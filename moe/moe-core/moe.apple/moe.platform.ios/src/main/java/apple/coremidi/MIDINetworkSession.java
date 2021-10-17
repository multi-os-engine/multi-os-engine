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

package apple.coremidi;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * __________________________________________________________________________________________________
 * MIDINetworkSession
 * <p>
 * A network session represents one CoreMIDI entity (source/destination pair). One session can
 * have any number of connections. Output is broadcast to all connections; input from multiple
 * connections is merged.
 */
@Generated
@Library("CoreMIDI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MIDINetworkSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MIDINetworkSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MIDINetworkSession alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MIDINetworkSession allocWithZone(VoidPtr zone);

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

    /**
     * returns the singleton.
     */
    @Generated
    @Selector("defaultSession")
    public static native MIDINetworkSession defaultSession();

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
    public static native MIDINetworkSession new_objc();

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

    @Generated
    @Selector("addConnection:")
    public native boolean addConnection(MIDINetworkConnection connection);

    @Generated
    @Selector("addContact:")
    public native boolean addContact(MIDINetworkHost contact);

    /**
     * who can connect to this session? see constants above.
     */
    @Generated
    @Selector("connectionPolicy")
    @NUInt
    public native long connectionPolicy();

    @Generated
    @Selector("connections")
    public native NSSet<? extends MIDINetworkConnection> connections();

    /**
     * The driver maintains a directory of MIDINetworkHosts, "contacts," for user convenience in initiating
     * connections, and for controlling incoming connection requests.
     */
    @Generated
    @Selector("contacts")
    public native NSSet<? extends MIDINetworkHost> contacts();

    @Generated
    @Selector("destinationEndpoint")
    public native int destinationEndpoint();

    @Generated
    @Selector("init")
    public native MIDINetworkSession init();

    /**
     * disabled sessions do not appear on the network and cannot initiate or receive connections. default is NO (disabled).
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * disabled sessions do not appear on the network and cannot initiate or receive connections. default is NO (disabled).
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * name of this session's CoreMIDI entity (inherited by its endpoints)
     */
    @Generated
    @Selector("localName")
    public native String localName();

    /**
     * name by which this session is advertised via Bonjour
     */
    @Generated
    @Selector("networkName")
    public native String networkName();

    /**
     * UDP port
     */
    @Generated
    @Selector("networkPort")
    @NUInt
    public native long networkPort();

    @Generated
    @Selector("removeConnection:")
    public native boolean removeConnection(MIDINetworkConnection connection);

    @Generated
    @Selector("removeContact:")
    public native boolean removeContact(MIDINetworkHost contact);

    /**
     * who can connect to this session? see constants above.
     */
    @Generated
    @Selector("setConnectionPolicy:")
    public native void setConnectionPolicy(@NUInt long value);

    @Generated
    @Selector("sourceEndpoint")
    public native int sourceEndpoint();
}
