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

package apple.multipeerconnectivity;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.multipeerconnectivity.protocol.MCBrowserViewControllerDelegate;
import apple.multipeerconnectivity.protocol.MCNearbyServiceBrowserDelegate;
import apple.uikit.UIViewController;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MCBrowserViewController
 * 
 * The
 * MCBrowserViewController class manages the system-supplied user
 * interface for choosing peers to connect with for multipeer sessions.
 * 
 * MCBrowserViewController manages presentation of nearby peers and the
 * invite process for you. The invite process is driven by the user
 * and handled by the peer picker and the MCNearbyServiceBrowser object
 * it holds.
 * 
 * MCBrowserViewController must be initialized with a
 * MCNearbyServiceBrowser object and a MCSession object at init time.
 * If the browser object's delegate is nil, the browser view controller
 * will set itself as the browser's delegate. The session object will be
 * used by the browser view controller during the invite process.
 * A delegate that conforms to the MCBrowserViewControllerDelegate
 * protocol must also be provided. The delegate is notified to decide
 * whether to present a peer, when the user taps the done button, or when
 * the users taps the cancel button. No assumption should be made as to
 * which queue the callbacks are called on.
 * 
 * When presented, the browser view controller looks for nearby peers,
 * and allows the user to connect up to the specified maximum number of
 * peers. When the user taps on a nearby peer, the browser view
 * controller will send an invitation to it.
 * 
 * When the browser view controller is dismissed, it will stop looking
 * for nearby peers.
 */
@Generated
@Library("MultipeerConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MCBrowserViewController extends UIViewController implements MCNearbyServiceBrowserDelegate {
    static {
        NatJ.register();
    }

    @Generated
    protected MCBrowserViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MCBrowserViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MCBrowserViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MCBrowserViewController new_objc();

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

    @Nullable
    @Generated
    @Selector("browser")
    public native MCNearbyServiceBrowser browser();

    @Generated
    @IsOptional
    @Selector("browser:didNotStartBrowsingForPeers:")
    public native void browserDidNotStartBrowsingForPeers(@NotNull MCNearbyServiceBrowser browser,
            @NotNull NSError error);

    @Generated
    @Selector("browser:foundPeer:withDiscoveryInfo:")
    public native void browserFoundPeerWithDiscoveryInfo(@NotNull MCNearbyServiceBrowser browser,
            @NotNull MCPeerID peerID, @Nullable NSDictionary<String, String> info);

    @Generated
    @Selector("browser:lostPeer:")
    public native void browserLostPeer(@NotNull MCNearbyServiceBrowser browser, @NotNull MCPeerID peerID);

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MCBrowserViewControllerDelegate delegate();

    @Generated
    @Selector("init")
    public native MCBrowserViewController init();

    /**
     * Create a browser view controller with a programmatic browser and a session.
     */
    @Generated
    @Selector("initWithBrowser:session:")
    public native MCBrowserViewController initWithBrowserSession(@NotNull MCNearbyServiceBrowser browser,
            @NotNull MCSession session);

    @Generated
    @Selector("initWithCoder:")
    public native MCBrowserViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native MCBrowserViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * Create a browser view controller with a service type and a session.
     */
    @Generated
    @Selector("initWithServiceType:session:")
    public native MCBrowserViewController initWithServiceTypeSession(@NotNull String serviceType,
            @NotNull MCSession session);

    /**
     * The maximum number of peers the session should expect.
     */
    @Generated
    @Selector("maximumNumberOfPeers")
    @NUInt
    public native long maximumNumberOfPeers();

    /**
     * The minimum number of peers the session should expect.
     */
    @Generated
    @Selector("minimumNumberOfPeers")
    @NUInt
    public native long minimumNumberOfPeers();

    @NotNull
    @Generated
    @Selector("session")
    public native MCSession session();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) MCBrowserViewControllerDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) MCBrowserViewControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The maximum number of peers the session should expect.
     */
    @Generated
    @Selector("setMaximumNumberOfPeers:")
    public native void setMaximumNumberOfPeers(@NUInt long value);

    /**
     * The minimum number of peers the session should expect.
     */
    @Generated
    @Selector("setMinimumNumberOfPeers:")
    public native void setMinimumNumberOfPeers(@NUInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
