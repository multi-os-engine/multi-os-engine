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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDropSession")
public interface UIDropSession extends UIDragDropSession, NSProgressReporting {
    @Generated
    @Selector("loadObjectsOfClass:completion:")
    NSProgress loadObjectsOfClassCompletion(@Mapped(ObjCObjectMapper.class) NSItemProviderReading aClass,
            @ObjCBlock(name = "call_loadObjectsOfClassCompletion") Block_loadObjectsOfClassCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadObjectsOfClassCompletion {
        @Generated
        void call_loadObjectsOfClassCompletion(NSArray<?> objects);
    }

    @Generated
    @Selector("localDragSession")
    @MappedReturn(ObjCObjectMapper.class)
    UIDragSession localDragSession();

    @Generated
    @Selector("progressIndicatorStyle")
    @NUInt
    long progressIndicatorStyle();

    @Generated
    @Selector("setProgressIndicatorStyle:")
    void setProgressIndicatorStyle(@NUInt long value);
}