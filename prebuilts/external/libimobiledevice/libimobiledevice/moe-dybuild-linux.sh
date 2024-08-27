export CROSSBINARYS=$CROSSCOMPILER/x86_64-unknown-linux-gnu/bin
export CC=$CROSSBINARYS/x86_64-unknown-linux-gnu-gcc
export SYSROOT=$CROSSCOMPILER/x86_64-unknown-linux-gnu/x86_64-unknown-linux-gnu/sysroot
export AR=$CROSSBINARYS/x86_64-unknown-linux-gnu-gcc-ar
export RANLIB=$CROSSBINARYS/x86_64-unknown-linux-gnu-gcc-ranlib

$CC --sysroot=$SYSROOT \
    -shared \
     -o libimobiledevice.so \
     -Wl,--whole-archive x86_64/lib/libimobiledevice-1.0.a -Wl,--no-whole-archive \
     ../../../libusbmuxd/build/linux/lib/libusbmuxd-2.0.a \
     ../../../libplist/build/linux/lib/libplist-2.0.a \
     ../../../openssl/build/linux/x86_64/lib/libssl.a \
     ../../../openssl/build/linux/x86_64/lib/libcrypto.a \
     -L$SYSROOT/lib -lpthread -ldl -lm
