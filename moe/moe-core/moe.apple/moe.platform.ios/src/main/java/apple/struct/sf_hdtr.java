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

package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class sf_hdtr extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public sf_hdtr() {
        super(sf_hdtr.class);
    }

    @Generated
    protected sf_hdtr(Pointer peer) {
        super(peer);
    }

    @Generated
    public sf_hdtr(@UncertainArgument("Options: reference, array Fallback: reference") iovec headers, int hdr_cnt,
            @UncertainArgument("Options: reference, array Fallback: reference") iovec trailers, int trl_cnt) {
        super(sf_hdtr.class);
        setHeaders(headers);
        setHdr_cnt(hdr_cnt);
        setTrailers(trailers);
        setTrl_cnt(trl_cnt);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native iovec headers();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setHeaders(@UncertainArgument("Options: reference, array Fallback: reference") iovec value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int hdr_cnt();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setHdr_cnt(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native iovec trailers();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setTrailers(@UncertainArgument("Options: reference, array Fallback: reference") iovec value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int trl_cnt();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTrl_cnt(int value);
}
