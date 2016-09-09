#!/bin/bash

#
# Copyright 2014-2016 Intel Corporation
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

realpath () {
[[ $1 = /* ]] && echo "$1" || echo "$PWD/${1#./}"
}

cd "$(dirname "$(realpath "$0")")";

rm -rf licenses
mkdir -p licenses

cd licenses

echo "This folder contains the licenses for the
open-source components used in the Multi-OS Engine.

" > README

cp $1/art/NOTICE license-art
cp $1/frameworks/base/NOTICE license-frameworks-base
cp $1/libnativehelper/NOTICE license-libnativehelper
cp $1/libcore/NOTICE license-libcore
cp $1/libcore/luni/bouncycastle-license.txt license-libcore-luni-bouncycastle.txt
cp $1/libcore/luni/license.html license-libcore-luni.html
cp $1/libcore/luni/unicode-license.txt license-libcore-luni-unicode.txt
cp $1/libcore/luni/MODULE_LICENSE_W3C license-libcore-luni-w3c
cp $1/system/core/NOTICE license-system-core
cp $1/system/core/libcutils/NOTICE license-system-core-libcutils
cp $1/system/core/liblog/NOTICE license-system-core-liblog
cp $1/system/core/libutils/NOTICE license-system-core-libutils
cp $1/external/apache-http/NOTICE license-external-apache-http
cp $1/external/bouncycastle/NOTICE license-external-bouncycastle
cp $1/external/expat/NOTICE license-external-expat
cp $1/external/fdlibm/NOTICE license-external-fdlibm
cp $1/external/gtest/NOTICE license-external-gtest
cp $1/external/icu/icu4c/source/stubdata/NOTICE license-external-icu-icu4c-stubdata
cp $1/external/icu/icu4c/license.html license-external-icu-icu4c.html
cp $1/external/icu/icu4j/main/shared/licenses/license.html license-external-icu-icu4j.html
cp $1/external/okhttp/LICENSE.txt license-external-okhttp.txt
cp $1/external/okhttp/okio/LICENSE.txt license-external-okhttp-okio.txt
cp $1/external/openssl/NOTICE license-external-openssl
cp $1/external/valgrind/main/include/valgrind.h license-external-valgrind
cp $1/external/vixl/LICENCE license-external-vixl
cp $1/external/zlib/NOTICE license-external-zlib
cp ../../../libffi/LICENSE license-libffi
cp ../../../retrolambda/LICENSE.txt license-retrolambda.txt
