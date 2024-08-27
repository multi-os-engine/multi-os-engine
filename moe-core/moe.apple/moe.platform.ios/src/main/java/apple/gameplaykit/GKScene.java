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

package apple.gameplaykit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.gameplaykit.protocol.GKSceneRootNodeType;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A scene stores and handles loading of data related to a particular scene.
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKScene extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected GKScene(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKScene alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKScene allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native GKScene new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Loads a scene from a file contained within the bundle.
     */
    @Generated
    @Selector("sceneWithFileNamed:")
    public static native GKScene sceneWithFileNamed(@NotNull String filename);

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
     * Adds an entity to the scene's list of entities.
     * 
     * @param entity the entity to add.
     */
    @Generated
    @Selector("addEntity:")
    public native void addEntity(@NotNull GKEntity entity);

    /**
     * Adds a graph to the scene's list of graphs.
     * 
     * @param graph the graph to add.
     */
    @Generated
    @Selector("addGraph:name:")
    public native void addGraphName(@NotNull GKGraph graph, @NotNull String name);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * The entities of this scene.
     */
    @NotNull
    @Generated
    @Selector("entities")
    public native NSArray<? extends GKEntity> entities();

    /**
     * The navigational graphs of this scene.
     */
    @NotNull
    @Generated
    @Selector("graphs")
    public native NSDictionary<String, ? extends GKGraph> graphs();

    @Generated
    @Selector("init")
    public native GKScene init();

    @Generated
    @Selector("initWithCoder:")
    public native GKScene initWithCoder(@NotNull NSCoder coder);

    /**
     * Removes an entity from the scene's list of entities.
     * 
     * @param entity the entity to remove.
     */
    @Generated
    @Selector("removeEntity:")
    public native void removeEntity(@NotNull GKEntity entity);

    /**
     * Removes a graph from the scene's list of graphs.
     * 
     * @param name the name of the corresponding graph as added via addGraph:
     */
    @Generated
    @Selector("removeGraph:")
    public native void removeGraph(@NotNull String name);

    /**
     * The root node for the scene.
     * 
     * @see GKSceneRootNodeType
     */
    @Nullable
    @Generated
    @Selector("rootNode")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKSceneRootNodeType rootNode();

    /**
     * The root node for the scene.
     * 
     * @see GKSceneRootNodeType
     */
    @Generated
    @Selector("setRootNode:")
    public native void setRootNode(@Nullable @Mapped(ObjCObjectMapper.class) GKSceneRootNodeType value);

    /**
     * Loads a scene from a file contained within the bundle and link with the specified rootNode.
     */
    @Generated
    @Selector("sceneWithFileNamed:rootNode:")
    public static native GKScene sceneWithFileNamedRootNode(@NotNull String filename,
            @NotNull @Mapped(ObjCObjectMapper.class) GKSceneRootNodeType rootNode);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
