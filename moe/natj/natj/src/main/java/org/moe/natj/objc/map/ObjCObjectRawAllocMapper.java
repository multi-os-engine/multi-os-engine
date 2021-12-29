package org.moe.natj.objc.map;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.NativeObject;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ObjCOpaqueObject;
import org.moe.natj.objc.ObjCRuntime;

public class ObjCObjectRawAllocMapper extends ObjCObjectMapper {
    @Override
    public long toNative(Object instance, NatJ.NativeObjectConstructionInfo info) {
        throw new IllegalArgumentException("Not supported");
    }

    @Override
    protected Object pointerToObject(boolean isInherited, boolean isBinding, Class<?> cls, Pointer pointer) {
        if (cls == ObjCOpaqueObject.class) {
            throw new IllegalArgumentException("Protocol proxies not supported");
        }

        return pointer;
    }

    public static <T extends NativeObject> void associateReference(Pointer pointer, T obj) {
        obj.setPeer(pointer);
        long peer = pointer.getPeer();
        boolean isInherited = ObjCRuntime.isKindOfInheritedClass(peer);
        boolean isProxy = !isInherited && ObjCRuntime.isKindOfProxyClass(peer);
        boolean isHybrid = !isInherited && !isProxy && ObjCRuntime.isKindOfHybridClass(peer);
        boolean isBinding = !isInherited && !isProxy && !isHybrid;

        // Association of the peers will happen at Objective-C side for inherited classes
        boolean isRefSettingNeeded = !isInherited;
        if (isRefSettingNeeded) {
            if (isBinding) {
                ObjCRuntime.setJavaReferenceOfBindingObject(peer, obj);
            } else {
                ObjCRuntime.setJavaReferenceOfCustomObject(peer, obj);
            }
        }
    }

    public static <T extends NativeObject> void validate(T thisObj, T afterInit) {
        if (thisObj != afterInit) {
            throw new IllegalStateException("<init> emulate failed!");
        }
    }
}
