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

package apple.audiotoolbox.struct;

import apple.coreaudiotypes.struct.AudioStreamBasicDescription;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.ConstVoidPtr;

@Generated
@Structure()
public final class AudioFormatInfo extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AudioFormatInfo() {
        super(AudioFormatInfo.class);
    }

    @Generated
    protected AudioFormatInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioFormatInfo(@ByValue AudioStreamBasicDescription mASBD, ConstVoidPtr mMagicCookie,
            int mMagicCookieSize) {
        super(AudioFormatInfo.class);
        setMASBD(mASBD);
        setMMagicCookie(mMagicCookie);
        setMMagicCookieSize(mMagicCookieSize);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native AudioStreamBasicDescription mASBD();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMASBD(@ByValue AudioStreamBasicDescription value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native ConstVoidPtr mMagicCookie();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMMagicCookie(ConstVoidPtr value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mMagicCookieSize();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMMagicCookieSize(int value);
}
