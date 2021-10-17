package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPresentationIntent extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPresentationIntent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPresentationIntent alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("blockQuoteIntentWithIdentity:nestedInsideIntent:")
    public static native NSPresentationIntent blockQuoteIntentWithIdentityNestedInsideIntent(@NInt long identity,
            NSPresentationIntent parent);

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
    @Selector("codeBlockIntentWithIdentity:languageHint:nestedInsideIntent:")
    public static native NSPresentationIntent codeBlockIntentWithIdentityLanguageHintNestedInsideIntent(
            @NInt long identity, String languageHint, NSPresentationIntent parent);

    /**
     * The column to which this cell belongs (0-based). If the intent is not a cell, this value is 0.
     */
    @Generated
    @Selector("column")
    @NInt
    public native long column();

    /**
     * If the intent is not a table, this value is `nil`.
     */
    @Generated
    @Selector("columnAlignments")
    public native NSArray<? extends NSNumber> columnAlignments();

    /**
     * If the intent is not a table, this value is 0.
     */
    @Generated
    @Selector("columnCount")
    @NInt
    public native long columnCount();

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("headerIntentWithIdentity:level:nestedInsideIntent:")
    public static native NSPresentationIntent headerIntentWithIdentityLevelNestedInsideIntent(@NInt long identity,
            @NInt long level, NSPresentationIntent parent);

    /**
     * If the intent is not a header, this value is 0.
     */
    @Generated
    @Selector("headerLevel")
    @NInt
    public native long headerLevel();

    /**
     * An integer value which uniquely identifies this intent in the document. Identity disambiguates attributes which apply to contiguous text -- for example, two headers in a row with the same level. It can also be used to track the location in an attributed string of a particular part of a document, even after mutation.
     */
    @Generated
    @Selector("identity")
    @NInt
    public native long identity();

    /**
     * The indentation level of this intent. Each nested list increases the indentation level by one; all elements within the same list (and not then nested into a child list intent) have the same indentation level.
     * Text outside list intents has an indentation level of 0.
     */
    @Generated
    @Selector("indentationLevel")
    @NInt
    public native long indentationLevel();

    @Generated
    @Selector("init")
    public native NSPresentationIntent init();

    @Generated
    @Selector("initWithCoder:")
    public native NSPresentationIntent initWithCoder(NSCoder coder);

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
    @Selector("intentKind")
    @NInt
    public native long intentKind();

    /**
     * Returns `YES` if this intent is equivalent to the other presentation intent. Equivalence is the same as equality except that identity is not taken into account.
     */
    @Generated
    @Selector("isEquivalentToPresentationIntent:")
    public native boolean isEquivalentToPresentationIntent(NSPresentationIntent other);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * If the intent is not a code block, this value is `nil`.
     */
    @Generated
    @Selector("languageHint")
    public native String languageHint();

    @Generated
    @Selector("listItemIntentWithIdentity:ordinal:nestedInsideIntent:")
    public static native NSPresentationIntent listItemIntentWithIdentityOrdinalNestedInsideIntent(@NInt long identity,
            @NInt long ordinal, NSPresentationIntent parent);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("orderedListIntentWithIdentity:nestedInsideIntent:")
    public static native NSPresentationIntent orderedListIntentWithIdentityNestedInsideIntent(@NInt long identity,
            NSPresentationIntent parent);

    /**
     * If the intent is not a list, this value is 0.
     */
    @Generated
    @Selector("ordinal")
    @NInt
    public native long ordinal();

    @Generated
    @Selector("paragraphIntentWithIdentity:nestedInsideIntent:")
    public static native NSPresentationIntent paragraphIntentWithIdentityNestedInsideIntent(@NInt long identity,
            NSPresentationIntent parent);

    @Generated
    @Selector("parentIntent")
    public native NSPresentationIntent parentIntent();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The row to which this cell belongs (0-based). If the intent is not a row, this value is 0. Header rows are always row 0. If the table has more rows, those start at row 1.
     */
    @Generated
    @Selector("row")
    @NInt
    public native long row();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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
    @Selector("tableCellIntentWithIdentity:column:nestedInsideIntent:")
    public static native NSPresentationIntent tableCellIntentWithIdentityColumnNestedInsideIntent(@NInt long identity,
            @NInt long column, NSPresentationIntent parent);

    @Generated
    @Selector("tableHeaderRowIntentWithIdentity:nestedInsideIntent:")
    public static native NSPresentationIntent tableHeaderRowIntentWithIdentityNestedInsideIntent(@NInt long identity,
            NSPresentationIntent parent);

    @Generated
    @Selector("tableIntentWithIdentity:columnCount:alignments:nestedInsideIntent:")
    public static native NSPresentationIntent tableIntentWithIdentityColumnCountAlignmentsNestedInsideIntent(
            @NInt long identity, @NInt long columnCount, NSArray<? extends NSNumber> alignments,
            NSPresentationIntent parent);

    @Generated
    @Selector("tableRowIntentWithIdentity:row:nestedInsideIntent:")
    public static native NSPresentationIntent tableRowIntentWithIdentityRowNestedInsideIntent(@NInt long identity,
            @NInt long row, NSPresentationIntent parent);

    @Generated
    @Selector("thematicBreakIntentWithIdentity:nestedInsideIntent:")
    public static native NSPresentationIntent thematicBreakIntentWithIdentityNestedInsideIntent(@NInt long identity,
            NSPresentationIntent parent);

    @Generated
    @Selector("unorderedListIntentWithIdentity:nestedInsideIntent:")
    public static native NSPresentationIntent unorderedListIntentWithIdentityNestedInsideIntent(@NInt long identity,
            NSPresentationIntent parent);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
