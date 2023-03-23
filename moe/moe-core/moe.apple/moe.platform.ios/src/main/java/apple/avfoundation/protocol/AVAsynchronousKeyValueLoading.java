/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.avfoundation.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AVAsynchronousKeyValueLoading
 * 
 * The AVAsynchronousKeyValueLoading protocol defines methods that let clients use an AVAsset or AVAssetTrack object
 * without blocking a thread. Using methods in the protocol, one can find out the current status of a key (for example,
 * whether the corresponding value has been loaded); and ask the object to load values asynchronously, informing the
 * client when the operation has completed.
 * 
 * Because of the nature of timed audiovisual media, successful initialization of an asset does not necessarily mean
 * that all its data is immediately available. Instead, an asset will wait to load data until an operation is performed
 * on it (for example, directly invoking any relevant AVAsset methods, playback via an AVPlayerItem object, export using
 * AVAssetExportSession, reading using an instance of AVAssetReader, and so on). This means that although you can
 * request the value of any key at any time, and its value will be returned synchronously, the calling thread may be
 * blocked until the request can be satisfied. To avoid blocking, you can:
 * 
 * 1. First, determine whether the value for a given key is available using statusOfValueForKey:error:.
 * 2. If a value has not been loaded yet, you can ask for to load one or more values and be notified when they become
 * available using loadValuesAsynchronouslyForKeys:completionHandler:.
 * 
 * Even for use cases that may typically support ready access to some keys (such as for assets initialized with URLs for
 * files in the local filesystem), slow I/O may require AVAsset to block before returning their values. Although
 * blocking may be acceptable for OS X API clients in cases where assets are being prepared on background threads or in
 * operation queues, in all cases in which blocking should be avoided you should use
 * loadValuesAsynchronouslyForKeys:completionHandler:. For iOS clients, blocking to obtain the value of a key
 * synchronously is never recommended under any circumstances.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAsynchronousKeyValueLoading")
public interface AVAsynchronousKeyValueLoading {
    /**
     * loadValuesAsynchronouslyForKeys:completionHandler:
     * 
     * Directs the target to load the values of any of the specified keys that are not already loaded.
     * 
     * @param keys
     *                An instance of NSArray, containing NSStrings for the specified keys.
     * @param handler
     *                The block to be invoked when loading succeeds, fails, or is cancelled.
     */
    @Generated
    @Selector("loadValuesAsynchronouslyForKeys:completionHandler:")
    void loadValuesAsynchronouslyForKeysCompletionHandler(NSArray<String> keys,
            @ObjCBlock(name = "call_loadValuesAsynchronouslyForKeysCompletionHandler") Block_loadValuesAsynchronouslyForKeysCompletionHandler handler);

    /**
     * statusOfValueForKey:
     * 
     * Reports whether the value for a key is immediately available without blocking.
     * 
     * Clients can use -statusOfValueForKey: to determine the availability of the value of any key of interest. However,
     * this method alone does not prompt the receiver to load the value of a key that's not yet available. To request
     * values for keys that may not already be loaded, without blocking, use
     * -loadValuesAsynchronouslyForKeys:completionHandler:, await invocation of the completion handler, and test the
     * availability of each key via -statusOfValueForKey: before invoking its getter.
     * 
     * Even if access to values of some keys may be readily available, as can occur with receivers initialized with URLs
     * for resources on local volumes, extensive I/O or parsing may be needed for these same receivers to provide values
     * for other keys. A duration for a local MP3 file, for example, may be expensive to obtain, even if the values for
     * other AVAsset properties may be trivial to obtain.
     * 
     * Blocking that may occur when calling the getter for any key should therefore be avoided in the general case by
     * loading values for all keys of interest via -loadValuesAsynchronouslyForKeys:completionHandler: and testing the
     * availability of the requested values before fetching them by calling getters.
     * 
     * The sole exception to this general rule is in usage on Mac OS X on the desktop, where it may be acceptable to
     * block in cases in which the client is preparing objects for use on background threads or in operation queues. On
     * iOS, values should always be loaded asynchronously prior to calling getters for the values, in any usage
     * scenario.
     * 
     * @param key
     *                 An instance of NSString containing the specified key.
     * @param outError
     *                 If the status of the value for the key is AVKeyValueStatusFailed, *outError is set to a non-nil
     *                 NSError that describes the failure that occurred.
     * @return The value's current loading status.
     */
    @Generated
    @Selector("statusOfValueForKey:error:")
    @NInt
    long statusOfValueForKeyError(String key, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadValuesAsynchronouslyForKeysCompletionHandler {
        @Generated
        void call_loadValuesAsynchronouslyForKeysCompletionHandler();
    }
}
