package apple.pdfkit;

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
 * API-Since: 11.0
 */
@Generated
@Library("PDFKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PDFOutline extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PDFOutline(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Action performed when a user clicks on the PDFOutline. Equivalent to calling -[destination] above when the
     * outline
     * has a destination (-[action] will return a PDFActionGoTo object). Some outlines do not have destinations however
     * and
     * you must therefore call this method. The root outline item will never return either an action or a destination.
     * Calling -[setAction] on the root item has no effect.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("action")
    public native PDFAction action();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PDFOutline alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PDFOutline allocWithZone(VoidPtr zone);

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

    /**
     * PDFOutline child at index. Will throw exception if index is out of range.
     */
    @Generated
    @Selector("childAtIndex:")
    public native PDFOutline childAtIndex(@NUInt long index);

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

    /**
     * Set: Has no effect on the root PDFOutline item. If the item previously had an action associated with it, the
     * action is
     * released (PDFOutline items cannot have both an action and a destination, they are mutually exclusive).
     * The preferred way though is to call -[setAction] below.
     */
    @Generated
    @Selector("destination")
    public native PDFDestination destination();

    /**
     * The PDFDocument the outline is associated with.
     */
    @Generated
    @Selector("document")
    public native PDFDocument document();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Returns the index of the outline item - that is, relative to its siblings (and from the perspective of the
     * parent).
     * The root outline item (or any item with no parent) is always index 0.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("index")
    @NUInt
    public native long index();

    /**
     * Returns a PDFOutline object. If this object is to be the outline root, you will need to add additional PDFOutline
     * objects to form the outline hierarchy you desire. You will then need to add it to a PDFDocument by passing it to
     * -[PDFDocument setOutlineRoot:]. If this is to be a child (non-root) outline you will need to set a label for it
     * and
     * either a destination or action for it. Also, you will need to add it as a child of another PDFOutline object.
     */
    @Generated
    @Selector("init")
    public native PDFOutline init();

    /**
     * To build up a PDFOutline hierarchy, you call this method to add children outline items. For the simplest of
     * outlines
     * you would, at the very least, have to add items to the outline root item.
     * NOTE: Be careful when calling this for a PDFOutline item which already has a parent (for example when moving
     * items
     * around within an outline hierarchy) - you should retain the item and call -[removeFromParent] first.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("insertChild:atIndex:")
    public native void insertChildAtIndex(PDFOutline child, @NUInt long index);

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
     * Indicates whether PDFOutline item is initially disclosed or not. If the outline item has no children, -[isOpen]
     * is
     * always NO and calling -[setIsOpen] has no effect. The root item always returns YES for -[isOpen] and calling
     * -[setIsOpen] also has no effect.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("isOpen")
    public native boolean isOpen();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * The label for the outline. The root PDFOutline has no label and is only a container for children PDFOutlines.
     */
    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    public static native PDFOutline new_objc();

    /**
     * Number of PDFOutline children this PDFOutline has.
     */
    @Generated
    @Selector("numberOfChildren")
    @NUInt
    public native long numberOfChildren();

    /**
     * Returns the parent outline (the root outline will return nil).
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("parent")
    public native PDFOutline parent();

    /**
     * Removes self from parent (for root outline, does nothing since the root has no parent).
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("removeFromParent")
    public native void removeFromParent();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Action performed when a user clicks on the PDFOutline. Equivalent to calling -[destination] above when the
     * outline
     * has a destination (-[action] will return a PDFActionGoTo object). Some outlines do not have destinations however
     * and
     * you must therefore call this method. The root outline item will never return either an action or a destination.
     * Calling -[setAction] on the root item has no effect.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setAction:")
    public native void setAction(PDFAction value);

    /**
     * Set: Has no effect on the root PDFOutline item. If the item previously had an action associated with it, the
     * action is
     * released (PDFOutline items cannot have both an action and a destination, they are mutually exclusive).
     * The preferred way though is to call -[setAction] below.
     */
    @Generated
    @Selector("setDestination:")
    public native void setDestination(PDFDestination value);

    /**
     * Indicates whether PDFOutline item is initially disclosed or not. If the outline item has no children, -[isOpen]
     * is
     * always NO and calling -[setIsOpen] has no effect. The root item always returns YES for -[isOpen] and calling
     * -[setIsOpen] also has no effect.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setIsOpen:")
    public native void setIsOpen(boolean value);

    /**
     * The label for the outline. The root PDFOutline has no label and is only a container for children PDFOutlines.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

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
