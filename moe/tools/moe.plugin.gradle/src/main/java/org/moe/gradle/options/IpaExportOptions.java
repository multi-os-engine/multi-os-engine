package org.moe.gradle.options;

import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.Nullable;

public class IpaExportOptions {

    /**
     * (String) Describes how Xcode should export the archive. Available options: app-store, ad-hoc, package,
     * enterprise, development, and developer-id. The list of options varies based on the type of archive.
     * Defaults to development.
     */
    @Nullable
    private String method;

    @Nullable
    public String getMethod() {
        return method;
    }

    @IgnoreUnused
    public void setMethod(@Nullable String method) {
        this.method = method;
    }

    /**
     * (Boolean) Option to include symbols in the generated ipa file.
     */
    private boolean uploadSymbols = true;

    public boolean getUploadSymbols() {
        return uploadSymbols;
    }

    @IgnoreUnused
    public void setUploadSymbols(boolean uploadSymbols) {
        this.uploadSymbols = uploadSymbols;
    }

    /**
     * (Boolean) Option to include Bitcode.
     */
    private boolean uploadBitcode = false;

    public boolean getUploadBitcode() {
        return uploadBitcode;
    }

    @IgnoreUnused
    public void setUploadBitcode(boolean uploadBitcode) {
        this.uploadBitcode = uploadBitcode;
    }

    /**
     * (Boolean) For non-App Store exports, should Xcode re-compile the app from bitcode? Defaults to FALSE.
     */
    private boolean compileBitcode = false;

    public boolean getCompileBitcode() {
        return compileBitcode;
    }

    @IgnoreUnused
    public void setCompileBitcode(boolean compileBitcode) {
        this.compileBitcode = compileBitcode;
    }

    /**
     * (Boolean) For non-App Store exports, if the app uses On Demand Resources and this is YES,
     * asset packs are embedded in the app bundle so that the app can be tested without a server to host asset packs.
     * Defaults to YES unless onDemandResourcesAssetPacksBaseURL is specified.
     */
    private boolean embedOnDemandResourcesAssetPacksInBundle = true;

    public boolean getEmbedOnDemandResourcesAssetPacksInBundle() {
        return embedOnDemandResourcesAssetPacksInBundle;
    }

    @IgnoreUnused
    public void setEmbedOnDemandResourcesAssetPacksInBundle(boolean embedOnDemandResourcesAssetPacksInBundle) {
        this.embedOnDemandResourcesAssetPacksInBundle = embedOnDemandResourcesAssetPacksInBundle;
    }

    /**
     * For non-App Store exports, if the app is using CloudKit, this configures
     * the "com.apple.developer.icloud-container-environment" entitlement. Available options: Development and Production.
     * Defaults to Development.
     */
    String iCloudContainerEnvironment;

    public String getICloudContainerEnvironment() {
        return iCloudContainerEnvironment;
    }

    @IgnoreUnused
    public void setICloudContainerEnvironment(String iCloudContainerEnvironment) {
        this.iCloudContainerEnvironment = iCloudContainerEnvironment;
    }

    /**
     * manifest : Dictionary
     *
     * For non-App Store exports, users can download your app over the web by opening your distribution manifest file
     * in a web browser. To generate a distribution manifest, the value of this key should be a dictionary with
     * three sub-keys: appURL, displayImageURL, fullSizeImageURL. The additional sub-key assetPackManifestURL is required
     * when using on demand resources.
     */

    String appURL;

    public String getAppURL() {
        return appURL;
    }

    @IgnoreUnused
    public void setAppURL(String appURL) {
        this.appURL = appURL;
    }

    String displayImageURL;

    public String getDisplayImageURL() {
        return displayImageURL;
    }

    @IgnoreUnused
    public void setDisplayImageURL(String displayImageURL) {
        this.displayImageURL = displayImageURL;
    }

    String fullSizeImageURL;

    public String getFullSizeImageURL() {
        return fullSizeImageURL;
    }

    @IgnoreUnused
    public void setFullSizeImageURL(String fullSizeImageURL) {
        this.fullSizeImageURL = fullSizeImageURL;
    }

    /**
     * Describes how Xcode should export the archive. Available options: app-store, ad-hoc, package, enterprise,
     * development, and developer-id. The list of options varies based on the type of archive. Defaults to development.
     */
    String onDemandResourcesAssetPacksBaseURL;

    public String getOnDemandResourcesAssetPacksBaseURL() {
        return onDemandResourcesAssetPacksBaseURL;
    }

    @IgnoreUnused
    public void setOnDemandResourcesAssetPacksBaseURL(String onDemandResourcesAssetPacksBaseURL) {
        this.onDemandResourcesAssetPacksBaseURL = onDemandResourcesAssetPacksBaseURL;
    }

    /**
     * For non-App Store exports, should Xcode thin the package for one or more device variants?
     * Available options: <none> (Xcode produces a non-thinned universal app), <thin-for-all-variants>
     * (Xcode produces a universal app and all available thinned variants), or a model identifier for a specific
     * device (e.g. "iPhone7,1"). Defaults to <none>.
     */
    String thinning;

    public String getThinning() {
        return thinning;
    }

    @IgnoreUnused
    public void setThinning(String thinning) {
        this.thinning = thinning;
    }

    /**
     * Defined export options plist file path
     */
    String plistFile;

    public String getPlistFile() {
        return plistFile;
    }

    @IgnoreUnused
    public void setPlistFile(String plistFile) {
        this.plistFile = plistFile;
    }

    public boolean isUserDefinedExportPlist() {
        return plistFile != null;
    }
}
