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

package apple.foundation;

import apple.NSObject;
import apple.coregraphics.struct.CGSize;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSItemProviderReading;
import apple.foundation.protocol.NSItemProviderWriting;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSItemProvider extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSItemProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSItemProvider alloc();

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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("hasItemConformingToTypeIdentifier:")
    public native boolean hasItemConformingToTypeIdentifier(String typeIdentifier);

    @Generated
    @Selector("init")
    public native NSItemProvider init();

    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSItemProvider initWithContentsOfURL(NSURL fileURL);

    @Generated
    @Selector("initWithItem:typeIdentifier:")
    public native NSItemProvider initWithItemTypeIdentifier(@Mapped(ObjCObjectMapper.class) NSSecureCoding item,
            String typeIdentifier);

    @Generated
    @Selector("loadItemForTypeIdentifier:options:completionHandler:")
    public native void loadItemForTypeIdentifierOptionsCompletionHandler(String typeIdentifier,
            NSDictionary<?, ?> options,
            @ObjCBlock(name = "call_loadItemForTypeIdentifierOptionsCompletionHandler") Block_loadItemForTypeIdentifierOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("loadPreviewImageWithOptions:completionHandler:")
    public native void loadPreviewImageWithOptionsCompletionHandler(NSDictionary<?, ?> options,
            @ObjCBlock(name = "call_loadPreviewImageWithOptionsCompletionHandler") Block_loadPreviewImageWithOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("registeredTypeIdentifiers")
    public native NSArray<String> registeredTypeIdentifiers();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadItemForTypeIdentifierOptionsCompletionHandler {
        @Generated
        void call_loadItemForTypeIdentifierOptionsCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0,
                NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadPreviewImageWithOptionsCompletionHandler {
        @Generated
        void call_loadPreviewImageWithOptionsCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0,
                NSError arg1);
    }

    @Generated
    @Selector("canLoadObjectOfClass:")
    public native boolean canLoadObjectOfClass(@Mapped(ObjCObjectMapper.class) NSItemProviderReading aClass);

    @Generated
    @Selector("hasRepresentationConformingToTypeIdentifier:fileOptions:")
    public native boolean hasRepresentationConformingToTypeIdentifierFileOptions(String typeIdentifier,
            @NInt long fileOptions);

    @Generated
    @Selector("initWithObject:")
    public native NSItemProvider initWithObject(@Mapped(ObjCObjectMapper.class) NSItemProviderWriting object);

    @Generated
    @Selector("loadDataRepresentationForTypeIdentifier:completionHandler:")
    public native NSProgress loadDataRepresentationForTypeIdentifierCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadDataRepresentationForTypeIdentifierCompletionHandler") Block_loadDataRepresentationForTypeIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadDataRepresentationForTypeIdentifierCompletionHandler {
        @Generated
        void call_loadDataRepresentationForTypeIdentifierCompletionHandler(NSData arg0, NSError arg1);
    }

    @Generated
    @Selector("loadFileRepresentationForTypeIdentifier:completionHandler:")
    public native NSProgress loadFileRepresentationForTypeIdentifierCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadFileRepresentationForTypeIdentifierCompletionHandler") Block_loadFileRepresentationForTypeIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFileRepresentationForTypeIdentifierCompletionHandler {
        @Generated
        void call_loadFileRepresentationForTypeIdentifierCompletionHandler(NSURL arg0, NSError arg1);
    }

    @Generated
    @Selector("loadInPlaceFileRepresentationForTypeIdentifier:completionHandler:")
    public native NSProgress loadInPlaceFileRepresentationForTypeIdentifierCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadInPlaceFileRepresentationForTypeIdentifierCompletionHandler") Block_loadInPlaceFileRepresentationForTypeIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadInPlaceFileRepresentationForTypeIdentifierCompletionHandler {
        @Generated
        void call_loadInPlaceFileRepresentationForTypeIdentifierCompletionHandler(NSURL arg0, boolean arg1,
                NSError arg2);
    }

    @Generated
    @Selector("loadObjectOfClass:completionHandler:")
    public native NSProgress loadObjectOfClassCompletionHandler(
            @Mapped(ObjCObjectMapper.class) NSItemProviderReading aClass,
            @ObjCBlock(name = "call_loadObjectOfClassCompletionHandler") Block_loadObjectOfClassCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadObjectOfClassCompletionHandler {
        @Generated
        void call_loadObjectOfClassCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0, NSError arg1);
    }

    @Generated
    @Selector("preferredPresentationSize")
    @ByValue
    public native CGSize preferredPresentationSize();

    @Generated
    @Selector("preferredPresentationStyle")
    @NInt
    public native long preferredPresentationStyle();

    @Generated
    @Selector("registerObject:visibility:")
    public native void registerObjectVisibility(@Mapped(ObjCObjectMapper.class) NSItemProviderWriting object,
            @NInt long visibility);

    @Generated
    @Selector("registeredTypeIdentifiersWithFileOptions:")
    public native NSArray<String> registeredTypeIdentifiersWithFileOptions(@NInt long fileOptions);

    @Generated
    @Selector("setPreferredPresentationSize:")
    public native void setPreferredPresentationSize(@ByValue CGSize value);

    @Generated
    @Selector("setPreferredPresentationStyle:")
    public native void setPreferredPresentationStyle(@NInt long value);

    @Generated
    @Selector("setSuggestedName:")
    public native void setSuggestedName(String value);

    @Generated
    @Selector("setTeamData:")
    public native void setTeamData(NSData value);

    @Generated
    @Selector("suggestedName")
    public native String suggestedName();

    @Generated
    @Selector("teamData")
    public native NSData teamData();
}
