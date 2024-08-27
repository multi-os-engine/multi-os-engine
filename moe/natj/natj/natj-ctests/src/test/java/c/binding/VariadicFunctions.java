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

package c.binding;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.VariadicArg;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;

@Runtime(CRuntime.class)
@Library("TestClassesC")
public class VariadicFunctions {

    static {
        NatJ.register();
    }

    private VariadicFunctions() {
    }


    /*
     * Methods for boolean
     */
    @Variadic()
    @CFunction
    public static native boolean testBooleansWithPairNumber(int n,
                                                            boolean... varargs);

	
	/*
     * Methods for byte
	 */

    @Variadic()
    @CFunction
    public static native boolean testBytesWithPairNumber(int n,
                                                         byte... varargs);

	
	/*
     * Methods for char
	 */

    @Variadic()
    @CFunction
    public static native boolean testCharsWithPairNumber(int n,
                                                         char... varargs);

	
	/*
	 * Methods for short
	 */

    @Variadic()
    @CFunction
    public static native boolean testShortsWithPairNumber(int n,
                                                          short... varargs);

	
	/*
	 * Methods for int
	 */

    @Variadic()
    @CFunction
    public static native boolean testIntsWithPairNumber(int n,
                                                        int... varargs);

	
	/*
	 * Methods for long
	 */

    @Variadic()
    @CFunction
    public static native boolean testLongsWithPairNumber(int n,
                                                         long... varargs);

	
	/*
	 * Methods for float 
	 */

    @Variadic()
    @CFunction
    public static native boolean testFloatsWithPairNumber(int n,
                                                          float... varargs);

    @Variadic()
    @CFunction("testFloatsWithPairNumber")
    public static native boolean testUnboxingFloatsWithPairNumber(int n,
                                                                  Float... varargs);

    @Variadic(unboxPolicy = Variadic.Box)
    @CFunction("testFloatsWithPairNumber")
    public static native boolean testExplicitUnboxingFloatsWithPairNumber(int n,
                                                                          VariadicArg.UnboxVariadicArg... varargs);
	
	
	/*
	 * Methods for double 
	 */

    @Variadic()
    @CFunction
    public static native boolean testDoublesWithPairNumber(int n,
                                                           double... varargs);

	
	/*
	 * Methods for by-value NJRect
	 */

    @Variadic()
    @CFunction
    public static native boolean testCGRectsWithPairNumber(int n,
                                                           VariadicArg.ByValueVariadicArg... varargs);


	/*
	 * Methods for mapped const char*
	 */

    @Variadic()
    @CFunction
    public static native boolean testCStringsWithPairNumber(int n,
                                                            VariadicArg.MapVariadicArg... varargs);

	
	/*
	 * Methods for @NFloat double
	 */

    @Variadic()
    @CFunction
    public static native boolean testNFloatsWithPairNumber(int n,
                                                           @NFloat double... varargs);

    @Variadic()
    @CFunction("testNFloatsWithPairNumber")
    public static native boolean testExplicitNFloatsWithPairNumber(int n,
                                                                   VariadicArg.NFloatVariadicArg... varargs);
	

	/*
	 * Methods for @NInt long
	 */

    @Variadic()
    @CFunction
    public static native boolean testNIntsWithPairNumber(int n,
                                                         @NInt long... varargs);

    @Variadic()
    @CFunction("testNIntsWithPairNumber")
    public static native boolean testExplicitNIntsWithPairNumber(int n,
                                                                 VariadicArg.NIntVariadicArg... varargs);

	
	/*
	 * Methods for @NUInt long
	 */

    @Variadic()
    @CFunction
    public static native boolean testNUIntsWithPairNumber(int n,
                                                          @NUInt long... varargs);

    @Variadic()
    @CFunction("testNUIntsWithPairNumber")
    public static native boolean testExplicitNUIntsWithPairNumber(int n,
                                                                  VariadicArg.NUIntVariadicArg... varargs);


	/*
	 * Methods for @NLong long
	 */

    @Variadic()
    @CFunction
    public static native boolean testNLongsWithPairNumber(int n,
                                                          @NLong long... varargs);

    @Variadic()
    @CFunction("testNLongsWithPairNumber")
    public static native boolean testExplicitNLongsWithPairNumber(int n,
                                                                  VariadicArg.NLongVariadicArg... varargs);


	/*
	 * Methods for @NULong long
	 */

    @Variadic()
    @CFunction
    public static native boolean testNULongsWithPairNumber(int n,
                                                          @NULong long... varargs);

    @Variadic()
    @CFunction("testNULongsWithPairNumber")
    public static native boolean testExplicitNULongsWithPairNumber(int n,
                                                                  VariadicArg.NULongVariadicArg... varargs);


	/*
	 * Methods for @WCharT long
	 */

    @Variadic()
    @CFunction
    public static native boolean testWCharTsWithPairNumber(int n,
                                                          @WCharT int... varargs);

    @Variadic()
    @CFunction("testWCharTsWithPairNumber")
    public static native boolean testExplicitWCharTsWithPairNumber(int n,
                                                                  VariadicArg.WCharTVariadicArg... varargs);

}
