package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.uikit.struct.NSDirectionalEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCollectionLayoutItem extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCollectionLayoutItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCollectionLayoutItem alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSCollectionLayoutItem allocWithZone(VoidPtr zone);

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

    /**
     * +---------------------+
     * +-------------+<----|Specified layout size|
     * |             |     +---------------------+
     * |  +-------+  |     +--------------------------+
     * |  |~~~~~~~|  |     |Final size (after         |
     * |  |~~~~~~~|<-+-----|contentInsets are applied)|
     * |  +-------+  |     +--------------------------+
     * |             |
     * +-------------+
     * <p>
     * Use contentInsets on an item to adjust the final size of the item after layout is computed.
     * useful for grid style layouts to apply even spacing around each the edges of each item.
     * <p>
     * Note: contentInsets are ignored for any axis with an .estimated dimension
     */
    @Generated
    @Selector("contentInsets")
    @ByValue
    public native NSDirectionalEdgeInsets contentInsets();

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
     * +--------+
     * |  Top   |
     * +--------+
     * |
     * |
     * +-------+--------------------------+
     * |       v                          |
     * |    +------+                      |
     * +--------+     |    |~~~~~~|        +--------+    |
     * |Leading |-----+->  |~~~~~~| <------|Trailing|    |
     * +--------+     |    |~~~~~~|        +--------+    |
     * |    +------+                      |
     * |        ^                         |
     * +--------+-------------------------+
     * |
     * |
     * +--------+
     * | Bottom |
     * +--------+
     * <p>
     * Specifies additional space required surrounding and item when laying out.
     * Flexible spacing can be used to apportion remaining space after items are laid out to
     * evenly align items among available layout space.
     */
    @Generated
    @Selector("edgeSpacing")
    public native NSCollectionLayoutEdgeSpacing edgeSpacing();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSCollectionLayoutItem init();

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
    @Selector("itemWithLayoutSize:")
    public static native NSCollectionLayoutItem itemWithLayoutSize(NSCollectionLayoutSize layoutSize);

    @Generated
    @Selector("itemWithLayoutSize:supplementaryItems:")
    public static native NSCollectionLayoutItem itemWithLayoutSizeSupplementaryItems(NSCollectionLayoutSize layoutSize,
            NSArray<? extends NSCollectionLayoutSupplementaryItem> supplementaryItems);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layoutSize")
    public native NSCollectionLayoutSize layoutSize();

    @Generated
    @Owned
    @Selector("new")
    public static native NSCollectionLayoutItem new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * +---------------------+
     * +-------------+<----|Specified layout size|
     * |             |     +---------------------+
     * |  +-------+  |     +--------------------------+
     * |  |~~~~~~~|  |     |Final size (after         |
     * |  |~~~~~~~|<-+-----|contentInsets are applied)|
     * |  +-------+  |     +--------------------------+
     * |             |
     * +-------------+
     * <p>
     * Use contentInsets on an item to adjust the final size of the item after layout is computed.
     * useful for grid style layouts to apply even spacing around each the edges of each item.
     * <p>
     * Note: contentInsets are ignored for any axis with an .estimated dimension
     */
    @Generated
    @Selector("setContentInsets:")
    public native void setContentInsets(@ByValue NSDirectionalEdgeInsets value);

    /**
     * +--------+
     * |  Top   |
     * +--------+
     * |
     * |
     * +-------+--------------------------+
     * |       v                          |
     * |    +------+                      |
     * +--------+     |    |~~~~~~|        +--------+    |
     * |Leading |-----+->  |~~~~~~| <------|Trailing|    |
     * +--------+     |    |~~~~~~|        +--------+    |
     * |    +------+                      |
     * |        ^                         |
     * +--------+-------------------------+
     * |
     * |
     * +--------+
     * | Bottom |
     * +--------+
     * <p>
     * Specifies additional space required surrounding and item when laying out.
     * Flexible spacing can be used to apportion remaining space after items are laid out to
     * evenly align items among available layout space.
     */
    @Generated
    @Selector("setEdgeSpacing:")
    public native void setEdgeSpacing(NSCollectionLayoutEdgeSpacing value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supplementaryItems")
    public native NSArray<? extends NSCollectionLayoutSupplementaryItem> supplementaryItems();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
