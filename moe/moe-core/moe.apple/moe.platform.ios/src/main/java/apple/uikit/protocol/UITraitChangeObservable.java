package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.uikit.UITraitCollection;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITraitChangeObservable")
public interface UITraitChangeObservable {
    /**
     * Convenience method where the target is self.
     */
    @Generated
    @Selector("registerForTraitChanges:withAction:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    UITraitChangeRegistration registerForTraitChangesWithAction(@NotNull NSArray<?> traits, @NotNull SEL action);

    @Generated
    @Selector("registerForTraitChanges:withHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    UITraitChangeRegistration registerForTraitChangesWithHandler(@NotNull NSArray<?> traits,
            @ObjCBlock(name = "call_registerForTraitChangesWithHandler") @NotNull Block_registerForTraitChangesWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerForTraitChangesWithHandler {
        @Generated
        void call_registerForTraitChangesWithHandler(@Mapped(ObjCObjectMapper.class) @NotNull Object traitEnvironment,
                @NotNull UITraitCollection previousCollection);
    }

    /**
     * The action method you use with the following registration APIs may have zero, one, or two parameters.
     * If the method accepts at least one parameter, the first parameter will be the trait environment whose traits are
     * changing.
     * If the method accepts two parameters, the second parameter will be the trait environment's previous trait
     * collection before the change.
     */
    @Generated
    @Selector("registerForTraitChanges:withTarget:action:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    UITraitChangeRegistration registerForTraitChangesWithTargetAction(@NotNull NSArray<?> traits,
            @Mapped(ObjCObjectMapper.class) @NotNull Object target, @NotNull SEL action);

    @Generated
    @Selector("unregisterForTraitChanges:")
    void unregisterForTraitChanges(@Mapped(ObjCObjectMapper.class) @NotNull UITraitChangeRegistration registration);
}