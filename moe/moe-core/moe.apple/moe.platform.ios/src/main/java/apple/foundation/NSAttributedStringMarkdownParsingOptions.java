package apple.foundation;

import apple.NSObject;
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
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAttributedStringMarkdownParsingOptions extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSAttributedStringMarkdownParsingOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSAttributedStringMarkdownParsingOptions alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSAttributedStringMarkdownParsingOptions allocWithZone(VoidPtr zone);

    /**
     * Whether to allow parsing extensions to Markdown that specify extended attributes. Defaults to NO (only parse CommonMark syntax).
     */
    @Generated
    @Selector("allowsExtendedAttributes")
    public native boolean allowsExtendedAttributes();

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
     * The policy to apply if the Markdown source triggers a parsing error.
     * The default is NSAttributedStringMarkdownParsingFailureReturnError.
     */
    @Generated
    @Selector("failurePolicy")
    @NInt
    public native long failurePolicy();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSAttributedStringMarkdownParsingOptions init();

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
     * What subset of Markdown syntax will be interpreted to produce relevant attributes in the final result.
     * Excluded syntax will still be parsed, and the text will be included in the final result. However, it will not have attributes applied to it.
     */
    @Generated
    @Selector("interpretedSyntax")
    @NInt
    public native long interpretedSyntax();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * The BCP-47 language code for this document. If not nil, the NSLanguageAttributeName attribute will be applied to any range in the returned string that doesn't otherwise specify a language attribute.
     * The default is nil, which applies no attributes.
     */
    @Generated
    @Selector("languageCode")
    public native String languageCode();

    @Generated
    @Owned
    @Selector("new")
    public static native NSAttributedStringMarkdownParsingOptions new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Whether to allow parsing extensions to Markdown that specify extended attributes. Defaults to NO (only parse CommonMark syntax).
     */
    @Generated
    @Selector("setAllowsExtendedAttributes:")
    public native void setAllowsExtendedAttributes(boolean value);

    /**
     * The policy to apply if the Markdown source triggers a parsing error.
     * The default is NSAttributedStringMarkdownParsingFailureReturnError.
     */
    @Generated
    @Selector("setFailurePolicy:")
    public native void setFailurePolicy(@NInt long value);

    /**
     * What subset of Markdown syntax will be interpreted to produce relevant attributes in the final result.
     * Excluded syntax will still be parsed, and the text will be included in the final result. However, it will not have attributes applied to it.
     */
    @Generated
    @Selector("setInterpretedSyntax:")
    public native void setInterpretedSyntax(@NInt long value);

    /**
     * The BCP-47 language code for this document. If not nil, the NSLanguageAttributeName attribute will be applied to any range in the returned string that doesn't otherwise specify a language attribute.
     * The default is nil, which applies no attributes.
     */
    @Generated
    @Selector("setLanguageCode:")
    public native void setLanguageCode(String value);

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
