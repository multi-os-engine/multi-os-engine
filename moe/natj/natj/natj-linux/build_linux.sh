export CROSSBINARYS=$MOE_PREBUILTS_DIR/build/linux-crosscompiler/x86_64-unknown-linux-gnu/bin
export SYSROOT=$MOE_PREBUILTS_DIR/build/linux-crosscompiler/x86_64-unknown-linux-gnu/x86_64-unknown-linux-gnu/sysroot/
export CC=$CROSSBINARYS/x86_64-unknown-linux-gnu-gcc
export CFLAGS="--sysroot=${SYSROOT}"
export LDFLAGS="--sysroot=${SYSROOT} -L${SYSROOT}/usr/lib"

export LIBFFI_STATIC=$MOE_PREBUILTS_DIR/external/libffi/build/linux/x86_64/lib64/libffi.a
export LIBFFI_HEADER=$MOE_PREBUILTS_DIR/external/libffi/build/linux/x86_64/lib/libffi-3.99999/include

export CONFIGURATION=$1

if [ $CONFIGURATION == "Release" ]; then
	export CONFIG_FLAGS="-Os"
elif [ $CONFIGURATION == "Debug" ]; then
	export CONFIG_FLAGS="-O0 -g"
else
	echo "Unknown configuration, Release and Debug are supported"
	exit 1
fi

cd ..
rm -rf $BUILD_DIR/$CONFIGURATION
mkdir -p $BUILD_DIR/$CONFIGURATION/obj
for I in $(find src -name "*.cpp" -exec basename {} \;); do
  echo "$BUILD_DIR/$CONFIGURATION/obj/$I.o" >> $BUILD_DIR/$CONFIGURATION/obj/main.infiles
  $CC -c -fPIC -std=c++11 -mtune=generic $CONFIG_FLAGS -Wall -Wno-strict-aliasing -Wno-unknown-pragmas src/main/native/natj/$I -o $BUILD_DIR/$CONFIGURATION/obj/$I.o -I$LIBFFI_HEADER -Isrc/main/native/include $CFLAGS;
done

$CC -shared -fPIC @$BUILD_DIR/$CONFIGURATION/obj/main.infiles -Wl,-soname=libnatj.so $LDFLAGS -o $BUILD_DIR/$CONFIGURATION/libnatj.so -lstdc++ $LIBFFI_STATIC