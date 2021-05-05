package apple.metal.protocol;

import apple.foundation.struct.NSRange;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLVisibleFunctionTable")
public interface MTLVisibleFunctionTable extends MTLResource {
    @Generated
    @Selector("setFunction:atIndex:")
    void setFunctionAtIndex(@Mapped(ObjCObjectMapper.class) MTLFunctionHandle function, @NUInt long index);

    @Generated
    @Selector("setFunctions:withRange:")
    void setFunctionsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> functions,
            @ByValue NSRange range);
}