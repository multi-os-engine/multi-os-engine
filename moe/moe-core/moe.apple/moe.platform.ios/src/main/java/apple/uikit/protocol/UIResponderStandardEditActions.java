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

package apple.uikit.protocol;

import apple.foundation.NSDictionary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIResponderStandardEditActions")
public interface UIResponderStandardEditActions {
    /**
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("copy:")
    default void copy(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("cut:")
    default void cut(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("decreaseSize:")
    default void decreaseSize(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.2
     */
    @Generated
    @IsOptional
    @Selector("delete:")
    default void delete(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("increaseSize:")
    default void increaseSize(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 5.0
     */
    @Generated
    @IsOptional
    @Selector("makeTextWritingDirectionLeftToRight:")
    default void makeTextWritingDirectionLeftToRight(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 5.0
     */
    @Generated
    @IsOptional
    @Selector("makeTextWritingDirectionRightToLeft:")
    default void makeTextWritingDirectionRightToLeft(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("paste:")
    default void paste(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("select:")
    default void select(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("selectAll:")
    default void selectAll(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("toggleBoldface:")
    default void toggleBoldface(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("toggleItalics:")
    default void toggleItalics(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("toggleUnderline:")
    default void toggleUnderline(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("updateTextAttributesWithConversionHandler:")
    default void updateTextAttributesWithConversionHandler(
            @NotNull @ObjCBlock(name = "call_updateTextAttributesWithConversionHandler") Block_updateTextAttributesWithConversionHandler conversionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateTextAttributesWithConversionHandler {
        @NotNull
        @Generated
        NSDictionary<String, ?> call_updateTextAttributesWithConversionHandler(@NotNull NSDictionary<String, ?> arg0);
    }

    /**
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("pasteAndGo:")
    default void pasteAndGo(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("pasteAndMatchStyle:")
    default void pasteAndMatchStyle(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("pasteAndSearch:")
    default void pasteAndSearch(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("print:")
    default void print(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("duplicate:")
    default void duplicate(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("export:")
    default void export(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("find:")
    default void find(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("findAndReplace:")
    default void findAndReplace(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("findNext:")
    default void findNext(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("findPrevious:")
    default void findPrevious(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("move:")
    default void move(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("rename:")
    default void rename(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("useSelectionForFind:")
    default void useSelectionForFind(@Nullable @Mapped(ObjCObjectMapper.class) Object sender) {
        throw new java.lang.UnsupportedOperationException();
    }
}
