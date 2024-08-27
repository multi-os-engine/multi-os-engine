package apple.uikit.protocol;

import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITraitDefinition")
public interface UITraitDefinition {
    /**
     * Whether the trait is used to resolve dynamic colors (or images), and changes to the trait should
     * automatically trigger views using dynamic colors/images to update their appearance. Default is NO.
     */
    @Generated
    @IsOptional
    @Selector("affectsColorAppearance")
    @ProtocolClassMethod("affectsColorAppearance")
    default boolean _affectsColorAppearance() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A unique identifier string for the trait (reverse-DNS format recommended).
     * Allows the trait to be encoded/decoded, and to map both a Swift and Objective-C trait to the same data.
     */
    @Generated
    @IsOptional
    @Selector("identifier")
    @ProtocolClassMethod("identifier")
    @NotNull
    default String _identifier() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A short human-readable name for the trait, e.g. for printing and debugging output.
     * By default, the trait's class name is used when not implemented.
     */
    @Generated
    @IsOptional
    @Selector("name")
    @ProtocolClassMethod("name")
    @NotNull
    default String _name() {
        throw new java.lang.UnsupportedOperationException();
    }
}