#!lua

location "build"

local MOE_PREBUILTS = os.getenv("MOE_PREBUILTS")
local MINGW_I686 = MOE_PREBUILTS .. "/external/libffi/build/windows/i686-w64-mingw32/lib"
local MINGW_X86_64 = MOE_PREBUILTS .. "/external/libffi/build/windows/x86_64-w64-mingw32/lib"

-- A solution contains projects, and defines the available configurations
solution "NatJ"
   configurations { "Debug", "Release" }
   platforms { "Win32", "Win64" }

   -- Default defines and includes
   filter "language:C++"
      defines { "_WIN32_WINNT=0x0600", "NATJ_EXPORT=1" }
      forceincludes { "windows.h", "mutex", "./mingw.mutex.h", "./mingw.thread.h" }
      buildoptions "-Wall -Wno-strict-aliasing -Wno-unknown-pragmas -std=c++11"

   -- Turn off filtering
   filter {}

   -- Shared target properties
   targetprefix ""
   targetsuffix ""

   -- Setup targets
   filter "configurations:Debug"
      defines { "DEBUG" }
      flags { "Symbols" }
   filter "configurations:Release"
      defines { "NDEBUG" }
      flags { "Optimize" }

   filter "platforms:Win32"
      linkoptions { "-Wl,--kill-at" }
      buildoptions "-m32 -fexceptions -Wformat -Wformat-security"
   filter "platforms:Win64"
      buildoptions "-m64 -fexceptions -Wformat -Wformat-security"

   filter { "platforms:Win32", "configurations:Debug" }
      targetdir "build/Debug-Win32"
   filter { "platforms:Win32", "configurations:Release" }
      targetdir "build/Release-Win32"
   filter { "platforms:Win64", "configurations:Debug" }
      targetdir "build/Debug-Win64"
   filter { "platforms:Win64", "configurations:Release" }
      targetdir "build/Release-Win64"

   -- Turn off filtering
   filter {}

   -- A project defines one build target
   project "NatJStatic"
      kind "StaticLib"
      targetname "natj-static"
      targetextension ".a"
      language "C++"
      files { "../src/main/native/natj/**.h", "../src/main/native/natj/**.cpp" }
      filter "platforms:Win32"
         includedirs {"../src/main/native/include", MINGW_I686 .. "/libffi-3.99999/include"}
      filter "platforms:Win64"
         includedirs {"../src/main/native/include", MINGW_X86_64 .. "/libffi-3.99999/include"}

      -- Turn off filtering
      filter {}

   -- A project defines one build target
   project "NatJ"
      kind "SharedLib"
      targetname "natj"
      targetextension ".dll"
      language "C++"
      links { "psapi" }

      -- Setup link options
      filter { "platforms:Win32", "configurations:Debug" }
         linkoptions {
            "-Wl,--whole-archive ../build/Debug-Win32/natj-static.a",
            "-Wl,--no-whole-archive " .. MINGW_I686 .. "/libffi.a -static-libgcc -static-libstdc++"
         }
      filter { "platforms:Win32", "configurations:Release" }
         linkoptions {
            "-Wl,--whole-archive ../build/Release-Win32/natj-static.a",
            "-Wl,--no-whole-archive " .. MINGW_I686 .. "/libffi.a -static-libgcc -static-libstdc++"
         }

      filter { "platforms:Win64", "configurations:Debug" }
         linkoptions {
            "-Wl,--whole-archive ../build/Debug-Win64/natj-static.a",
            "-Wl,--no-whole-archive " .. MINGW_X86_64 .. "/libffi.a -static-libgcc -static-libstdc++"
         }
      filter { "platforms:Win64", "configurations:Release" }
         linkoptions {
            "-Wl,--whole-archive ../build/Release-Win64/natj-static.a",
            "-Wl,--no-whole-archive " .. MINGW_X86_64 .. "/libffi.a -static-libgcc -static-libstdc++"
         }

      -- Turn off filtering
      filter {}

   -- A project defines one build target
   project "TestClassesCxx"
      kind "SharedLib"
      targetname "TestClassesCxx"
      targetextension ".dll"
      language "C++"
      files {
         "../natj-cxxtests/src/test/native/**.cpp",
         "../natj-cxxtests/src/test/native/binding/**.cpp",
         "../natj-cxxtests/src/test/native/inheritance/**.cpp",
         "../natj-cxxtests/src/test/native/other/**.cpp",
         "../natj-cxxtests/build/native-gen/natj_cxx_stub.cpp"
      }
      includedirs {"../src/main/native/include", "../src/main/native/natj", "../natj-cxxtests/src/test/native"}
      links { "psapi" }

      -- Setup link options
      filter { "platforms:Win32", "configurations:Debug" }
         linkoptions {
            "-Wl,--whole-archive ../build/Debug-Win32/natj-static.a",
            "-Wl,--no-whole-archive " .. MINGW_I686 .. "/libffi.a -static-libgcc -static-libstdc++"
         }
      filter { "platforms:Win32", "configurations:Release" }
         linkoptions {
            "-Wl,--whole-archive ../build/Release-Win32/natj-static.a",
            "-Wl,--no-whole-archive " .. MINGW_I686 .. "/libffi.a -static-libgcc -static-libstdc++"
         }

      filter { "platforms:Win64", "configurations:Debug" }
         linkoptions {
            "-Wl,--whole-archive ../build/Debug-Win64/natj-static.a",
            "-Wl,--no-whole-archive " .. MINGW_X86_64 .. "/libffi.a -static-libgcc -static-libstdc++"
         }
      filter { "platforms:Win64", "configurations:Release" }
         linkoptions {
            "-Wl,--whole-archive ../build/Release-Win64/natj-static.a",
            "-Wl,--no-whole-archive " .. MINGW_X86_64 .. "/libffi.a -static-libgcc -static-libstdc++"
         }

      -- Turn off filtering
      filter {}

   -- A project defines one build target
   project "TestClassesC"
      kind "SharedLib"
      targetname "TestClassesC"
      targetextension ".dll"
      language "C"
      files {
         "../natj-ctests/src/test/native/**.c"
      }
      includedirs {"../src/main/native/include", "../src/main/native/natj", "../natj-ctests/src/test/native"}
      links { "psapi" }

      -- Setup link options
      filter { "platforms:Win32", "configurations:Debug" }
         linkoptions {
            "-Wl,--whole-archive ../build/Debug-Win32/natj-static.a",
            "-Wl,--no-whole-archive " .. MINGW_I686 .. "/libffi.a -static-libgcc -static-libstdc++"
         }
      filter { "platforms:Win32", "configurations:Release" }
         linkoptions {
            "-Wl,--whole-archive ../build/Release-Win32/natj-static.a",
            "-Wl,--no-whole-archive " .. MINGW_I686 .. "/libffi.a -static-libgcc -static-libstdc++"
         }

      filter { "platforms:Win64", "configurations:Debug" }
         linkoptions {
            "-Wl,--whole-archive ../build/Debug-Win64/natj-static.a",
            "-Wl,--no-whole-archive " .. MINGW_X86_64 .. "/libffi.a -static-libgcc -static-libstdc++"
         }
      filter { "platforms:Win64", "configurations:Release" }
         linkoptions {
            "-Wl,--whole-archive ../build/Release-Win64/natj-static.a",
            "-Wl,--no-whole-archive " .. MINGW_X86_64 .. "/libffi.a -static-libgcc -static-libstdc++"
         }

      -- Turn off filtering
      filter {}
