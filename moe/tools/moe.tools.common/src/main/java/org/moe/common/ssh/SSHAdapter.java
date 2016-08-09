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

package org.moe.common.ssh;

import com.jcraft.jsch.*;
import org.moe.common.LOGGER;

import javax.net.ssl.*;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Vector;

public class SSHAdapter {

    class SSHSocketfactory implements  SocketFactory {

        Socket socket = null;

        @Override
        public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
            try {
                TrustManagerFactory managerFactory;

                KeyStore keyStore = KeyStore.getInstance("jks");
                keyStore.load(null, null);

                String tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
                managerFactory = TrustManagerFactory.getInstance(tmfAlgorithm);
                managerFactory.init(keyStore);

//                SSLContext context = SSLContext.getInstance("TLS");
                SSLContext context = SSLContext.getInstance("TLS");
//                context.init(null,new TrustManager[]{new X509TrustManager(){
//                    public void checkClientTrusted(X509Certificate[] x509Certificates, String authType) throws CertificateException {
//                    }
//                    public void checkServerTrusted(      X509Certificate[] x509Certificates,      String authType) throws CertificateException {
////                        if (LOGGER.isLoggable(FINE))         LOGGER.fine("Got the certificate: " + Arrays.asList(x509Certificates));
//                    }
//                    public X509Certificate[] getAcceptedIssuers(){
//                        return new X509Certificate[0];
//                    }
//                }
//                },new SecureRandom());
//                context.init(null, managerFactory.getTrustManagers(), null);
                context.init(null, null, null);

                SSLSocketFactory socketFactory = context.getSocketFactory();

                socket = socketFactory.createSocket(host, port);
                ((SSLSocket)socket).setEnabledCipherSuites(getCiphers(context));
                socket.setKeepAlive(true);

//                doTunnelHandshake(socket, host, port);
            } catch (Exception e) {
                throw new IOException(e);
            }

            return socket;
        }

        @Override
        public InputStream getInputStream(Socket socket) throws IOException {
            return socket.getInputStream();
        }

        @Override
        public OutputStream getOutputStream(Socket socket) throws IOException {
            return socket.getOutputStream();
        }

        private String[] getCiphers(SSLContext context) throws Exception {
            String[] exludedCipherSuites = {"_DHE_","_DH_"};

            SSLParameters params = context.getSupportedSSLParameters();
            ArrayList<String> enabledCiphers = new ArrayList<String>();

            for (String cipher : params.getCipherSuites()) {
                boolean exclude = false;
                for (int i = 0; (i < exludedCipherSuites.length) && !exclude; i++) {
                    exclude = cipher.indexOf(exludedCipherSuites[i]) >= 0;
                }
                if (!exclude) {
                    enabledCiphers.add(cipher);
                }
            }

            return enabledCiphers.toArray(new String[enabledCiphers.size()]);
        }

