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

package objc.tests.natj.variadic;


import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.VariadicArg;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;

@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VariadicClass extends NSObject {

    static {
        NatJ.register();
    }

    protected VariadicClass(Pointer peer) {
        super(peer);
    }

    @Owned
    @Selector("alloc")
    public static native VariadicClass alloc();

    @Selector("init")
    public native VariadicClass init();

	
	/*
     * Methods for boolean
	 */

    @Variadic()
    @Selector("testBooleansWithPairNumber:")
    public static native boolean testBooleansWithPairNumber(int n,
                                                            boolean... varargs);

    @ObjCBlock(name = "call_blockForBooleans")
    @Selector("blockForBooleans")
    public static native Block_blockForBooleans blockForBooleans();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForBooleans {
        @Variadic()
        public boolean call_blockForBooleans(int n, boolean... varargs);
    }

	
	/*
     * Methods for byte
	 */

    @Variadic()
    @Selector("testBytesWithPairNumber:")
    public static native boolean testBytesWithPairNumber(int n,
                                                         byte... varargs);

    @ObjCBlock(name = "call_blockForBytes")
    @Selector("blockForBytes")
    public static native Block_blockForBytes blockForBytes();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForBytes {
        @Variadic()
        public boolean call_blockForBytes(int n, byte... varargs);
    }

	
	/*
	 * Methods for char
	 */

    @Variadic()
    @Selector("testCharsWithPairNumber:")
    public static native boolean testCharsWithPairNumber(int n,
                                                         char... varargs);

    @ObjCBlock(name = "call_blockForChars")
    @Selector("blockForChars")
    public static native Block_blockForChars blockForChars();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForChars {
        @Variadic()
        public boolean call_blockForChars(int n, char... varargs);
    }
	
	
	/*
	 * Methods for short
	 */

    @Variadic()
    @Selector("testShortsWithPairNumber:")
    public static native boolean testShortsWithPairNumber(int n,
                                                          short... varargs);

    @ObjCBlock(name = "call_blockForShorts")
    @Selector("blockForShorts")
    public static native Block_blockForShorts blockForShorts();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForShorts {
        @Variadic()
        public boolean call_blockForShorts(int n, short... varargs);
    }
	

	/*
	 * Methods for int
	 */

    @Variadic()
    @Selector("testIntsWithPairNumber:")
    public static native boolean testIntsWithPairNumber(int n,
                                                        int... varargs);

    @ObjCBlock(name = "call_blockForInts")
    @Selector("blockForInts")
    public static native Block_blockForInts blockForInts();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForInts {
        @Variadic()
        public boolean call_blockForInts(int n, int... varargs);
    }


	/*
	 * Methods for long
	 */

    @Variadic()
    @Selector("testLongsWithPairNumber:")
    public static native boolean testLongsWithPairNumber(int n,
                                                         long... varargs);

    @ObjCBlock(name = "call_blockForLongs")
    @Selector("blockForLongs")
    public static native Block_blockForLongs blockForLongs();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForLongs {
        @Variadic()
        public boolean call_blockForLongs(int n, long... varargs);
    }
	
	
	/*
	 * Methods for float
	 */

    @Variadic()
    @Selector("testFloatsWithPairNumber:")
    public static native boolean testFloatsWithPairNumber(int n,
                                                          float... varargs);

    @ObjCBlock(name = "call_blockForFloats")
    @Selector("blockForFloats")
    public static native Block_blockForFloats blockForFloats();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForFloats {
        @Variadic()
        public boolean call_blockForFloats(int n, float... varargs);
    }

    @Variadic(unboxPolicy = Variadic.Unbox)
    @Selector("testFloatsWithPairNumber:")
    public static native boolean testUnboxingFloatsWithPairNumber(int n,
                                                                  Float... varargs);

    @ObjCBlock(name = "call_blockForUnboxingFloats")
    @Selector("blockForUnboxingFloats")
    public static native Block_blockForUnboxingFloats blockForUnboxingFloats();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForUnboxingFloats {
        @Variadic(unboxPolicy = Variadic.Unbox)
        public boolean call_blockForUnboxingFloats(int n, Float... varargs);
    }

    @Variadic()
    @Selector("testFloatsWithPairNumber:")
    public static native boolean testExplicitUnboxingFloatsWithPairNumber(int n,
                                                                          VariadicArg.UnboxVariadicArg... varargs);

    @ObjCBlock(name = "call_blockForExplicitUnboxingFloats")
    @Selector("blockForExplicitUnboxingFloats")
    public static native Block_blockForExplicitUnboxingFloats blockForExplicitUnboxingFloats();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForExplicitUnboxingFloats {
        @Variadic()
        public boolean call_blockForExplicitUnboxingFloats(int n, VariadicArg.UnboxVariadicArg... varargs);
    }
	
	
	/*
	 * Methods for double
	 */

    @Variadic()
    @Selector("testDoublesWithPairNumber:")
    public static native boolean testDoublesWithPairNumber(int n,
                                                           double... varargs);

    @ObjCBlock(name = "call_blockForDoubles")
    @Selector("blockForDoubles")
    public static native Block_blockForDoubles blockForDoubles();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForDoubles {
        @Variadic()
        public boolean call_blockForDoubles(int n, double... varargs);
    }
	
	
	/*
	 * Methods for by-value CGRect
	 */

    @Variadic()
    @Selector("testCGRectsWithPairNumber:")
    public static native boolean testCGRectsWithPairNumber(int n,
                                                           VariadicArg.ByValueVariadicArg... varargs);

    @ObjCBlock(name = "call_blockForCGRects")
    @Selector("blockForCGRects")
    public static native Block_blockForCGRects blockForCGRects();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForCGRects {
        @Variadic()
        public boolean call_blockForCGRects(int n, VariadicArg.ByValueVariadicArg... varargs);
    }
	
	
	/*
	 * Methods for mapped const char*
	 */

    @Variadic()
    @Selector("testCStringsWithPairNumber:")
    public static native boolean testCStringsWithPairNumber(int n,
                                                            VariadicArg.MapVariadicArg... varargs);

    @ObjCBlock(name = "call_blockForCStrings")
    @Selector("blockForCStrings")
    public static native Block_blockForCStrings blockForCStrings();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForCStrings {
        @Variadic()
        public boolean call_blockForCStrings(int n, VariadicArg.MapVariadicArg... varargs);
    }
	
	
	/*
	 * Methods for boxed float
	 */

    @Variadic()
    @Selector("testBoxedFloatsWithPairNumber:")
    public static native boolean testBoxedFloatsWithPairNumber(int n,
                                                               Float... varargs);

    @ObjCBlock(name = "call_blockForBoxedFloats")
    @Selector("blockForBoxedFloats")
    public static native Block_blockForBoxedFloats blockForBoxedFloats();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForBoxedFloats {
        @Variadic()
        public boolean call_blockForBoxedFloats(int n, Float... varargs);
    }

    @Variadic(unboxPolicy = Variadic.Unbox)
    @Selector("testBoxedFloatsWithPairNumber:")
    public static native boolean testExplicitBoxedFloatsWithPairNumber(int n,
                                                                       VariadicArg.BoxVariadicArg... varargs);

    @ObjCBlock(name = "call_blockForExplicitBoxedFloats")
    @Selector("blockForExplicitBoxedFloats")
    public static native Block_blockForExplicitBoxedFloats blockForExplicitBoxedFloats();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForExplicitBoxedFloats {
        @Variadic(unboxPolicy = Variadic.Unbox)
        public boolean call_blockForExplicitBoxedFloats(int n, VariadicArg.BoxVariadicArg... varargs);
    }
	

	/*
	 * Methods for @NFloat double
	 */

    @Variadic()
    @Selector("testNFloatsWithPairNumber:")
    public static native boolean testNFloatsWithPairNumber(int n,
                                                           @NFloat double... varargs);

    @ObjCBlock(name = "call_blockForNFloats")
    @Selector("blockForNFloats")
    public static native Block_blockForNFloats blockForNFloats();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForNFloats {
        @Variadic()
        public boolean call_blockForNFloats(int n, @NFloat double... varargs);
    }

    @Variadic()
    @Selector("testNFloatsWithPairNumber:")
    public static native boolean testExplicitNFloatsWithPairNumber(int n,
                                                                   VariadicArg.NFloatVariadicArg... varargs);

    @ObjCBlock(name = "call_blockForExplicitNFloats")
    @Selector("blockForExplicitNFloats")
    public static native Block_blockForExplicitNFloats blockForExplicitNFloats();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForExplicitNFloats {
        @Variadic()
        public boolean call_blockForExplicitNFloats(int n, VariadicArg.NFloatVariadicArg... varargs);
    }

	
	/*
	 * Methods for @NInt long
	 */

    @Variadic()
    @Selector("testNIntsWithPairNumber:")
    public static native boolean testNIntsWithPairNumber(int n,
                                                         @NInt long... varargs);

    @ObjCBlock(name = "call_blockForNInts")
    @Selector("blockForNInts")
    public static native Block_blockForNInts blockForNInts();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForNInts {
        @Variadic()
        public boolean call_blockForNInts(int n, @NInt long... varargs);
    }

    @Variadic()
    @Selector("testNIntsWithPairNumber:")
    public static native boolean testExplicitNIntsWithPairNumber(int n,
                                                                 VariadicArg.NIntVariadicArg... varargs);

    @ObjCBlock(name = "call_blockForExplicitNInts")
    @Selector("blockForExplicitNInts")
    public static native Block_blockForExplicitNInts blockForExplicitNInts();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForExplicitNInts {
        @Variadic()
        public boolean call_blockForExplicitNInts(int n, VariadicArg.NIntVariadicArg... varargs);
    }

	
	/*
	 * Methods for @NUInt long
	 */

    @Variadic()
    @Selector("testNUIntsWithPairNumber:")
    public static native boolean testNUIntsWithPairNumber(int n,
                                                          @NUInt long... varargs);

    @ObjCBlock(name = "call_blockForNUInts")
    @Selector("blockForNUInts")
    public static native Block_blockForNUInts blockForNUInts();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForNUInts {
        @Variadic()
        public boolean call_blockForNUInts(int n, @NUInt long... varargs);
    }

    @Variadic()
    @Selector("testNUIntsWithPairNumber:")
    public static native boolean testExplicitNUIntsWithPairNumber(int n,
                                                                  VariadicArg.NUIntVariadicArg... varargs);

    @ObjCBlock(name = "call_blockForExplicitNUInts")
    @Selector("blockForExplicitNUInts")
    public static native Block_blockForExplicitNUInts blockForExplicitNUInts();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForExplicitNUInts {
        @Variadic()
        public boolean call_blockForExplicitNUInts(int n, VariadicArg.NUIntVariadicArg... varargs);
    }


	/*
	 * Methods for @NLong long
	 */

    @Variadic()
    @Selector("testNLongsWithPairNumber:")
    public static native boolean testNLongsWithPairNumber(int n,
                                                          @NLong long... varargs);

    @ObjCBlock(name = "call_blockForNLongs")
    @Selector("blockForNLongs")
    public static native Block_blockForNLongs blockForNLongs();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForNLongs {
        @Variadic()
        public boolean call_blockForNLongs(int n, @NLong long... varargs);
    }

    @Variadic()
    @Selector("testNLongsWithPairNumber:")
    public static native boolean testExplicitNLongsWithPairNumber(int n,
                                                                  VariadicArg.NLongVariadicArg... varargs);

    @ObjCBlock(name = "call_blockForExplicitNLongs")
    @Selector("blockForExplicitNLongs")
    public static native Block_blockForExplicitNLongs blockForExplicitNLongs();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForExplicitNLongs {
        @Variadic()
        public boolean call_blockForExplicitNLongs(int n, VariadicArg.NLongVariadicArg... varargs);
    }


	/*
	 * Methods for @NULong long
	 */

    @Variadic()
    @Selector("testNULongsWithPairNumber:")
    public static native boolean testNULongsWithPairNumber(int n,
                                                           @NULong long... varargs);

    @ObjCBlock(name = "call_blockForNULongs")
    @Selector("blockForNULongs")
    public static native Block_blockForNULongs blockForNULongs();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForNULongs {
        @Variadic()
        public boolean call_blockForNULongs(int n, @NULong long... varargs);
    }

    @Variadic()
    @Selector("testNULongsWithPairNumber:")
    public static native boolean testExplicitNULongsWithPairNumber(int n,
                                                                   VariadicArg.NULongVariadicArg... varargs);

    @ObjCBlock(name = "call_blockForExplicitNULongs")
    @Selector("blockForExplicitNULongs")
    public static native Block_blockForExplicitNULongs blockForExplicitNULongs();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForExplicitNULongs {
        @Variadic()
        public boolean call_blockForExplicitNULongs(int n, VariadicArg.NULongVariadicArg... varargs);
    }


	/*
	 * Methods for @WCharT int
	 */

    @Variadic()
    @Selector("testWCharTsWithPairNumber:")
    public static native boolean testWCharTsWithPairNumber(int n,
                                                           @WCharT int... varargs);

    @ObjCBlock(name = "call_blockForWCharTs")
    @Selector("blockForWCharTs")
    public static native Block_blockForWCharTs blockForWCharTs();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForWCharTs {
        @Variadic()
        public boolean call_blockForWCharTs(int n, @WCharT int... varargs);
    }

    @Variadic()
    @Selector("testWCharTsWithPairNumber:")
    public static native boolean testExplicitWCharTsWithPairNumber(int n,
                                                                   VariadicArg.WCharTVariadicArg... varargs);

    @ObjCBlock(name = "call_blockForExplicitWCharTs")
    @Selector("blockForExplicitWCharTs")
    public static native Block_blockForExplicitWCharTs blockForExplicitWCharTs();

    @Runtime(ObjCRuntime.class)
    static public interface Block_blockForExplicitWCharTs {
        @Variadic()
        public boolean call_blockForExplicitWCharTs(int n, VariadicArg.WCharTVariadicArg... varargs);
    }


    /*
     * Methods for implicitly mapped objects
     */

    @Variadic()
    @Selector("testFirstArgString:withVariadics:")
    public static native boolean testFirstArgStringWithVariadics(String str,
                                                                 String others, Object... arargs);
}
