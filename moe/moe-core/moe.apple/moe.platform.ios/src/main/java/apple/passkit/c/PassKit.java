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

package apple.passkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("PassKit")
@Runtime(CRuntime.class)
public final class PassKit {
    static {
        NatJ.register();
    }

    @Generated
    private PassKit() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKEncryptionSchemeECC_V2();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKEncryptionSchemeRSA_V2();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkAmex();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkChinaUnionPay();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkDiscover();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkInterac();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkMasterCard();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkPrivateLabel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPaymentNetworkVisa();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassKitErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibraryDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibraryRemotePaymentPassesDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibraryAddedPassesUserInfoKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibraryReplacementPassesUserInfoKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibraryRemovedPassInfosUserInfoKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibraryPassTypeIdentifierUserInfoKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPassLibrarySerialNumberUserInfoKey();
}
