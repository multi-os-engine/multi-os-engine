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

package objc.binding.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;
import mac.NSObject;
import mac.foundation.NSNumber;
import mac.foundation.NSString;

@Generated
@Runtime(CRuntime.class)
public final class Globals {
    static {
        NatJ.register();
    }

    @Generated
    private Globals() {
    }

    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object NGIdCreate();

    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object NGIdPass(
            @Mapped(ObjCObjectMapper.class) Object obj);

    @Generated
    @CFunction
    @ReferenceInfo(type = ObjCObject.class)
    public static native Ptr<ObjCObject> NGIdArrayCreate(@NUInt long capacity);

    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object NGIdGetAtIndex(Ptr<ObjCObject> objects,
                                               @NUInt long idx);

    @Generated
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object NGIdSetAtIndex(Ptr<ObjCObject> objects,
                                               @NUInt long idx, @Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @CFunction
    public static native void NGIdArrayFree(Ptr<ObjCObject> objects,
                                            @NUInt long capacity);

    @Generated
    @CFunction
    public static native NSObject NGObjectCreate();

    @Generated
    @CFunction
    public static native NSObject NGObjectPass(NSObject obj);

    @Generated
    @CFunction
    @ReferenceInfo(type = NSObject.class)
    public static native Ptr<NSObject> NGObjectArrayCreate(@NUInt long capacity);

    @Generated
    @CFunction
    public static native NSObject NGObjectGetAtIndex(Ptr<NSObject> objects,
                                                     @NUInt long idx);

    @Generated
    @CFunction
    public static native NSObject NGObjectSetAtIndex(Ptr<NSObject> objects,
                                                     @NUInt long idx, NSObject object);

    @Generated
    @CFunction
    public static native void NGObjectArrayFree(Ptr<NSObject> objects,
                                                @NUInt long capacity);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NGStringCreate();

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NGStringPass(
            @Mapped(ObjCStringMapper.class) String obj);

    @Generated
    @CFunction
    @ReferenceInfo(type = NSString.class)
    public static native Ptr<NSString> NGStringArrayCreate(@NUInt long capacity);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NGStringGetAtIndex(Ptr<NSString> objects,
                                                   @NUInt long idx);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NGStringSetAtIndex(Ptr<NSString> objects,
                                                   @NUInt long idx, @Mapped(ObjCStringMapper.class) String object);

    @Generated
    @CFunction
    public static native void NGStringArrayFree(Ptr<NSString> objects,
                                                @NUInt long capacity);

    @Generated
    @CFunction
    public static native NSNumber NGNumberCreate();

    @Generated
    @CFunction
    public static native NSNumber NGNumberPass(NSNumber obj);

    @Generated
    @CFunction
    @ReferenceInfo(type = NSNumber.class)
    public static native Ptr<NSNumber> NGNumberArrayCreate(@NUInt long capacity);

    @Generated
    @CFunction
    public static native NSNumber NGNumberGetAtIndex(Ptr<NSNumber> objects,
                                                     @NUInt long idx);

    @Generated
    @CFunction
    public static native NSNumber NGNumberSetAtIndex(Ptr<NSNumber> objects,
                                                     @NUInt long idx, NSNumber object);

    @Generated
    @CFunction
    public static native void NGNumberArrayFree(Ptr<NSNumber> objects,
                                                @NUInt long capacity);

}
