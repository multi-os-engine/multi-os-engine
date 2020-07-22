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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIWindowSceneDelegate")
public interface UIWindowSceneDelegate extends UISceneDelegate {
    @Generated
    @IsOptional
    @Selector("setWindow:")
    default void setWindow(UIWindow value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("window")
    default UIWindow window() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("windowScene:didUpdateCoordinateSpace:interfaceOrientation:traitCollection:")
    default void windowSceneDidUpdateCoordinateSpaceInterfaceOrientationTraitCollection(UIWindowScene windowScene,
            @Mapped(ObjCObjectMapper.class) UICoordinateSpace previousCoordinateSpace,
            @NInt long previousInterfaceOrientation, UITraitCollection previousTraitCollection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("windowScene:performActionForShortcutItem:completionHandler:")
    default void windowScenePerformActionForShortcutItemCompletionHandler(UIWindowScene windowScene,
            UIApplicationShortcutItem shortcutItem,
            @ObjCBlock(name = "call_windowScenePerformActionForShortcutItemCompletionHandler") Block_windowScenePerformActionForShortcutItemCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_windowScenePerformActionForShortcutItemCompletionHandler {
        @Generated
        void call_windowScenePerformActionForShortcutItemCompletionHandler(boolean succeeded);
    }

    @Generated
    @IsOptional
    @Selector("windowScene:userDidAcceptCloudKitShareWithMetadata:")
    default void windowSceneUserDidAcceptCloudKitShareWithMetadata(UIWindowScene windowScene,
            CKShareMetadata cloudKitShareMetadata) {
        throw new java.lang.UnsupportedOperationException();
    }
}