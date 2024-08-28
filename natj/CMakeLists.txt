set(CMAKE_LEGACY_CYGWIN_WIN32 0)

project("NatJ")

cmake_minimum_required(VERSION 2.8)

find_package(Java REQUIRED)
include(UseJava)

#compile native side
set(CMAKE_CXX_FLAGS "-std=c++11 -m64 -fcxx_exceptions ${CMAKE_CXX_FLAGS}")
set(CMAKE_C_FLAGS "-fstack-protector-strong -fexceptions -Wformat -Wformat-security ${CMAKE_C_FLAGS}")

SET (CMAKE_C_COMPILER "clang")
SET (CMAKE_CXX_COMPILER "clang++")

include_directories(src/native/include)
include_directories(../libffi/build/include)
file(GLOB natj_sources src/native/natj/*.cpp)
add_library(natj_native SHARED ${natj_sources})
target_link_libraries (natj_native "${CMAKE_CURRENT_SOURCE_DIR}/../libffi/build/.libs/libffi.a")

#compile java side
file(GLOB_RECURSE java_sources src/java/*.java)
add_jar(natj_java ${java_sources})
