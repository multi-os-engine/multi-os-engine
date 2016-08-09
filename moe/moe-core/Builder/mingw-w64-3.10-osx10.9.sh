#!/bin/sh

check_dir() {
	echo -n ""
}

# check_error my_cmd --param ...
check_error() {
  $* # we execute everything
  if [ $? -ne 0 ]; then
    echo "check_error(): Error during execution:"
    echo "check_error(): $*"
    echo "check_error(): Continue? o/n"
    read a
    if [ $a != "o" ]; then
      exit
    fi
    echo "check_error(): On continue..."
  else
    echo "check_error(): OK: $*"
  fi
}
# check_download "file_maybe_existing" download_cmd...
check_download() {
  file=$1
  shift
  if [ ! -f "$file" ]; then
    echo "check_download(): download of $file must be done"
    $*
  else
    echo "check_download(): $file already downloaded"
  fi
}
# check_unzip "dir_unzipped" unzip_cmd...
check_unzip() {
  unzipped=$1
  shift
  if [ ! -d "$1" ]; then
    echo "check_unzip(): unzip is needed"
    $*
  else
    echo "check_unzip(): unzip not needed, the $1 dir already exists"
  fi
}

#  dependencies

#echo "Installing dependencies via Homebrew (http://brew.sh)"

#check_error ruby -e "$(curl -fsSL https://raw.github.com/Homebrew/homebrew/go/install)"
#check_error brew update

#check_error brew install gcc48
#check_error brew install wget

#  mingw

PREFIX="/usr/local/mingw"
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
check_error cd $DIR

check_error mkdir source
check_error mkdir $PREFIX

echo "Downloading binutils\n"

check_error cd ./source
check_error check_download "binutils-2.24.tar.bz2" curl -O http://ftp.gnu.org/gnu/binutils/binutils-2.24.tar.bz2
check_error check_unzip "binutils-2.24" tar xjf binutils-2.24.tar.bz2

echo "Building binutils\n"
echo "1/2 32-bit\n"

check_error cd binutils-2.24
check_error mkdir build
check_error cd build

CC=gcc-4.8 CXX=g++-4.8 CPP=cpp-4.8 LD=gcc-4.8

check_error ../configure --target=i686-w64-mingw32 --disable-werror --disable-multilib --prefix=$PREFIX --with-sysroot=$PREFIX
check_error make -j4
check_error make install-strip

echo "2/2 64-bit\n"
cd ..
#check_error rm -rf build
check_error mkdir build64
cd build64

CC=gcc-4.8 CXX=g++-4.8 CPP=cpp-4.8 LD=gcc-4.8
check_error ../configure --target=x86_64-w64-mingw32 --disable-werror --disable-multilib --prefix=$PREFIX --with-sysroot=$PREFIX --enable-64-bit-bfd
check_error make -j4
check_error make install-strip

check_error cd ..
check_error cd ..

echo "Downloading mingw-w64\n"

check_error check_download "mingw-w64-v3.1.0.tar.bz2" wget -O mingw-w64-v3.1.0.tar.bz2 "http://downloads.sourceforge.net/project/mingw-w64/mingw-w64/mingw-w64-release/mingw-w64-v3.1.0.tar.bz2?r=http%3A%2F%2Fsourceforge.net%2Fprojects%2Fmingw-w64%2Ffiles%2Fmingw-w64%2Fmingw-w64-release%2F&ts=1396199899&use_mirror=kent"

check_error check_unzip "mingw-w64-v3.1.0" tar xjf mingw-w64-v3.1.0.tar.bz2

echo "Building mingw-headers\n"

echo "1/2 32-bit\n"

check_error cd mingw-w64-v3.1.0
check_error mkdir build-headers32
check_error cd build-headers32

check_error ../mingw-w64-headers/configure --host=i686-w64-mingw32 --prefix=$PREFIX/i686-w64-mingw32
check_error make -j4
check_error make install-strip

check_error cd $PREFIX/i686-w64-mingw32
check_error ln -s lib lib32
check_error cd $DIR/source/mingw-w64-v3.1.0

echo "2/2 64-bit\n"
#check_error rm -rf build-headers
check_error mkdir build-headers64
check_error cd build-headers64

check_error ../mingw-w64-headers/configure --host=x86_64-w64-mingw32 --prefix=$PREFIX/x86_64-w64-mingw32
check_error make -j4
check_error make install-strip


check_error cd $PREFIX/x86_64-w64-mingw32
check_error ln -s lib lib64
check_error cd $DIR/source/

echo "Downloading gcc\n"

check_error check_download "gcc-4.8.2.tar.bz2" curl -O ftp://gcc.gnu.org/pub/gcc/releases/gcc-4.8.2/gcc-4.8.2.tar.bz2

check_error check_unzip "gcc-4.8.2" tar xjf gcc-4.8.2.tar.bz2

echo "Building core gcc\n"

echo "1/2 32-bit\n"


check_error cd $PREFIX
check_error ln -s i686-w64-mingw32 mingw

check_error cd $DIR/source/gcc-4.8.2
check_error mkdir build32
check_error cd build32

CC=gcc-4.8 CXX=g++-4.8 CPP=cpp-4.8 LD=gcc-4.8 PATH=/usr/local/mingw/bin/:$PATH

