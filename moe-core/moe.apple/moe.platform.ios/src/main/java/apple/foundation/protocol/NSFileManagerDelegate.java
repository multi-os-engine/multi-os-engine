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
import org.jetbrains.annotations.NotNull;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileManagerDelegate")
public interface NSFileManagerDelegate {
    /**
     * fileManager:shouldCopyItemAtPath:toPath: gives the delegate an opportunity to filter the resulting copy.
     * Returning YES from this method will allow the copy to happen. Returning NO from this method causes the item in
     * question to be skipped. If the item skipped was a directory, no children of that directory will be copied, nor
     * will the delegate be notified of those children.
     * 
     * If the delegate does not implement this method, the NSFileManager instance acts as if this method returned YES.
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldCopyItemAtPath:toPath:")
    default boolean fileManagerShouldCopyItemAtPathToPath(@NotNull NSFileManager fileManager, @NotNull String srcPath,
            @NotNull String dstPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldCopyItemAtURL:toURL:")
    default boolean fileManagerShouldCopyItemAtURLToURL(@NotNull NSFileManager fileManager, @NotNull NSURL srcURL,
            @NotNull NSURL dstURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldLinkItemAtPath:toPath: acts as the other "should" methods, but this applies to the file manager
     * creating hard links to the files in question.
     * 
     * If the delegate does not implement this method, the NSFileManager instance acts as if this method returned YES.
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldLinkItemAtPath:toPath:")
    default boolean fileManagerShouldLinkItemAtPathToPath(@NotNull NSFileManager fileManager, @NotNull String srcPath,
            @NotNull String dstPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldLinkItemAtURL:toURL:")
    default boolean fileManagerShouldLinkItemAtURLToURL(@NotNull NSFileManager fileManager, @NotNull NSURL srcURL,
            @NotNull NSURL dstURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldMoveItemAtPath:toPath: gives the delegate an opportunity to not move the item at the specified
     * path. If the source path and the destination path are not on the same device, a copy is performed to the
     * destination path and the original is removed. If the copy does not succeed, an error is returned and the
     * incomplete copy is removed, leaving the original in place.
     * 
     * If the delegate does not implement this method, the NSFileManager instance acts as if this method returned YES.
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldMoveItemAtPath:toPath:")
    default boolean fileManagerShouldMoveItemAtPathToPath(@NotNull NSFileManager fileManager, @NotNull String srcPath,
            @NotNull String dstPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldMoveItemAtURL:toURL:")
    default boolean fileManagerShouldMoveItemAtURLToURL(@NotNull NSFileManager fileManager, @NotNull NSURL srcURL,
            @NotNull NSURL dstURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldProceedAfterError:copyingItemAtPath:toPath: gives the delegate an opportunity to recover from
     * or continue copying after an error. If an error occurs, the error object will contain an NSError indicating the
     * problem. The source path and destination paths are also provided. If this method returns YES, the NSFileManager
     * instance will continue as if the error had not occurred. If this method returns NO, the NSFileManager instance
     * will stop copying, return NO from copyItemAtPath:toPath:error: and the error will be provied there.
     * 
     * If the delegate does not implement this method, the NSFileManager instance acts as if this method returned NO.
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:copyingItemAtPath:toPath:")
    default boolean fileManagerShouldProceedAfterErrorCopyingItemAtPathToPath(@NotNull NSFileManager fileManager,
            @NotNull NSError error, @NotNull String srcPath, @NotNull String dstPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:copyingItemAtURL:toURL:")
    default boolean fileManagerShouldProceedAfterErrorCopyingItemAtURLToURL(@NotNull NSFileManager fileManager,
            @NotNull NSError error, @NotNull NSURL srcURL, @NotNull NSURL dstURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldProceedAfterError:linkingItemAtPath:toPath: allows the delegate an opportunity to remedy the
     * error which occurred in linking srcPath to dstPath. If the delegate returns YES from this method, the linking
     * will continue. If the delegate returns NO from this method, the linking operation will stop and the error will be
     * returned via linkItemAtPath:toPath:error:.
     * 
     * If the delegate does not implement this method, the NSFileManager instance acts as if this method returned NO.
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:linkingItemAtPath:toPath:")
    default boolean fileManagerShouldProceedAfterErrorLinkingItemAtPathToPath(@NotNull NSFileManager fileManager,
            @NotNull NSError error, @NotNull String srcPath, @NotNull String dstPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:linkingItemAtURL:toURL:")
    default boolean fileManagerShouldProceedAfterErrorLinkingItemAtURLToURL(@NotNull NSFileManager fileManager,
            @NotNull NSError error, @NotNull NSURL srcURL, @NotNull NSURL dstURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldProceedAfterError:movingItemAtPath:toPath: functions much like
     * fileManager:shouldProceedAfterError:copyingItemAtPath:toPath: above. The delegate has the opportunity to remedy
     * the error condition and allow the move to continue.
     * 
     * If the delegate does not implement this method, the NSFileManager instance acts as if this method returned NO.
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:movingItemAtPath:toPath:")
    default boolean fileManagerShouldProceedAfterErrorMovingItemAtPathToPath(@NotNull NSFileManager fileManager,
            @NotNull NSError error, @NotNull String srcPath, @NotNull String dstPath) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:movingItemAtURL:toURL:")
    default boolean fileManagerShouldProceedAfterErrorMovingItemAtURLToURL(@NotNull NSFileManager fileManager,
            @NotNull NSError error, @NotNull NSURL srcURL, @NotNull NSURL dstURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldProceedAfterError:removingItemAtPath: allows the delegate an opportunity to remedy the error
     * which occurred in removing the item at the path provided. If the delegate returns YES from this method, the
     * removal operation will continue. If the delegate returns NO from this method, the removal operation will stop and
     * the error will be returned via linkItemAtPath:toPath:error:.
     * 
     * If the delegate does not implement this method, the NSFileManager instance acts as if this method returned NO.
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:removingItemAtPath:")
    default boolean fileManagerShouldProceedAfterErrorRemovingItemAtPath(@NotNull NSFileManager fileManager,
            @NotNull NSError error, @NotNull String path) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldProceedAfterError:removingItemAtURL:")
    default boolean fileManagerShouldProceedAfterErrorRemovingItemAtURL(@NotNull NSFileManager fileManager,
            @NotNull NSError error, @NotNull NSURL URL) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * fileManager:shouldRemoveItemAtPath: allows the delegate the opportunity to not remove the item at path. If the
     * delegate returns YES from this method, the NSFileManager instance will attempt to remove the item. If the
     * delegate returns NO from this method, the remove skips the item. If the item is a directory, no children of that
     * item will be visited.
     * 
     * If the delegate does not implement this method, the NSFileManager instance acts as if this method returned YES.
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldRemoveItemAtPath:")
    default boolean fileManagerShouldRemoveItemAtPath(@NotNull NSFileManager fileManager, @NotNull String path) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("fileManager:shouldRemoveItemAtURL:")
    default boolean fileManagerShouldRemoveItemAtURL(@NotNull NSFileManager fileManager, @NotNull NSURL URL) {
        throw new java.lang.UnsupportedOperationException();
    }
}
