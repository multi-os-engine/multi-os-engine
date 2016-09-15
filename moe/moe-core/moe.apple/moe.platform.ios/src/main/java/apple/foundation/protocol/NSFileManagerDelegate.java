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

package apple.foundation.protocol;

import apple.foundation.NSError;
import apple.foundation.NSFileManager;
import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileManagerDelegate")
public interface NSFileManagerDelegate {
    /**
     * fileManager:shouldCopyItemAtPath:toPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldCopyItemAtPath:toPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldCopyItemAtPath:toPath:")
    default boolean fileManagerShouldCopyItemAtPathToPath(NSFileManager fileManager, String srcPath, String dstPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldCopyItemAtURL:toURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldCopyItemAtURL:toURL:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldCopyItemAtURL:toURL:")
    default boolean fileManagerShouldCopyItemAtURLToURL(NSFileManager fileManager, NSURL srcURL, NSURL dstURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldLinkItemAtPath:toPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldLinkItemAtPath:toPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldLinkItemAtPath:toPath:")
    default boolean fileManagerShouldLinkItemAtPathToPath(NSFileManager fileManager, String srcPath, String dstPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldLinkItemAtURL:toURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldLinkItemAtURL:toURL:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldLinkItemAtURL:toURL:")
    default boolean fileManagerShouldLinkItemAtURLToURL(NSFileManager fileManager, NSURL srcURL, NSURL dstURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldMoveItemAtPath:toPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldMoveItemAtPath:toPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldMoveItemAtPath:toPath:")
    default boolean fileManagerShouldMoveItemAtPathToPath(NSFileManager fileManager, String srcPath, String dstPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldMoveItemAtURL:toURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldMoveItemAtURL:toURL:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldMoveItemAtURL:toURL:")
    default boolean fileManagerShouldMoveItemAtURLToURL(NSFileManager fileManager, NSURL srcURL, NSURL dstURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldProceedAfterError:copyingItemAtPath:toPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldProceedAfterError:copyingItemAtPath:toPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:copyingItemAtPath:toPath:")
    default boolean fileManagerShouldProceedAfterErrorCopyingItemAtPathToPath(NSFileManager fileManager, NSError error,
            String srcPath, String dstPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldProceedAfterError:copyingItemAtURL:toURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldProceedAfterError:copyingItemAtURL:toURL:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:copyingItemAtURL:toURL:")
    default boolean fileManagerShouldProceedAfterErrorCopyingItemAtURLToURL(NSFileManager fileManager, NSError error,
            NSURL srcURL, NSURL dstURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldProceedAfterError:linkingItemAtPath:toPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldProceedAfterError:linkingItemAtPath:toPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:linkingItemAtPath:toPath:")
    default boolean fileManagerShouldProceedAfterErrorLinkingItemAtPathToPath(NSFileManager fileManager, NSError error,
            String srcPath, String dstPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldProceedAfterError:linkingItemAtURL:toURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldProceedAfterError:linkingItemAtURL:toURL:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:linkingItemAtURL:toURL:")
    default boolean fileManagerShouldProceedAfterErrorLinkingItemAtURLToURL(NSFileManager fileManager, NSError error,
            NSURL srcURL, NSURL dstURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldProceedAfterError:movingItemAtPath:toPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldProceedAfterError:movingItemAtPath:toPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:movingItemAtPath:toPath:")
    default boolean fileManagerShouldProceedAfterErrorMovingItemAtPathToPath(NSFileManager fileManager, NSError error,
            String srcPath, String dstPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldProceedAfterError:movingItemAtURL:toURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldProceedAfterError:movingItemAtURL:toURL:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:movingItemAtURL:toURL:")
    default boolean fileManagerShouldProceedAfterErrorMovingItemAtURLToURL(NSFileManager fileManager, NSError error,
            NSURL srcURL, NSURL dstURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldProceedAfterError:removingItemAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldProceedAfterError:removingItemAtPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:removingItemAtPath:")
    default boolean fileManagerShouldProceedAfterErrorRemovingItemAtPath(NSFileManager fileManager, NSError error,
            String path) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldProceedAfterError:removingItemAtURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldProceedAfterError:removingItemAtURL:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:removingItemAtURL:")
    default boolean fileManagerShouldProceedAfterErrorRemovingItemAtURL(NSFileManager fileManager, NSError error,
            NSURL URL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldRemoveItemAtPath:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldRemoveItemAtPath:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldRemoveItemAtPath:")
    default boolean fileManagerShouldRemoveItemAtPath(NSFileManager fileManager, String path) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldRemoveItemAtURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSFileManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSFileManagerDelegate/fileManager:shouldRemoveItemAtURL:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldRemoveItemAtURL:")
    default boolean fileManagerShouldRemoveItemAtURL(NSFileManager fileManager, NSURL URL) {
        throw new java.lang.UnsupportedOperationException();
    }
}
