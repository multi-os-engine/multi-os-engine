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

package apple.scenekit.protocol;

import apple.avfoundation.AVAudioEngine;
import apple.avfoundation.AVAudioEnvironmentNode;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.scenekit.SCNHitTestResult;
import apple.scenekit.SCNNode;
import apple.scenekit.SCNScene;
import apple.scenekit.struct.SCNVector3;
import apple.spritekit.SKScene;
import apple.spritekit.SKTransition;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNSceneRenderer")
public interface SCNSceneRenderer {
    @Generated
    @Selector("audioEngine")
    AVAudioEngine audioEngine();

    @Generated
    @Selector("audioEnvironmentNode")
    AVAudioEnvironmentNode audioEnvironmentNode();

    @Generated
    @Selector("audioListener")
    SCNNode audioListener();

    @Generated
    @Selector("autoenablesDefaultLighting")
    boolean autoenablesDefaultLighting();

    @Generated
    @Selector("colorPixelFormat")
    @NUInt
    long colorPixelFormat();

    @Generated
    @Selector("commandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    Object commandQueue();

    @Generated
    @Selector("context")
    VoidPtr context();

    @Generated
    @Selector("currentRenderCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    Object currentRenderCommandEncoder();

    @Generated
    @Selector("debugOptions")
    @NUInt
    long debugOptions();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    Object delegate();

    @Generated
    @Selector("depthPixelFormat")
    @NUInt
    long depthPixelFormat();

    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    Object device();

    @Generated
    @Selector("hitTest:options:")
    NSArray<? extends SCNHitTestResult> hitTestOptions(@ByValue CGPoint point, NSDictionary<String, ?> options);

    @Generated
    @Selector("isJitteringEnabled")
    boolean isJitteringEnabled();

    @Generated
    @Selector("setJitteringEnabled:")
    void setJitteringEnabled(boolean value);

    @Generated
    @Selector("isNodeInsideFrustum:withPointOfView:")
    boolean isNodeInsideFrustumWithPointOfView(SCNNode node, SCNNode pointOfView);

    @Generated
    @Selector("isPlaying")
    boolean isPlaying();

    @Generated
    @Selector("setPlaying:")
    void setPlaying(boolean value);

    @Generated
    @Selector("loops")
    boolean loops();

    @Generated
    @Selector("nodesInsideFrustumWithPointOfView:")
    NSArray<? extends SCNNode> nodesInsideFrustumWithPointOfView(SCNNode pointOfView);

    @Generated
    @Selector("overlaySKScene")
    SKScene overlaySKScene();

    @Generated
    @Selector("pointOfView")
    SCNNode pointOfView();

    @Generated
    @Selector("prepareObject:shouldAbortBlock:")
    boolean prepareObjectShouldAbortBlock(@Mapped(ObjCObjectMapper.class) Object object,
            @ObjCBlock(name = "call_prepareObjectShouldAbortBlock") Block_prepareObjectShouldAbortBlock block);

    @Generated
    @Selector("prepareObjects:withCompletionHandler:")
    void prepareObjectsWithCompletionHandler(NSArray<?> objects,
            @ObjCBlock(name = "call_prepareObjectsWithCompletionHandler") Block_prepareObjectsWithCompletionHandler completionHandler);

    @Generated
    @Selector("presentScene:withTransition:incomingPointOfView:completionHandler:")
    void presentSceneWithTransitionIncomingPointOfViewCompletionHandler(SCNScene scene, SKTransition transition,
            SCNNode pointOfView,
            @ObjCBlock(name = "call_presentSceneWithTransitionIncomingPointOfViewCompletionHandler") Block_presentSceneWithTransitionIncomingPointOfViewCompletionHandler completionHandler);

    @Generated
    @Selector("projectPoint:")
    @ByValue
    SCNVector3 projectPoint(@ByValue SCNVector3 point);

    @Generated
    @Selector("renderingAPI")
    @NUInt
    long renderingAPI();

    @Generated
    @Selector("scene")
    SCNScene scene();

    @Generated
    @Selector("sceneTime")
    double sceneTime();

    @Generated
    @Selector("setAudioListener:")
    void setAudioListener(SCNNode value);

    @Generated
    @Selector("setAutoenablesDefaultLighting:")
    void setAutoenablesDefaultLighting(boolean value);

    @Generated
    @Selector("setDebugOptions:")
    void setDebugOptions(@NUInt long value);

    @Generated
    @Selector("setDelegate:")
    void setDelegate(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setLoops:")
    void setLoops(boolean value);

    @Generated
    @Selector("setOverlaySKScene:")
    void setOverlaySKScene(SKScene value);

    @Generated
    @Selector("setPointOfView:")
    void setPointOfView(SCNNode value);

    @Generated
    @Selector("setScene:")
    void setScene(SCNScene value);

    @Generated
    @Selector("setSceneTime:")
    void setSceneTime(double value);

    @Generated
    @Selector("setShowsStatistics:")
    void setShowsStatistics(boolean value);

    @Generated
    @Selector("showsStatistics")
    boolean showsStatistics();

    @Generated
    @Selector("stencilPixelFormat")
    @NUInt
    long stencilPixelFormat();

    @Generated
    @Selector("unprojectPoint:")
    @ByValue
    SCNVector3 unprojectPoint(@ByValue SCNVector3 point);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prepareObjectShouldAbortBlock {
        @Generated
        boolean call_prepareObjectShouldAbortBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prepareObjectsWithCompletionHandler {
        @Generated
        void call_prepareObjectsWithCompletionHandler(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentSceneWithTransitionIncomingPointOfViewCompletionHandler {
        @Generated
        void call_presentSceneWithTransitionIncomingPointOfViewCompletionHandler();
    }

    @Generated
    @Selector("currentViewport")
    @ByValue
    CGRect currentViewport();

    @Generated
    @Selector("isTemporalAntialiasingEnabled")
    boolean isTemporalAntialiasingEnabled();

    @Generated
    @Selector("setTemporalAntialiasingEnabled:")
    void setTemporalAntialiasingEnabled(boolean value);

    @Generated
    @Selector("setUsesReverseZ:")
    void setUsesReverseZ(boolean value);

    @Generated
    @Selector("usesReverseZ")
    boolean usesReverseZ();
}
