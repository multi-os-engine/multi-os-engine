package apple.carplay;

import apple.NSObject;
import apple.carplay.protocol.CPNowPlayingTemplateObserver;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPNowPlayingTemplate extends CPTemplate {
    static {
        NatJ.register();
    }

    @Generated
    protected CPNowPlayingTemplate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Add an observer. Observers are notified about now playing template events.
     */
    @Generated
    @Selector("addObserver:")
    public native void addObserver(@Mapped(ObjCObjectMapper.class) CPNowPlayingTemplateObserver observer);

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPNowPlayingTemplate alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CPNowPlayingTemplate allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPNowPlayingTemplate init();

    @Generated
    @Selector("initWithCoder:")
    public native CPNowPlayingTemplate initWithCoder(NSCoder coder);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    /**
     * A Boolean value indicating whether the string that displays the album and artist above the playback controls should be a tappable button
     * <p>
     * Set the value of this property to @c YES to enable the button.
     * <p>
     * Defaults to NO.
     */
    @Generated
    @Selector("isAlbumArtistButtonEnabled")
    public native boolean isAlbumArtistButtonEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * A Boolean value indicating whether the "Up Next" button on the upper right of a Now Playing view is enabled.
     * <p>
     * Set the value of this property to @c YES to enable the button.
     * <p>
     * Defaults to NO.
     */
    @Generated
    @Selector("isUpNextButtonEnabled")
    public native boolean isUpNextButtonEnabled();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CPNowPlayingTemplate new_objc();

    /**
     * Playback control buttons on the Now Playing screen, like repeat, shuffle, and more.
     * <p>
     * Your application may specify a maximum of 5 now playing buttons.
     * <p>
     * Buttons are filled in array order, from the leading side to the trailing side of the screen.
     */
    @Generated
    @Selector("nowPlayingButtons")
    public native NSArray<? extends CPNowPlayingButton> nowPlayingButtons();

    /**
     * Remove an observer.
     */
    @Generated
    @Selector("removeObserver:")
    public native void removeObserver(@Mapped(ObjCObjectMapper.class) CPNowPlayingTemplateObserver observer);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A Boolean value indicating whether the string that displays the album and artist above the playback controls should be a tappable button
     * <p>
     * Set the value of this property to @c YES to enable the button.
     * <p>
     * Defaults to NO.
     */
    @Generated
    @Selector("setAlbumArtistButtonEnabled:")
    public native void setAlbumArtistButtonEnabled(boolean value);

    /**
     * A Boolean value indicating whether the "Up Next" button on the upper right of a Now Playing view is enabled.
     * <p>
     * Set the value of this property to @c YES to enable the button.
     * <p>
     * Defaults to NO.
     */
    @Generated
    @Selector("setUpNextButtonEnabled:")
    public native void setUpNextButtonEnabled(boolean value);

    /**
     * If your template elects to display the "Up Next" button, you may optionally specify a string
     * indicating the title for the up next button. If no title is specified, a default system title
     * will be used.
     *
     * @see -[CPNowPlayingTemplate upNextButtonEnabled].
     */
    @Generated
    @Selector("setUpNextTitle:")
    public native void setUpNextTitle(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Access the shared now playing template for your app. Instead of creating your own
     * now playing template, you should configure the properties of this shared instance.
     * <p>
     * You should present this shared instance when your app needs to present now playing,
     * for example in response to the user selecting a playable item.
     * <p>
     * When the system needs to present now playing on behalf of your app, it will present
     * this shared instance.
     */
    @Generated
    @Selector("sharedTemplate")
    public static native CPNowPlayingTemplate sharedTemplate();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * If your template elects to display the "Up Next" button, you may optionally specify a string
     * indicating the title for the up next button. If no title is specified, a default system title
     * will be used.
     *
     * @see -[CPNowPlayingTemplate upNextButtonEnabled].
     */
    @Generated
    @Selector("upNextTitle")
    public native String upNextTitle();

    /**
     * Update the buttons displayed in this Now Playing template.
     */
    @Generated
    @Selector("updateNowPlayingButtons:")
    public native void updateNowPlayingButtons(NSArray<? extends CPNowPlayingButton> nowPlayingButtons);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
