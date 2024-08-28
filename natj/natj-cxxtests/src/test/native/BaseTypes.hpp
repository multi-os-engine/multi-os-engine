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

#ifndef BaseTypes_hpp
#define BaseTypes_hpp

/* TYPE TABLE
 Regex: ((unsigned |signed )?(long )?[\w]+)\t([\w]+)\t([\w]+)\t([\w]+)\t([\w @]*)\t([\w]+)\t([\w]+)\t([\w]+)

 bool	jboolean	m_bool_t	boolean		I1	Bool	Boolean
 char	jbyte	m_byte_t	byte		C8	Byte	Byte
 signed char	jbyte	m_sbyte_t	byte	@CxxSigned 	I8	Byte	Byte
 short	jshort	m_short_t	short		I16	Short	Short
 int	jint	m_int_t	int		I32	Int	Integer
 long	jlong	m_long_t	long	@NLong 	IL	NLong	Long
 long long	jlong	m_longlong_t	long		I64	Long	Long
 unsigned char	jbyte	m_ubyte_t	byte	@CxxUnsigned 	U8	Byte	Byte
 unsigned short	jchar	m_ushort_t	char		U16	Char	Character
 unsigned int	jint	m_uint_t	int	@CxxUnsigned 	U32	Int	Integer
 unsigned long	jlong	m_ulong_t	long	@NULong 	UL	NULong	Long
 unsigned long long	jlong	m_ulonglong_t	long	@CxxUnsigned 	U64	Long	Long
 float	jfloat	m_float_t	float		F32	Float	Float
 double	jdouble	m_double_t	double		F64	Double	Double
 char16_t	jchar	m_char16_t	char	@CxxChar16T 	C16	Char	Character
 char32_t	jint	m_char32_t	int	@CxxChar32T 	C32	Int	Integer
 wchar_t	jint	m_wchar_t	int	@WCharT 	CWI	WCharT	Integer
 */

#include <iostream>
#include <string>
#include <algorithm>
#include <stdlib.h>

#include "CxxRuntime.h"

#define __NATJ_ASSERT(x) { if (!(x)) { abort(); }}

typedef bool m_bool_t;

typedef char m_byte_t;
typedef signed char m_sbyte_t;
typedef short m_short_t;
typedef int m_int_t;
typedef long m_long_t;
typedef long long m_longlong_t;

typedef unsigned char m_ubyte_t;
typedef unsigned short m_ushort_t;
typedef unsigned int m_uint_t;
typedef unsigned long m_ulong_t;
typedef unsigned long long m_ulonglong_t;

typedef char16_t m_char16_t;
typedef char32_t m_char32_t;
typedef wchar_t m_wchar_t;

typedef float m_float_t;
typedef double m_double_t;

namespace natj { namespace cxx { namespace tests {
    class MyClass {
    public:
        const int value;
        MyClass() : value(0) {}
        MyClass(int val) : value(val) {}
        bool compare(const void* pointer) const;
        inline static MyClass* getArray(int size) {
            MyClass* arr = new MyClass[size]();
            for (int i = 0; i < size; ++i) {
                new(&arr[i]) MyClass(i);
            }
            return arr;
        }
    };
    class MyClass2 {
    public:
        const int value;
        MyClass2(int val) : value(val) {}
        bool compare(const void* pointer) const;
    };
    class Vector3f {
    public:
        float xyz[3] = { 0.0f, 0.0f, 0.0f };
        float getX() const { return xyz[0]; }
        float getY() const { return xyz[1]; }
        float getZ() const { return xyz[2]; }
    };
} } }

#endif /* BaseTypes_hpp */
