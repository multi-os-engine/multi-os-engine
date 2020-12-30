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

package apple.iad.c;

import apple.coregraphics.struct.CGSize;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("iAd")
@Runtime(CRuntime.class)
public final class iAd {
    static {
        NatJ.register();
    }

    @Generated
    private iAd() {
    }

    /**
     * @const ADErrorDomain
     * 
     * @discussion
     * Error domain for NSErrors passed to the following delegate methods:
     * 
     *   • -[ADBannerViewDelegate bannerView:didFailToReceiveAdWithError:]
     *   • -[ADInterstitialAdDelegate interstitialAd:didFailWithError:]
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ADErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ADBannerContentSizeIdentifier320x50();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ADBannerContentSizeIdentifier480x32();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ADBannerContentSizeIdentifierPortrait();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ADBannerContentSizeIdentifierLandscape();

    /**
     * @const ADClientErrorDomain
     * 
     * @discussion
     * Error domain for NSErrors passed to the completionHandler as a
     * result of calling:
     * 
     *   • -[[ADClient SharedClient] requestAttributionDetailsWithBlock]
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ADClientErrorDomain();

    @Generated
    @CFunction
    @ByValue
    public static native CGSize ADClampedBannerSize(@ByValue CGSize size);
}
