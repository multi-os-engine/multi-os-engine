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
import apple.cloudkit.CKAllowedSharingOptions;
import apple.cloudkit.CKContainer;
import apple.cloudkit.CKShare;
import apple.uniformtypeidentifiers.UTType;
import apple.corefoundation.struct.CGSize;

/**
 * An NSItemProvider is a high level abstraction for an item supporting multiple representations.
 * 
 * API-Since: 8.0
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSItemProvider allocWithZone(VoidPtr zone);

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
    public static native NSItemProvider new_objc();

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

    /**
     * Returns YES if the item provider has at least one item that conforms to the supplied type identifier.
     */
    @Generated
    @Selector("hasItemConformingToTypeIdentifier:")
    public native boolean hasItemConformingToTypeIdentifier(String typeIdentifier);

    @Generated
    @Selector("init")
    public native NSItemProvider init();

    /**
     * Initialize an NSItemProvider with load handlers for the given file URL, and the file content. A type identifier
     * is inferred from the file extension.
     */
    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSItemProvider initWithContentsOfURL(NSURL fileURL);

    /**
     * Initialize an NSItemProvider with an object assigned to a single UTI. `item` is retained.
     */
    @Generated
    @Selector("initWithItem:typeIdentifier:")
    public native NSItemProvider initWithItemTypeIdentifier(@Mapped(ObjCObjectMapper.class) NSSecureCoding item,
            String typeIdentifier);

    /**
     * Loads the best matching item for a type identifier. The returned object depends on the class specified for the
     * completion handler's `item` parameter.
     * See the table above for coercion rules.
     */
    @Generated
    @Selector("loadItemForTypeIdentifier:options:completionHandler:")
    public native void loadItemForTypeIdentifierOptionsCompletionHandler(String typeIdentifier,
            NSDictionary<?, ?> options,
            @ObjCBlock(name = "call_loadItemForTypeIdentifierOptionsCompletionHandler") Block_loadItemForTypeIdentifierOptionsCompletionHandler completionHandler);

    /**
     * Loads the preview image for this item by either calling the supplied preview block or falling back to a
     * QuickLook-based handler. This method, like loadItemForTypeIdentifier:options:completionHandler:, supports
     * implicit type coercion for the item parameter of the completion block. Allowed value classes are: NSData, NSURL,
     * UIImage/NSImage.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("loadPreviewImageWithOptions:completionHandler:")
    public native void loadPreviewImageWithOptionsCompletionHandler(NSDictionary<?, ?> options,
            @ObjCBlock(name = "call_loadPreviewImageWithOptionsCompletionHandler") Block_loadPreviewImageWithOptionsCompletionHandler completionHandler);

    /**
     * Returns the list of registered type identifiers, in the order they were registered.
     */
    @Generated
    @Selector("registeredTypeIdentifiers")
    public native NSArray<String> registeredTypeIdentifiers();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadItemForTypeIdentifierOptionsCompletionHandler {
        @Generated
        void call_loadItemForTypeIdentifierOptionsCompletionHandler(@Mapped(ObjCObjectMapper.class) Object item,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadPreviewImageWithOptionsCompletionHandler {
        @Generated
        void call_loadPreviewImageWithOptionsCompletionHandler(@Mapped(ObjCObjectMapper.class) Object item,
                NSError error);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("canLoadObjectOfClass:")
    public native boolean canLoadObjectOfClass(@Mapped(ObjCObjectMapper.class) NSItemProviderReading aClass);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("hasRepresentationConformingToTypeIdentifier:fileOptions:")
    public native boolean hasRepresentationConformingToTypeIdentifierFileOptions(String typeIdentifier,
            @NInt long fileOptions);

    /**
     * Instantiate an NSItemProvider by querying an object for its eligible type identifiers via the
     * NSItemProviderWriting protocol.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("initWithObject:")
    public native NSItemProvider initWithObject(@Mapped(ObjCObjectMapper.class) NSItemProviderWriting object);

    /**
     * Copies the provided data into an NSData object.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("loadDataRepresentationForTypeIdentifier:completionHandler:")
    public native NSProgress loadDataRepresentationForTypeIdentifierCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadDataRepresentationForTypeIdentifierCompletionHandler") Block_loadDataRepresentationForTypeIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadDataRepresentationForTypeIdentifierCompletionHandler {
        @Generated
        void call_loadDataRepresentationForTypeIdentifierCompletionHandler(NSData data, NSError error);
    }

    /**
     * Writes a copy of the data to a temporary file. This file will be deleted when the completion handler returns.
     * Your program should copy or move the file within the completion handler.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("loadFileRepresentationForTypeIdentifier:completionHandler:")
    public native NSProgress loadFileRepresentationForTypeIdentifierCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadFileRepresentationForTypeIdentifierCompletionHandler") Block_loadFileRepresentationForTypeIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFileRepresentationForTypeIdentifierCompletionHandler {
        @Generated
        void call_loadFileRepresentationForTypeIdentifierCompletionHandler(NSURL url, NSError error);
    }

    /**
     * Open the original file in place, if possible.
     * If a file is not available for opening in place, a copy of the file is written to a temporary location, and
     * `isInPlace` is set to NO. Your program may then copy or move the file, or the system will delete this file at
     * some point in the future.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("loadInPlaceFileRepresentationForTypeIdentifier:completionHandler:")
    public native NSProgress loadInPlaceFileRepresentationForTypeIdentifierCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadInPlaceFileRepresentationForTypeIdentifierCompletionHandler") Block_loadInPlaceFileRepresentationForTypeIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadInPlaceFileRepresentationForTypeIdentifierCompletionHandler {
        @Generated
        void call_loadInPlaceFileRepresentationForTypeIdentifierCompletionHandler(NSURL url, boolean isInPlace,
                NSError error);
    }

    /**
     * Instantiate an object using the NSItemProviderReading protocol.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("loadObjectOfClass:completionHandler:")
    public native NSProgress loadObjectOfClassCompletionHandler(
            @Mapped(ObjCObjectMapper.class) NSItemProviderReading aClass,
            @ObjCBlock(name = "call_loadObjectOfClassCompletionHandler") Block_loadObjectOfClassCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadObjectOfClassCompletionHandler {
        @Generated
        void call_loadObjectOfClassCompletionHandler(@Mapped(ObjCObjectMapper.class) Object object, NSError error);
    }

    /**
     * Estimated presentation size, in points. CGSizeZero value indicates this information is not available.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("preferredPresentationSize")
    @ByValue
    public native CGSize preferredPresentationSize();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("preferredPresentationStyle")
    @NInt
    public native long preferredPresentationStyle();

    /**
     * Add representations from an object using the NSItemProviderWriting protocol. Duplicate representations are
     * ignored.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("registerObject:visibility:")
    public native void registerObjectVisibility(@Mapped(ObjCObjectMapper.class) NSItemProviderWriting object,
            @NInt long visibility);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("registeredTypeIdentifiersWithFileOptions:")
    public native NSArray<String> registeredTypeIdentifiersWithFileOptions(@NInt long fileOptions);

    /**
     * Estimated presentation size, in points. CGSizeZero value indicates this information is not available.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPreferredPresentationSize:")
    public native void setPreferredPresentationSize(@ByValue CGSize value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPreferredPresentationStyle:")
    public native void setPreferredPresentationStyle(@NInt long value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setSuggestedName:")
    public native void setSuggestedName(String value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTeamData:")
    public native void setTeamData(NSData value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("suggestedName")
    public native String suggestedName();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("teamData")
    public native NSData teamData();

    /**
     * Sets a custom preview image handler block for this item provider. The returned item should preferably be NSData
     * or a file NSURL.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("previewImageHandler")
    @ObjCBlock(name = "call_previewImageHandler_ret")
    public native Block_previewImageHandler_ret previewImageHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_previewImageHandler_ret {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_previewImageHandler_ret {
            @Generated
            void call_Block_previewImageHandler_ret(@Mapped(ObjCObjectMapper.class) Object item, NSError error);
        }

        @Generated
        void call_previewImageHandler_ret(
                @ObjCBlock(name = "call_Block_previewImageHandler_ret") Block_Block_previewImageHandler_ret completionHandler,
                Class expectedValueClass, NSDictionary<?, ?> options);
    }

    /**
     * Registers a data-backed representation.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("registerDataRepresentationForTypeIdentifier:visibility:loadHandler:")
    public native void registerDataRepresentationForTypeIdentifierVisibilityLoadHandler(String typeIdentifier,
            @NInt long visibility,
            @ObjCBlock(name = "call_registerDataRepresentationForTypeIdentifierVisibilityLoadHandler") Block_registerDataRepresentationForTypeIdentifierVisibilityLoadHandler loadHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerDataRepresentationForTypeIdentifierVisibilityLoadHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_registerDataRepresentationForTypeIdentifierVisibilityLoadHandler {
            @Generated
            void call_Block_registerDataRepresentationForTypeIdentifierVisibilityLoadHandler(NSData arg0, NSError arg1);
        }

        @Generated
        NSProgress call_registerDataRepresentationForTypeIdentifierVisibilityLoadHandler(
                @ObjCBlock(name = "call_Block_registerDataRepresentationForTypeIdentifierVisibilityLoadHandler") Block_Block_registerDataRepresentationForTypeIdentifierVisibilityLoadHandler completionHandler);
    }

    /**
     * Registers a file-backed representation.
     * Set `coordinated` to YES if the returned file must be accessed using NSFileCoordinator.
     * If `NSItemProviderFileOptionOpenInPlace` is not provided, the file provided will be copied before the load
     * handler returns.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("registerFileRepresentationForTypeIdentifier:fileOptions:visibility:loadHandler:")
    public native void registerFileRepresentationForTypeIdentifierFileOptionsVisibilityLoadHandler(
            String typeIdentifier, @NInt long fileOptions, @NInt long visibility,
            @ObjCBlock(name = "call_registerFileRepresentationForTypeIdentifierFileOptionsVisibilityLoadHandler") Block_registerFileRepresentationForTypeIdentifierFileOptionsVisibilityLoadHandler loadHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerFileRepresentationForTypeIdentifierFileOptionsVisibilityLoadHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_registerFileRepresentationForTypeIdentifierFileOptionsVisibilityLoadHandler {
            @Generated
            void call_Block_registerFileRepresentationForTypeIdentifierFileOptionsVisibilityLoadHandler(NSURL arg0,
                    boolean arg1, NSError arg2);
        }

        @Generated
        NSProgress call_registerFileRepresentationForTypeIdentifierFileOptionsVisibilityLoadHandler(
                @ObjCBlock(name = "call_Block_registerFileRepresentationForTypeIdentifierFileOptionsVisibilityLoadHandler") Block_Block_registerFileRepresentationForTypeIdentifierFileOptionsVisibilityLoadHandler completionHandler);
    }

    /**
     * Registers a load handler that returns an object, assigned to a single UTI.
     */
    @Generated
    @Selector("registerItemForTypeIdentifier:loadHandler:")
    public native void registerItemForTypeIdentifierLoadHandler(String typeIdentifier,
            @ObjCBlock(name = "call_registerItemForTypeIdentifierLoadHandler") Block_registerItemForTypeIdentifierLoadHandler loadHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerItemForTypeIdentifierLoadHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_registerItemForTypeIdentifierLoadHandler {
            @Generated
            void call_Block_registerItemForTypeIdentifierLoadHandler(@Mapped(ObjCObjectMapper.class) Object item,
                    NSError error);
        }

        @Generated
        void call_registerItemForTypeIdentifierLoadHandler(
                @ObjCBlock(name = "call_Block_registerItemForTypeIdentifierLoadHandler") Block_Block_registerItemForTypeIdentifierLoadHandler completionHandler,
                Class expectedValueClass, NSDictionary<?, ?> options);
    }

    /**
     * Add representations from a class, but defer loading the object until needed.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("registerObjectOfClass:visibility:loadHandler:")
    public native void registerObjectOfClassVisibilityLoadHandler(
            @Mapped(ObjCObjectMapper.class) NSItemProviderWriting aClass, @NInt long visibility,
            @ObjCBlock(name = "call_registerObjectOfClassVisibilityLoadHandler") Block_registerObjectOfClassVisibilityLoadHandler loadHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerObjectOfClassVisibilityLoadHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_registerObjectOfClassVisibilityLoadHandler {
            @Generated
            void call_Block_registerObjectOfClassVisibilityLoadHandler(@Mapped(ObjCObjectMapper.class) Object arg0,
                    NSError arg1);
        }

        @Generated
        NSProgress call_registerObjectOfClassVisibilityLoadHandler(
                @ObjCBlock(name = "call_Block_registerObjectOfClassVisibilityLoadHandler") Block_Block_registerObjectOfClassVisibilityLoadHandler completionHandler);
    }

    /**
     * Sets a custom preview image handler block for this item provider. The returned item should preferably be NSData
     * or a file NSURL.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setPreviewImageHandler:")
    public native void setPreviewImageHandler(
            @ObjCBlock(name = "call_setPreviewImageHandler") Block_setPreviewImageHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPreviewImageHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_setPreviewImageHandler {
            @Generated
            void call_Block_setPreviewImageHandler(@Mapped(ObjCObjectMapper.class) Object item, NSError error);
        }

        @Generated
        void call_setPreviewImageHandler(
                @ObjCBlock(name = "call_Block_setPreviewImageHandler") Block_Block_setPreviewImageHandler completionHandler,
                Class expectedValueClass, NSDictionary<?, ?> options);
    }

    /**
     * Initialize this instance with the contents of a URL
     * \discussion The filename of the URL is copied into the \c suggestedName property
     * \param fileURL The URL of the file.
     * \param contentType The content type associated with this file, or \c nil to deduce the content type from the
     * file extension.
     * \param openInPlace Pass \c YES to allow this file to be opened in place.
     * \param coordinated Pass \c YES to use file coordination to access this file, even if it is not opened in place.
     * If \c openInPlace is set to \c YES file coordination will be used and this parameter is ignored.
     * \param visibility The visibility of this representation.
     */
    @Generated
    @Selector("initWithContentsOfURL:contentType:openInPlace:coordinated:visibility:")
    public native NSItemProvider initWithContentsOfURLContentTypeOpenInPlaceCoordinatedVisibility(NSURL fileURL,
            UTType contentType, boolean openInPlace, boolean coordinated, @NInt long visibility);

    /**
     * Load a representation as data
     * \discussion If the requested representation was registered as a file, an \c NSData with the contents of the file
     * will be provided. If the registered URL points to a folder, an \c NSData containing a zip archive containing that
     * folder will be provided.
     * \note The completion handler may be scheduled on an arbitrary queue.
     * \param contentType Content type of the representation to load. Must conform to one of the content types returned
     * by \c registeredContentTypes
     * \param completionHandler A block that will be called when loading is complete. It will either have a non-nil
     * \c data or a non-nil \c error parameter.
     * \return A progress object. Use it to monitor loading progress, or to cancel loading.
     */
    @Generated
    @Selector("loadDataRepresentationForContentType:completionHandler:")
    public native NSProgress loadDataRepresentationForContentTypeCompletionHandler(UTType contentType,
            @ObjCBlock(name = "call_loadDataRepresentationForContentTypeCompletionHandler") Block_loadDataRepresentationForContentTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadDataRepresentationForContentTypeCompletionHandler {
        @Generated
        void call_loadDataRepresentationForContentTypeCompletionHandler(NSData data, NSError error);
    }

    /**
     * Load a representation as a file
     * \discussion Except for files registered as open-in-place, a temporary file containing a copy of the original
     * will be provided to your completion handler. This temporary file will be deleted once your completion handler
     * returns. To keep a copy of this file, move or copy it into another directory before returning from the completion
     * handler.
     * \discussion If the representation was registered as \c NSData its contents will be written to a temporary file.
     * \discussion If \c suggestedName is non-nil, an attempt will be made to use it as the file name, with an
     * appropriate
     * file extension based on the content type. Otherwise, a suitable name and file extension will be chosen based on
     * the
     * content type.
     * \note The completion handler may be scheduled on an arbitrary queue
     * \param contentType Content type of the representation to load. Must conform to one of the content types returned
     * by \c registeredContentTypes
     * \param openInPlace Pass \c YES to attempt to open a file representation in place
     * \param completionHandler A block that will be called when loading is complete. It will either have a non-nil
     * \c URL or a non-nill \c error parameter. The \c openInPlace parameter will be set to
     * \c YES if the file was successfully opened in place, or \c NO if a copy of the file was
     * created in a temporary directory.
     * \return A progress object. Use it to monitor loading progress, or to cancel loading.
     */
    @Generated
    @Selector("loadFileRepresentationForContentType:openInPlace:completionHandler:")
    public native NSProgress loadFileRepresentationForContentTypeOpenInPlaceCompletionHandler(UTType contentType,
            boolean openInPlace,
            @ObjCBlock(name = "call_loadFileRepresentationForContentTypeOpenInPlaceCompletionHandler") Block_loadFileRepresentationForContentTypeOpenInPlaceCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFileRepresentationForContentTypeOpenInPlaceCompletionHandler {
        @Generated
        void call_loadFileRepresentationForContentTypeOpenInPlaceCompletionHandler(NSURL URL, boolean openInPlace,
                NSError error);
    }

    /**
     * Use this method when you have a @c CKShare that is already saved to the server. Invoking the share sheet with
     * a @c CKShare registered with this method will allow the owner to make modifications to the share settings, or
     * will allow a participant to view the share settings.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("registerCKShare:container:allowedSharingOptions:")
    public native void registerCKShareContainerAllowedSharingOptions(CKShare share, CKContainer container,
            CKAllowedSharingOptions allowedOptions);

    /**
     * Use this method when you want to share a collection of @c CKRecords but don't currently have a @c CKShare. When
     * the @c preparationHandler is called, you should create a new @c CKShare with the appropriate root @c CKRecord
     * or @c CKRecordZoneID. After ensuring the share and all records have been saved to the server, invoke the @c
     * preparationCompletionHandler with either the resulting @c CKShare, or an @c NSError if saving failed. Invoking
     * the share sheet with a @c CKShare registered with this method will prompt the user to start sharing.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("registerCKShareWithContainer:allowedSharingOptions:preparationHandler:")
    public native void registerCKShareWithContainerAllowedSharingOptionsPreparationHandler(CKContainer container,
            CKAllowedSharingOptions allowedOptions,
            @ObjCBlock(name = "call_registerCKShareWithContainerAllowedSharingOptionsPreparationHandler") Block_registerCKShareWithContainerAllowedSharingOptionsPreparationHandler preparationHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerCKShareWithContainerAllowedSharingOptionsPreparationHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_registerCKShareWithContainerAllowedSharingOptionsPreparationHandler {
            @Generated
            void call_Block_registerCKShareWithContainerAllowedSharingOptionsPreparationHandler(CKShare arg0,
                    NSError arg1);
        }

        @Generated
        void call_registerCKShareWithContainerAllowedSharingOptionsPreparationHandler(
                @ObjCBlock(name = "call_Block_registerCKShareWithContainerAllowedSharingOptionsPreparationHandler") Block_Block_registerCKShareWithContainerAllowedSharingOptionsPreparationHandler arg0);
    }

    /**
     * Register a representation backed by an \c NSData
     * \discussion The load handler must call the completion block when loading is complete. Pass either a non-nil data
     * object, or a non-nil error. If the load handler returns a non-nil progress object, it should report loading
     * progress
     * and respond to cancelation.
     * \param contentType The content type associated with the data representation.
     * \param visibility Specifies which processes have access to this representation.
     * \param loadHandler A block called to provide the data representation.
     */
    @Generated
    @Selector("registerDataRepresentationForContentType:visibility:loadHandler:")
    public native void registerDataRepresentationForContentTypeVisibilityLoadHandler(UTType contentType,
            @NInt long visibility,
            @ObjCBlock(name = "call_registerDataRepresentationForContentTypeVisibilityLoadHandler") Block_registerDataRepresentationForContentTypeVisibilityLoadHandler loadHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerDataRepresentationForContentTypeVisibilityLoadHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_registerDataRepresentationForContentTypeVisibilityLoadHandler {
            @Generated
            void call_Block_registerDataRepresentationForContentTypeVisibilityLoadHandler(NSData arg0, NSError arg1);
        }

        @Generated
        NSProgress call_registerDataRepresentationForContentTypeVisibilityLoadHandler(
                @ObjCBlock(name = "call_Block_registerDataRepresentationForContentTypeVisibilityLoadHandler") Block_Block_registerDataRepresentationForContentTypeVisibilityLoadHandler completionHandler);
    }

    /**
     * Register a representation backed by a file
     * \discussion It is permissible to provide a URL pointing to a folder. A folder requested as \c NSData will yield a
     * data object containing a zip archive holding a copy of the source folder tree.
     * 
     * The load handler must call the completion block when loading is complete. Pass either a non-nil url, or a non-nil
     * error. Pass \c YES to \c coordinated if the file should be accessed using file coordination even if it is not
     * opened
     * in-place. Files registered as open-in-place are assumed to need coordination, and this parameter will be ignored
     * in those cases. If the load handler returns a non-nil progress object, it should report loading progress and
     * respond
     * to cancelation.
     * \note Not all files specified as openable in place can be opened in place by the destination. System security or
     * privacy policies may restrict which files can be opened in place.
     * \param contentType The content type associated with the file representation.
     * \param visibility Specifies which processes have access to this representation.
     * \param openInPlace Specifies whether the file should be openable in place.
     * \param loadHandler A block called to provide the file representation.
     */
    @Generated
    @Selector("registerFileRepresentationForContentType:visibility:openInPlace:loadHandler:")
    public native void registerFileRepresentationForContentTypeVisibilityOpenInPlaceLoadHandler(UTType contentType,
            @NInt long visibility, boolean openInPlace,
            @ObjCBlock(name = "call_registerFileRepresentationForContentTypeVisibilityOpenInPlaceLoadHandler") Block_registerFileRepresentationForContentTypeVisibilityOpenInPlaceLoadHandler loadHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerFileRepresentationForContentTypeVisibilityOpenInPlaceLoadHandler {
        @Runtime(ObjCRuntime.class)
        @Generated
        public interface Block_Block_registerFileRepresentationForContentTypeVisibilityOpenInPlaceLoadHandler {
            @Generated
            void call_Block_registerFileRepresentationForContentTypeVisibilityOpenInPlaceLoadHandler(NSURL arg0,
                    boolean arg1, NSError arg2);
        }

        @Generated
        NSProgress call_registerFileRepresentationForContentTypeVisibilityOpenInPlaceLoadHandler(
                @ObjCBlock(name = "call_Block_registerFileRepresentationForContentTypeVisibilityOpenInPlaceLoadHandler") Block_Block_registerFileRepresentationForContentTypeVisibilityOpenInPlaceLoadHandler completionHandler);
    }

    /**
     * Registered content types, in the order they were registered
     * \discussion Content types should be registered in order of fidelity. Prefer using content types that appear
     * earlier
     * in the array.
     */
    @Generated
    @Selector("registeredContentTypes")
    public native NSArray<? extends UTType> registeredContentTypes();

    /**
     * Return an array of registered content types that conform to a given content type.
     * \discussion The returned content types are given in order of fidelity. Prefer content types that appear earlier
     * in the array.
     */
    @Generated
    @Selector("registeredContentTypesConformingToContentType:")
    public native NSArray<? extends UTType> registeredContentTypesConformingToContentType(UTType contentType);

    /**
     * Registered content types that can be loaded as files opened in place
     */
    @Generated
    @Selector("registeredContentTypesForOpenInPlace")
    public native NSArray<? extends UTType> registeredContentTypesForOpenInPlace();
}
