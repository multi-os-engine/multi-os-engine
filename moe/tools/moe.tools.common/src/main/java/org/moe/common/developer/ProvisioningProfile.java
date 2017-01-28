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

package org.moe.common.developer;

import com.dd.plist.NSArray;
import com.dd.plist.NSDate;
import com.dd.plist.NSDictionary;
import com.dd.plist.NSNumber;
import com.dd.plist.PropertyListParser;
import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.SimpleExec;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ProvisioningProfile implements Serializable {
    public enum Type {
        Development,
        AppStore,
        AdHoc
    }

    private String uuid;
    private String name;
    private Type type;
    private File file;
    private String appIdName;
    private String appIdPrefix;
    private String appId;
    private Date creationDate;
    private Date expirationDate;
    private List<String> certFingerprints;
    private transient NSArray provisionedDevices;

    private ProvisioningProfile() {
    }

    public static String getPlistFromProfile(String filePath) throws Exception {
        SimpleExec exec = SimpleExec.getExec("security");
        List<String> execArgs = exec.getArguments();

        execArgs.add("cms");
        execArgs.add("-D");
        execArgs.add("-i");
        execArgs.add(filePath);

        return ExecOutputCollector.collect(exec);
    }

    public static List<ProvisioningProfile> getProfiles() {
        File dir = new File(new File(System.getProperty("user.home")), "Library/MobileDevice/Provisioning Profiles");

        if (!dir.exists() || !dir.isDirectory()) {
            return Collections.emptyList();
        }

        List<ProvisioningProfile> result = new ArrayList<ProvisioningProfile>();

        String plistBody;

        NSDictionary rootDict;
        NSDictionary entitlements;

        File files[] = dir.listFiles();

        if (files == null) {
            return result;
        }

        for (File file : files) {
            if (!file.getName().endsWith(".mobileprovision")) {
                continue;
            }

            try {
                plistBody = getPlistFromProfile(file.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

            if ((plistBody == null) || plistBody.isEmpty()) {
                continue;
            }

            plistBody = plistBody.substring(0, plistBody.length() - 1);

            plistBody = plistBody.replace("\n", "").replace("\t", "");

            byte[] bytes = plistBody.getBytes();

            ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);

            try {
                rootDict = (NSDictionary)PropertyListParser.parse(inputStream);
            } catch (Exception e) {
                continue;
            }

            ProvisioningProfile profile = new ProvisioningProfile();

            profile.file = file;
            profile.name = rootDict.objectForKey("Name").toString();
            profile.uuid = rootDict.objectForKey("UUID").toString();

            if (rootDict.objectForKey("AppIDName") != null) {
                profile.appIdName = rootDict.objectForKey("AppIDName").toString();
            } else {
                profile.appIdName = null;
            }

            profile.appIdPrefix = ((NSArray)rootDict.objectForKey("ApplicationIdentifierPrefix")).objectAtIndex(0)
                    .toString();

            profile.creationDate = ((NSDate)rootDict.objectForKey("CreationDate")).getDate();
            profile.expirationDate = ((NSDate)rootDict.objectForKey("ExpirationDate")).getDate();

            entitlements = (NSDictionary)rootDict.objectForKey("Entitlements");

            boolean taskAllow = ((NSNumber)entitlements.objectForKey("get-task-allow")).boolValue();

            profile.provisionedDevices = (NSArray)rootDict.objectForKey("ProvisionedDevices");

            if (taskAllow) {
                profile.type = Type.Development;
            } else if (profile.provisionedDevices != null) {
                profile.type = Type.AdHoc;
            } else {
                profile.type = Type.AppStore;
            }

            result.add(profile);
        }

        return result;
    }

    public static String getUUIDFromProfile(File file) throws Exception {
        String result;

        String plistBody = getPlistFromProfile(file.getAbsolutePath());

        if (plistBody == null || plistBody.isEmpty()) {
            throw new Exception("Failed to get plist from provisioning profile: " + file.getAbsolutePath());
        }

        plistBody = plistBody.substring(0, plistBody.length() - 1);
        plistBody = plistBody.replace("\n", "").replace("\t", "");

        byte[] bytes = plistBody.getBytes();

        NSDictionary rootDict = null;
        ByteArrayInputStream inputStream = null;
        try {
            inputStream = new ByteArrayInputStream(bytes);
            rootDict = (NSDictionary)PropertyListParser.parse(inputStream);
        } catch (Exception e) {
            throw new Exception(
                    "Failed to parse provisioning profile: " + file.getAbsolutePath() + "\n" + e.getMessage(), e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }

        result = rootDict.objectForKey("UUID").toString();
        if (result == null || result.isEmpty()) {
            throw new Exception("Failed to get UUID (null or empty) from profile: " + file.getAbsolutePath());
        }

        return result;
    }

    public String name() {
        return name;
    }

    public String type() {
        return type.toString();
    }

    public File file() {
        return file;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("ProvisioningProfile [");

        builder.append("type=" + type + ",");
        builder.append("file=" + file + ",");
        builder.append("uuid=" + uuid + ",");
        builder.append("name=" + name + ",");
        builder.append("appIdName=" + appIdName + ",");
        builder.append("appIdPrefix=" + appIdPrefix + ",");
        builder.append("appId=" + appId + ",");
        builder.append("creationDate=" + creationDate + ",");
        builder.append("expirationDate=" + expirationDate + ",");
        builder.append("certFingerprints=" + certFingerprints);
        builder.append("]");

        return builder.toString();
    }

    public String uuid() {
        return uuid;
    }

    public static class ProvisioningProfileComboItem {
        public ProvisioningProfile provisioningProfile;

        public ProvisioningProfileComboItem(ProvisioningProfile Provisioning) {
            provisioningProfile = Provisioning;
        }

        public String toString() {
            return provisioningProfile.name() + " (" + provisioningProfile.uuid() + ")";
        }
    }
}
