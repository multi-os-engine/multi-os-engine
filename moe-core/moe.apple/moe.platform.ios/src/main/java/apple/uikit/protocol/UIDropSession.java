package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSProgress;
import apple.foundation.protocol.NSItemProviderReading;
import apple.foundation.protocol.NSProgressReporting;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDropSession")
public interface UIDropSession extends UIDragDropSession, NSProgressReporting {
    /**
     * A convenience method that can be used only during the UIDropInteractionDelegate's
     * implementation of `-dropInteraction:performDrop:`.
     * Asynchronously instantiates objects of the provided class for each
     * drag item that can do so. The completion handler is called on the
     * main queue, with an array of all objects that were created, in the
     * same order as `items`.
     * The progress returned is an aggregate of the progress for all objects
     * that are loaded.
     */
    @NotNull
    @Generated
    @Selector("loadObjectsOfClass:completion:")
    NSProgress loadObjectsOfClassCompletion(@NotNull @Mapped(ObjCObjectMapper.class) NSItemProviderReading aClass,
            @NotNull @ObjCBlock(name = "call_loadObjectsOfClassCompletion") Block_loadObjectsOfClassCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadObjectsOfClassCompletion {
        @Generated
        void call_loadObjectsOfClassCompletion(@NotNull NSArray<?> objects);
    }

    /**
     * The `UIDragSession` that corresponds to this `UIDropSession`.
     * If the drag was started in a different app, this is nil.
     */
    @Nullable
    @Generated
    @Selector("localDragSession")
    @MappedReturn(ObjCObjectMapper.class)
    UIDragSession localDragSession();

    /**
     * The kind of progress and cancellation UI that UIKit will display
     * if handling this session's drop takes a significant amount of time.
     * 
     * The default value is UIDropSessionProgressIndicatorStyleDefault,
     * meaning that some progress UI will be shown. If you show your own
     * progress indicator, hide the system progress UI by setting this
     * property to UIDropSessionProgressIndicatorStyleNone.
     */
    @Generated
    @Selector("progressIndicatorStyle")
    @NUInt
    long progressIndicatorStyle();

    /**
     * The kind of progress and cancellation UI that UIKit will display
     * if handling this session's drop takes a significant amount of time.
     * 
     * The default value is UIDropSessionProgressIndicatorStyleDefault,
     * meaning that some progress UI will be shown. If you show your own
     * progress indicator, hide the system progress UI by setting this
     * property to UIDropSessionProgressIndicatorStyleNone.
     */
    @Generated
    @Selector("setProgressIndicatorStyle:")
    void setProgressIndicatorStyle(@NUInt long value);
}
