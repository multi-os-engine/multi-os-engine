package apple.pdfkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("PDFKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PDFActionResetForm extends PDFAction implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PDFActionResetForm(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PDFActionResetForm alloc();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Fields are an array of NSString objects corresponding to the fieldNames of Widget annotations on the page.
     * May return nil.
     */
    @Generated
    @Selector("fields")
    public native NSArray<String> fields();

    /**
     * If -[fieldsIncludedAreCleared] is YES, then the widget annotations associated with the fieldNames in the fields
     * array above are to be cleared, i.e. uncheck checkboxes, clear text fields, reset radio buttons, etc.
     * If -[fieldsIncludedAreCleared] is NO, then every widget annotation associated with the fields array is not to be
     * cleared, meaning that every widget annotation in the document whose field name is not listed is to be cleared.
     * Both situations above only occur when this reset-form action is performed.
     */
    @Generated
    @Selector("fieldsIncludedAreCleared")
    public native boolean fieldsIncludedAreCleared();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Initially there will be no fields, and -[fieldsIncludedAreCleared] will be YES.
     */
    @Generated
    @Selector("init")
    public native PDFActionResetForm init();

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

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Fields are an array of NSString objects corresponding to the fieldNames of Widget annotations on the page.
     * May return nil.
     */
    @Generated
    @Selector("setFields:")
    public native void setFields(NSArray<String> value);

    /**
     * If -[fieldsIncludedAreCleared] is YES, then the widget annotations associated with the fieldNames in the fields
     * array above are to be cleared, i.e. uncheck checkboxes, clear text fields, reset radio buttons, etc.
     * If -[fieldsIncludedAreCleared] is NO, then every widget annotation associated with the fields array is not to be
     * cleared, meaning that every widget annotation in the document whose field name is not listed is to be cleared.
     * Both situations above only occur when this reset-form action is performed.
     */
    @Generated
    @Selector("setFieldsIncludedAreCleared:")
    public native void setFieldsIncludedAreCleared(boolean value);

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