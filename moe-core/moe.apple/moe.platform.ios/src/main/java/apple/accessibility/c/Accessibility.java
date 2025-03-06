package apple.accessibility.c;

import apple.coregraphics.opaque.CGColorRef;
import apple.foundation.NSArray;
import apple.foundation.NSUUID;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;
import apple.foundation.NSError;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.ann.ObjCBlock;

@Generated
@Library("Accessibility")
@Runtime(CRuntime.class)
public final class Accessibility {
    static {
        NatJ.register();
    }

    @Generated
    private Accessibility() {
    }

    /**
     * Returns a localized description of the CGColorRef for use in accessibility attributes.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXNameFromColor(@NotNull CGColorRef color);

    /**
     * API-Since: 15.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long AXMFiHearingDeviceStreamingEar();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native boolean AXSupportsBidirectionalAXMFiHearingDeviceStreaming();

    /**
     * Returns the CoreBluetooth UUIDs of the hearing device CBPeripherals. This requires that the value of the
     * "com.apple.developer.hearing-aid-app" entitlement match the manufacturer of the CBPeripherals. For bimodal
     * hearing devices the entitlement should be an array of the manufacturers.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native NSArray<? extends NSUUID> AXMFiHearingDevicePairedUUIDs();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXMFiHearingDeviceStreamingEarDidChangeNotification();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXMFiHearingDevicePairedUUIDsDidChangeNotification();

    /**
     * Returns whether the system setting to prefer horizontal text is enabled for languages that support both vertical
     * and horizontal text layout.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native boolean AXPrefersHorizontalTextLayout();

    /**
     * Returns whether the system setting for displaying animations in an animated image is on or off.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CFunction
    public static native boolean AXAnimatedImagesEnabled();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String AXPrefersHorizontalTextLayoutDidChangeNotification();

    /**
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String AXAnimatedImagesEnabledDidChangeNotification();

    /**
     * Returns whether Assistive Access is running.
     * The value does not change during a process's lifetime, so it is not necessary to observe changes.
     * 
     * API-Since: 18.0
     */
    @Generated
    @CFunction
    public static native boolean AXAssistiveAccessEnabled();

    /**
     * Returns whether the system setting to prefer non-blinking text insertion indicators in editable text fields is
     * enabled. Apps that draw custom insertion indicators should honor this setting.
     * 
     * API-Since: 18.0
     */
    @Generated
    @CFunction
    public static native boolean AXPrefersNonBlinkingTextInsertionIndicator();

    /**
     * Open the Settings app to a specific section.
     * If successful, the completion handler will set error to nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @CFunction
    public static native void AXOpenSettingsFeature(@NInt long feature,
            @ObjCBlock(name = "call_AXOpenSettingsFeature") @Nullable Block_AXOpenSettingsFeature completionHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_AXOpenSettingsFeature {
        @Generated
        void call_AXOpenSettingsFeature(@Nullable NSError arg0);
    }

    /**
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXTechnologyVoiceOver();

    /**
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXTechnologySwitchControl();

    /**
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXTechnologyVoiceControl();

    /**
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXTechnologyFullKeyboardAccess();

    /**
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXTechnologySpeakScreen();

    /**
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXTechnologyAutomation();

    /**
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXTechnologyHoverText();

    /**
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXTechnologyZoom();

    /**
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String AXPrefersNonBlinkingTextInsertionIndicatorDidChangeNotification();
}
