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
import apple.foundation.protocol.NSCoding;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileWrapper extends NSObject implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFileWrapper(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileWrapper alloc();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * addFileWrapper:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instm/NSFileWrapper/addFileWrapper:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addFileWrapper:")
    public native String addFileWrapper(NSFileWrapper child);

    /**
     * addRegularFileWithContents:preferredFilename:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instm/NSFileWrapper/addRegularFileWithContents:preferredFilename:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addRegularFileWithContents:preferredFilename:")
    public native String addRegularFileWithContentsPreferredFilename(NSData data, String fileName);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * fileAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instp/NSFileWrapper/fileAttributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileAttributes")
    public native NSDictionary<String, ?> fileAttributes();

    /**
     * fileWrappers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instp/NSFileWrapper/fileWrappers">iOS Dev Center</a>
     */
    @Generated
    @Selector("fileWrappers")
    public native NSDictionary<String, ? extends NSFileWrapper> fileWrappers();

    /**
     * filename</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instp/NSFileWrapper/filename">iOS Dev Center</a>
     */
    @Generated
    @Selector("filename")
    public native String filename();

    @Generated
    @Selector("init")
    public native NSFileWrapper init();

    /**
     * initDirectoryWithFileWrappers:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instm/NSFileWrapper/initDirectoryWithFileWrappers:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initDirectoryWithFileWrappers:")
    public native NSFileWrapper initDirectoryWithFileWrappers(
            NSDictionary<String, ? extends NSFileWrapper> childrenByPreferredName);

    /**
     * initRegularFileWithContents:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instm/NSFileWrapper/initRegularFileWithContents:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initRegularFileWithContents:")
    public native NSFileWrapper initRegularFileWithContents(NSData contents);

    /**
     * initSymbolicLinkWithDestinationURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instm/NSFileWrapper/initSymbolicLinkWithDestinationURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initSymbolicLinkWithDestinationURL:")
    public native NSFileWrapper initSymbolicLinkWithDestinationURL(NSURL url);

    @Generated
    @Selector("initWithCoder:")
    public native NSFileWrapper initWithCoder(NSCoder inCoder);

    /**
     * initWithSerializedRepresentation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instm/NSFileWrapper/initWithSerializedRepresentation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithSerializedRepresentation:")
    public native NSFileWrapper initWithSerializedRepresentation(NSData serializeRepresentation);

    /**
     * initWithURL:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instm/NSFileWrapper/initWithURL:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithURL:options:error:")
    public native NSFileWrapper initWithURLOptionsError(NSURL url, @NUInt long options, Ptr<NSError> outError);

    /**
     * directory</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instp/NSFileWrapper/directory">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDirectory")
    public native boolean isDirectory();

    /**
     * regularFile</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instp/NSFileWrapper/regularFile">iOS Dev Center</a>
     */
    @Generated
    @Selector("isRegularFile")
    public native boolean isRegularFile();

    /**
     * symbolicLink</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instp/NSFileWrapper/symbolicLink">iOS Dev Center</a>
     */
    @Generated
    @Selector("isSymbolicLink")
    public native boolean isSymbolicLink();

    /**
     * keyForFileWrapper:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instm/NSFileWrapper/keyForFileWrapper:">iOS Dev Center</a>
     */
    @Generated
    @Selector("keyForFileWrapper:")
    public native String keyForFileWrapper(NSFileWrapper child);

    /**
     * matchesContentsOfURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instm/NSFileWrapper/matchesContentsOfURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("matchesContentsOfURL:")
    public native boolean matchesContentsOfURL(NSURL url);

    /**
     * preferredFilename</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instp/NSFileWrapper/preferredFilename">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredFilename")
    public native String preferredFilename();

    /**
     * readFromURL:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instm/NSFileWrapper/readFromURL:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("readFromURL:options:error:")
    public native boolean readFromURLOptionsError(NSURL url, @NUInt long options, Ptr<NSError> outError);

    /**
     * regularFileContents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instp/NSFileWrapper/regularFileContents">iOS Dev Center</a>
     */
    @Generated
    @Selector("regularFileContents")
    public native NSData regularFileContents();

    /**
     * removeFileWrapper:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instm/NSFileWrapper/removeFileWrapper:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeFileWrapper:")
    public native void removeFileWrapper(NSFileWrapper child);

    /**
     * serializedRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instp/NSFileWrapper/serializedRepresentation">iOS Dev Center</a>
     */
    @Generated
    @Selector("serializedRepresentation")
    public native NSData serializedRepresentation();

    /**
     * fileAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instp/NSFileWrapper/fileAttributes">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFileAttributes:")
    public native void setFileAttributes(NSDictionary<String, ?> value);

    /**
     * filename</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instp/NSFileWrapper/filename">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFilename:")
    public native void setFilename(String value);

    /**
     * preferredFilename</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instp/NSFileWrapper/preferredFilename">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreferredFilename:")
    public native void setPreferredFilename(String value);

    /**
     * symbolicLinkDestinationURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instp/NSFileWrapper/symbolicLinkDestinationURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("symbolicLinkDestinationURL")
    public native NSURL symbolicLinkDestinationURL();

    /**
     * writeToURL:options:originalContentsURL:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSFileWrapper_Class/index.html#//apple_ref/occ/instm/NSFileWrapper/writeToURL:options:originalContentsURL:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeToURL:options:originalContentsURL:error:")
    public native boolean writeToURLOptionsOriginalContentsURLError(NSURL url, @NUInt long options,
            NSURL originalContentsURL, Ptr<NSError> outError);
}