        private void doTunnelHandshake(Socket tunnel, String host, int port) throws IOException {
            OutputStream out = tunnel.getOutputStream();
            String msg = "CONNECT " + host + ":" + port + " HTTP/1.0\n" +
                    "User-Agent: " +
                    sun.net.www.protocol.http.HttpURLConnection.userAgent + "\r\n\r\n";
            byte b[];
            try {

                b = msg.getBytes("ASCII7");
            } catch (UnsupportedEncodingException ignored) {
              /*
               * If ASCII7 isn't there, something serious is wrong, but Paranoia
               * Is Good (tm)
               */
                b = msg.getBytes();
            }
            out.write(b);
            out.flush();

        /*
         * We need to store the reply so we can create a detailed error message
         * to the user.
         */
            byte reply[] = new byte[200];
            int replyLen = 0;
            int newlinesSeen = 0;
            boolean headerDone = false; /* Done on first newline */

            InputStream in = tunnel.getInputStream();
            boolean error = false;

            while (newlinesSeen < 2) {
                int i = in.read();
                if (i < 0) {
                    throw new IOException("Unexpected EOF from proxy");
                }
                if (i == '\n') {
                    headerDone = true;
                    ++newlinesSeen;
                } else if (i != '\r') {
                    newlinesSeen = 0;
                    if (!headerDone && replyLen < reply.length) {
                        reply[replyLen++] = (byte) i;
                    }
                }
            }

        /*
         * Converting the byte array to a string is slightly wasteful in the
         * case where the connection was successful, but it's insignificant
         * compared to the network overhead.
         */
            String replyStr;
            try {
                replyStr = new String(reply, 0, replyLen, "ASCII7");
            } catch (UnsupportedEncodingException ignored) {
                replyStr = new String(reply, 0, replyLen);
            }

            System.out.println(replyStr);

        /* We asked for HTTP/1.0, so we should get that back */
            if (!replyStr.startsWith("HTTP/1.0 200")) {
                throw new IOException("Unable to tunnel for " + host + ":" + port + ".  Proxy returns \"" + replyStr + "\"");
            }

        /* tunneling Handshake was successful! */
        }
    }

    // SSH port must be privileged for secure purposes.
    public static final int OSX_MAX_PRIVILEGED_PORT = 1024;

    private JSch m_Jsch;

    private ChannelSftp m_SFTPchannel;

    private Session m_Session;

    private Proxy m_Proxy;

    public SSHAdapter() {
    }

    /*
    * Mast be called before function ConnectToServer
    */
    public void SetHTTPProxy(String sIP, int nPort) {
        if ((sIP == null) || (nPort < 0)) {
            LOGGER.SEVERE("Incorrect HTTP proxy parameters.");
            return;
        }

        m_Proxy = new ProxyHTTP(sIP, nPort);
    }

    public boolean IsConnected() {
        if ((m_Session != null) && (m_Session.isConnected())) {
            return true;
        }
        return false;
    }

    /*
    * param
    */
    public void ConnectToServer(String sServerIP, int nPort, String sLogin, String prvkey, String proxy) throws JSchException {
        LOGGER.FINE("Connecting to ", sLogin, '@', sServerIP, ':', nPort, "...");

        if ((sServerIP == null) || sServerIP.isEmpty()) {
            throw new JSchException("Build server IP address was not set.");
        } else if ((nPort < 0) || (nPort >= OSX_MAX_PRIVILEGED_PORT)) {
            throw new JSchException("Incorrect port value. Please set port from interval (0, " + OSX_MAX_PRIVILEGED_PORT + ").");
        } else if ((sLogin == null) || (sLogin.isEmpty())) {
            throw new JSchException("Login was not set.");
        } else if (prvkey == null) {
            throw new JSchException("Path to private key was not set.");
        } else if (!(new File(prvkey)).exists()) {
            throw new JSchException("Private key could not be found in '" + prvkey + "'");
        }

        CloseConnection();

        if (m_Jsch != null) {
            m_Jsch.removeAllIdentity();
        }
        m_Jsch = new JSch();
        m_Jsch.addIdentity(prvkey);
        m_Session = m_Jsch.getSession(sLogin, sServerIP, nPort);

//        if (proxy != null) {
//            m_Session.setProxy(m_Proxy = proxy);
//        }

        m_Session.setConfig("StrictHostKeyChecking", "no");
        //m_Session.setConfig("HashKnownHosts", "yes");
        m_Session.setConfig("compression.s2c", "zlib@openssh.com,zlib,none");
        m_Session.setConfig("compression.c2s", "zlib@openssh.com,zlib,none");
        m_Session.setConfig("compression_level", "9");

        m_Session.setSocketFactory(new SSHSocketfactory());
        m_Session.connect();

        // Create SFTP channel
        m_SFTPchannel = (ChannelSftp) m_Session.openChannel("sftp");
        m_SFTPchannel.connect();
    }

    public void ConnectToServer(String sServerIP, int nPort, String sLogin, byte[] password, String proxy) throws SSHException {
        LOGGER.FINE("Connecting to ", sLogin, '@', sServerIP, ':', nPort, "...");

        if ((sServerIP == null) || sServerIP.isEmpty()) {
            throw new SSHException("Build server IP address was not set.");
        } else if ((nPort < 0) || (nPort >= OSX_MAX_PRIVILEGED_PORT)) {
            throw new SSHException("Incorrect port value. Please set port from interval (0, " + OSX_MAX_PRIVILEGED_PORT + ").");
        } else if ((sLogin == null) || (sLogin.isEmpty())) {
            throw new SSHException("Login was not set.");
        } else if (password == null) {
            throw new SSHException("SSH: password was not set.");
        }

        CloseConnection();

        try {
            if (m_Jsch != null) {
                m_Jsch.removeAllIdentity();
            }

            m_Jsch = new JSch();
            m_Session = m_Jsch.getSession(sLogin, sServerIP, nPort);
            m_Session.setPassword(password);

//        if (proxy != null) {
//            m_Session.setProxy(m_Proxy = proxy);
//        }

            m_Session.setConfig("StrictHostKeyChecking", "no");
            //m_Session.setConfig("HashKnownHosts", "yes");
            m_Session.setConfig("compression.s2c", "zlib@openssh.com,zlib,none");
            m_Session.setConfig("compression.c2s", "zlib@openssh.com,zlib,none");
            m_Session.setConfig("compression_level", "9");

//        String kex = m_Session.getConfig("kex");
//        String[] kexs = kex.split(",");
//        StringBuffer kb = new StringBuffer(256);
//        for (String k : kexs) {
//            if (!k.contains("diffie-hellman")) {
//                kb.append(k);
//                kb.append(',');
//            }
//        }
//        if (kb.length() > 0) {
//            m_Session.setConfig("kex", kb.substring(0, kb.length() - 1));
//        }
//            m_Session.setSocketFactory(new SSHSocketfactory());

            m_Session.connect();

            // Create SFTP channel
            m_SFTPchannel = (ChannelSftp) m_Session.openChannel("sftp");
            m_SFTPchannel.connect();
        } catch (Exception e) {
            throw new SSHException(e);
        }
    }

    public void CloseConnection() {

        if (m_SFTPchannel != null) {
            m_SFTPchannel.disconnect();
            m_SFTPchannel = null;
        }

        if (m_Session != null) {
            m_Session.disconnect();
            m_Session = null;
        }
    }

    /*
     * Test cases:
     * 1. Try to download remote dir which does not exist => appropriate error message is expected;
     * 2. Download folder to existing folder;
     * 3. Download folder to new folder, dst folder name ends with a file separator;
     * 4. Download folder to new folder, dst folder name does not end with a file separator;
     * 5. Download folder content to new folder, src folder name does not end with a file separator;
     * 6. Download file to existing folder;
     * 7. Download file to new folder;
     * 8. Download file with new name to new folder, dst name does not end with a file separator;.
     */
    public void Download(String sRemoteSource, String sLocalDestination) throws SSHException {
        if ((m_SFTPchannel == null) || (!m_SFTPchannel.isConnected())) {
            throw new SSHException("SFTP channel is not connected!");
        }

        GetDir(sRemoteSource, sLocalDestination);
    }

    /*
     * Test cases:
     * 1. Upload file to existing remote dir, dst folder name ends with a file separator;
     * 2. Upload file to existing remote dir, dst folder name does not end with a file separator;
     * 3. Upload file to not existing remote dir => all necessary dirs must be created;
     * 4. Upload file with rename, dst name ends with new name without a file separator;
     * 5. Upload folder to a new folder, dst folder name ends with a file separator;
     * 6. Upload folder to a new folder, dst folder name does not end with a file separator;
     * 7. Upload file to dir which already contains folder with the same name => appropriate error message is expected;
     * 8. Upload file to dir which requires root permissions => appropriate error message is expected;
     */
    public void Upload(String sLocalSource, String sRemoteDestination) throws SSHException {
        if ((m_SFTPchannel == null) || (!m_SFTPchannel.isConnected())) {
            throw new SSHException("SFTP channel is not connected!");
        }

        PushDir(new File(sLocalSource), sRemoteDestination);
    }

    /*
    *
    */
    protected void GetFile(ChannelSftp.LsEntry leRemote, String sRemoteSource, File fLocal) throws JSchException {
        String sRemoteFile = leRemote.getFilename();
        // Create missed dirs
        if (!fLocal.exists()) {
            String sLocalDestination = fLocal.getAbsolutePath();
            int nLastSepIndx = sLocalDestination.lastIndexOf(File.separatorChar);
            if ((nLastSepIndx != -1) && (sLocalDestination.length() > 1)) {
                File fMissedDir = new File(sLocalDestination.substring(0, nLastSepIndx));
                if (!fMissedDir.exists()) {
                    fMissedDir.mkdirs();
                }
            }
        }
        if (fLocal.isDirectory()) {
            fLocal = new File(fLocal, sRemoteFile);
        }

        try {
            m_SFTPchannel.get(sRemoteSource, fLocal.getAbsolutePath());
        } catch (SftpException e) {
            throw new JSchException("File retrieving failure: " + e.getMessage());
        }
    }

    protected void GetDir(String sRemoteSource, String sLocalDestination) throws SSHException {
        try {
            Vector files = m_SFTPchannel.ls(sRemoteSource);
            boolean bIsRemoteUnique = true;

            try {
                if (!m_SFTPchannel.stat(sRemoteSource).isDir()) {
                    //---> FOR ONE FILE
                    File fLocal = new File(sLocalDestination);
                    // If local dst ends with '/' - copy to this dir,
                    // otherwise copy and rename.
                    if ((sLocalDestination.endsWith(File.separator) || sLocalDestination.endsWith("/") ||
                            sLocalDestination.endsWith("\\")) && !fLocal.exists()) {
                        fLocal.mkdirs();
                    }
                    GetFile((ChannelSftp.LsEntry) files.elementAt(0), sRemoteSource, fLocal);
                    return;
                } else if (sRemoteSource.contains("*")) {
                    bIsRemoteUnique = false;
                }
            } catch (SftpException e1) {
                //---> IF sRemoteSource IS NOT UNIQUE
                bIsRemoteUnique = false;
            }

            //---> ONLY FOR DIR OR FILES LIST

            if (!sLocalDestination.endsWith(File.separator) && !sLocalDestination.endsWith("/") && !sLocalDestination.endsWith("\\")) {
                sLocalDestination += File.separator;
            }
            // If remote src ends with file separator - copy content; otherwise - copy folder to sLocalDestination.
            if (bIsRemoteUnique && !sRemoteSource.endsWith(File.separator) && !sRemoteSource.endsWith("/") && !sRemoteSource.endsWith("\\")) {
                sLocalDestination += sRemoteSource.substring(sRemoteSource.lastIndexOf('/') + 1, sRemoteSource.length()) + File.separator;
                sRemoteSource += '/';
            } else if (!bIsRemoteUnique) {
                int nLastSeparator = sRemoteSource.lastIndexOf('/');
                if (nLastSeparator < 0) {
                    nLastSeparator = sRemoteSource.lastIndexOf('\\');
                    if (nLastSeparator < 0) {
                        nLastSeparator = sRemoteSource.lastIndexOf(File.separator);
                    }
                }
                if (nLastSeparator >= 0) {
                    sRemoteSource = sRemoteSource.substring(0, nLastSeparator + 1);
                }
            }

            File fLocal = new File(sLocalDestination);
            if (!fLocal.exists()) {
                fLocal.mkdirs();
            } else if (fLocal.isFile()) {
                throw new IOException("Cannot create local directory \"" + sLocalDestination + "\": file with such name already exists!");
            }

            final int nSize = files.size();
            String sRemoteName = null;
            String sRemoteFullName = null;

            for (int nInx = 0; nInx < nSize; nInx++) {
                ChannelSftp.LsEntry leRemote = (ChannelSftp.LsEntry) files.elementAt(nInx);
                sRemoteName = leRemote.getFilename();
                if (sRemoteName.equals(".") || sRemoteName.equals("..")) {
                    continue;
                }

                if (leRemote.getAttrs().isDir()) {
                    sRemoteFullName = sRemoteSource + sRemoteName + '/';
                    GetDir(sRemoteFullName, sLocalDestination + sRemoteName + File.separator);
                } else {
                    sRemoteFullName = sRemoteSource + sRemoteName;
                    GetFile(leRemote, sRemoteFullName, fLocal);
                }
            }
        } catch (Exception e) {
            throw new SSHException("Download from \"" + sRemoteSource + "\" to \"" + sLocalDestination + "\" failed!\n\t" + e.getMessage());
        }
    }

    private void PushDir(File fLocalSource, String sRemoteDestination) throws SSHException {
        if (fLocalSource == null || !fLocalSource.exists()) {
            throw new SSHException("Local file \"" + (fLocalSource != null ? fLocalSource.getAbsolutePath() : "NULL") + "\" does not exist.");
        }

        if (fLocalSource.isDirectory()) {
            String sDst = sRemoteDestination +
                    (sRemoteDestination.endsWith("/") ? "" : "/") +
                    fLocalSource.getName() + '/';
            File[] fLocFiles = fLocalSource.listFiles();
            if (fLocFiles != null) {
                for (File fLocFile : fLocFiles) {
                    PushDir(fLocFile, sDst);
                }
            }
        } else {
            PushFile(fLocalSource.getAbsolutePath(), sRemoteDestination);
        }
    }

    private void PushFile(String sLocalSource, String sRemoteDestination) throws SSHException {
        String sDstDir = (sRemoteDestination.length() > 1) ? sRemoteDestination.substring(0, sRemoteDestination.lastIndexOf('/')) : sRemoteDestination;

        CreateRemoteFolder(sDstDir);

        try {
            m_SFTPchannel.put(sLocalSource, sRemoteDestination);
            LOGGER.FINEST("File \"", sLocalSource, "\" was uploaded to the remote directory \"", sRemoteDestination, "\".");
        } catch (SftpException e) {
            throw new SSHException("File \"" + sLocalSource + "\" was not uploaded to the remote directory \"" + sRemoteDestination + "\".\n\t" + e.toString());
        }
    }

    private void CreateRemoteFolder(String sRemotePath) throws SSHException {
        boolean bRC = false;

        try {
            if (m_SFTPchannel.stat(sRemotePath).isDir()) {
                bRC = true;
            } else {
                LOGGER.SEVERE("Remote directory \"", sRemotePath, "\" was not created! Reason: file with such name already exists.");
            }
        } catch (SftpException e) {
            if (e.id == ChannelSftp.SSH_FX_NO_SUCH_FILE) {
                try {
                    String[] sPathArray = sRemotePath.split("/");
                    boolean bExists = false;
                    String sCurrent = null;
                    for (String sDir : sPathArray) {
                        if ((sDir.length() == 0) || (sDir.equals("."))) {
                            sCurrent = sDir;
                            continue;
                        }

                        if (sCurrent != null) {
                            sCurrent = sCurrent + "/" + sDir;
                        } else {
                            sCurrent = sDir;
                        }

                        try {
                            if (m_SFTPchannel.stat(sCurrent).isDir()) {
                                bExists = true;
                            }
                        } catch (SftpException e2) {
                            //
                        }
                        if (!bExists) {
                            m_SFTPchannel.mkdir(sCurrent);
                        }
                        bExists = false;
                    }
                    bRC = true;
                    LOGGER.FINER("Remote directory \"", sRemotePath, "\" was created.");
                } catch (SftpException e1) {
                    LOGGER.SEVERE("Remote directory \"", sRemotePath, "\" creation failure! Reason# ", e1.toString());
                }
            } else {
                LOGGER.SEVERE("Remote directory \"", sRemotePath, "\" creation failure! Reason# ", e.toString());
            }
        }

        if (!bRC) {
            throw new SSHException("Remote folder creation failure.");
        }
    }

    public void RemoveFile(String sRemotePath) throws Exception {
        int retCode = ShellCmd("rm -rf " + sRemotePath, null);
        if (retCode != 0) {
            LOGGER.SEVERE("Failed to remove file: " + sRemotePath);
        }
    }

    public boolean DoesFileExist(String sPath) {
        try {
            m_SFTPchannel.stat(sPath);
            return true;
        } catch (SftpException e) {
            return false;
        }
    }

    public int ShellCmd(String sCmd, StringBuffer sbOutput) throws Exception {
        int nExitStatus = -1;
        ChannelShell ShellChannel = null;

        try {
            ShellChannel = (ChannelShell) m_Session.openChannel("shell");

            OutputStream ShellOutput = ShellChannel.getOutputStream();

            InputStream input = ShellChannel.getInputStream();
            ShellChannel.connect();

            ShellOutput.write((sCmd + ";exit\n").getBytes());
            ShellOutput.flush();

            int nLength = 0;
            byte[] bBuff = new byte[1024];

            while (true) {
                while (input.available() > 0) {
                    nLength = input.read(bBuff, 0, 1024);
                    if (nLength < 1) {
                        break;
                    }
                    String sTmp = new String(bBuff, 0, nLength);
                    if (sbOutput != null) {
                        sbOutput.append(sTmp);
                    } else {
                        LOGGER.FINEST("shell output: ", sTmp);
                    }
                }

                if (ShellChannel.isClosed()) {
                    if (input.available() > 0) {
                        continue;
                    }
                    nExitStatus = ShellChannel.getExitStatus();
                    if (nExitStatus == 0) {
                        LOGGER.FINER("cmd \"", sCmd, "\" exit-status: 0");
                    } else {
                        LOGGER.SEVERE("cmd \"", sCmd, "\" exit-status: ", nExitStatus);
                        throw new JSchException("Exit status= " + nExitStatus);
                    }
                    break;
                }
                try {
                    Thread.sleep(20);
                } catch (Exception et) {/*is not critical*/}
            }
        } catch (IOException e) {
            LOGGER.SEVERE("IO error: ", e.getMessage());
        } finally {
            ShellChannel.disconnect();
        }
        return nExitStatus;
    }

    /*
     * It works as shell, but does not support environment variables.
     * Use ShellCmd function if executable target requires environment variables.
     */
    public String Execute(String sCommand, boolean bReturnOutput) {
        String sOutput = "";
        if (!IsConnected()) {
            LOGGER.SEVERE("Execution error: session disconnected!");
            return sOutput;
        }

        ChannelExec execChannel = null;
        try {
            execChannel = (ChannelExec) m_Session.openChannel("exec");
            LOGGER.FINE("command to execute on remote machine: \"", sCommand, '\"');
            execChannel.setCommand(sCommand);

            InputStream input = execChannel.getInputStream();
            InputStream errInput = execChannel.getErrStream();
            InputStream extInput = execChannel.getExtInputStream();

            int nLength = 0;
            String sRes;
            StringBuffer sBuff = null;
            if (bReturnOutput) {
                sBuff = new StringBuffer(1000);
            }

            execChannel.connect();

            byte[] bBuff = new byte[1024];
            while (true) {
                while (errInput.available() > 0) {
                    nLength = errInput.read(bBuff, 0, 1024);
                    if (nLength < 1) {
                        break;
                    }
                    sRes = new String(bBuff, 0, nLength);
                    LOGGER.FINER(sRes);
                    if (bReturnOutput) {
                        sBuff.append(sRes);
                    }
                }
                while (input.available() > 0) {
                    nLength = input.read(bBuff, 0, 1024);
                    if (nLength < 1) {
                        break;
                    }
                    sRes = new String(bBuff, 0, nLength);
                    LOGGER.INFO(sRes);
                    if (bReturnOutput) {
                        sBuff.append(sRes);
                    }
                }
                while (extInput.available() > 0) {
                    nLength = extInput.read(bBuff, 0, 1024);
                    if (nLength < 1) {
                        break;
                    }
                    sRes = new String(bBuff, 0, nLength);
                    LOGGER.INFO(sRes);
                    if (bReturnOutput) {
                        sBuff.append(sRes);
                    }
                }

                if (execChannel.isClosed()) {
                    if ((errInput.available() > 0) || (input.available() > 0) || (extInput.available() > 0)) {
                        continue;
                    }
                    int nExitStatus = execChannel.getExitStatus();
                    if (nExitStatus == 0) {
                        LOGGER.INFO("exit-status: ", nExitStatus);
                    } else {
                        LOGGER.SEVERE("exit-status: ", nExitStatus);
                    }
                    break;
                }
                try {
                    Thread.sleep(500);
                } catch (Exception et) {
                }
            }

            execChannel.disconnect();
            if (bReturnOutput) {
                sOutput = sBuff.toString();
            }
        } catch (JSchException e) {
            LOGGER.SEVERE("SSH connector error: ", e);
        } catch (IOException e) {
            LOGGER.SEVERE("IO error: ", e);
        }

        return sOutput;
    }

    public void ExecuteWithPassword(String sCmd, byte[] password, StringBuffer sbOutput) throws SSHException {
        if (!IsConnected()) {
            throw new SSHException("Execution of command \"" + sCmd + "\" failure: session disconnected!");
        }

        int nReturnCode = -1;
        ChannelExec execChannel = null;
        try {
            LOGGER.FINEST("command to execute on remote machine: \"", sCmd, '\"');

            execChannel = (ChannelExec) m_Session.openChannel("exec");
            execChannel.setCommand(sCmd);

            OutputStream outputStream = execChannel.getOutputStream();

            InputStream stdInput = execChannel.getInputStream();
            InputStream errInput = execChannel.getErrStream();
            InputStream extInput = execChannel.getExtInputStream();

            execChannel.connect();

            outputStream.write(password);
            outputStream.write('\n');
            outputStream.flush();

            int nLength = 0;
            String sRes;
            byte[] bBuff = new byte[1024];

            while (true) {
                while (errInput.available() > 0) {
                    nLength = errInput.read(bBuff, 0, 1024);
                    if (nLength < 1) {
                        break;
                    }
                    sRes = new String(bBuff, 0, nLength);
                    LOGGER.SEVERE(sRes);
                    if (sbOutput != null) {
                        sbOutput.append(sRes);
                    }
                }
                while (stdInput.available() > 0) {
                    nLength = stdInput.read(bBuff, 0, 1024);
                    if (nLength < 1) {
                        break;
                    }
                    sRes = new String(bBuff, 0, nLength);
                    LOGGER.FINEST(sRes);
                    if (sbOutput != null) {
                        sbOutput.append(sRes);
                    }
                }
                while (extInput.available() > 0) {
                    nLength = extInput.read(bBuff, 0, 1024);
                    if (nLength < 1) {
                        break;
                    }
                    sRes = new String(bBuff, 0, nLength);
                    LOGGER.FINEST(sRes);
                    if (sbOutput != null) {
                        sbOutput.append(sRes);
                    }
                }

                if (execChannel.isClosed()) {
                    if ((errInput.available() > 0) || (stdInput.available() > 0) || (extInput.available() > 0)) {
                        continue;
                    }
                    nReturnCode = execChannel.getExitStatus();
                    if (nReturnCode == 0) {
                        LOGGER.FINER("\"" + sCmd + "\" exit-status= 0");
                    } else {
                        LOGGER.SEVERE("\"" + sCmd + "\" exit-status= " + nReturnCode);
                    }
                    break;
                }
                try {
                    Thread.sleep(50);
                } catch (Exception et) {
                }
            }

            execChannel.disconnect();

        } catch (JSchException e) {
            LOGGER.SEVERE("SSH connector error: ", e.toString());
        } catch (IOException e) {
            LOGGER.SEVERE("IO error: ", e.toString());
        }

        if (nReturnCode != 0) {
            throw new SSHException("Exit status= " + nReturnCode + " for command " + sCmd);
        }
    }

    // Execution without logs. Prefered if @command contains password.
    public void executeWithoutOutput(String command) throws SSHException {
        if (!IsConnected()) {
            throw new SSHException("Disconnected!");
        }

        ChannelExec execChannel = null;
        try {
            execChannel = (ChannelExec) m_Session.openChannel("exec");
            execChannel.setCommand(command);

            execChannel.connect();

            int nReturnCode;
            while (true) {
                if (execChannel.isClosed()) {
                    nReturnCode = execChannel.getExitStatus();
                    if (nReturnCode == 0) {
                        LOGGER.FINER("exit-status= 0");
                    } else {
                        LOGGER.SEVERE("exit-status= " + nReturnCode);
                        throw new SSHException("Exit status= " + nReturnCode);
                    }
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (Exception et) {}
            }
        } catch (Exception e) {
            throw new SSHException(e);
        } finally {
            execChannel.disconnect();
        }
    }

    public String GetEnvVariable(String sName) {
        String sVar = "";
        if (!IsConnected()) {
            LOGGER.WARNING("There is no SSH connection!");
            return sVar;
        }

        PipedOutputStream ShellInput = null;
        InputStream in = null;

        try {
            ChannelShell ShellChannel = (ChannelShell) m_Session.openChannel("shell");

            ShellInput = new PipedOutputStream();
            in = new PipedInputStream(ShellInput);

            ShellChannel.setInputStream(in);

            InputStream input = ShellChannel.getInputStream();

            int nLength = 0;

            ShellChannel.connect();

            String sCmd = "echo ${" + sName + "};exit";
            ShellInput.write((sCmd + "\n").getBytes());
            ShellInput.flush();

            StringBuffer sTmp = new StringBuffer(1024);
            byte[] bBuff = new byte[1024];

            while (true) {
                while (input.available() > 0) {
                    nLength = input.read(bBuff, 0, 1024);
                    if (nLength < 1) {
                        break;
                    }
                    sTmp.append(new String(bBuff, 0, nLength));
                }

                if (ShellChannel.isClosed()) {
                    if (input.available() > 0) {
                        continue;
                    }
                    int nExitStatus = ShellChannel.getExitStatus();
                    if (nExitStatus == 0) {
                        LOGGER.FINER(sName, "; exit-status = 0");
                    } else {
                        LOGGER.SEVERE(sName, "; exit-status = ", nExitStatus);
                    }
                    break;
                }
                try {
                    Thread.sleep(20);
                } catch (Exception et) {
                    LOGGER.FINEST(et);
                }
            }

            ShellChannel.disconnect();

            sVar = sTmp.toString();
            LOGGER.FINEST("Returned output: ", sVar);
            int nCmdIndex = sVar.lastIndexOf(sCmd);
            if (nCmdIndex >= 0) {
                nCmdIndex += sCmd.length() + 2;
                sVar = sVar.substring(nCmdIndex, sVar.indexOf("\r\n", nCmdIndex));
            }

        } catch (JSchException e1) {
            LOGGER.SEVERE("error: ", e1.getMessage());
        } catch (IOException e2) {
            LOGGER.SEVERE("error: ", e2.getMessage());
        } finally {
            if (ShellInput != null) {
                try {
                    ShellInput.close();
                } catch (IOException ignored) {
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ignored) {
                }
            }
        }
        return sVar;
    }

    public String getHome() throws SSHException {
        try {
            return m_SFTPchannel.getHome();
        } catch (Exception e) {
            throw new SSHException(e);
        }
    }

    protected void finalize() throws Throwable {
        CloseConnection();
    }

    public enum etAuthorizationType {
        ePASSWORD,
        ePRIVATE_KEY
    }

}
