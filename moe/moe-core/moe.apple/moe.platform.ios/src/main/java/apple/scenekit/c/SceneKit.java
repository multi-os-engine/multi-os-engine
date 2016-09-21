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

package apple.scenekit.c;

import apple.glkit.struct.GLKMatrix4;
import apple.glkit.struct.GLKVector3;
import apple.glkit.struct.GLKVector4;
import apple.javascriptcore.JSContext;
import apple.scenekit.struct.SCNMatrix4;
import apple.scenekit.struct.SCNVector3;
import apple.scenekit.struct.SCNVector4;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("SceneKit")
@Runtime(CRuntime.class)
public final class SceneKit {
    static {
        NatJ.register();
    }

    @Generated
    private SceneKit() {
    }

    @Generated
    @CFunction
    public static native boolean SCNVector3EqualToVector3(@ByValue SCNVector3 a, @ByValue SCNVector3 b);

    @Generated
    @CFunction
    public static native boolean SCNVector4EqualToVector4(@ByValue SCNVector4 a, @ByValue SCNVector4 b);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNVector3 SCNVector3Make(float x, float y, float z);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNVector4 SCNVector4Make(float x, float y, float z, float w);

    @Generated
    @CFunction
    public static native boolean SCNMatrix4IsIdentity(@ByValue SCNMatrix4 m);

    @Generated
    @CFunction
    public static native boolean SCNMatrix4EqualToMatrix4(@ByValue SCNMatrix4 a, @ByValue SCNMatrix4 b);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4MakeTranslation(float tx, float ty, float tz);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4MakeScale(float sx, float sy, float sz);

    @Generated
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4MakeRotation(float angle, float x, float y, float z);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4Translate(@ByValue SCNMatrix4 m, float tx, float ty, float tz);

    @Generated
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4Scale(@ByValue SCNMatrix4 m, float sx, float sy, float sz);

    @Generated
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4Rotate(@ByValue SCNMatrix4 m, float angle, float x, float y, float z);

    @Generated
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4Invert(@ByValue SCNMatrix4 m);

    @Generated
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4Mult(@ByValue SCNMatrix4 a, @ByValue SCNMatrix4 b);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNVector3 SCNVector3FromGLKVector3(@ByValue GLKVector3 vector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector3 SCNVector3ToGLKVector3(@ByValue SCNVector3 vector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native SCNVector4 SCNVector4FromGLKVector4(@ByValue GLKVector4 vector);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native GLKVector4 SCNVector4ToGLKVector4(@ByValue SCNVector4 vector);

    @Generated
    @CFunction
    @ByValue
    public static native GLKMatrix4 SCNMatrix4ToGLKMatrix4(@ByValue SCNMatrix4 mat);

    @Generated
    @CFunction
    @ByValue
    public static native SCNMatrix4 SCNMatrix4FromGLKMatrix4(@ByValue GLKMatrix4 mat);

    @Generated
    @CFunction
    public static native void SCNExportJavaScriptModule(JSContext context);

    @Generated
    @CVariable()
    @ByValue
    public static native SCNVector3 SCNVector3Zero();

    @Generated
    @CVariable()
    @ByValue
    public static native SCNVector4 SCNVector4Zero();

    @Generated
    @CVariable()
    @ByValue
    public static native SCNMatrix4 SCNMatrix4Identity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestFirstFoundOnlyKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestSortResultsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestClipToZRangeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestBackFaceCullingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestBoundingBoxOnlyKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestIgnoreChildNodesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestRootNodeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestIgnoreHiddenNodesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNHitTestOptionCategoryBitMask();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNProgramMappingChannelKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNShaderModifierEntryPointGeometry();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNShaderModifierEntryPointSurface();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNShaderModifierEntryPointLightingModel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNShaderModifierEntryPointFragment();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPreferredRenderingAPIKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPreferredDeviceKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPreferLowPowerDeviceKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetContributorsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetCreatedDateKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetModifiedDateKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetUpAxisKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetUnitKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetAuthoringToolKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetAuthorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetUnitNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetUnitMeterKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceCreateNormalsIfAbsentKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceCheckConsistencyKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceFlattenSceneKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceUseSafeModeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAssetDirectoryURLsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceOverrideAssetURLsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceStrictConformanceKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAnimationImportPolicyKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceLoadingOptionPreserveOriginalTopology();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAnimationImportPolicyPlay();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAnimationImportPolicyPlayRepeatedly();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAnimationImportPolicyDoNotPlay();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneSourceAnimationImportPolicyPlayUsingSceneTimeBase();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNDetailedErrorsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNConsistencyElementIDErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNConsistencyElementTypeErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNConsistencyLineNumberErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneExportDestinationURL();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneStartTimeAttributeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneEndTimeAttributeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneFrameRateAttributeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNSceneUpAxisAttributeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNModelTransform();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNViewTransform();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNProjectionTransform();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNNormalTransform();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNModelViewTransform();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNModelViewProjectionTransform();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightTypeAmbient();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightTypeOmni();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightTypeDirectional();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightTypeSpot();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightTypeIES();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightTypeProbe();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightingModelPhong();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightingModelBlinn();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightingModelLambert();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightingModelConstant();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNLightingModelPhysicallyBased();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticVertex();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticNormal();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticColor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticTexcoord();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticTangent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticVertexCrease();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticEdgeCrease();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticBoneWeights();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNGeometrySourceSemanticBoneIndices();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyPosition();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyAngle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyRotationAxis();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyVelocity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyAngularVelocity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyLife();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyColor();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyOpacity();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertySize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyFrame();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyFrameRate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyBounce();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyCharge();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyFriction();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyContactPoint();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNParticlePropertyContactNormal();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeTypeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeKeepAsCompoundKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeScaleKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeOptionCollisionMargin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeTypeBoundingBox();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeTypeConvexHull();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsShapeTypeConcavePolyhedron();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsTestCollisionBitMaskKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsTestSearchModeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsTestBackfaceCullingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsTestSearchModeAny();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsTestSearchModeClosest();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCNPhysicsTestSearchModeAll();
}
