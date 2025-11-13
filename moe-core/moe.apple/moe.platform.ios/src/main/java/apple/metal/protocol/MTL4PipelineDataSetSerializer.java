package apple.metal.protocol;

import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSURL;
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

/**
 * A fast-addition container for collecting data during pipeline state creation.
 * 
 * Pipeline data serializer instances allow you to create binary archives and serialize pipeline scripts to use with
 * the offline Metal binary generator (`metal-tt`)
 * <doc:compiling-binary-archives-from-a-custom-configuration-script.md>.
 * 
 * You capture and retain all relevant data for all pipelines a compiler instance creates by providing an instance of
 * this object to its ``MTL4CompilerDescriptor``.
 * 
 * After capturing data, you can serialize it to a binary archive to persist its contents offline by calling
 * ``serializeAsArchiveAndFlushToURL:error:``. You can also serialize a pipeline script suitable for the offline binary
 * generator (`metal-tt`) by calling ``serializeAsPipelinesScriptWithError:``
 * 
 * - Note: The objects ``MTL4PipelineDataSetSerializer`` contains are opaque and can't accelerate compilation for
 * compilers they are not attached to. Additionally, your program can't read data out of data set serializer instances.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4PipelineDataSetSerializer")
public interface MTL4PipelineDataSetSerializer {
    /**
     * Serializes a pipeline data set to an archive.
     * 
     * - Parameters:
     * - url: the URL used to serialize the serializer data set as an archive to.
     * - error: an optional parameter to store information in case of an error.
     * - Returns: a boolean indicating whether the operation was successful.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("serializeAsArchiveAndFlushToURL:error:")
    boolean serializeAsArchiveAndFlushToURLError(@NotNull NSURL url,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Serializes a serializer data set to a pipeline script as raw data.
     * 
     * - Parameters:
     * - error: an optional parameter to store information in case of an error.
     * - Returns: an `NSData` instance containing the pipeline script.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("serializeAsPipelinesScriptWithError:")
    @Nullable
    NSData serializeAsPipelinesScriptWithError(@ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);
}