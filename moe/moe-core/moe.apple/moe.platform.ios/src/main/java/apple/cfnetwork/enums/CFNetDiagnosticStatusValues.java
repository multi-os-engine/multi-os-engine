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

package apple.cfnetwork.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class CFNetDiagnosticStatusValues {
    @Generated public static final int NoErr = 0x00000000;
    @Generated public static final int Err = 0xFFFEFC00;
    @Generated public static final int ConnectionUp = 0xFFFEFC01;
    @Generated public static final int ConnectionIndeterminate = 0xFFFEFC02;
    @Generated public static final int ConnectionDown = 0xFFFEFC03;

    @Generated
    private CFNetDiagnosticStatusValues() {
    }
}
