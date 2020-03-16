package apple.fileprovider.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderItemFlags")
public interface NSFileProviderItemFlags {
    @Generated
    @Selector("isHidden")
    boolean isHidden();

    @Generated
    @Selector("isPathExtensionHidden")
    boolean isPathExtensionHidden();

    @Generated
    @Selector("isUserExecutable")
    boolean isUserExecutable();

    @Generated
    @Selector("isUserReadable")
    boolean isUserReadable();

    @Generated
    @Selector("isUserWritable")
    boolean isUserWritable();
}