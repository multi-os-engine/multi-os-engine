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

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNSceneSource
 * <p>
 * SCNSceneSource objects, abstract the data-reading task. A scene source can read scene data from a URL or a NSData object.
 * After creating a SCNSceneSource object for the appropriate source, you can obtain scenes using SCNSceneSource methods.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNSceneSource extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNSceneSource(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNSceneSource alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * sceneSourceWithData:options:
     * <p>
     * Creates and initialize a SCNSceneSource instance.
     *
     * @param data    The scene data.
     * @param options An optional dictionary for future extensions.
     */
    @Generated
    @Selector("sceneSourceWithData:options:")
    public static native SCNSceneSource sceneSourceWithDataOptions(NSData data, NSDictionary<String, ?> options);

    /**
     * sceneSourceWithURL:options:
     * <p>
     * Creates and initialize a SCNSceneSource instance.
     *
     * @param url     The URL to read scenes from.
     * @param options An optional dictionary for future extensions.
     */
    @Generated
    @Selector("sceneSourceWithURL:options:")
    public static native SCNSceneSource sceneSourceWithURLOptions(NSURL url, NSDictionary<String, ?> options);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] data
     * <p>
     * The receiver's data (if any).
     */
    @Generated
    @Selector("data")
    public native NSData data();

    /**
     * entriesPassingTest:
     * <p>
     * Returns the entries in the receiver's library that pass a test in a given Block.
     * <p>
     * The entry is an instance of one of following classes: SCNMaterial, SCNScene, SCNGeometry, SCNNode, CAAnimation, SCNLight, SCNCamera, SCNSkinner, SCNMorpher, NSImage.
     *
     * @param predicate The block to apply to entries in the library. The block takes three arguments: "entry" is an entry in the library, "identifier" is the ID of this entry and "stop" is a reference to a Boolean value. The block can set the value to YES to stop further processing of the library. The stop argument is an out-only argument. You should only ever set this Boolean to YES within the Block. The Block returns a Boolean value that indicates whether "entry" passed the test.
     */
    @Generated
    @Selector("entriesPassingTest:")
    public native NSArray<?> entriesPassingTest(
            @ObjCBlock(name = "call_entriesPassingTest") Block_entriesPassingTest predicate);

    /**
     * entryWithIdentifier:classType:
     * <p>
     * Returns the instance of "entryClass" found in the receiver's library with the id "uid".
     * <p>
     * Returns NULL if the receiver's library doesn't contains such an uid for the specified type.
     *
     * @param uid        The id of the entry to find as specified in the source file
     * @param entryClass Specifies the type of the object to be returned. It can be one of the following classes: SCNMaterial, SCNGeometry, SCNScene, SCNNode, CAAnimation, SCNLight, SCNCamera, SCNSkinner, SCNMorpher, NSImage
     */
    @Generated
    @Selector("entryWithIdentifier:withClass:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object entryWithIdentifierWithClass(String uid, Class entryClass);

    /**
     * identifiersOfEntriesWithClass:
     * <p>
     * Returns the IDs found in the receiver's library for the class "entryClass".
     *
     * @param entryClass Specifies the type of the object referenced by the returned IDs. It can be one of the following classes: SCNMaterial, SCNScene, SCNGeometry, SCNNode, CAAnimation, SCNLight, SCNCamera, SCNSkinner, SCNMorpher, NSImage
     */
    @Generated
    @Selector("identifiersOfEntriesWithClass:")
    public native NSArray<String> identifiersOfEntriesWithClass(Class entryClass);

    @Generated
    @Selector("init")
    public native SCNSceneSource init();

    /**
     * initWithData:options:
     * <p>
     * Initialize a SCNSceneSource instance from a NSData object.
     *
     * @param data    The data to read scenes from.
     * @param options An optional dictionary for future extensions.
     */
    @Generated
    @Selector("initWithData:options:")
    public native SCNSceneSource initWithDataOptions(NSData data, NSDictionary<String, ?> options);

    /**
     * initWithURL:options:
     * <p>
     * Initialize a SCNSceneSource instance from a URL.
     *
     * @param url     The URL to read scenes from.
     * @param options An optional dictionary for future extensions.
     */
    @Generated
    @Selector("initWithURL:options:")
    public native SCNSceneSource initWithURLOptions(NSURL url, NSDictionary<String, ?> options);

    /**
     * propertyForKey:
     * <p>
     * Returns the property as defined in the 3D file for the given key. See keys above.
     *
     * @param key The key for which to return the corresponding property.
     */
    @Generated
    @Selector("propertyForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object propertyForKey(String key);

    /**
     * sceneWithOptions:error:
     * <p>
     * Creates and initializes the scene described in the 3D file with the specified options.
     * <p>
     * This simpler version is equivalent to providing a block to sceneWithOptions:statusHandler: and checking the "error"
     * parameter of the block if the status is SCNSceneStatusError.
     *
     * @param options A dictionary of options. The valid keys are described in the "Scene loading options" section.
     * @param error   If this method returns nil, an error providing more information is returned by reference.
     */
    @Generated
    @Selector("sceneWithOptions:error:")
    public native SCNScene sceneWithOptionsError(NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * sceneWithOptions:statusHandler:
     * <p>
     * Creates and initializes the scene described in the 3D file with the specified options and lets you monitor the progress.
     *
     * @param options       A dictionary of options. The valid keys are described in the "Scene loading options" section.
     * @param statusHandler This block will be called repeatedly while the scene is being loaded.
     *                      - The first argument, overallProgress, is a floating-point number between 0 and 1. 0 means the loading process has just started and 1 that it is complete.
     *                      - The second argument, status, tells you what the source is currently doing. It takes one of the values in the SCNSceneSourceStatus enum. New values might be added to this enum in the future.
     *                      - If status == SCNSceneStatusError, then error will contain more information about the failure, and the method will return nil after having called the block. Otherwise error will be nil.
     *                      - Set *stop to YES if you want the source to abort the loading operation.
     */
    @Generated
    @Selector("sceneWithOptions:statusHandler:")
    public native SCNScene sceneWithOptionsStatusHandler(NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_sceneWithOptionsStatusHandler") Block_sceneWithOptionsStatusHandler statusHandler);

    /**
     * [@property] url
     * <p>
     * The receiver's URL (if any).
     */
    @Generated
    @Selector("url")
    public native NSURL url();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_entriesPassingTest {
        @Generated
        boolean call_entriesPassingTest(@Mapped(ObjCObjectMapper.class) Object entry, String identifier, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sceneWithOptionsStatusHandler {
        @Generated
        void call_sceneWithOptionsStatusHandler(float totalProgress, @NInt long status, NSError error, BoolPtr stop);
    }
}
