package apple.classkit.protocol;

import apple.classkit.CLSContext;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("ClassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CLSContextProvider")
public interface CLSContextProvider {
    @Generated
    @Selector("updateDescendantsOfContext:completion:")
    void updateDescendantsOfContextCompletion(CLSContext context,
            @ObjCBlock(name = "call_updateDescendantsOfContextCompletion") Block_updateDescendantsOfContextCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateDescendantsOfContextCompletion {
        @Generated
        void call_updateDescendantsOfContextCompletion(NSError error);
    }
}