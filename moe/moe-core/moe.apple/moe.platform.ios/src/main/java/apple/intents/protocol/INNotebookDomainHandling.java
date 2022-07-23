package apple.intents.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INNotebookDomainHandling")
public interface INNotebookDomainHandling extends INCreateNoteIntentHandling, INAppendToNoteIntentHandling,
        INAddTasksIntentHandling, INCreateTaskListIntentHandling, INSetTaskAttributeIntentHandling,
        INSearchForNotebookItemsIntentHandling {
}