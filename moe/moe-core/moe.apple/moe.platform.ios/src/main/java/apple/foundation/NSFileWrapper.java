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
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileWrapper extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFileWrapper(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileWrapper alloc();

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

    /**
     * Add a file wrapper to the receiver's children and return the file name that uniquely identifies it among the receiver's children. The unique file name will be the same as the passed-in file wrapper's preferred file name unless that name is already in use as a key into the receiver's dictionary of children. Beware of the fact that -initDirectoryWithFileWrappers:, -initRegularFileWithContents:, and -initSymbolicLinkWithDestinationURL: do not automatically set the preferred file name.
     */
    @Generated
    @Selector("addFileWrapper:")
    public native String addFileWrapper(NSFileWrapper child);

    /**
     * A convenience method. The default implementation merely allocates a new file wrapper, initializes it with -initRegularFileWithContents:, sends it -setPreferredFileName:fileName, adds it to the receiver with -addFileWrapper:, and returns what -addFileWrapper: returned.
     */
    @Generated
    @Selector("addRegularFileWithContents:preferredFilename:")
    public native String addRegularFileWithContentsPreferredFilename(NSData data, String fileName);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * The file attributes, in a dictionary of the same sort as those returned by -[NSFileManager attributesOfItemAtPath:error:].
     */
    @Generated
    @Selector("fileAttributes")
    public native NSDictionary<String, ?> fileAttributes();

    /**
     * Return a dictionary whose values are the receiver's children and whose keys are the unique file name that has been assigned to each one. This method may return nil if the receiver is the result of reading a parent from the file system (use NSFileWrapperReadingImmediately if appropriate to prevent that).
     */
    @Generated
    @Selector("fileWrappers")
    public native NSDictionary<String, ? extends NSFileWrapper> fileWrappers();

    /**
     * The actual file name. Often it will be the same as the preferred file name but might instead be a name derived from the preferred file name. You can use this method to find out the name of a child that's just been read but you should not use it to find out the name of a child that's about to be written, because the name might be about to change. Send -keyForFileWrapper: to the parent instead.
     */
    @Generated
    @Selector("filename")
    public native String filename();

    @Generated
    @Selector("init")
    public native NSFileWrapper init();

    /**
     * A designated initializer for creating an instance for which -isDirectory returns YES. The passed-in dictionary must contain entries whose values are the file wrappers that are to become children and whose keys are file names. Each file wrapper that does not already have a preferred file name is sent -setPreferredFilename: with the corresponding key as the argument.
     */
    @Generated
    @Selector("initDirectoryWithFileWrappers:")
    public native NSFileWrapper initDirectoryWithFileWrappers(
            NSDictionary<String, ? extends NSFileWrapper> childrenByPreferredName);

    /**
     * A designated initializer for creating an instance for which -isRegularFile returns YES.
     */
    @Generated
    @Selector("initRegularFileWithContents:")
    public native NSFileWrapper initRegularFileWithContents(NSData contents);

    /**
     * A designated initializer for creating an instance for which -isSymbolicLink returns YES. -writeToURL:options:originalContentsURL:error: uses the result of sending -relativePath to this URL when creating a symbolic link. (An NSURL initialized by -initFileURLWithPath: returns that entire path when sent -relativePath though.)
     */
    @Generated
    @Selector("initSymbolicLinkWithDestinationURL:")
    public native NSFileWrapper initSymbolicLinkWithDestinationURL(NSURL url);

    @Generated
    @Selector("initWithCoder:")
    public native NSFileWrapper initWithCoder(NSCoder inCoder);

    /**
     * A designated initializer. The data must be in the same format as that returned by -serializedRepresentation.
     */
    @Generated
    @Selector("initWithSerializedRepresentation:")
    public native NSFileWrapper initWithSerializedRepresentation(NSData serializeRepresentation);

    /**
     * A designated initializer for creating an instance whose kind (directory, regular file, or symbolic link) is determined based on what the URL locates. If reading is not successful return nil after setting *outError to an NSError that encapsulates the reason why the file wrapper could not be read.
     */
    @Generated
    @Selector("initWithURL:options:error:")
    public native NSFileWrapper initWithURLOptionsError(NSURL url, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * What kind of file wrapper it is. Invocations of -readFromURL:options:error: may change what subsequent invocations of these methods return.
     */
    @Generated
    @Selector("isDirectory")
    public native boolean isDirectory();

    @Generated
    @Selector("isRegularFile")
    public native boolean isRegularFile();

    @Generated
    @Selector("isSymbolicLink")
    public native boolean isSymbolicLink();

    /**
     * Return the unique file name that has been assigned to a child or nil if it is not a child of the receiver.
     */
    @Generated
    @Selector("keyForFileWrapper:")
    public native String keyForFileWrapper(NSFileWrapper child);

    /**
     * Whether the receiver matches the directory, regular file, or symbolic link that is located by the URL. For a directory, children are compared against the files in the directory, recursively. The contents of files are not compared; matching of regular files is based on file modification dates. Because children of directory file wrappers are not read immediately by -initWithURL:options:error: or -readFromURL:options:error: unless NSFileWrapperReadingImmediate is used, creating a file wrapper and then later sending it this message is not a reliable way to simply check whether anything in a directory has changed. You can use this method to determine whether the receiver's contents in memory are out of date relative to the file system.
     */
    @Generated
    @Selector("matchesContentsOfURL:")
    public native boolean matchesContentsOfURL(NSURL url);

    /**
     * The file name that is "preferred." When the receiver is added to a parent directory file wrapper the parent will attempt to use this name as the key into its dictionary of children. Usually the preferred file name will actually get used in this situation but it won't be if that key is already in use. The default implementation of this method causes existing parents to remove and re-add the child to accommodate the change. Preferred file names of children are not effectively preserved when you write a file wrapper to disk and then later instantiate another file wrapper by reading. If your application needs to preserve the user-visible names of attachments it has to make its own arrangements for their storage.
     * 
     * Some instances of NSFileWrapper may be created without a preferredFilename (e.g. -initDirectoryWithFileWrappers: or -initRegularFileWithContents:), meaning preferredFilename may be nil. However, setting nil is never allowed and will result in an exception.
     */
    @Generated
    @Selector("preferredFilename")
    public native String preferredFilename();

    /**
     * Recursively reread the entire contents of the receiver from the specified location, and return YES if successful. If not successful, return NO after setting *outError to an NSError that encapsulates the reason why the file wrapper could not be reread. When reading a directory children are added and removed as necessary to match the file system.
     */
    @Generated
    @Selector("readFromURL:options:error:")
    public native boolean readFromURLOptionsError(NSURL url, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Return the receiver's contents. This may return nil if the receiver is the result of reading a parent from the file system (use NSFileWrapperReadingImmediately if appropriate to prevent that).
     */
    @Generated
    @Selector("regularFileContents")
    public native NSData regularFileContents();

    /**
     * Remove a file wrapper from the receiver's children.
     */
    @Generated
    @Selector("removeFileWrapper:")
    public native void removeFileWrapper(NSFileWrapper child);

    /**
     * Return an NSData suitable for passing to -initWithSerializedRepresentation:. This method may return nil if the receiver is the result of reading from the file system (use NSFileWrapperReadingImmediately if appropriate to prevent that).
     */
    @Generated
    @Selector("serializedRepresentation")
    public native NSData serializedRepresentation();

    /**
     * The file attributes, in a dictionary of the same sort as those returned by -[NSFileManager attributesOfItemAtPath:error:].
     */
    @Generated
    @Selector("setFileAttributes:")
    public native void setFileAttributes(NSDictionary<String, ?> value);

    /**
     * The actual file name. Often it will be the same as the preferred file name but might instead be a name derived from the preferred file name. You can use this method to find out the name of a child that's just been read but you should not use it to find out the name of a child that's about to be written, because the name might be about to change. Send -keyForFileWrapper: to the parent instead.
     */
    @Generated
    @Selector("setFilename:")
    public native void setFilename(String value);

    /**
     * The file name that is "preferred." When the receiver is added to a parent directory file wrapper the parent will attempt to use this name as the key into its dictionary of children. Usually the preferred file name will actually get used in this situation but it won't be if that key is already in use. The default implementation of this method causes existing parents to remove and re-add the child to accommodate the change. Preferred file names of children are not effectively preserved when you write a file wrapper to disk and then later instantiate another file wrapper by reading. If your application needs to preserve the user-visible names of attachments it has to make its own arrangements for their storage.
     * 
     * Some instances of NSFileWrapper may be created without a preferredFilename (e.g. -initDirectoryWithFileWrappers: or -initRegularFileWithContents:), meaning preferredFilename may be nil. However, setting nil is never allowed and will result in an exception.
     */
    @Generated
    @Selector("setPreferredFilename:")
    public native void setPreferredFilename(String value);

    /**
     * Return the destination link of the receiver. This may return nil if the receiver is the result of reading a parent from the file system (use NSFileWrapperReadingImmediately if appropriate to prevent that).
     */
    @Generated
    @Selector("symbolicLinkDestinationURL")
    public native NSURL symbolicLinkDestinationURL();

    /**
     * Recursively write the entire contents of the receiver at the specified location, and return YES if successful. If not successful, return NO after setting *outError to an NSError that encapsulates the reason why the file wrapper could not be written. originalContentsURL may be nil or it may be the location of a previous revision of what is being written. If it is not nil the default implementation of this method attempts to avoid unnecessary I/O by merely writing hard links to regular files instead of actually writing out their contents. The descendant file wrappers must return accurate values when sent -filename for this to work (use NSFileWrapperWritingWithNameUpdating to increase the likelihood of that).
     */
    @Generated
    @Selector("writeToURL:options:originalContentsURL:error:")
    public native boolean writeToURLOptionsOriginalContentsURLError(NSURL url, @NUInt long options,
            NSURL originalContentsURL, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
