package apple.pencilkit.protocol;

import apple.pencilkit.PKToolPicker;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKToolPickerObserver")
public interface PKToolPickerObserver {
    @Generated
    @IsOptional
    @Selector("toolPickerFramesObscuredDidChange:")
    default void toolPickerFramesObscuredDidChange(PKToolPicker toolPicker) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("toolPickerIsRulerActiveDidChange:")
    default void toolPickerIsRulerActiveDidChange(PKToolPicker toolPicker) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("toolPickerSelectedToolDidChange:")
    default void toolPickerSelectedToolDidChange(PKToolPicker toolPicker) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("toolPickerVisibilityDidChange:")
    default void toolPickerVisibilityDidChange(PKToolPicker toolPicker) {
        throw new java.lang.UnsupportedOperationException();
    }
}