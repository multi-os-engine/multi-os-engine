package apple.widgetkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("WidgetKit")
@Runtime(CRuntime.class)
public final class WidgetKit {
    static {
        NatJ.register();
    }

    @Generated
    private WidgetKit() {
    }

    /**
     * A key you use to access the widget's kind. The value matches the `kind` property specified in the widget’s
     * configuration.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WGWidgetUserInfoKeyKind();

    /**
     * A key you use to access the widget's family.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WGWidgetUserInfoKeyFamily();

    /**
     * A key you use to access the activity ID if the widget represents a Live Activity.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String WGWidgetUserInfoKeyActivityID();

    /**
     * A string that the system passes to the app on launch from a Live Activity that doesn't provide
     * a URL.
     * 
     * In many cases, you use <doc://com.apple.documentation/documentation/swiftui/view/widgeturl(_:)>
     * to allow users to tap a Live Activity and open a screen in the app with functionality that best fits the
     * Live Activity. If you don't use the `widgetURL(_:)` modifier to provide a URL, the system launches
     * your app and passes `NSUserActivityTypeLiveActivity` as the
     * <doc://com.apple.documentation/documentation/foundation/nsuseractivity/1409611-activitytype>
     * of <doc://com.apple.documentation/documentation/foundation/nsuseractivity>
     * upon launch. Check for this value on launch to open a screen in your app that fits the context of the
     * active Live Activity.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUserActivityTypeLiveActivity();
}
