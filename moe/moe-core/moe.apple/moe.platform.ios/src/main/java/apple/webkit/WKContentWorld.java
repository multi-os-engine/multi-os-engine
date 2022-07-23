package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A WKContentWorld object allows you to separate your application's interaction with content displayed in a WKWebView
 * into different roles that cannot interfere with one another.
 * <p>
 * WKContentWorld objects should be treated as namespaces. This is useful for keeping your application's web content
 * environment separate from the environment of the web page content itself,
 * as well as managing multiple different environments within your own application.
 * For example:
 * - If you have complex scripting logic to bridge your web content to your application but your web content also has
 * complex scripting libraries of its own,
 * you avoid possible conflicts by using a client WKContentWorld.
 * - If you are writing a general purpose web browser that supports JavaScript extensions, you would use a different
 * client WKContentWorld for each extension.
 * <p>
 * Since a WKContentWorld object is a namespace it does not contain any data itself.
 * For example:
 * - If you store a variable in JavaScript in the scope of a particular WKContentWorld while viewing a particular web
 * page document, after navigating to a new document that variable will be gone.
 * - If you store a variable in JavaScript in the scope of a particular WKContentWorld in one WKWebView, that variable
 * will not exist in the same world in another WKWebView.
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKContentWorld extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKContentWorld(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKContentWorld alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native WKContentWorld allocWithZone(VoidPtr zone);

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

    /**
     * Retrieve the default world for API client use.
     * <p>
     * When using a content world different from the page content world you can still manipulate the DOM and built-in
     * DOM APIs but without conflicting with other aspects of the page content (e.g. JavaScript from the web page
     * content itself)
     * Repeated calls will retrieve the same WKContentWorld instance.
     */
    @Generated
    @Selector("defaultClientWorld")
    public static native WKContentWorld defaultClientWorld();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native WKContentWorld init();

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

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * The name of the WKContentWorld
     * <p>
     * The pageWorld and defaultClientWorld instances will have a nil name.
     * All other instances will have the non-nil name they were accessed by.
     */
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native WKContentWorld new_objc();

    /**
     * Retrieve the main world that page content itself uses.
     * <p>
     * When interacting with page content in a WKWebView using the page content world you can disrupt the operation of
     * page content (e.g. by conflicting with variable names in JavaScript set by the web page content itself).
     */
    @Generated
    @Selector("pageWorld")
    public static native WKContentWorld pageWorld();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Retrieves a named content world for API client use.
     * <p>
     * When using a content world different from the page content world you can still manipulate the DOM and built-in
     * DOM APIs but without conflicting with other aspects of the page content (e.g. JavaScript from the web page
     * content itself)
     * As long as a particular named WKContentWorld instance has not been deallocated, repeated calls with the same name
     * will retrieve that same WKContentWorld instance.
     * Each named content world is distinct from all other named content worlds, the defaultClientWorld, and the
     * pageWorld.
     * The name can be used to keep distinct worlds identifiable anywhere a world might be surfaced in a user interface.
     * For example, the different worlds used in your application will be surfaced by name in the WebKit Web Inspector.
     *
     * @param name The name of the WKContentWorld to retrieve.
     */
    @Generated
    @Selector("worldWithName:")
    public static native WKContentWorld worldWithName(String name);
}
