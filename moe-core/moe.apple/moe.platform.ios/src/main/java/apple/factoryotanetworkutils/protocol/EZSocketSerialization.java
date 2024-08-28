package apple.factoryotanetworkutils.protocol;

import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("FactoryOTANetworkUtils")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("EZSocketSerialization")
public interface EZSocketSerialization {
    @Generated
    @Selector("dataWithDictionary:error:")
    @Nullable
    NSData dataWithDictionaryError(@NotNull NSDictionary<?, ?> dictionary,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("dictionaryWithData:error:")
    @Nullable
    NSDictionary<?, ?> dictionaryWithDataError(@NotNull NSData data,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("formatName")
    @NotNull
    String formatName();
}