#!/bin/bash

#
# Java binding for libimobiledevice and libplist.
#
# Copyright 2014-2016 Intel Corporation
#
# This library is free software; you can redistribute it and/or
# modify it under the terms of the GNU Lesser General Public
# License as published by the Free Software Foundation; either
# version 2.1 of the License, or (at your option) any later version.
#
# This library is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
# Lesser General Public License for more details.
#
# You should have received a copy of the GNU Lesser General Public
# License along with this library; if not, write to the Free Software
# Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
#

realpath () {
  [[ $1 = /* ]] && echo "$1" || echo "$PWD/${1#./}"
}
WORKSPACE="$(dirname "$(realpath "$0")")"

BASE_MOE_REPO_URL="$1"
BRANCH="$2"

CHECKOUT_DIR="$WORKSPACE/../../../external/libimobiledevice"

if [ "$BASE_MOE_REPO_URL" != "" ]
then
    CHECKOUT_DIR="$WORKSPACE/../libimobiledevice-checkout"
fi

BUILD_DIR="$WORKSPACE/build/native"

rm -rf $BUILD_DIR
if [ $? -ne 0 ]; then
    echo "FAILED TO CLEAN BUILD DIR"
    exit 1
fi

BUILD_DIR_MACOSX_X86_64="$BUILD_DIR/macosx/x86_64"
BUILD_DIR_WINDOWS_X86_64="$BUILD_DIR/windows/x86_64"
LOG_DIR_GENERAL="$BUILD_DIR"
GENERAL_LOG="$LOG_DIR_GENERAL/build-native.log"

function printoutput {
    old_IFS=$IFS # save the field separator
    IFS=$'\n' # new field separator, the end of line
    for line in $1; do
        echo "   $line"
    done
    IFS=$old_IFS # restore default field separator
}

function execute_internal {
    TASK_PWD=`pwd`

    TASK_NAME=$1
    shift

    TASK_COMMAND=$1
    shift
    while [ $# -ne 0 ]; do
        TASK_COMMAND="$TASK_COMMAND '$1'"
        shift
    done

    echo " "
    echo "Task: $TASK_NAME"
    echo "Exec: $TASK_COMMAND"
    echo " Pwd: $TASK_PWD"
    echo " "

    TASK_OUTPUT=`eval $TASK_COMMAND 2>&1`
    TASK_RESULT=$?
    echo "$TASK_OUTPUT"

    return $TASK_RESULT
}

function execute {
    TASK_PWD=`pwd`

    TASK_NAME=$1
    shift

    TASK_COMMAND=$1
    shift
    while [ $# -ne 0 ]; do
        TASK_COMMAND="$TASK_COMMAND '$1'"
        shift
    done

    echo -n "$TASK_NAME"
    TASK_OUTPUT=`eval $TASK_COMMAND 2>&1`
    TASK_RESULT=$?

    echo "**********************************" >> $GENERAL_LOG
    echo ">     Task: $TASK_NAME"             >> $GENERAL_LOG
    echo ">     Exec: $TASK_COMMAND"          >> $GENERAL_LOG
    echo ">      Pwd: $TASK_PWD"              >> $GENERAL_LOG
    echo "> Returned: $TASK_RESULT"           >> $GENERAL_LOG
    if [ $TASK_RESULT -ne 0 ]; then
    echo "> >>> FAILED <<<"                   >> $GENERAL_LOG
    fi
    echo "**********************************" >> $GENERAL_LOG
    echo " "                                  >> $GENERAL_LOG
    printoutput "$TASK_OUTPUT" >> $GENERAL_LOG
    echo " "                                  >> $GENERAL_LOG

    if [ $TASK_RESULT -ne 0 ]; then
        echo -e " -> \033[1m\033[31m[FAILED]\033[39m\033[0m\n"
        printoutput "$TASK_OUTPUT"
        echo " "
        echo -e "Full log is available at $GENERAL_LOG\n"
        exit 1
    fi
    echo " "
}

execute "Preparing log directory" mkdir -p $LOG_DIR_GENERAL

cd "$WORKSPACE";

#
# Pre-check
#
execute "Checking brew" which brew

#
# Checkout repos
#
function checkout {
    local MODULE="$1"
    local REPO_BASE="$2"
    local REPO="$3"
    local BRANCH="$4"

    if [ "$REPO_BASE" = "" ]
    then
        echo "Assuming local repository for $MODULE"
        if [ ! -d "$CHECKOUT_DIR/$MODULE" ]
        then
            echo "Could not find repository for $MODULE"
            return 1
        fi
        cd "$CHECKOUT_DIR/$MODULE"
        git reset --hard
        if [ $? -ne 0 ]; then echo "Failed to reset $MODULE"; return 1; fi
        git clean -x -d -f
        if [ $? -ne 0 ]; then echo "Failed to clean $MODULE"; return 1; fi
        return 0;
    fi

    if [ ! -d "$CHECKOUT_DIR/$MODULE" ]; then
        mkdir -p "$CHECKOUT_DIR/$MODULE"
    fi
    cd "$CHECKOUT_DIR/$MODULE"

    echo "BRANCH = $BRANCH"
    git checkout "$BRANCH"
    if [ $? -ne 0 ]; then
        echo "BRANCH is empty. Cloning..."
        cd ..
        git clone "$REPO_BASE/$REPO" "$MODULE"
        if [ $? -ne 0 ]; then echo "Failed to clone $MODULE"; return 1; fi
        cd "$MODULE"
    fi

    git reset --hard
    if [ $? -ne 0 ]; then echo "Failed to reset $MODULE"; return 1; fi
    git clean -x -d -f
    if [ $? -ne 0 ]; then echo "Failed to clean $MODULE"; return 1; fi
    git fetch origin
    if [ $? -ne 0 ]; then echo "Failed to pull origin for $MODULE"; return 1; fi
    git checkout "$BRANCH"
    if [ $? -ne 0 ]; then echo "Failed to checkout $MODULE"; return 1; fi
    git reset --hard
    if [ $? -ne 0 ]; then echo "Failed to reset $MODULE"; return 1; fi
    git clean -x -d -f
    if [ $? -ne 0 ]; then echo "Failed to clean $MODULE"; return 1; fi

    return 0
}

execute "Checking out openssl" checkout openssl https://github.com/openssl openssl.git \
    OpenSSL_1_0_2-stable

execute "Checking out libimobiledevice" checkout libimobiledevice "$BASE_MOE_REPO_URL" \
    libimobiledevice/libimobiledevice.git $BRANCH

execute "Checking out libplist" checkout libplist "$BASE_MOE_REPO_URL" \
    libimobiledevice/libplist.git $BRANCH

execute "Checking out libusbmuxd" checkout libusbmuxd "$BASE_MOE_REPO_URL" \
    libimobiledevice/libusbmuxd.git $BRANCH

execute "Checking out libxml2" checkout libxml2 "$BASE_MOE_REPO_URL" \
    libimobiledevice/libxml2.git $BRANCH

#
# Build libimobiledevice
#
cd "$CHECKOUT_DIR/openssl"
execute "Patching openssl" git apply "$WORKSPACE/patches/openssl-enable-deprecated.patch"

cd "$CHECKOUT_DIR/libxml2"
execute "Patching libxml2" git apply "$WORKSPACE/patches/libxml_v291.patch"

cd "$CHECKOUT_DIR/libplist"
execute "Patching libplist" git apply "$WORKSPACE/patches/libplist-pretty-natjgen.patch"

execute "Preparing OS X build directory" mkdir -p "$BUILD_DIR_MACOSX_X86_64"
execute "Preparing Windows build directory" mkdir -p "$BUILD_DIR_WINDOWS_X86_64"

buildopenssl() {
    cd "$CHECKOUT_DIR/openssl"

    CROSS_COMPILE="x86_64-w64-mingw32-" execute_internal "Configuring openssl" ./Configure mingw64 \
        shared no-asm --prefix=/usr/local/mingw/x86_64-w64-mingw32 enable-deprecated
    retcode=$?; if [ $retcode -ne 0 ]; then return $retcode; fi

    execute_internal "Building openssl depend" make depend
    retcode=$?; if [ $retcode -ne 0 ]; then return $retcode; fi

    execute_internal "Building openssl" make
    retcode=$?; if [ $retcode -ne 0 ]; then return $retcode; fi

    # Workaround for openssl install bug
    rm -rf /usr/local/mingw/x86_64-w64-mingw32/ssl

    execute_internal "Installing openssl" make install
    retcode=$?; if [ $retcode -ne 0 ]; then return $retcode; fi
}

BREW_OPENSSL_DIR="/usr/local/Cellar/openssl/$(ls -1 /usr/local/Cellar/openssl | tail -n 1)"
execute "Checking brew openssl" [ -d "$BREW_OPENSSL_DIR" ]

MY_PKG_CONFIG_PATHS=$BREW_OPENSSL_DIR/lib/pkgconfig
function update_pkgconfig {
    echo "Updating MY_PKG_CONFIG_PATHS"
    MY_PKG_CONFIG_PATHS=$MY_PKG_CONFIG_PATHS:$BUILD_DIR_MACOSX_X86_64/$1-build/lib/pkgconfig
}

function buildlib {
    local PROJECT=$1
    local AUTOCONF_OSX=$2
    local AUTOCONF_WIN=$3

    cd "$CHECKOUT_DIR/$PROJECT"

    execute_internal "Removing build dir ($PROJECT)" rm -rf "../$PROJECT-build"
    retcode=$?; if [ $retcode -ne 0 ]; then return $retcode; fi

    execute_internal "Removing other build dir ($PROJECT)" rm -rf \
        "$BUILD_DIR_MACOSX_X86_64/$PROJECT-build"
    retcode=$?; if [ $retcode -ne 0 ]; then return $retcode; fi

    execute_internal "Auto Generating ($PROJECT)" ./autogen.sh \
        --prefix="$BUILD_DIR_MACOSX_X86_64/$PROJECT-build" --disable-shared \
        PKG_CONFIG_PATH=$MY_PKG_CONFIG_PATHS CFLAGS="$MAC_CFLAGS" ${AUTOCONF_OSX}
    retcode=$?; if [ $retcode -ne 0 ]; then return $retcode; fi

    execute_internal "Building ($PROJECT)" make
    retcode=$?; if [ $retcode -ne 0 ]; then return $retcode; fi

    execute_internal "Installing ($PROJECT)" make install
    retcode=$?; if [ $retcode -ne 0 ]; then return $retcode; fi

    execute_internal "Cleaning ($PROJECT)" make clean
    retcode=$?; if [ $retcode -ne 0 ]; then return $retcode; fi

    execute_internal "Auto Generating for Windows ($PROJECT)" ./autogen.sh --disable-shared \
        --prefix=/usr/local/mingw/x86_64-w64-mingw32 --host=x86_64-w64-mingw32 \
        PKG_CONFIG_LIBDIR=/usr/local/mingw/x86_64-w64-mingw32/lib/pkgconfig \
        CFLAGS="$WIN_CFLAGS" ${AUTOCONF_WIN}
    retcode=$?; if [ $retcode -ne 0 ]; then return $retcode; fi

    execute_internal "Building for Windows ($PROJECT)" make
    retcode=$?; if [ $retcode -ne 0 ]; then return $retcode; fi

    execute_internal "Installing for Windows ($PROJECT)" make install
    retcode=$?; if [ $retcode -ne 0 ]; then return $retcode; fi

    return 0
}

execute "Building Windows openssl" buildopenssl

MAC_CFLAGS="-DMOE" \
    WIN_CFLAGS="-DMOE" \
    execute "Making libxml2" buildlib libxml2 \
    "--with-python=no" "--with-python=no"
update_pkgconfig libxml2

MAC_CFLAGS="-DMOE" \
    WIN_CFLAGS="-DMOE" \
    execute "Making libplist" buildlib libplist \
    "--without-cython" "--without-cython"
update_pkgconfig libplist

MAC_CFLAGS="-DMOE" \
    WIN_CFLAGS="-DMOE" \
    execute "Making libusbmuxd" buildlib libusbmuxd \
    "" "ac_cv_func_malloc_0_nonnull=yes ac_cv_func_realloc_0_nonnull=yes"
update_pkgconfig libusbmuxd

MAC_CFLAGS="-DMOE -I$BREW_OPENSSL_DIR/include" \
    WIN_CFLAGS="-std=gnu99 -DMOE -DWIN32" \
    execute "Making libimobiledevice" buildlib libimobiledevice \
    "--without-cython" "--without-cython"

cd "$BUILD_DIR_MACOSX_X86_64"
execute "Creating libimobiledevice.dylib" cc -dynamiclib -o libimobiledevice.dylib -all_load \
    libusbmuxd-build/lib/libusbmuxd.a \
    libplist-build/lib/libplist.a \
    libimobiledevice-build/lib/libimobiledevice.a \
    -lxml2 $BREW_OPENSSL_DIR/lib/libssl.a \
    $BREW_OPENSSL_DIR/lib/libcrypto.a -lz

cd "$BUILD_DIR_WINDOWS_X86_64"
execute "Creating libimobiledevice.dll" /usr/local/mingw/bin/x86_64-w64-mingw32-g++ -shared -o \
    libimobiledevice.dll -Wl,--whole-archive \
    /usr/local/mingw/x86_64-w64-mingw32/lib/libusbmuxd.a \
    /usr/local/mingw/x86_64-w64-mingw32/lib/libplist.a \
    /usr/local/mingw/x86_64-w64-mingw32/lib/libxml2.a \
    /usr/local/mingw/x86_64-w64-mingw32/lib/libimobiledevice.a \
    -Wl,--no-whole-archive \
    -lole32 -lws2_32 -lgdi32 -lcrypto -lssl

execute "Copying libeay32.dll" cp /usr/local/mingw/x86_64-w64-mingw32/bin/libeay32.dll ./
execute "Copying ssleay32.dll" cp /usr/local/mingw/x86_64-w64-mingw32/bin/ssleay32.dll ./
