package org.moe.gradle.utils;

import com.dd.plist.NSDictionary;
import com.dd.plist.NSNumber;
import com.dd.plist.NSString;
import com.dd.plist.PropertyListParser;
import org.gradle.api.GradleException;

import java.io.File;
import java.io.IOException;

public class ExportOptionsPlistManager {

    public static final String METHOD_KEY = "method";
    public static final String TEAM_ID_KEY = "teamID";
    public static final String COMPILE_BITCODE_KEY = "compileBitcode";
    public static final String UPLOAD_BITCODE_KEY = "uploadBitcode";
    public static final String ON_DEMAND_RESOURCES_KEY = "embedOnDemandResourcesAssetPacksInBundle";
    public static final String ICLOUD_CONTAINER_EVVIROMENT_KEY = "iCloudContainerEnvironment";
    public static final String ON_DEMAND_RESOURCES_ASSET_PACKS_BASE_URL_KEY = "onDemandResourcesAssetPacksBaseURL";
    public static final String THINNING_KEY = "thinning";
    public static final String UPLOAD_SYMBOLS_KEY = "uploadSymbols";
    public static final String APP_URL_KEY = "appURL";
    public static final String DISPLAY_IMAGE_URL_KEY = "displayImageURL";
    public static final String FULL_SIZE_IMAGE_URL_KEY = "fullSizeImageURL";
    public static final String MANIFEST_KEY = "manifest";
    public static final String PROVISIONING_PROFILES_KEY = "provisioningProfiles";
    public static final String SIGNING_STYLE_KEY = "signingStyle";
    public static final String SIGNING_CERTIFICATE_KEY = "signingCertificate";

    public static final String APP_STORE_METHOD = "app-store";
    public static final String AD_HOC_METHOD = "ad-hoc";
    public static final String PACKAGE_METHOD = "package";
    public static final String ENTERPRISE_METHOD = "enterprise";
    public static final String DEVELOPMENT_METHOD = "development";
    public static final String DEVELOPER_ID_METHOD = "developer-id";

    private File exportPlist;
    private NSDictionary rootDict;

    public ExportOptionsPlistManager(File exportPlist) throws Exception {
        this.exportPlist = exportPlist;
        load();
    }

    public void load() throws Exception {
        this.rootDict = (NSDictionary) PropertyListParser.parse(exportPlist);
    }

    public void setMethod(String method) {
        if (method.equals(APP_STORE_METHOD) ||
                method.equals(AD_HOC_METHOD) ||
                method.equals(PACKAGE_METHOD) ||
                method.equals(ENTERPRISE_METHOD) ||
                method.equals(DEVELOPMENT_METHOD) ||
                method.equals(DEVELOPER_ID_METHOD) ) {

            rootDict.put(METHOD_KEY, new NSString(method));
        } else  {
            throw new GradleException("Allowed ipaExport.method options: app-store, ad-hoc, package, enterprise" +
                    ", development, and developer-id.");
        }
    }

    public void setTeamId(String id) {
        if (id == null || id.isEmpty()) {
            throw new GradleException("IPA build requires signing developmentTeam! Please set the "
                    + "moe.signing.developmentTeam property");
        }
        rootDict.put(TEAM_ID_KEY, new NSString(id));
    }

    public void setCompileBitcode(boolean b) {
        rootDict.put(COMPILE_BITCODE_KEY, new NSNumber(b));
    }

    public void setUploadBitcode(boolean b) {
        rootDict.put(UPLOAD_BITCODE_KEY, new NSNumber(b));
    }

    public void setEmbedOnDemandResourcesAssetPacksInBundle(boolean b) {
        rootDict.put(ON_DEMAND_RESOURCES_KEY, new NSNumber(b));
    }

    public void setICloudContainerEnvironment(String ce) {
        rootDict.put(ICLOUD_CONTAINER_EVVIROMENT_KEY, new NSString(ce));
    }

    public void setOnDemandResourcesAssetPacksBaseURL(String rap) {
        rootDict.put(ON_DEMAND_RESOURCES_ASSET_PACKS_BASE_URL_KEY, new NSString(rap));
    }

    public void setThinning(String thinning) {
        rootDict.put(THINNING_KEY, new NSString(thinning));
    }

    public void setUploadSymbols(boolean b) {
        rootDict.put(UPLOAD_SYMBOLS_KEY, new NSNumber(b));
    }

    public void setAppURL(String url) {
        getManifestOrCreate().put(APP_URL_KEY, new NSString(url));
    }

    public void setDisplayImageURL(String displayImageURL) {
        getManifestOrCreate().put(DISPLAY_IMAGE_URL_KEY, new NSString(displayImageURL));
    }

    public void setFullSizeImageURL(String fullSizeImageURL) {
        getManifestOrCreate().put(FULL_SIZE_IMAGE_URL_KEY, new NSString(fullSizeImageURL));
    }

    public NSDictionary getManifestOrCreate() {
        NSDictionary manifest = (NSDictionary) rootDict.get(MANIFEST_KEY);
        if (manifest == null) {
            manifest = new NSDictionary();
            rootDict.put(MANIFEST_KEY, manifest);
        }
        return manifest;
    }

    public void setProvisioningProfiles(String bundleId, String provisioningProfileSpecifier) {
        NSDictionary provisioningProfiles = getProvisioningProfilesOrCreate();
        provisioningProfiles.put(bundleId, provisioningProfileSpecifier);
    }

    public NSDictionary getProvisioningProfilesOrCreate() {
        NSDictionary provisioningProfiles = (NSDictionary) rootDict.get(PROVISIONING_PROFILES_KEY);
        if (provisioningProfiles == null) {
            provisioningProfiles = new NSDictionary();
            rootDict.put(PROVISIONING_PROFILES_KEY, provisioningProfiles);
        }
        return provisioningProfiles;
    }

    public void setSigningStyle(String style) {
        rootDict.put(SIGNING_STYLE_KEY, style);
    }

    public void setSigningCertificate(String certificate) {
        rootDict.put(SIGNING_CERTIFICATE_KEY, certificate);
    }

    public void save() throws IOException {
        PropertyListParser.saveAsXML(rootDict, exportPlist);
    }

    public void clean() {
        rootDict.clear();
    }
}
