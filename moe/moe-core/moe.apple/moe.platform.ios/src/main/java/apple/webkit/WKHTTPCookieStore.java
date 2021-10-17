package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSHTTPCookie;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.webkit.protocol.WKHTTPCookieStoreObserver;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A WKHTTPCookieStore object allows managing the HTTP cookies associated with a particular WKWebsiteDataStore.
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKHTTPCookieStore extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKHTTPCookieStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Adds a WKHTTPCookieStoreObserver object with the cookie store.
     * <p>
     * The observer is not retained by the receiver. It is your responsibility
     * to unregister the observer before it becomes invalid.
     *
     * @param observer The observer object to add.
     */
    @Generated
    @Selector("addObserver:")
    public native void addObserver(@Mapped(ObjCObjectMapper.class) WKHTTPCookieStoreObserver observer);

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKHTTPCookieStore alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
     * Delete the specified cookie.
     *
     * @param completionHandler A block to invoke once the cookie has been deleted.
     */
    @Generated
    @Selector("deleteCookie:completionHandler:")
    public native void deleteCookieCompletionHandler(NSHTTPCookie cookie,
            @ObjCBlock(name = "call_deleteCookieCompletionHandler") Block_deleteCookieCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteCookieCompletionHandler {
        @Generated
        void call_deleteCookieCompletionHandler();
    }

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Fetches all stored cookies.
     *
     * @param completionHandler A block to invoke with the fetched cookies.
     */
    @Generated
    @Selector("getAllCookies:")
    public native void getAllCookies(@ObjCBlock(name = "call_getAllCookies") Block_getAllCookies completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getAllCookies {
        @Generated
        void call_getAllCookies(NSArray<? extends NSHTTPCookie> arg0);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native WKHTTPCookieStore init();

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

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Removes a WKHTTPCookieStoreObserver object from the cookie store.
     *
     * @param observer The observer to remove.
     */
    @Generated
    @Selector("removeObserver:")
    public native void removeObserver(@Mapped(ObjCObjectMapper.class) WKHTTPCookieStoreObserver observer);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Set a cookie.
     *
     * @param cookie            The cookie to set.
     * @param completionHandler A block to invoke once the cookie has been stored.
     */
    @Generated
    @Selector("setCookie:completionHandler:")
    public native void setCookieCompletionHandler(NSHTTPCookie cookie,
            @ObjCBlock(name = "call_setCookieCompletionHandler") Block_setCookieCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCookieCompletionHandler {
        @Generated
        void call_setCookieCompletionHandler();
    }

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
}
