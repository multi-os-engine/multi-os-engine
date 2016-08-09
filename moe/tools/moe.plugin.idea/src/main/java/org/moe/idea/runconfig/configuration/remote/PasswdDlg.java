/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.idea.runconfig.configuration.remote;

import org.moe.common.PasswordEntry;
import com.intellij.openapi.ui.Messages;
import res.MOEIcons;
import res.MOEText;
import sun.security.x509.X500Name;

import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;


public class PasswdDlg extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JPasswordField passwordField1;

    private String certPath;

    private char[] certPassword = null;
    private boolean isPasswordAccepted = true;
    private String certCommonName;

    public PasswdDlg(String certPath) {
        dialogInit();
        this.certPath = certPath;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setSize(350, 145);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        certPassword = passwordField1.getPassword();
        passwordField1.setText("");
        if (certPassword.length == 0) {
            Messages.showMessageDialog("Password can't be empty", MOEText.get("Cloud.Build"), MOEIcons.MOELogo);
        } else {

            try {
                FileInputStream fis = null;
                KeyStore keyStore = KeyStore.getInstance("PKCS12");
                try {
                    fis = new FileInputStream(new File(certPath));
                    keyStore.load(fis, certPassword);
                } finally {
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                    }
                }
                String alias = keyStore.aliases().nextElement();
                Certificate cert = keyStore.getCertificate(alias);

                Principal subj;
                if (cert instanceof X509Certificate) {
                    subj = ((X509Certificate)cert).getSubjectDN();
                    if (subj instanceof X500Name) {
                        certCommonName = ((X500Name)subj).getCommonName();
                    }
                }
            } catch (UnsupportedEncodingException e) {
                isPasswordAccepted = false;

                PasswordEntry.clean(certPassword);
                Messages.showMessageDialog("Password cannot be encrypted", MOEText.get("Cloud.Build"), MOEIcons.MOELogo);
            } catch (NullPointerException e) {
                isPasswordAccepted = false;

                PasswordEntry.clean(certPassword);
                Messages.showMessageDialog("Couldn't load certificate please, make sure that the path is correct", MOEText.get("Cloud.Build"), MOEIcons.MOELogo);
            } catch (IOException e) {
                isPasswordAccepted = false;

                PasswordEntry.clean(certPassword);
                Messages.showMessageDialog("Couldn't load certificate please, make sure that the path and password are correct", MOEText.get("Cloud.Build"), MOEIcons.MOELogo);
            } catch (CertificateException e) {
                isPasswordAccepted = false;

                PasswordEntry.clean(certPassword);
                Messages.showMessageDialog("Certificate is not correct", MOEText.get("Cloud.Build"), MOEIcons.MOELogo);
            } catch (GeneralSecurityException e) {
                isPasswordAccepted = false;

                PasswordEntry.clean(certPassword);
                Messages.showMessageDialog("Password cannot be encrypted", MOEText.get("Cloud.Build"), MOEIcons.MOELogo);
            }
        }
        dispose();
    }

    public char[] certPassword() {
        return certPassword;
    }

    private void onCancel() {
        // add your code here if necessary
        passwordField1.setText("");
        PasswordEntry.clean(certPassword);
        dispose();
    }

    public boolean isPasswordAccepted() {
        return isPasswordAccepted;
    }

    public String certCommonName() {
        return certCommonName;
    }
}
