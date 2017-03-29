package org.moe.gradle.options;

import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.Nullable;

public class ExportOptions {

    /**
     * (String) The method of distribution, which can be set as any of the following:
     * app-store
     * enterprise
     * ad-hoc
     * development
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
    private boolean uploadBitcode = true;

    public boolean getUploadBitcode() {
        return uploadBitcode;
    }

    @IgnoreUnused
    public void setUploadBitcode(boolean uploadBitcode) {
        this.uploadBitcode = uploadBitcode;
    }
}
