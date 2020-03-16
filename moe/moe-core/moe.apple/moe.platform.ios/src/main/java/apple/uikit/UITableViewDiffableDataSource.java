package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UITableViewDataSource;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITableViewDiffableDataSource<_SectionIdentifierType, _ItemIdentifierType> extends NSObject
        implements UITableViewDataSource {
    static {
        NatJ.register();
    }

    @Generated
    protected UITableViewDiffableDataSource(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITableViewDiffableDataSource<?, ?> alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("applySnapshot:animatingDifferences:")
    public native void applySnapshotAnimatingDifferences(
            NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> snapshot,
            boolean animatingDifferences);

    @Generated
    @Selector("applySnapshot:animatingDifferences:completion:")
    public native void applySnapshotAnimatingDifferencesCompletion(
            NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> snapshot,
            boolean animatingDifferences,
            @ObjCBlock(name = "call_applySnapshotAnimatingDifferencesCompletion") Block_applySnapshotAnimatingDifferencesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applySnapshotAnimatingDifferencesCompletion {
        @Generated
        void call_applySnapshotAnimatingDifferencesCompletion();
    }

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
    @Selector("defaultRowAnimation")
    @NInt
    public native long defaultRowAnimation();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("indexPathForItemIdentifier:")
    public native NSIndexPath indexPathForItemIdentifier(
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType identifier);

    @Generated
    @Selector("init")
    public native UITableViewDiffableDataSource<?, ?> init();

    @Generated
    @Selector("initWithTableView:cellProvider:")
    public native UITableViewDiffableDataSource<?, ?> initWithTableViewCellProvider(UITableView tableView,
            @ObjCBlock(name = "call_initWithTableViewCellProvider") Block_initWithTableViewCellProvider cellProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTableViewCellProvider {
        @Generated
        UITableViewCell call_initWithTableViewCellProvider(UITableView arg0, NSIndexPath arg1,
                @Mapped(ObjCObjectMapper.class) Object arg2);
    }

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
    @Selector("itemIdentifierForIndexPath:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ItemIdentifierType itemIdentifierForIndexPath(NSIndexPath indexPath);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @IsOptional
    @Selector("numberOfSectionsInTableView:")
    @NInt
    public native long numberOfSectionsInTableView(UITableView tableView);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @IsOptional
    @Selector("sectionIndexTitlesForTableView:")
    public native NSArray<String> sectionIndexTitlesForTableView(UITableView tableView);

    @Generated
    @Selector("setDefaultRowAnimation:")
    public native void setDefaultRowAnimation(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("snapshot")
    public native NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> snapshot();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @IsOptional
    @Selector("tableView:canEditRowAtIndexPath:")
    public native boolean tableViewCanEditRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:canMoveRowAtIndexPath:")
    public native boolean tableViewCanMoveRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @Selector("tableView:cellForRowAtIndexPath:")
    public native UITableViewCell tableViewCellForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:commitEditingStyle:forRowAtIndexPath:")
    public native void tableViewCommitEditingStyleForRowAtIndexPath(UITableView tableView, @NInt long editingStyle,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:moveRowAtIndexPath:toIndexPath:")
    public native void tableViewMoveRowAtIndexPathToIndexPath(UITableView tableView, NSIndexPath sourceIndexPath,
            NSIndexPath destinationIndexPath);

    @Generated
    @Selector("tableView:numberOfRowsInSection:")
    @NInt
    public native long tableViewNumberOfRowsInSection(UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:sectionForSectionIndexTitle:atIndex:")
    @NInt
    public native long tableViewSectionForSectionIndexTitleAtIndex(UITableView tableView, String title,
            @NInt long index);

    @Generated
    @IsOptional
    @Selector("tableView:titleForFooterInSection:")
    public native String tableViewTitleForFooterInSection(UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:titleForHeaderInSection:")
    public native String tableViewTitleForHeaderInSection(UITableView tableView, @NInt long section);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}