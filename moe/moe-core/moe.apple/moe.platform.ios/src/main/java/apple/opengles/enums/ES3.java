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
public final class ES3 {
    /**
     * OpenGL ES core versions
     */
    @Generated public static final int ES_VERSION_3_0 = 0x00000001;
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
     * OpenGL ES 3.0
     */
    @Generated public static final int READ_BUFFER = 0x00000C02;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNPACK_ROW_LENGTH = 0x00000CF2;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNPACK_SKIP_ROWS = 0x00000CF3;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNPACK_SKIP_PIXELS = 0x00000CF4;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int PACK_ROW_LENGTH = 0x00000D02;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int PACK_SKIP_ROWS = 0x00000D03;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int PACK_SKIP_PIXELS = 0x00000D04;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR = 0x00001800;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DEPTH = 0x00001801;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int STENCIL = 0x00001802;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RED = 0x00001903;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGB8 = 0x00008051;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGBA8 = 0x00008058;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGB10_A2 = 0x00008059;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TEXTURE_BINDING_3D = 0x0000806A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNPACK_SKIP_IMAGES = 0x0000806D;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNPACK_IMAGE_HEIGHT = 0x0000806E;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TEXTURE_3D = 0x0000806F;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TEXTURE_WRAP_R = 0x00008072;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_3D_TEXTURE_SIZE = 0x00008073;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNSIGNED_INT_2_10_10_10_REV = 0x00008368;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_ELEMENTS_VERTICES = 0x000080E8;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_ELEMENTS_INDICES = 0x000080E9;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TEXTURE_MIN_LOD = 0x0000813A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TEXTURE_MAX_LOD = 0x0000813B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TEXTURE_BASE_LEVEL = 0x0000813C;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TEXTURE_MAX_LEVEL = 0x0000813D;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MIN = 0x00008007;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX = 0x00008008;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DEPTH_COMPONENT24 = 0x000081A6;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_TEXTURE_LOD_BIAS = 0x000084FD;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TEXTURE_COMPARE_MODE = 0x0000884C;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TEXTURE_COMPARE_FUNC = 0x0000884D;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int CURRENT_QUERY = 0x00008865;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int QUERY_RESULT = 0x00008866;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int QUERY_RESULT_AVAILABLE = 0x00008867;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int BUFFER_MAPPED = 0x000088BC;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int BUFFER_MAP_POINTER = 0x000088BD;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int STREAM_READ = 0x000088E1;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int STREAM_COPY = 0x000088E2;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int STATIC_READ = 0x000088E5;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int STATIC_COPY = 0x000088E6;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DYNAMIC_READ = 0x000088E9;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DYNAMIC_COPY = 0x000088EA;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_DRAW_BUFFERS = 0x00008824;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER0 = 0x00008825;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER1 = 0x00008826;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER2 = 0x00008827;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER3 = 0x00008828;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER4 = 0x00008829;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER5 = 0x0000882A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER6 = 0x0000882B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER7 = 0x0000882C;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER8 = 0x0000882D;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER9 = 0x0000882E;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER10 = 0x0000882F;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER11 = 0x00008830;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER12 = 0x00008831;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER13 = 0x00008832;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER14 = 0x00008833;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_BUFFER15 = 0x00008834;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x00008B49;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_VERTEX_UNIFORM_COMPONENTS = 0x00008B4A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SAMPLER_3D = 0x00008B5F;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SAMPLER_2D_SHADOW = 0x00008B62;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FRAGMENT_SHADER_DERIVATIVE_HINT = 0x00008B8B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int PIXEL_PACK_BUFFER = 0x000088EB;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int PIXEL_UNPACK_BUFFER = 0x000088EC;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int PIXEL_PACK_BUFFER_BINDING = 0x000088ED;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int PIXEL_UNPACK_BUFFER_BINDING = 0x000088EF;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FLOAT_MAT2x3 = 0x00008B65;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FLOAT_MAT2x4 = 0x00008B66;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FLOAT_MAT3x2 = 0x00008B67;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FLOAT_MAT3x4 = 0x00008B68;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FLOAT_MAT4x2 = 0x00008B69;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FLOAT_MAT4x3 = 0x00008B6A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SRGB = 0x00008C40;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SRGB8 = 0x00008C41;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SRGB8_ALPHA8 = 0x00008C43;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COMPARE_REF_TO_TEXTURE = 0x0000884E;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAJOR_VERSION = 0x0000821B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MINOR_VERSION = 0x0000821C;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int NUM_EXTENSIONS = 0x0000821D;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGBA32F = 0x00008814;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGB32F = 0x00008815;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGBA16F = 0x0000881A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGB16F = 0x0000881B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int VERTEX_ATTRIB_ARRAY_INTEGER = 0x000088FD;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_ARRAY_TEXTURE_LAYERS = 0x000088FF;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MIN_PROGRAM_TEXEL_OFFSET = 0x00008904;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_PROGRAM_TEXEL_OFFSET = 0x00008905;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_VARYING_COMPONENTS = 0x00008B4B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TEXTURE_2D_ARRAY = 0x00008C1A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TEXTURE_BINDING_2D_ARRAY = 0x00008C1D;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int R11F_G11F_B10F = 0x00008C3A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNSIGNED_INT_10F_11F_11F_REV = 0x00008C3B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGB9_E5 = 0x00008C3D;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNSIGNED_INT_5_9_9_9_REV = 0x00008C3E;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x00008C76;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TRANSFORM_FEEDBACK_BUFFER_MODE = 0x00008C7F;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x00008C80;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TRANSFORM_FEEDBACK_VARYINGS = 0x00008C83;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TRANSFORM_FEEDBACK_BUFFER_START = 0x00008C84;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x00008C85;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x00008C88;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RASTERIZER_DISCARD = 0x00008C89;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x00008C8A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x00008C8B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int INTERLEAVED_ATTRIBS = 0x00008C8C;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SEPARATE_ATTRIBS = 0x00008C8D;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TRANSFORM_FEEDBACK_BUFFER = 0x00008C8E;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x00008C8F;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGBA32UI = 0x00008D70;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGB32UI = 0x00008D71;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGBA16UI = 0x00008D76;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGB16UI = 0x00008D77;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGBA8UI = 0x00008D7C;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGB8UI = 0x00008D7D;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGBA32I = 0x00008D82;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGB32I = 0x00008D83;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGBA16I = 0x00008D88;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGB16I = 0x00008D89;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGBA8I = 0x00008D8E;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGB8I = 0x00008D8F;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RED_INTEGER = 0x00008D94;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGB_INTEGER = 0x00008D98;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGBA_INTEGER = 0x00008D99;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SAMPLER_2D_ARRAY = 0x00008DC1;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SAMPLER_2D_ARRAY_SHADOW = 0x00008DC4;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SAMPLER_CUBE_SHADOW = 0x00008DC5;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNSIGNED_INT_VEC2 = 0x00008DC6;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNSIGNED_INT_VEC3 = 0x00008DC7;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNSIGNED_INT_VEC4 = 0x00008DC8;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int INT_SAMPLER_2D = 0x00008DCA;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int INT_SAMPLER_3D = 0x00008DCB;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int INT_SAMPLER_CUBE = 0x00008DCC;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int INT_SAMPLER_2D_ARRAY = 0x00008DCF;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNSIGNED_INT_SAMPLER_2D = 0x00008DD2;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNSIGNED_INT_SAMPLER_3D = 0x00008DD3;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNSIGNED_INT_SAMPLER_CUBE = 0x00008DD4;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x00008DD7;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int BUFFER_ACCESS_FLAGS = 0x0000911F;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int BUFFER_MAP_LENGTH = 0x00009120;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int BUFFER_MAP_OFFSET = 0x00009121;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DEPTH_COMPONENT32F = 0x00008CAC;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DEPTH32F_STENCIL8 = 0x00008CAD;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FLOAT_32_UNSIGNED_INT_24_8_REV = 0x00008DAD;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x00008210;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x00008211;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x00008212;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x00008213;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x00008214;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x00008215;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x00008216;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x00008217;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FRAMEBUFFER_DEFAULT = 0x00008218;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FRAMEBUFFER_UNDEFINED = 0x00008219;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DEPTH_STENCIL_ATTACHMENT = 0x0000821A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DEPTH_STENCIL = 0x000084F9;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNSIGNED_INT_24_8 = 0x000084FA;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DEPTH24_STENCIL8 = 0x000088F0;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNSIGNED_NORMALIZED = 0x00008C17;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_FRAMEBUFFER_BINDING = 0x00008CA6;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int READ_FRAMEBUFFER = 0x00008CA8;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int DRAW_FRAMEBUFFER = 0x00008CA9;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int READ_FRAMEBUFFER_BINDING = 0x00008CAA;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RENDERBUFFER_SAMPLES = 0x00008CAB;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x00008CD4;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_COLOR_ATTACHMENTS = 0x00008CDF;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT1 = 0x00008CE1;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT2 = 0x00008CE2;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT3 = 0x00008CE3;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT4 = 0x00008CE4;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT5 = 0x00008CE5;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT6 = 0x00008CE6;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT7 = 0x00008CE7;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT8 = 0x00008CE8;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT9 = 0x00008CE9;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT10 = 0x00008CEA;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT11 = 0x00008CEB;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT12 = 0x00008CEC;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT13 = 0x00008CED;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT14 = 0x00008CEE;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COLOR_ATTACHMENT15 = 0x00008CEF;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x00008D56;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_SAMPLES = 0x00008D57;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int HALF_FLOAT = 0x0000140B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAP_READ_BIT = 0x00000001;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAP_WRITE_BIT = 0x00000002;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAP_INVALIDATE_RANGE_BIT = 0x00000004;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAP_INVALIDATE_BUFFER_BIT = 0x00000008;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAP_FLUSH_EXPLICIT_BIT = 0x00000010;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAP_UNSYNCHRONIZED_BIT = 0x00000020;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RG = 0x00008227;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RG_INTEGER = 0x00008228;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int R8 = 0x00008229;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RG8 = 0x0000822B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int R16F = 0x0000822D;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int R32F = 0x0000822E;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RG16F = 0x0000822F;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RG32F = 0x00008230;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int R8I = 0x00008231;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int R8UI = 0x00008232;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int R16I = 0x00008233;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int R16UI = 0x00008234;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int R32I = 0x00008235;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int R32UI = 0x00008236;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RG8I = 0x00008237;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RG8UI = 0x00008238;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RG16I = 0x00008239;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RG16UI = 0x0000823A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RG32I = 0x0000823B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RG32UI = 0x0000823C;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int VERTEX_ARRAY_BINDING = 0x000085B5;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int R8_SNORM = 0x00008F94;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RG8_SNORM = 0x00008F95;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGB8_SNORM = 0x00008F96;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int RGBA8_SNORM = 0x00008F97;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SIGNED_NORMALIZED = 0x00008F9C;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int PRIMITIVE_RESTART_FIXED_INDEX = 0x00008D69;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COPY_READ_BUFFER = 0x00008F36;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COPY_WRITE_BUFFER = 0x00008F37;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COPY_READ_BUFFER_BINDING = 0x00008F36;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int COPY_WRITE_BUFFER_BINDING = 0x00008F37;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_BUFFER = 0x00008A11;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_BUFFER_BINDING = 0x00008A28;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_BUFFER_START = 0x00008A29;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_BUFFER_SIZE = 0x00008A2A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_VERTEX_UNIFORM_BLOCKS = 0x00008A2B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_FRAGMENT_UNIFORM_BLOCKS = 0x00008A2D;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_COMBINED_UNIFORM_BLOCKS = 0x00008A2E;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_UNIFORM_BUFFER_BINDINGS = 0x00008A2F;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_UNIFORM_BLOCK_SIZE = 0x00008A30;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x00008A31;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x00008A33;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x00008A34;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x00008A35;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int ACTIVE_UNIFORM_BLOCKS = 0x00008A36;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_TYPE = 0x00008A37;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_SIZE = 0x00008A38;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_NAME_LENGTH = 0x00008A39;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_BLOCK_INDEX = 0x00008A3A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_OFFSET = 0x00008A3B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_ARRAY_STRIDE = 0x00008A3C;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_MATRIX_STRIDE = 0x00008A3D;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_IS_ROW_MAJOR = 0x00008A3E;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_BLOCK_BINDING = 0x00008A3F;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_BLOCK_DATA_SIZE = 0x00008A40;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_BLOCK_NAME_LENGTH = 0x00008A41;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x00008A42;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x00008A43;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x00008A44;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x00008A46;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int INVALID_INDEX = 0xFFFFFFFF;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_VERTEX_OUTPUT_COMPONENTS = 0x00009122;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_FRAGMENT_INPUT_COMPONENTS = 0x00009125;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int MAX_SERVER_WAIT_TIMEOUT = 0x00009111;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int OBJECT_TYPE = 0x00009112;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SYNC_CONDITION = 0x00009113;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SYNC_STATUS = 0x00009114;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SYNC_FLAGS = 0x00009115;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SYNC_FENCE = 0x00009116;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SYNC_GPU_COMMANDS_COMPLETE = 0x00009117;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int UNSIGNALED = 0x00009118;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SIGNALED = 0x00009119;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int ALREADY_SIGNALED = 0x0000911A;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int TIMEOUT_EXPIRED = 0x0000911B;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int CONDITION_SATISFIED = 0x0000911C;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int WAIT_FAILED = 0x0000911D;
    /**
     * OpenGL ES 3.0
     */
    @Generated public static final int SYNC_FLUSH_COMMANDS_BIT = 0x00000001;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int VERTEX_ATTRIB_ARRAY_DIVISOR = 0x000088FE;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int ANY_SAMPLES_PASSED = 0x00008C2F;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int ANY_SAMPLES_PASSED_CONSERVATIVE = 0x00008D6A;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int SAMPLER_BINDING = 0x00008919;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int RGB10_A2UI = 0x0000906F;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int TEXTURE_SWIZZLE_R = 0x00008E42;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int TEXTURE_SWIZZLE_G = 0x00008E43;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int TEXTURE_SWIZZLE_B = 0x00008E44;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int TEXTURE_SWIZZLE_A = 0x00008E45;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int GREEN = 0x00001904;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int BLUE = 0x00001905;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int INT_2_10_10_10_REV = 0x00008D9F;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int TRANSFORM_FEEDBACK = 0x00008E22;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int TRANSFORM_FEEDBACK_PAUSED = 0x00008E23;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int TRANSFORM_FEEDBACK_ACTIVE = 0x00008E24;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int TRANSFORM_FEEDBACK_BINDING = 0x00008E25;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int PROGRAM_BINARY_RETRIEVABLE_HINT = 0x00008257;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int PROGRAM_BINARY_LENGTH = 0x00008741;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int NUM_PROGRAM_BINARY_FORMATS = 0x000087FE;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int PROGRAM_BINARY_FORMATS = 0x000087FF;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int COMPRESSED_R11_EAC = 0x00009270;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int COMPRESSED_SIGNED_R11_EAC = 0x00009271;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int COMPRESSED_RG11_EAC = 0x00009272;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int COMPRESSED_SIGNED_RG11_EAC = 0x00009273;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int COMPRESSED_RGB8_ETC2 = 0x00009274;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int COMPRESSED_SRGB8_ETC2 = 0x00009275;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x00009276;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x00009277;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int COMPRESSED_RGBA8_ETC2_EAC = 0x00009278;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x00009279;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int TEXTURE_IMMUTABLE_FORMAT = 0x0000912F;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int MAX_ELEMENT_INDEX = 0x00008D6B;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int NUM_SAMPLE_COUNTS = 0x00009380;
    /**
     * _ES3_GL_TIMEOUT_IGNORED = GL_TIMEOUT_IGNORED,
     */
    @Generated public static final int TEXTURE_IMMUTABLE_LEVELS = 0x000082DF;
    /**
     * glext.h
     */
    @Generated public static final int APPLE_copy_texture_levels = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int APPLE_rgb_422 = 0x00000001;
    /**
     * glext.h
     */
    @Generated public static final int APPLE_texture_format_BGRA8888 = 0x00000001;
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
     * _ES3_GL_EXT_shader_framebuffer_fetch = GL_EXT_shader_framebuffer_fetch,
     */
    @Generated public static final int EXT_texture_filter_anisotropic = 0x00000001;
    /**
     * _ES3_GL_EXT_shader_framebuffer_fetch = GL_EXT_shader_framebuffer_fetch,
     */
    @Generated public static final int IMG_read_format = 0x00000001;
    /**
     * _ES3_GL_EXT_shader_framebuffer_fetch = GL_EXT_shader_framebuffer_fetch,
     */
    @Generated public static final int IMG_texture_compression_pvrtc = 0x00000001;
    /**
     * _ES3_GL_EXT_shader_framebuffer_fetch = GL_EXT_shader_framebuffer_fetch,
     */
    @Generated public static final int OES_standard_derivatives = 0x00000001;
    @Generated public static final int RGB_422_APPLE = 0x00008A1F;
    @Generated public static final int UNSIGNED_SHORT_8_8_APPLE = 0x000085BA;
    @Generated public static final int UNSIGNED_SHORT_8_8_REV_APPLE = 0x000085BB;
    @Generated public static final int RGB_RAW_422_APPLE = 0x00008A51;
    @Generated public static final int BGRA_EXT = 0x000080E1;
    @Generated public static final int BGRA8_EXT = 0x000093A1;
    @Generated public static final int BGRA = 0x000080E1;
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
    @Generated public static final int SYNC_OBJECT_APPLE = 0x00008A53;
    @Generated public static final int SAMPLER = 0x000082E6;
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
    @Generated public static final int TEXTURE_MAX_ANISOTROPY_EXT = 0x000084FE;
    @Generated public static final int MAX_TEXTURE_MAX_ANISOTROPY_EXT = 0x000084FF;
    @Generated public static final int BGRA_IMG = 0x000080E1;
    @Generated public static final int UNSIGNED_SHORT_4_4_4_4_REV_IMG = 0x00008365;
    @Generated public static final int COMPRESSED_RGB_PVRTC_4BPPV1_IMG = 0x00008C00;
    @Generated public static final int COMPRESSED_RGB_PVRTC_2BPPV1_IMG = 0x00008C01;
    @Generated public static final int COMPRESSED_RGBA_PVRTC_4BPPV1_IMG = 0x00008C02;
    @Generated public static final int COMPRESSED_RGBA_PVRTC_2BPPV1_IMG = 0x00008C03;
    @Generated public static final int FRAGMENT_SHADER_DERIVATIVE_HINT_OES = 0x00008B8B;

    @Generated
    private ES3() {
    }
}
