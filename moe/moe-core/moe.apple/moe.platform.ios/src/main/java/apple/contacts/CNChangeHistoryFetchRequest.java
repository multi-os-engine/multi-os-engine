package apple.contacts;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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

/**
 * Specifies the criteria to fetch change history.
 * <p>
 * Changes to contacts are always returned.
 * All changes are coalesced to remove redundant adds, updates and deletes.
 * This request is used with [CNContactStore enumeratorForChangeHistoryFetchRequest:error:].
 */
@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNChangeHistoryFetchRequest extends CNFetchRequest implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CNChangeHistoryFetchRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Additional keys to include in the fetched contacts.
     * <p>
     * By default, only @c CNContactIdentifierKey will be fetched. If you
     * would like to include additional key descriptors to process the contacts,
     * include the key descriptors you need.
     * <p>
     * [@c] CNContactIdentifierKey will always be fetched, whether you
     * request it or not.
     */
    @Generated
    @Selector("additionalContactKeyDescriptors")
    public native NSArray<?> additionalContactKeyDescriptors();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNChangeHistoryFetchRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CNChangeHistoryFetchRequest allocWithZone(VoidPtr zone);

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Exclude changes made by certain authors.
     * <p>
     * If set, transactions made by the specified authors will be excluded
     * from the results. Use this, in conjunction with @c CNSaveRequest.transactionAuthor,
     * to suppress processing of changes you already know about.
     */
    @Generated
    @Selector("excludedTransactionAuthors")
    public native NSArray<String> excludedTransactionAuthors();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Set to @c YES to also fetch group changes. Default is @c NO.
     */
    @Generated
    @Selector("includeGroupChanges")
    public native boolean includeGroupChanges();

    @Generated
    @Selector("init")
    public native CNChangeHistoryFetchRequest init();

    @Generated
    @Selector("initWithCoder:")
    public native CNChangeHistoryFetchRequest initWithCoder(NSCoder coder);

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
     * To return mutable contacts and groups.
     * <p>
     * If @c YES returns mutable contacts and groups. Default is @c NO.
     */
    @Generated
    @Selector("mutableObjects")
    public native boolean mutableObjects();

    @Generated
    @Owned
    @Selector("new")
    public static native CNChangeHistoryFetchRequest new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Additional keys to include in the fetched contacts.
     * <p>
     * By default, only @c CNContactIdentifierKey will be fetched. If you
     * would like to include additional key descriptors to process the contacts,
     * include the key descriptors you need.
     * <p>
     * [@c] CNContactIdentifierKey will always be fetched, whether you
     * request it or not.
     */
    @Generated
    @Selector("setAdditionalContactKeyDescriptors:")
    public native void setAdditionalContactKeyDescriptors(NSArray<?> value);

    /**
     * Exclude changes made by certain authors.
     * <p>
     * If set, transactions made by the specified authors will be excluded
     * from the results. Use this, in conjunction with @c CNSaveRequest.transactionAuthor,
     * to suppress processing of changes you already know about.
     */
    @Generated
    @Selector("setExcludedTransactionAuthors:")
    public native void setExcludedTransactionAuthors(NSArray<String> value);

    /**
     * Set to @c YES to also fetch group changes. Default is @c NO.
     */
    @Generated
    @Selector("setIncludeGroupChanges:")
    public native void setIncludeGroupChanges(boolean value);

    /**
     * To return mutable contacts and groups.
     * <p>
     * If @c YES returns mutable contacts and groups. Default is @c NO.
     */
    @Generated
    @Selector("setMutableObjects:")
    public native void setMutableObjects(boolean value);

    /**
     * Returns contact changes as unified contacts.
     * <p>
     * If @c YES, returns unified contact history. Otherwise returns individual contact history. Default is @c YES.
     * <p>
     * [@note]        A unified contact is the aggregation of properties from a set of linked individual contacts.
     * If an individual contact is not linked then the unified contact is simply that individual contact.
     */
    @Generated
    @Selector("setShouldUnifyResults:")
    public native void setShouldUnifyResults(boolean value);

    /**
     * Request changes made after a certain point.
     * <p>
     * If non-nil, only changes made after this point in history will be returned.
     * <p>
     * If nil, a @c CNChangeHistoryDropEverythingEvent will be returned, followed by an add event
     * for every contact and group currently in the contacts database.
     */
    @Generated
    @Selector("setStartingToken:")
    public native void setStartingToken(NSData value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Returns contact changes as unified contacts.
     * <p>
     * If @c YES, returns unified contact history. Otherwise returns individual contact history. Default is @c YES.
     * <p>
     * [@note]        A unified contact is the aggregation of properties from a set of linked individual contacts.
     * If an individual contact is not linked then the unified contact is simply that individual contact.
     */
    @Generated
    @Selector("shouldUnifyResults")
    public native boolean shouldUnifyResults();

    /**
     * Request changes made after a certain point.
     * <p>
     * If non-nil, only changes made after this point in history will be returned.
     * <p>
     * If nil, a @c CNChangeHistoryDropEverythingEvent will be returned, followed by an add event
     * for every contact and group currently in the contacts database.
     */
    @Generated
    @Selector("startingToken")
    public native NSData startingToken();

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