check_error ../configure --target=i686-w64-mingw32 --disable-multilib --enable-languages=c,c++,objc,obj-c++ --with-gmp=/usr/local/Cellar/gmp4/4.3.2/ --with-mpfr=/usr/local/Cellar/mpfr2/2.4.2/ --with-mpc=/usr/local/Cellar/libmpc08/0.8.1/ --with-cloog=/usr/local/Cellar/cloog018/0.18.0/ --with-isl=/usr/local/Cellar/isl011/0.11.1/ --with-system-zlib --enable-version-specific-runtime-libs --enable-libstdcxx-time=yes --enable-stage1-checking --enable-checking=release --enable-lto --enable-threads=win32 --disable-sjlj-exceptions --prefix=$PREFIX --with-sysroot=$PREFIX

PATH=/usr/local/mingw/bin/:$PATH
check_error make all-gcc -j4
PATH=/usr/local/mingw/bin/:$PATH
check_error make install-gcc

echo "2/2 64-bit\n"

check_error cd $PREFIX
check_error rm mingw
check_error ln -s x86_64-w64-mingw32 mingw

check_error cd $DIR/source/gcc-4.8.2
check_error mkdir build64
check_error cd build64

CC=gcc-4.8 CXX=g++-4.8 CPP=cpp-4.8 LD=gcc-4.8 PATH=/usr/local/mingw/bin/:$PATH

check_error ../configure --target=x86_64-w64-mingw32 --disable-multilib --enable-languages=c,c++,objc,obj-c++ --with-gmp=/usr/local/Cellar/gmp4/4.3.2/ --with-mpfr=/usr/local/Cellar/mpfr2/2.4.2/ --with-mpc=/usr/local/Cellar/libmpc08/0.8.1/ --with-cloog=/usr/local/Cellar/cloog018/0.18.0/ --with-isl=/usr/local/Cellar/isl011/0.11.1/ --with-system-zlib --enable-version-specific-runtime-libs --enable-libstdcxx-time=yes --enable-stage1-checking --enable-checking=release --enable-lto --enable-threads=win32 --prefix=$PREFIX --with-sysroot=$PREFIX

PATH=/usr/local/mingw/bin/:$PATH
check_error make all-gcc -j4
PATH=/usr/local/mingw/bin/:$PATH
check_error make install-gcc

echo "Building mingw runtime\n"

check_error cd $PREFIX
check_error rm mingw
check_error ln -s i686-w64-mingw32 mingw

check_error cd $DIR/source/mingw-w64-v3.1.0
check_error mkdir build-crt32
check_error cd build-crt32

echo "1/2 32-Bit\n"

PATH=/usr/local/mingw/bin/:$PATH
check_error ../mingw-w64-crt/configure --host=i686-w64-mingw32 --prefix=$PREFIX/i686-w64-mingw32 --with-sysroot=$PREFIX

PATH=/usr/local/mingw/bin/:$PATH
check_error make
PATH=/usr/local/mingw/bin/:$PATH
check_error make install-strip

echo "2/2 64-Bit\n"

check_error cd $PREFIX
check_error rm mingw
check_error ln -s x86_64-w64-mingw32 mingw

check_error cd $DIR/source/mingw-w64-v3.1.0
#check_error rm -rf build-crt
check_error mkdir build-crt64
check_error cd build-crt64

PATH=/usr/local/mingw/bin/:$PATH

check_error ../mingw-w64-crt/configure --host=x86_64-w64-mingw32 --prefix=$PREFIX/x86_64-w64-mingw32 --with-sysroot=$PREFIX

PATH=/usr/local/mingw/bin/:$PATH
check_error make
PATH=/usr/local/mingw/bin/:$PATH
check_error make install-strip

echo "Building all gcc\n"

echo "1/2 32-Bit\n"

check_error cd $PREFIX
check_error rm mingw
check_error ln -s i686-w64-mingw32 mingw

check_error cd $DIR/source/gcc-4.8.2/build32

PATH=/usr/local/mingw/bin/:$PATH
check_error make
PATH=/usr/local/mingw/bin/:$PATH
check_error make install-strip

echo "2/2 64-Bit\n"

check_error cd $PREFIX
check_error rm mingw
check_error ln -s x86_64-w64-mingw32 mingw

check_error cd $DIR/source/gcc-4.8.2/build64

PATH=/usr/local/mingw/bin/:$PATH
check_error make
PATH=/usr/local/mingw/bin/:$PATH
check_error make install-strip

echo "Linking libgcc\n"

check_error cd $PREFIX/i686-w64-mingw32/lib
check_error ln -s ../../lib/gcc/i686-w64-mingw32/lib/libgcc_s.a ./
check_error ln -s ../../lib/gcc/i686-w64-mingw32/lib/libgcc.a ./

check_error cd $PREFIX/x86_64-w64-mingw32/lib
check_error ln -s ../../lib/gcc/x86_64-w64-mingw32/lib/libgcc_s.a ./
check_error ln -s ../../lib/gcc/x86_64-w64-mingw32/lib/libgcc.a ./

echo "Building winpthreads\n"

check_error cd $DIR/source/mingw-w64-v3.1.0/mingw-w64-libraries/winpthreads

echo "1/2 32-Bit\n"

check_error mkdir build32
check_error cd build32

check_error ../configure --host=i686-w64-mingw32 --prefix=$PREFIX/i686-w64-mingw32
check_error make
check_error make install-strip

check_error cd ..
#check_error rm -rf build

echo "2/2 64-Bit\n"

check_error mkdir build64
check_error cd build64

check_error ../configure --host=x86_64-w64-mingw32 --prefix=$PREFIX/x86_64-w64-mingw32
check_error make
check_error make install-strip

echo "Cleaning up\n"

check_error cd $DIR
#check_error rm -rf source

echo "Done"