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

package apple.coreaudio.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioChannelLayout extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AudioChannelLayout() {
        super(AudioChannelLayout.class);
    }

    @Generated
    protected AudioChannelLayout(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioChannelLayout(int mChannelLayoutTag, int mChannelBitmap, int mNumberChannelDescriptions,
            @ByValue AudioChannelDescription mChannelDescriptions) {
        super(AudioChannelLayout.class);
        setMChannelLayoutTag(mChannelLayoutTag);
        setMChannelBitmap(mChannelBitmap);
        setMNumberChannelDescriptions(mNumberChannelDescriptions);
        setMChannelDescriptions(mChannelDescriptions);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mChannelLayoutTag();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMChannelLayoutTag(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mChannelBitmap();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMChannelBitmap(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mNumberChannelDescriptions();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMNumberChannelDescriptions(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native AudioChannelDescription mChannelDescriptions();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMChannelDescriptions(@ByValue AudioChannelDescription value);
}
