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

package apple.opengles.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class ES2 {
    /**
     * OpenGL ES core versions
     */
    @Generated public static final int ES_VERSION_2_0 = 0x00000001;
    /**
     * ClearBufferMask
     */
    @Generated public static final int DEPTH_BUFFER_BIT = 0x00000100;
    /**
     * ClearBufferMask
     */
    @Generated public static final int STENCIL_BUFFER_BIT = 0x00000400;
    /**
     * ClearBufferMask
     */
    @Generated public static final int COLOR_BUFFER_BIT = 0x00004000;
    /**
     * Boolean
     */
    @Generated public static final int FALSE = 0x00000000;
    /**
     * Boolean
     */
    @Generated public static final int TRUE = 0x00000001;
    /**
     * BeginMode
     */
    @Generated public static final int POINTS = 0x00000000;
    /**
     * BeginMode
     */
    @Generated public static final int LINES = 0x00000001;
    /**
     * BeginMode
     */
    @Generated public static final int LINE_LOOP = 0x00000002;
    /**
     * BeginMode
     */
    @Generated public static final int LINE_STRIP = 0x00000003;
    /**
     * BeginMode
     */
    @Generated public static final int TRIANGLES = 0x00000004;
    /**
     * BeginMode
     */
    @Generated public static final int TRIANGLE_STRIP = 0x00000005;
    /**
     * BeginMode
     */
    @Generated public static final int TRIANGLE_FAN = 0x00000006;
    /**
     * BlendingFactorDest
     */
    @Generated public static final int ZERO = 0x00000000;
    /**
     * BlendingFactorDest
     */
    @Generated public static final int ONE = 0x00000001;
    /**
     * BlendingFactorDest
     */
    @Generated public static final int SRC_COLOR = 0x00000300;
    /**
     * BlendingFactorDest
     */
    @Generated public static final int ONE_MINUS_SRC_COLOR = 0x00000301;
    /**
     * BlendingFactorDest
     */
    @Generated public static final int SRC_ALPHA = 0x00000302;
    /**
     * BlendingFactorDest
     */
    @Generated public static final int ONE_MINUS_SRC_ALPHA = 0x00000303;
    /**
     * BlendingFactorDest
     */
    @Generated public static final int DST_ALPHA = 0x00000304;
    /**
     * BlendingFactorDest
     */
    @Generated public static final int ONE_MINUS_DST_ALPHA = 0x00000305;
    /**
     * BlendingFactorSrc
     * GL_ZERO
     * GL_ONE
     */
    @Generated public static final int DST_COLOR = 0x00000306;
    /**
     * BlendingFactorSrc
     * GL_ZERO
     * GL_ONE
     */
    @Generated public static final int ONE_MINUS_DST_COLOR = 0x00000307;
    /**
     * BlendingFactorSrc
     * GL_ZERO
     * GL_ONE
     */
    @Generated public static final int SRC_ALPHA_SATURATE = 0x00000308;
    /**
     * BlendEquationSeparate
     */
    @Generated public static final int FUNC_ADD = 0x00008006;
    /**
     * BlendEquationSeparate
     */
    @Generated public static final int BLEND_EQUATION = 0x00008009;
    /**
     * same as BLEND_EQUATION
     */
    @Generated public static final int BLEND_EQUATION_RGB = 0x00008009;
    @Generated public static final int BLEND_EQUATION_ALPHA = 0x0000883D;
    /**
     * BlendSubtract
     */
    @Generated public static final int FUNC_SUBTRACT = 0x0000800A;
    /**
     * BlendSubtract
     */
    @Generated public static final int FUNC_REVERSE_SUBTRACT = 0x0000800B;
    /**
     * Separate Blend Functions
     */
    @Generated public static final int BLEND_DST_RGB = 0x000080C8;
    /**
     * Separate Blend Functions
     */
    @Generated public static final int BLEND_SRC_RGB = 0x000080C9;
    /**
     * Separate Blend Functions
     */
    @Generated public static final int BLEND_DST_ALPHA = 0x000080CA;
    /**
     * Separate Blend Functions
     */
    @Generated public static final int BLEND_SRC_ALPHA = 0x000080CB;
    /**
     * Separate Blend Functions
     */
    @Generated public static final int CONSTANT_COLOR = 0x00008001;
    /**
     * Separate Blend Functions
     */
    @Generated public static final int ONE_MINUS_CONSTANT_COLOR = 0x00008002;
    /**
     * Separate Blend Functions
     */
    @Generated public static final int CONSTANT_ALPHA = 0x00008003;
    /**
     * Separate Blend Functions
     */
    @Generated public static final int ONE_MINUS_CONSTANT_ALPHA = 0x00008004;
    /**
     * Separate Blend Functions
     */
    @Generated public static final int BLEND_COLOR = 0x00008005;
    /**
     * Buffer Objects
     */
    @Generated public static final int ARRAY_BUFFER = 0x00008892;
    /**
     * Buffer Objects
     */
    @Generated public static final int ELEMENT_ARRAY_BUFFER = 0x00008893;
    /**
     * Buffer Objects
     */
    @Generated public static final int ARRAY_BUFFER_BINDING = 0x00008894;
    /**
     * Buffer Objects
     */
    @Generated public static final int ELEMENT_ARRAY_BUFFER_BINDING = 0x00008895;
    /**
     * Buffer Objects
     */
    @Generated public static final int STREAM_DRAW = 0x000088E0;
    /**
     * Buffer Objects
     */
    @Generated public static final int STATIC_DRAW = 0x000088E4;
    /**
     * Buffer Objects
     */
    @Generated public static final int DYNAMIC_DRAW = 0x000088E8;
    /**
     * Buffer Objects
     */
    @Generated public static final int BUFFER_SIZE = 0x00008764;
    /**
     * Buffer Objects
     */
    @Generated public static final int BUFFER_USAGE = 0x00008765;
    /**
     * Buffer Objects
     */
    @Generated public static final int CURRENT_VERTEX_ATTRIB = 0x00008626;
    /**
     * CullFaceMode
     */
    @Generated public static final int FRONT = 0x00000404;
    /**
     * CullFaceMode
     */
    @Generated public static final int BACK = 0x00000405;
    /**
     * CullFaceMode
     */
    @Generated public static final int FRONT_AND_BACK = 0x00000408;
    /**
     * EnableCap
     */
    @Generated public static final int TEXTURE_2D = 0x00000DE1;
    /**
     * EnableCap
     */
    @Generated public static final int CULL_FACE = 0x00000B44;
    /**
     * EnableCap
     */
    @Generated public static final int BLEND = 0x00000BE2;
    /**
     * EnableCap
     */
    @Generated public static final int DITHER = 0x00000BD0;
    /**
     * EnableCap
     */
    @Generated public static final int STENCIL_TEST = 0x00000B90;
    /**
     * EnableCap
     */
    @Generated public static final int DEPTH_TEST = 0x00000B71;
    /**
     * EnableCap
     */
    @Generated public static final int SCISSOR_TEST = 0x00000C11;
    /**
     * EnableCap
     */
    @Generated public static final int POLYGON_OFFSET_FILL = 0x00008037;
    /**
     * EnableCap
     */
    @Generated public static final int SAMPLE_ALPHA_TO_COVERAGE = 0x0000809E;
    /**
     * EnableCap
     */
    @Generated public static final int SAMPLE_COVERAGE = 0x000080A0;
    /**
     * ErrorCode
     */
    @Generated public static final int NO_ERROR = 0x00000000;
    /**
     * ErrorCode
     */
    @Generated public static final int INVALID_ENUM = 0x00000500;
    /**
     * ErrorCode
     */
    @Generated public static final int INVALID_VALUE = 0x00000501;
    /**
     * ErrorCode
     */
    @Generated public static final int INVALID_OPERATION = 0x00000502;
    /**
     * ErrorCode
     */
    @Generated public static final int OUT_OF_MEMORY = 0x00000505;
    /**
     * FrontFaceDirection
     */
    @Generated public static final int CW = 0x00000900;
    /**
     * FrontFaceDirection
     */
    @Generated public static final int CCW = 0x00000901;
    /**
     * GetPName
     */
    @Generated public static final int LINE_WIDTH = 0x00000B21;
    /**
     * GetPName
     */
    @Generated public static final int ALIASED_POINT_SIZE_RANGE = 0x0000846D;
    /**
     * GetPName
     */
    @Generated public static final int ALIASED_LINE_WIDTH_RANGE = 0x0000846E;
    /**
     * GetPName
     */
    @Generated public static final int CULL_FACE_MODE = 0x00000B45;
    /**
     * GetPName
     */
    @Generated public static final int FRONT_FACE = 0x00000B46;
    /**
     * GetPName
     */
    @Generated public static final int DEPTH_RANGE = 0x00000B70;
    /**
     * GetPName
     */
    @Generated public static final int DEPTH_WRITEMASK = 0x00000B72;
    /**
     * GetPName
     */
    @Generated public static final int DEPTH_CLEAR_VALUE = 0x00000B73;
    /**
     * GetPName
     */
    @Generated public static final int DEPTH_FUNC = 0x00000B74;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_CLEAR_VALUE = 0x00000B91;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_FUNC = 0x00000B92;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_FAIL = 0x00000B94;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_PASS_DEPTH_FAIL = 0x00000B95;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_PASS_DEPTH_PASS = 0x00000B96;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_REF = 0x00000B97;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_VALUE_MASK = 0x00000B93;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_WRITEMASK = 0x00000B98;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_BACK_FUNC = 0x00008800;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_BACK_FAIL = 0x00008801;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_BACK_PASS_DEPTH_FAIL = 0x00008802;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_BACK_PASS_DEPTH_PASS = 0x00008803;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_BACK_REF = 0x00008CA3;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_BACK_VALUE_MASK = 0x00008CA4;
    /**
     * GetPName
     */
    @Generated public static final int STENCIL_BACK_WRITEMASK = 0x00008CA5;
    /**
     * GetPName
     */
    @Generated public static final int VIEWPORT = 0x00000BA2;
    /**
     * GetPName
     */
    @Generated public static final int SCISSOR_BOX = 0x00000C10;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int COLOR_CLEAR_VALUE = 0x00000C22;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int COLOR_WRITEMASK = 0x00000C23;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int UNPACK_ALIGNMENT = 0x00000CF5;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int PACK_ALIGNMENT = 0x00000D05;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int MAX_TEXTURE_SIZE = 0x00000D33;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int MAX_VIEWPORT_DIMS = 0x00000D3A;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int SUBPIXEL_BITS = 0x00000D50;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int RED_BITS = 0x00000D52;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int GREEN_BITS = 0x00000D53;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int BLUE_BITS = 0x00000D54;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int ALPHA_BITS = 0x00000D55;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int DEPTH_BITS = 0x00000D56;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int STENCIL_BITS = 0x00000D57;
    /**
     * GL_SCISSOR_TEST
     */
    @Generated public static final int POLYGON_OFFSET_UNITS = 0x00002A00;
    /**
     * GL_POLYGON_OFFSET_FILL
     */
    @Generated public static final int POLYGON_OFFSET_FACTOR = 0x00008038;
    /**
     * GL_POLYGON_OFFSET_FILL
     */
    @Generated public static final int TEXTURE_BINDING_2D = 0x00008069;
    /**
     * GL_POLYGON_OFFSET_FILL
     */
    @Generated public static final int SAMPLE_BUFFERS = 0x000080A8;
    /**
     * GL_POLYGON_OFFSET_FILL
     */
    @Generated public static final int SAMPLES = 0x000080A9;
    /**
     * GL_POLYGON_OFFSET_FILL
     */
    @Generated public static final int SAMPLE_COVERAGE_VALUE = 0x000080AA;
    /**
     * GL_POLYGON_OFFSET_FILL
     */
    @Generated public static final int SAMPLE_COVERAGE_INVERT = 0x000080AB;
    /**
     * GetTextureParameter
     * GL_TEXTURE_MAG_FILTER
     * GL_TEXTURE_MIN_FILTER
     * GL_TEXTURE_WRAP_S
     * GL_TEXTURE_WRAP_T
     */
    @Generated public static final int NUM_COMPRESSED_TEXTURE_FORMATS = 0x000086A2;
    /**
     * GetTextureParameter
     * GL_TEXTURE_MAG_FILTER
     * GL_TEXTURE_MIN_FILTER
     * GL_TEXTURE_WRAP_S
     * GL_TEXTURE_WRAP_T
     */
    @Generated public static final int COMPRESSED_TEXTURE_FORMATS = 0x000086A3;
    /**
     * HintMode
     */
    @Generated public static final int DONT_CARE = 0x00001100;
    /**
     * HintMode
     */
    @Generated public static final int FASTEST = 0x00001101;
    /**
     * HintMode
     */
    @Generated public static final int NICEST = 0x00001102;
    /**
     * HintTarget
     */
    @Generated public static final int GENERATE_MIPMAP_HINT = 0x00008192;
    /**
     * DataType
     */
    @Generated public static final int BYTE = 0x00001400;
    /**
     * DataType
     */
    @Generated public static final int UNSIGNED_BYTE = 0x00001401;
    /**
     * DataType
     */
    @Generated public static final int SHORT = 0x00001402;
    /**
     * DataType
     */
    @Generated public static final int UNSIGNED_SHORT = 0x00001403;
    /**
     * DataType
     */
    @Generated public static final int INT = 0x00001404;
    /**
     * DataType
     */
    @Generated public static final int UNSIGNED_INT = 0x00001405;
    /**
     * DataType
     */
    @Generated public static final int FLOAT = 0x00001406;
    /**
     * DataType
     */
    @Generated public static final int FIXED = 0x0000140C;
    /**
     * PixelFormat
     */
    @Generated public static final int DEPTH_COMPONENT = 0x00001902;
    /**
     * PixelFormat
     */
    @Generated public static final int ALPHA = 0x00001906;
    /**
     * PixelFormat
     */
    @Generated public static final int RGB = 0x00001907;
    /**
     * PixelFormat
     */
    @Generated public static final int RGBA = 0x00001908;
    /**
     * PixelFormat
     */
    @Generated public static final int LUMINANCE = 0x00001909;
    /**
     * PixelFormat
     */
    @Generated public static final int LUMINANCE_ALPHA = 0x0000190A;
    /**
     * PixelType
     * GL_UNSIGNED_BYTE
     */
    @Generated public static final int UNSIGNED_SHORT_4_4_4_4 = 0x00008033;
    /**
     * PixelType
     * GL_UNSIGNED_BYTE
     */
    @Generated public static final int UNSIGNED_SHORT_5_5_5_1 = 0x00008034;
    /**
     * PixelType
     * GL_UNSIGNED_BYTE
     */
    @Generated public static final int UNSIGNED_SHORT_5_6_5 = 0x00008363;
    /**
     * Shaders
     */
    @Generated public static final int FRAGMENT_SHADER = 0x00008B30;
    /**
     * Shaders
     */
    @Generated public static final int VERTEX_SHADER = 0x00008B31;
    /**
     * Shaders
     */
    @Generated public static final int MAX_VERTEX_ATTRIBS = 0x00008869;
    /**
     * Shaders
     */
    @Generated public static final int MAX_VERTEX_UNIFORM_VECTORS = 0x00008DFB;
    /**
     * Shaders
     */
    @Generated public static final int MAX_VARYING_VECTORS = 0x00008DFC;
    /**
     * Shaders
     */
    @Generated public static final int MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x00008B4D;
    /**
     * Shaders
     */
    @Generated public static final int MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x00008B4C;
    /**
     * Shaders
     */
    @Generated public static final int MAX_TEXTURE_IMAGE_UNITS = 0x00008872;
    /**
     * Shaders
     */
    @Generated public static final int MAX_FRAGMENT_UNIFORM_VECTORS = 0x00008DFD;
    /**
     * Shaders
     */
    @Generated public static final int SHADER_TYPE = 0x00008B4F;
    /**
     * Shaders
     */
    @Generated public static final int DELETE_STATUS = 0x00008B80;
    /**
     * Shaders
     */
    @Generated public static final int LINK_STATUS = 0x00008B82;
    /**
     * Shaders
     */
    @Generated public static final int VALIDATE_STATUS = 0x00008B83;
    /**
     * Shaders
     */
    @Generated public static final int ATTACHED_SHADERS = 0x00008B85;
    /**
     * Shaders
     */
    @Generated public static final int ACTIVE_UNIFORMS = 0x00008B86;
    /**
     * Shaders
     */
    @Generated public static final int ACTIVE_UNIFORM_MAX_LENGTH = 0x00008B87;
    /**
     * Shaders
     */
    @Generated public static final int ACTIVE_ATTRIBUTES = 0x00008B89;
    /**
     * Shaders
     */
    @Generated public static final int ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x00008B8A;
    /**
     * Shaders
     */
    @Generated public static final int SHADING_LANGUAGE_VERSION = 0x00008B8C;
    /**
     * Shaders
     */
    @Generated public static final int CURRENT_PROGRAM = 0x00008B8D;
    /**
     * StencilFunction
     */
    @Generated public static final int NEVER = 0x00000200;
    /**
     * StencilFunction
     */
    @Generated public static final int LESS = 0x00000201;
    /**
     * StencilFunction
     */
    @Generated public static final int EQUAL = 0x00000202;
    /**
     * StencilFunction
     */
    @Generated public static final int LEQUAL = 0x00000203;
    /**
     * StencilFunction
     */
    @Generated public static final int GREATER = 0x00000204;
    /**
     * StencilFunction
     */
    @Generated public static final int NOTEQUAL = 0x00000205;
    /**
     * StencilFunction
     */
    @Generated public static final int GEQUAL = 0x00000206;
    /**
     * StencilFunction
     */
    @Generated public static final int ALWAYS = 0x00000207;
    /**
     * StencilOp
     * GL_ZERO
     */
    @Generated public static final int KEEP = 0x00001E00;
    /**
     * StencilOp
     * GL_ZERO
     */
    @Generated public static final int REPLACE = 0x00001E01;
    /**
     * StencilOp
     * GL_ZERO
     */
    @Generated public static final int INCR = 0x00001E02;
    /**
     * StencilOp
     * GL_ZERO
     */
    @Generated public static final int DECR = 0x00001E03;
    /**
     * StencilOp
     * GL_ZERO
     */
    @Generated public static final int INVERT = 0x0000150A;
    /**
     * StencilOp
     * GL_ZERO
     */
    @Generated public static final int INCR_WRAP = 0x00008507;
    /**
     * StencilOp
     * GL_ZERO
     */
    @Generated public static final int DECR_WRAP = 0x00008508;
    /**
     * StringName
     */
    @Generated public static final int VENDOR = 0x00001F00;
    /**
     * StringName
     */
    @Generated public static final int RENDERER = 0x00001F01;
    /**
     * StringName
     */
    @Generated public static final int VERSION = 0x00001F02;
    /**
     * StringName
     */
    @Generated public static final int EXTENSIONS = 0x00001F03;
    /**
     * TextureMagFilter
     */
    @Generated public static final int NEAREST = 0x00002600;
    /**
     * TextureMagFilter
     */
    @Generated public static final int LINEAR = 0x00002601;
    /**
     * TextureMinFilter
     * GL_NEAREST
     * GL_LINEAR
     */
    @Generated public static final int NEAREST_MIPMAP_NEAREST = 0x00002700;
    /**
     * TextureMinFilter
     * GL_NEAREST
     * GL_LINEAR
     */
    @Generated public static final int LINEAR_MIPMAP_NEAREST = 0x00002701;
    /**
     * TextureMinFilter
     * GL_NEAREST
     * GL_LINEAR
     */
    @Generated public static final int NEAREST_MIPMAP_LINEAR = 0x00002702;
    /**
     * TextureMinFilter
     * GL_NEAREST
     * GL_LINEAR
     */
    @Generated public static final int LINEAR_MIPMAP_LINEAR = 0x00002703;
    /**
     * TextureParameterName
     */
    @Generated public static final int TEXTURE_MAG_FILTER = 0x00002800;
    /**
     * TextureParameterName
     */
    @Generated public static final int TEXTURE_MIN_FILTER = 0x00002801;
    /**
     * TextureParameterName
     */
    @Generated public static final int TEXTURE_WRAP_S = 0x00002802;
    /**
     * TextureParameterName
     */
    @Generated public static final int TEXTURE_WRAP_T = 0x00002803;
    /**
     * TextureTarget
     * GL_TEXTURE_2D
     */
    @Generated public static final int TEXTURE = 0x00001702;
    /**
     * TextureTarget
     * GL_TEXTURE_2D
     */
    @Generated public static final int TEXTURE_CUBE_MAP = 0x00008513;
    /**
     * TextureTarget
     * GL_TEXTURE_2D
     */
    @Generated public static final int TEXTURE_BINDING_CUBE_MAP = 0x00008514;
    /**
     * TextureTarget
     * GL_TEXTURE_2D
     */
    @Generated public static final int TEXTURE_CUBE_MAP_POSITIVE_X = 0x00008515;
    /**
     * TextureTarget
     * GL_TEXTURE_2D
     */
    @Generated public static final int TEXTURE_CUBE_MAP_NEGATIVE_X = 0x00008516;
    /**
     * TextureTarget
     * GL_TEXTURE_2D
     */
    @Generated public static final int TEXTURE_CUBE_MAP_POSITIVE_Y = 0x00008517;
    /**
     * TextureTarget
     * GL_TEXTURE_2D
     */
    @Generated public static final int TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x00008518;
    /**
     * TextureTarget
     * GL_TEXTURE_2D
     */
    @Generated public static final int TEXTURE_CUBE_MAP_POSITIVE_Z = 0x00008519;
    /**
     * TextureTarget
     * GL_TEXTURE_2D
     */
    @Generated public static final int TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x0000851A;
    /**
     * TextureTarget
     * GL_TEXTURE_2D
     */
    @Generated public static final int MAX_CUBE_MAP_TEXTURE_SIZE = 0x0000851C;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE0 = 0x000084C0;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE1 = 0x000084C1;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE2 = 0x000084C2;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE3 = 0x000084C3;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE4 = 0x000084C4;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE5 = 0x000084C5;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE6 = 0x000084C6;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE7 = 0x000084C7;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE8 = 0x000084C8;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE9 = 0x000084C9;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE10 = 0x000084CA;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE11 = 0x000084CB;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE12 = 0x000084CC;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE13 = 0x000084CD;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE14 = 0x000084CE;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE15 = 0x000084CF;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE16 = 0x000084D0;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE17 = 0x000084D1;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE18 = 0x000084D2;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE19 = 0x000084D3;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE20 = 0x000084D4;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE21 = 0x000084D5;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE22 = 0x000084D6;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE23 = 0x000084D7;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE24 = 0x000084D8;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE25 = 0x000084D9;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE26 = 0x000084DA;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE27 = 0x000084DB;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE28 = 0x000084DC;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE29 = 0x000084DD;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE30 = 0x000084DE;
    /**
     * TextureUnit
     */
    @Generated public static final int TEXTURE31 = 0x000084DF;
    /**
     * TextureUnit
     */
    @Generated public static final int ACTIVE_TEXTURE = 0x000084E0;
    /**
     * TextureWrapMode
     */
    @Generated public static final int REPEAT = 0x00002901;
    /**
     * TextureWrapMode
     */
    @Generated public static final int CLAMP_TO_EDGE = 0x0000812F;
    /**
     * TextureWrapMode
     */
    @Generated public static final int MIRRORED_REPEAT = 0x00008370;
    /**
     * Uniform Types
     */
    @Generated public static final int FLOAT_VEC2 = 0x00008B50;
    /**
     * Uniform Types
     */
    @Generated public static final int FLOAT_VEC3 = 0x00008B51;
    /**
     * Uniform Types
     */
    @Generated public static final int FLOAT_VEC4 = 0x00008B52;
    /**
     * Uniform Types
     */
    @Generated public static final int INT_VEC2 = 0x00008B53;
    /**
     * Uniform Types
     */
    @Generated public static final int INT_VEC3 = 0x00008B54;
    /**
     * Uniform Types
     */
    @Generated public static final int INT_VEC4 = 0x00008B55;
    /**
     * Uniform Types
     */
    @Generated public static final int BOOL = 0x00008B56;
    /**
     * Uniform Types
     */
    @Generated public static final int BOOL_VEC2 = 0x00008B57;
    /**
     * Uniform Types
     */
    @Generated public static final int BOOL_VEC3 = 0x00008B58;
    /**
     * Uniform Types
     */
    @Generated public static final int BOOL_VEC4 = 0x00008B59;
    /**
     * Uniform Types
     */
    @Generated public static final int FLOAT_MAT2 = 0x00008B5A;
    /**
     * Uniform Types
     */
    @Generated public static final int FLOAT_MAT3 = 0x00008B5B;
    /**
     * Uniform Types
     */
    @Generated public static final int FLOAT_MAT4 = 0x00008B5C;
    /**
     * Uniform Types
     */
    @Generated public static final int SAMPLER_2D = 0x00008B5E;
    /**
     * Uniform Types
     */
    @Generated public static final int SAMPLER_CUBE = 0x00008B60;
    /**
     * Vertex Arrays
     */
    @Generated public static final int VERTEX_ATTRIB_ARRAY_ENABLED = 0x00008622;
    /**
     * Vertex Arrays
     */
    @Generated public static final int VERTEX_ATTRIB_ARRAY_SIZE = 0x00008623;
    /**
     * Vertex Arrays
     */
    @Generated public static final int VERTEX_ATTRIB_ARRAY_STRIDE = 0x00008624;
    /**
     * Vertex Arrays
     */
    @Generated public static final int VERTEX_ATTRIB_ARRAY_TYPE = 0x00008625;
    /**
     * Vertex Arrays
     */
    @Generated public static final int VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x0000886A;
    /**
     * Vertex Arrays
     */
    @Generated public static final int VERTEX_ATTRIB_ARRAY_POINTER = 0x00008645;
    /**
     * Vertex Arrays
     */
    @Generated public static final int VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x0000889F;
    /**
     * Read Format
     */
    @Generated public static final int IMPLEMENTATION_COLOR_READ_TYPE = 0x00008B9A;
    /**
     * Read Format
     */
    @Generated public static final int IMPLEMENTATION_COLOR_READ_FORMAT = 0x00008B9B;
    /**
     * Shader Source
     */
    @Generated public static final int COMPILE_STATUS = 0x00008B81;
    /**
     * Shader Source
     */
    @Generated public static final int INFO_LOG_LENGTH = 0x00008B84;
    /**
     * Shader Source
     */
    @Generated public static final int SHADER_SOURCE_LENGTH = 0x00008B88;
    /**
     * Shader Source
     */
    @Generated public static final int SHADER_COMPILER = 0x00008DFA;
    /**
     * Shader Binary
     */
    @Generated public static final int SHADER_BINARY_FORMATS = 0x00008DF8;
    /**
     * Shader Binary
     */
    @Generated public static final int NUM_SHADER_BINARY_FORMATS = 0x00008DF9;
    /**
     * Shader Precision-Specified Types
     */
    @Generated public static final int LOW_FLOAT = 0x00008DF0;
    /**
     * Shader Precision-Specified Types
     */
    @Generated public static final int MEDIUM_FLOAT = 0x00008DF1;
    /**
     * Shader Precision-Specified Types
     */
    @Generated public static final int HIGH_FLOAT = 0x00008DF2;
    /**
     * Shader Precision-Specified Types
     */
    @Generated public static final int LOW_INT = 0x00008DF3;
    /**
     * Shader Precision-Specified Types
     */
    @Generated public static final int MEDIUM_INT = 0x00008DF4;
    /**
     * Shader Precision-Specified Types
     */
    @Generated public static final int HIGH_INT = 0x00008DF5;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int FRAMEBUFFER = 0x00008D40;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RENDERBUFFER = 0x00008D41;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RGBA4 = 0x00008056;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RGB5_A1 = 0x00008057;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RGB565 = 0x00008D62;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int DEPTH_COMPONENT16 = 0x000081A5;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int STENCIL_INDEX8 = 0x00008D48;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RENDERBUFFER_WIDTH = 0x00008D42;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RENDERBUFFER_HEIGHT = 0x00008D43;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RENDERBUFFER_INTERNAL_FORMAT = 0x00008D44;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RENDERBUFFER_RED_SIZE = 0x00008D50;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RENDERBUFFER_GREEN_SIZE = 0x00008D51;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RENDERBUFFER_BLUE_SIZE = 0x00008D52;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RENDERBUFFER_ALPHA_SIZE = 0x00008D53;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RENDERBUFFER_DEPTH_SIZE = 0x00008D54;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RENDERBUFFER_STENCIL_SIZE = 0x00008D55;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x00008CD0;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x00008CD1;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x00008CD2;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x00008CD3;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int COLOR_ATTACHMENT0 = 0x00008CE0;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int DEPTH_ATTACHMENT = 0x00008D00;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int STENCIL_ATTACHMENT = 0x00008D20;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int NONE = 0x00000000;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int FRAMEBUFFER_COMPLETE = 0x00008CD5;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x00008CD6;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x00008CD7;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 0x00008CD9;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int FRAMEBUFFER_UNSUPPORTED = 0x00008CDD;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int FRAMEBUFFER_BINDING = 0x00008CA6;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int RENDERBUFFER_BINDING = 0x00008CA7;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int MAX_RENDERBUFFER_SIZE = 0x000084E8;
    /**
     * Framebuffer Object.
     */
    @Generated public static final int INVALID_FRAMEBUFFER_OPERATION = 0x00000506;
    /**
     * glext.h
     */
    @Generated public static final int APPLE_copy_texture_levels = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int APPLE_framebuffer_multisample = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int APPLE_rgb_422 = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int APPLE_sync = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int APPLE_texture_format_BGRA8888 = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int APPLE_texture_max_level = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_blend_minmax = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_color_buffer_half_float = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_debug_label = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_debug_marker = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_discard_framebuffer = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_draw_instanced = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_instanced_arrays = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_map_buffer_range = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_occlusion_query_boolean = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_pvrtc_sRGB = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_read_format_bgra = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_separate_shader_objects = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_shader_framebuffer_fetch = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_shader_texture_lod = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_shadow_samplers = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_sRGB = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_texture_filter_anisotropic = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_texture_rg = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int EXT_texture_storage = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int IMG_read_format = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int IMG_texture_compression_pvrtc = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int OES_depth_texture = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int OES_depth24 = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int OES_element_index_uint = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int OES_fbo_render_mipmap = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int OES_mapbuffer = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int OES_packed_depth_stencil = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int OES_rgb8_rgba8 = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int OES_standard_derivatives = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int OES_texture_float = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int OES_texture_half_float = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int OES_texture_half_float_linear = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int OES_vertex_array_object = 0x00000001;
    @Generated public static final int RENDERBUFFER_SAMPLES_APPLE = 0x00008CAB;
    @Generated public static final int FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_APPLE = 0x00008D56;
    @Generated public static final int MAX_SAMPLES_APPLE = 0x00008D57;
    @Generated public static final int READ_FRAMEBUFFER_APPLE = 0x00008CA8;
    @Generated public static final int DRAW_FRAMEBUFFER_APPLE = 0x00008CA9;
    @Generated public static final int DRAW_FRAMEBUFFER_BINDING_APPLE = 0x00008CA6;
    @Generated public static final int READ_FRAMEBUFFER_BINDING_APPLE = 0x00008CAA;
    @Generated public static final int RGB_422_APPLE = 0x00008A1F;
    @Generated public static final int UNSIGNED_SHORT_8_8_APPLE = 0x000085BA;
    @Generated public static final int UNSIGNED_SHORT_8_8_REV_APPLE = 0x000085BB;
    @Generated public static final int MAX_SERVER_WAIT_TIMEOUT_APPLE = 0x00009111;
    @Generated public static final int OBJECT_TYPE_APPLE = 0x00009112;
    @Generated public static final int SYNC_CONDITION_APPLE = 0x00009113;
    @Generated public static final int SYNC_STATUS_APPLE = 0x00009114;
    @Generated public static final int SYNC_FLAGS_APPLE = 0x00009115;
    @Generated public static final int SYNC_FENCE_APPLE = 0x00009116;
    @Generated public static final int SYNC_GPU_COMMANDS_COMPLETE_APPLE = 0x00009117;
    @Generated public static final int UNSIGNALED_APPLE = 0x00009118;
    @Generated public static final int SIGNALED_APPLE = 0x00009119;
    @Generated public static final int ALREADY_SIGNALED_APPLE = 0x0000911A;
    @Generated public static final int TIMEOUT_EXPIRED_APPLE = 0x0000911B;
    @Generated public static final int CONDITION_SATISFIED_APPLE = 0x0000911C;
    @Generated public static final int WAIT_FAILED_APPLE = 0x0000911D;
    @Generated public static final int SYNC_FLUSH_COMMANDS_BIT_APPLE = 0x00000001;
    /**
     * _ES2_GL_TIMEOUT_IGNORED_APPLE = GL_TIMEOUT_IGNORED_APPLE,
     */
    @Generated public static final int SYNC_OBJECT_APPLE = 0x00008A53;
    @Generated public static final int BGRA_EXT = 0x000080E1;
    @Generated public static final int BGRA = 0x000080E1;
    @Generated public static final int TEXTURE_MAX_LEVEL_APPLE = 0x0000813D;
    @Generated public static final int MIN_EXT = 0x00008007;
    @Generated public static final int MAX_EXT = 0x00008008;
    @Generated public static final int RGBA16F_EXT = 0x0000881A;
    @Generated public static final int RGB16F_EXT = 0x0000881B;
    @Generated public static final int RG16F_EXT = 0x0000822F;
    @Generated public static final int R16F_EXT = 0x0000822D;
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = 0x00008211;
    @Generated public static final int UNSIGNED_NORMALIZED_EXT = 0x00008C17;
    @Generated public static final int BUFFER_OBJECT_EXT = 0x00009151;
    @Generated public static final int SHADER_OBJECT_EXT = 0x00008B48;
    @Generated public static final int PROGRAM_OBJECT_EXT = 0x00008B40;
    @Generated public static final int QUERY_OBJECT_EXT = 0x00009153;
    @Generated public static final int VERTEX_ARRAY_OBJECT_EXT = 0x00009154;
    @Generated public static final int PROGRAM_PIPELINE_OBJECT_EXT = 0x00008A4F;
    @Generated public static final int COLOR_EXT = 0x00001800;
    @Generated public static final int DEPTH_EXT = 0x00001801;
    @Generated public static final int STENCIL_EXT = 0x00001802;
    @Generated public static final int VERTEX_ATTRIB_ARRAY_DIVISOR_EXT = 0x000088FE;
    @Generated public static final int MAP_READ_BIT_EXT = 0x00000001;
    @Generated public static final int MAP_WRITE_BIT_EXT = 0x00000002;
    @Generated public static final int MAP_INVALIDATE_RANGE_BIT_EXT = 0x00000004;
    @Generated public static final int MAP_INVALIDATE_BUFFER_BIT_EXT = 0x00000008;
    @Generated public static final int MAP_FLUSH_EXPLICIT_BIT_EXT = 0x00000010;
    @Generated public static final int MAP_UNSYNCHRONIZED_BIT_EXT = 0x00000020;
    @Generated public static final int ANY_SAMPLES_PASSED_EXT = 0x00008C2F;
    @Generated public static final int ANY_SAMPLES_PASSED_CONSERVATIVE_EXT = 0x00008D6A;
    @Generated public static final int CURRENT_QUERY_EXT = 0x00008865;
    @Generated public static final int QUERY_RESULT_EXT = 0x00008866;
    @Generated public static final int QUERY_RESULT_AVAILABLE_EXT = 0x00008867;
    @Generated public static final int COMPRESSED_SRGB_PVRTC_2BPPV1_EXT = 0x00008A54;
    @Generated public static final int COMPRESSED_SRGB_PVRTC_4BPPV1_EXT = 0x00008A55;
    @Generated public static final int COMPRESSED_SRGB_ALPHA_PVRTC_2BPPV1_EXT = 0x00008A56;
    @Generated public static final int COMPRESSED_SRGB_ALPHA_PVRTC_4BPPV1_EXT = 0x00008A57;
    @Generated public static final int UNSIGNED_SHORT_4_4_4_4_REV_EXT = 0x00008365;
    @Generated public static final int UNSIGNED_SHORT_1_5_5_5_REV_EXT = 0x00008366;
    @Generated public static final int UNSIGNED_SHORT_1_5_5_5_REV = 0x00008366;
    @Generated public static final int UNSIGNED_SHORT_4_4_4_4_REV = 0x00008365;
    @Generated public static final int VERTEX_SHADER_BIT_EXT = 0x00000001;
    @Generated public static final int FRAGMENT_SHADER_BIT_EXT = 0x00000002;
    @Generated public static final int ALL_SHADER_BITS_EXT = 0xFFFFFFFF;
    @Generated public static final int PROGRAM_SEPARABLE_EXT = 0x00008258;
    @Generated public static final int ACTIVE_PROGRAM_EXT = 0x00008259;
    @Generated public static final int PROGRAM_PIPELINE_BINDING_EXT = 0x0000825A;
    @Generated public static final int FRAGMENT_SHADER_DISCARDS_SAMPLES_EXT = 0x00008A52;
    @Generated public static final int TEXTURE_COMPARE_MODE_EXT = 0x0000884C;
    @Generated public static final int TEXTURE_COMPARE_FUNC_EXT = 0x0000884D;
    @Generated public static final int COMPARE_REF_TO_TEXTURE_EXT = 0x0000884E;
    @Generated public static final int SAMPLER_2D_SHADOW_EXT = 0x00008B62;
    @Generated public static final int SRGB_EXT = 0x00008C40;
    @Generated public static final int SRGB_ALPHA_EXT = 0x00008C42;
    @Generated public static final int SRGB8_ALPHA8_EXT = 0x00008C43;
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT = 0x00008210;
    @Generated public static final int TEXTURE_MAX_ANISOTROPY_EXT = 0x000084FE;
    @Generated public static final int MAX_TEXTURE_MAX_ANISOTROPY_EXT = 0x000084FF;
    @Generated public static final int RED_EXT = 0x00001903;
    @Generated public static final int RG_EXT = 0x00008227;
    @Generated public static final int R8_EXT = 0x00008229;
    @Generated public static final int RG8_EXT = 0x0000822B;
    @Generated public static final int TEXTURE_IMMUTABLE_FORMAT_EXT = 0x0000912F;
    @Generated public static final int ALPHA8_EXT = 0x0000803C;
    @Generated public static final int LUMINANCE8_EXT = 0x00008040;
    @Generated public static final int LUMINANCE8_ALPHA8_EXT = 0x00008045;
    @Generated public static final int BGRA8_EXT = 0x000093A1;
    @Generated public static final int RGBA32F_EXT = 0x00008814;
    @Generated public static final int RGB32F_EXT = 0x00008815;
    @Generated public static final int RG32F_EXT = 0x00008230;
    @Generated public static final int R32F_EXT = 0x0000822E;
    @Generated public static final int ALPHA32F_EXT = 0x00008816;
    @Generated public static final int LUMINANCE32F_EXT = 0x00008818;
    @Generated public static final int LUMINANCE_ALPHA32F_EXT = 0x00008819;
    @Generated public static final int ALPHA16F_EXT = 0x0000881C;
    @Generated public static final int LUMINANCE16F_EXT = 0x0000881E;
    @Generated public static final int LUMINANCE_ALPHA16F_EXT = 0x0000881F;
    @Generated public static final int DEPTH_COMPONENT32_OES = 0x000081A7;
    @Generated public static final int RGB_RAW_422_APPLE = 0x00008A51;
    @Generated public static final int BGRA_IMG = 0x000080E1;
    @Generated public static final int UNSIGNED_SHORT_4_4_4_4_REV_IMG = 0x00008365;
    @Generated public static final int COMPRESSED_RGB_PVRTC_4BPPV1_IMG = 0x00008C00;
    @Generated public static final int COMPRESSED_RGB_PVRTC_2BPPV1_IMG = 0x00008C01;
    @Generated public static final int COMPRESSED_RGBA_PVRTC_4BPPV1_IMG = 0x00008C02;
    @Generated public static final int COMPRESSED_RGBA_PVRTC_2BPPV1_IMG = 0x00008C03;
    @Generated public static final int DEPTH_COMPONENT24_OES = 0x000081A6;
    @Generated public static final int WRITE_ONLY_OES = 0x000088B9;
    @Generated public static final int BUFFER_ACCESS_OES = 0x000088BB;
    @Generated public static final int BUFFER_MAPPED_OES = 0x000088BC;
    @Generated public static final int BUFFER_MAP_POINTER_OES = 0x000088BD;
    @Generated public static final int DEPTH_STENCIL_OES = 0x000084F9;
    @Generated public static final int UNSIGNED_INT_24_8_OES = 0x000084FA;
    @Generated public static final int DEPTH24_STENCIL8_OES = 0x000088F0;
    @Generated public static final int RGB8_OES = 0x00008051;
    @Generated public static final int RGBA8_OES = 0x00008058;
    @Generated public static final int FRAGMENT_SHADER_DERIVATIVE_HINT_OES = 0x00008B8B;
    @Generated public static final int HALF_FLOAT_OES = 0x00008D61;
    @Generated public static final int VERTEX_ARRAY_BINDING_OES = 0x000085B5;

    @Generated
    private ES2() {
    }
}
