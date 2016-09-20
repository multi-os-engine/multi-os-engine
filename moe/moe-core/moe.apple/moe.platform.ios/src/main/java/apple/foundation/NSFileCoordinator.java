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
import apple.foundation.protocol.NSFilePresenter;
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
import org.moe.natj.general.ptr.Ptr;
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
public class NSFileCoordinator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFileCoordinator(Pointer peer) {
        super(peer);
    }

    /**
     * addFilePresenter:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/clm/NSFileCoordinator/addFilePresenter:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addFilePresenter:")
    public static native void addFilePresenter(@Mapped(ObjCObjectMapper.class) NSFilePresenter filePresenter);

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileCoordinator alloc();

    /**
     * filePresenters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/clm/NSFileCoordinator/filePresenters">iOS Dev Center</a>
     */
    @Generated
    @Selector("filePresenters")
    public static native NSArray<?> filePresenters();

    /**
     * removeFilePresenter:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/clm/NSFileCoordinator/removeFilePresenter:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeFilePresenter:")
    public static native void removeFilePresenter(@Mapped(ObjCObjectMapper.class) NSFilePresenter filePresenter);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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

    /**
     * cancel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/instm/NSFileCoordinator/cancel">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * coordinateAccessWithIntents:queue:byAccessor:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/instm/NSFileCoordinator/coordinateAccessWithIntents:queue:byAccessor:">iOS Dev Center</a>
     */
    @Generated
    @Selector("coordinateAccessWithIntents:queue:byAccessor:")
    public native void coordinateAccessWithIntentsQueueByAccessor(NSArray<? extends NSFileAccessIntent> intents,
            NSOperationQueue queue,
            @ObjCBlock(name = "call_coordinateAccessWithIntentsQueueByAccessor") Block_coordinateAccessWithIntentsQueueByAccessor accessor);

    /**
     * coordinateReadingItemAtURL:options:error:byAccessor:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/instm/NSFileCoordinator/coordinateReadingItemAtURL:options:error:byAccessor:">iOS Dev Center</a>
     */
    @Generated
    @Selector("coordinateReadingItemAtURL:options:error:byAccessor:")
    public native void coordinateReadingItemAtURLOptionsErrorByAccessor(NSURL url, @NUInt long options,
            Ptr<NSError> outError,
            @ObjCBlock(name = "call_coordinateReadingItemAtURLOptionsErrorByAccessor") Block_coordinateReadingItemAtURLOptionsErrorByAccessor reader);

    /**
     * coordinateReadingItemAtURL:options:writingItemAtURL:options:error:byAccessor:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/instm/NSFileCoordinator/coordinateReadingItemAtURL:options:writingItemAtURL:options:error:byAccessor:">iOS Dev Center</a>
     */
    @Generated
    @Selector("coordinateReadingItemAtURL:options:writingItemAtURL:options:error:byAccessor:")
    public native void coordinateReadingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor(NSURL readingURL,
            @NUInt long readingOptions, NSURL writingURL, @NUInt long writingOptions, Ptr<NSError> outError,
            @ObjCBlock(name = "call_coordinateReadingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor") Block_coordinateReadingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor readerWriter);

    /**
     * coordinateWritingItemAtURL:options:error:byAccessor:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/instm/NSFileCoordinator/coordinateWritingItemAtURL:options:error:byAccessor:">iOS Dev Center</a>
     */
    @Generated
    @Selector("coordinateWritingItemAtURL:options:error:byAccessor:")
    public native void coordinateWritingItemAtURLOptionsErrorByAccessor(NSURL url, @NUInt long options,
            Ptr<NSError> outError,
            @ObjCBlock(name = "call_coordinateWritingItemAtURLOptionsErrorByAccessor") Block_coordinateWritingItemAtURLOptionsErrorByAccessor writer);

    /**
     * coordinateWritingItemAtURL:options:writingItemAtURL:options:error:byAccessor:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/instm/NSFileCoordinator/coordinateWritingItemAtURL:options:writingItemAtURL:options:error:byAccessor:">iOS Dev Center</a>
     */
    @Generated
    @Selector("coordinateWritingItemAtURL:options:writingItemAtURL:options:error:byAccessor:")
    public native void coordinateWritingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor(NSURL url1,
            @NUInt long options1, NSURL url2, @NUInt long options2, Ptr<NSError> outError,
            @ObjCBlock(name = "call_coordinateWritingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor") Block_coordinateWritingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor writer);

    @Generated
    @Selector("init")
    public native NSFileCoordinator init();

    /**
     * initWithFilePresenter:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/instm/NSFileCoordinator/initWithFilePresenter:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFilePresenter:")
    public native NSFileCoordinator initWithFilePresenter(
            @Mapped(ObjCObjectMapper.class) NSFilePresenter filePresenterOrNil);

    /**
     * itemAtURL:didMoveToURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/instm/NSFileCoordinator/itemAtURL:didMoveToURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("itemAtURL:didMoveToURL:")
    public native void itemAtURLDidMoveToURL(NSURL oldURL, NSURL newURL);

    /**
     * itemAtURL:willMoveToURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/instm/NSFileCoordinator/itemAtURL:willMoveToURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("itemAtURL:willMoveToURL:")
    public native void itemAtURLWillMoveToURL(NSURL oldURL, NSURL newURL);

    /**
     * purposeIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/instp/NSFileCoordinator/purposeIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("purposeIdentifier")
    public native String purposeIdentifier();

    /**
     * purposeIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSFileCoordinator_class/index.html#//apple_ref/occ/instp/NSFileCoordinator/purposeIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPurposeIdentifier:")
    public native void setPurposeIdentifier(String value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_coordinateAccessWithIntentsQueueByAccessor {
        @Generated
        void call_coordinateAccessWithIntentsQueueByAccessor(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_coordinateReadingItemAtURLOptionsErrorByAccessor {
        @Generated
        void call_coordinateReadingItemAtURLOptionsErrorByAccessor(NSURL arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_coordinateReadingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor {
        @Generated
        void call_coordinateReadingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor(NSURL arg0, NSURL arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_coordinateWritingItemAtURLOptionsErrorByAccessor {
        @Generated
        void call_coordinateWritingItemAtURLOptionsErrorByAccessor(NSURL arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_coordinateWritingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor {
        @Generated
        void call_coordinateWritingItemAtURLOptionsWritingItemAtURLOptionsErrorByAccessor(NSURL arg0, NSURL arg1);
    }
}
