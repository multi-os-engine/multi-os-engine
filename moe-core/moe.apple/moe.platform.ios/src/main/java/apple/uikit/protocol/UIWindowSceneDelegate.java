package apple.uikit.protocol;

import apple.cloudkit.CKShareMetadata;
import apple.uikit.UIApplicationShortcutItem;
import apple.uikit.UITraitCollection;
import apple.uikit.UIWindow;
import apple.uikit.UIWindowScene;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.uikit.UISceneWindowingControlStyle;
import apple.uikit.UIWindowSceneGeometry;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIWindowSceneDelegate")
public interface UIWindowSceneDelegate extends UISceneDelegate {
    /**
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("setWindow:")
    default void setWindow(@Nullable UIWindow value) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("window")
    default UIWindow window() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the coordinate space, interface orientation, or trait collection of a `UIWindowScene` changes.
     * 
     * Always called when a UIWindowScene moves between screens.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 26.0
     * Deprecated-Message: Use windowScene(_: didUpdateEffectiveGeometry:) to be notified of the scene's geometry
     * changes, or use traits whose values are inherited from the scene via the traitCollection of views and view
     * controllers instead.
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("windowScene:didUpdateCoordinateSpace:interfaceOrientation:traitCollection:")
    default void windowSceneDidUpdateCoordinateSpaceInterfaceOrientationTraitCollection(
            @NotNull UIWindowScene windowScene,
            @NotNull @Mapped(ObjCObjectMapper.class) UICoordinateSpace previousCoordinateSpace,
            @NInt long previousInterfaceOrientation, @NotNull UITraitCollection previousTraitCollection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user activates your application by selecting a shortcut on the home screen,
     * and the window scene is already connected.
     */
    @Generated
    @IsOptional
    @Selector("windowScene:performActionForShortcutItem:completionHandler:")
    default void windowScenePerformActionForShortcutItemCompletionHandler(@NotNull UIWindowScene windowScene,
            @NotNull UIApplicationShortcutItem shortcutItem,
            @NotNull @ObjCBlock(name = "call_windowScenePerformActionForShortcutItemCompletionHandler") Block_windowScenePerformActionForShortcutItemCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_windowScenePerformActionForShortcutItemCompletionHandler {
        @Generated
        void call_windowScenePerformActionForShortcutItemCompletionHandler(boolean succeeded);
    }

    /**
     * Called after the user indicates they want to accept a CloudKit sharing invitation in your application
     * and the window scene is already connected.
     * You should use the CKShareMetadata object's shareURL and containerIdentifier to schedule a
     * CKAcceptSharesOperation, then start using
     * the resulting CKShare and its associated record(s), which will appear in the CKContainer's shared database in a
     * zone matching that of the record's owner.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("windowScene:userDidAcceptCloudKitShareWithMetadata:")
    default void windowSceneUserDidAcceptCloudKitShareWithMetadata(@NotNull UIWindowScene windowScene,
            @NotNull CKShareMetadata cloudKitShareMetadata) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called by the system to determine the windowing control style for the provided scene.
     * `automaticStyle` will be used if this method is not implemented.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("preferredWindowingControlStyleForScene:")
    @NotNull
    default UISceneWindowingControlStyle preferredWindowingControlStyleForScene(@NotNull UIWindowScene windowScene) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the window scene's effective geometry has changed.
     * 
     * Always called when a `UIWindowScene` moves between screens.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("windowScene:didUpdateEffectiveGeometry:")
    default void windowSceneDidUpdateEffectiveGeometry(@NotNull UIWindowScene windowScene,
            @NotNull UIWindowSceneGeometry previousEffectiveGeometry) {
        throw new java.lang.UnsupportedOperationException();
    }
}