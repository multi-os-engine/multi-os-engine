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

package apple.opengles.c;

import apple.opengles.opaque.GLsync;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.map.CStringArrayMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.general.ptr.ConstShortPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("OpenGLES")
@Runtime(CRuntime.class)
public final class OpenGLES {
    static {
        NatJ.register();
    }

    @Generated
    private OpenGLES() {
    }

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glAlphaFunc(int func, float ref);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glClearColor(float red, float green, float blue, float alpha);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glClearDepthf(float depth);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glClipPlanef(int plane, ConstFloatPtr equation);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glColor4f(float red, float green, float blue, float alpha);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDepthRangef(float zNear, float zFar);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFogf(int pname, float param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFogfv(int pname, ConstFloatPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFrustumf(float left, float right, float bottom, float top, float zNear, float zFar);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetClipPlanef(int pname, FloatPtr equation);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetFloatv(int pname, FloatPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetLightfv(int light, int pname, FloatPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetMaterialfv(int face, int pname, FloatPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetTexEnvfv(int env, int pname, FloatPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetTexParameterfv(int target, int pname, FloatPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLightModelf(int pname, float param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLightModelfv(int pname, ConstFloatPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLightf(int light, int pname, float param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLightfv(int light, int pname, ConstFloatPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLineWidth(float width);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLoadMatrixf(ConstFloatPtr m);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glMaterialf(int face, int pname, float param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glMaterialfv(int face, int pname, ConstFloatPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glMultMatrixf(ConstFloatPtr m);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glMultiTexCoord4f(int target, float s, float t, float r, float q);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glNormal3f(float nx, float ny, float nz);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glOrthof(float left, float right, float bottom, float top, float zNear, float zFar);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPointParameterf(int pname, float param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPointParameterfv(int pname, ConstFloatPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPointSize(float size);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPolygonOffset(float factor, float units);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glRotatef(float angle, float x, float y, float z);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glSampleCoverage(float value, byte invert);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glScalef(float x, float y, float z);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexEnvf(int target, int pname, float param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexEnvfv(int target, int pname, ConstFloatPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexParameterf(int target, int pname, float param);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexParameterfv(int target, int pname, ConstFloatPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTranslatef(float x, float y, float z);

    /**
     * -------------------------------------------------------------------------
     * Entrypoint definitions
     * -----------------------------------------------------------------------
     * 
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glActiveTexture(int texture);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glAlphaFuncx(int func, int ref);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindBuffer(int target, int buffer);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindTexture(int target, int texture);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBlendFunc(int sfactor, int dfactor);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBufferData(int target, @NInt long size, ConstVoidPtr data, int usage);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBufferSubData(int target, @NInt long offset, @NInt long size, ConstVoidPtr data);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glClear(int mask);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glClearColorx(int red, int green, int blue, int alpha);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glClearDepthx(int depth);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glClearStencil(int s);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glClientActiveTexture(int texture);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glClipPlanex(int plane, ConstIntPtr equation);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glColor4ub(byte red, byte green, byte blue, byte alpha);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glColor4x(int red, int green, int blue, int alpha);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glColorMask(byte red, byte green, byte blue, byte alpha);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glColorPointer(int size, int type, int stride, ConstVoidPtr pointer);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height,
            int border, int imageSize, ConstVoidPtr data);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width,
            int height, int format, int imageSize, ConstVoidPtr data);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width,
            int height, int border);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y,
            int width, int height);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glCullFace(int mode);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteBuffers(int n, ConstIntPtr buffers);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteTextures(int n, ConstIntPtr textures);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDepthFunc(int func);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDepthMask(byte flag);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDepthRangex(int zNear, int zFar);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDisable(int cap);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDisableClientState(int array);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawArrays(int mode, int first, int count);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawElements(int mode, int count, int type, ConstVoidPtr indices);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glEnable(int cap);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glEnableClientState(int array);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFinish();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFlush();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFogx(int pname, int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFogxv(int pname, ConstIntPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFrontFace(int mode);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFrustumx(int left, int right, int bottom, int top, int zNear, int zFar);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenBuffers(int n, IntPtr buffers);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenTextures(int n, IntPtr textures);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetBooleanv(int pname, BytePtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetBufferParameteriv(int target, int pname, IntPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int glGetError();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetFixedv(int pname, IntPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetIntegerv(int pname, IntPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetLightxv(int light, int pname, IntPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetMaterialxv(int face, int pname, IntPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetPointerv(int pname, Ptr<VoidPtr> params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String glGetString(int name);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetTexEnviv(int env, int pname, IntPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetTexEnvxv(int env, int pname, IntPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetTexParameteriv(int target, int pname, IntPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetTexParameterxv(int target, int pname, IntPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glHint(int target, int mode);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsBuffer(int buffer);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsEnabled(int cap);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsTexture(int texture);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLightModelx(int pname, int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLightModelxv(int pname, ConstIntPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLightx(int light, int pname, int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLightxv(int light, int pname, ConstIntPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLineWidthx(int width);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLoadIdentity();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLoadMatrixx(ConstIntPtr m);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLogicOp(int opcode);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glMaterialx(int face, int pname, int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glMaterialxv(int face, int pname, ConstIntPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glMatrixMode(int mode);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glMultMatrixx(ConstIntPtr m);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glMultiTexCoord4x(int target, int s, int t, int r, int q);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glNormal3x(int nx, int ny, int nz);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glNormalPointer(int type, int stride, ConstVoidPtr pointer);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glOrthox(int left, int right, int bottom, int top, int zNear, int zFar);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPixelStorei(int pname, int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPointParameterx(int pname, int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPointParameterxv(int pname, ConstIntPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPointSizex(int size);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPolygonOffsetx(int factor, int units);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPopMatrix();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPushMatrix();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glReadPixels(int x, int y, int width, int height, int format, int type, VoidPtr pixels);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glRotatex(int angle, int x, int y, int z);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glSampleCoveragex(int value, byte invert);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glScalex(int x, int y, int z);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glScissor(int x, int y, int width, int height);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glShadeModel(int mode);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glStencilFunc(int func, int ref, int mask);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glStencilMask(int mask);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glStencilOp(int fail, int zfail, int zpass);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexCoordPointer(int size, int type, int stride, ConstVoidPtr pointer);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexEnvi(int target, int pname, int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexEnvx(int target, int pname, int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexEnviv(int target, int pname, ConstIntPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexEnvxv(int target, int pname, ConstIntPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexImage2D(int target, int level, int internalformat, int width, int height, int border,
            int format, int type, ConstVoidPtr pixels);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexParameteri(int target, int pname, int param);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexParameterx(int target, int pname, int param);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexParameteriv(int target, int pname, ConstIntPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexParameterxv(int target, int pname, ConstIntPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height,
            int format, int type, ConstVoidPtr pixels);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTranslatex(int x, int y, int z);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexPointer(int size, int type, int stride, ConstVoidPtr pointer);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glViewport(int x, int y, int width, int height);

    /**
     * OES extension functions
     * OES_matrix_palette
     * 
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glCurrentPaletteMatrixOES(int matrixpaletteindex);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLoadPaletteFromModelViewMatrixOES();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glMatrixIndexPointerOES(int size, int type, int stride, ConstVoidPtr pointer);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glWeightPointerOES(int size, int type, int stride, ConstVoidPtr pointer);

    /**
     * OES_point_size_array
     * 
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPointSizePointerOES(int type, int stride, ConstVoidPtr pointer);

    /**
     * OES_draw_texture
     * 
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawTexsOES(short x, short y, short z, short width, short height);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawTexiOES(int x, int y, int z, int width, int height);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawTexxOES(int x, int y, int z, int width, int height);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawTexsvOES(ConstShortPtr coords);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawTexivOES(ConstIntPtr coords);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawTexxvOES(ConstIntPtr coords);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawTexfOES(float x, float y, float z, float width, float height);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawTexfvOES(ConstFloatPtr coords);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glCopyTextureLevelsAPPLE(int destinationTexture, int sourceTexture, int sourceBaseLevel,
            int sourceLevelCount);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glRenderbufferStorageMultisampleAPPLE(int target, int samples, int internalformat,
            int width, int height);

    @Generated
    @CFunction
    public static native void glResolveMultisampleFramebufferAPPLE();

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLabelObjectEXT(int type, int object, int length,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetObjectLabelEXT(int type, int object, int bufSize, IntPtr length, BytePtr label);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glInsertEventMarkerEXT(int length,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String marker);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPushGroupMarkerEXT(int length,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String marker);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPopGroupMarkerEXT();

    /**
     * API-Since: 4.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDiscardFramebufferEXT(int target, int numAttachments, ConstIntPtr attachments);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native VoidPtr glMapBufferRangeEXT(int target, @NInt long offset, @NInt long length, int access);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFlushMappedBufferRangeEXT(int target, @NInt long offset, @NInt long length);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexStorage2DEXT(int target, int levels, int internalformat, int width, int height);

    /**
     * API-Since: 3.1
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBlendEquationSeparateOES(int modeRGB, int modeAlpha);

    /**
     * API-Since: 3.1
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBlendFuncSeparateOES(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

    @Generated
    @CFunction
    public static native void glBlendEquationOES(int mode);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsRenderbufferOES(int renderbuffer);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindRenderbufferOES(int target, int renderbuffer);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteRenderbuffersOES(int n, ConstIntPtr renderbuffers);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenRenderbuffersOES(int n, IntPtr renderbuffers);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glRenderbufferStorageOES(int target, int internalformat, int width, int height);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetRenderbufferParameterivOES(int target, int pname, IntPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsFramebufferOES(int framebuffer);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindFramebufferOES(int target, int framebuffer);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteFramebuffersOES(int n, ConstIntPtr framebuffers);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenFramebuffersOES(int n, IntPtr framebuffers);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int glCheckFramebufferStatusOES(int target);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFramebufferRenderbufferOES(int target, int attachment, int renderbuffertarget,
            int renderbuffer);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFramebufferTexture2DOES(int target, int attachment, int textarget, int texture,
            int level);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetFramebufferAttachmentParameterivOES(int target, int attachment, int pname,
            IntPtr params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenerateMipmapOES(int target);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetBufferPointervOES(int target, int pname, Ptr<VoidPtr> params);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native VoidPtr glMapBufferOES(int target, int access);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glUnmapBufferOES(int target);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindVertexArrayOES(int array);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteVertexArraysOES(int n, ConstIntPtr arrays);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenVertexArraysOES(int n, IntPtr arrays);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsVertexArrayOES(int array);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glAttachShader(int program, int shader);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindAttribLocation(int program, int index,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindFramebuffer(int target, int framebuffer);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindRenderbuffer(int target, int renderbuffer);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBlendColor(float red, float green, float blue, float alpha);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBlendEquation(int mode);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBlendEquationSeparate(int modeRGB, int modeAlpha);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int glCheckFramebufferStatus(int target);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glCompileShader(int shader);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int glCreateProgram();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int glCreateShader(int type);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteFramebuffers(int n, ConstIntPtr framebuffers);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteProgram(int program);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteRenderbuffers(int n, ConstIntPtr renderbuffers);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteShader(int shader);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDetachShader(int program, int shader);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDisableVertexAttribArray(int index);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glEnableVertexAttribArray(int index);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget,
            int renderbuffer);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenerateMipmap(int target);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenFramebuffers(int n, IntPtr framebuffers);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenRenderbuffers(int n, IntPtr renderbuffers);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetActiveAttrib(int program, int index, int bufsize, IntPtr length, IntPtr size,
            IntPtr type, BytePtr name);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetActiveUniform(int program, int index, int bufsize, IntPtr length, IntPtr size,
            IntPtr type, BytePtr name);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetAttachedShaders(int program, int maxcount, IntPtr count, IntPtr shaders);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int glGetAttribLocation(int program,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname,
            IntPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetProgramiv(int program, int pname, IntPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetProgramInfoLog(int program, int bufsize, IntPtr length, BytePtr infolog);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetRenderbufferParameteriv(int target, int pname, IntPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetShaderiv(int shader, int pname, IntPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetShaderInfoLog(int shader, int bufsize, IntPtr length, BytePtr infolog);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntPtr range,
            IntPtr precision);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetShaderSource(int shader, int bufsize, IntPtr length, BytePtr source);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetUniformfv(int program, int location, FloatPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetUniformiv(int program, int location, IntPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int glGetUniformLocation(int program,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetVertexAttribfv(int index, int pname, FloatPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetVertexAttribiv(int index, int pname, IntPtr params);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetVertexAttribPointerv(int index, int pname, Ptr<VoidPtr> pointer);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsFramebuffer(int framebuffer);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsProgram(int program);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsRenderbuffer(int renderbuffer);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsShader(int shader);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glLinkProgram(int program);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glReleaseShaderCompiler();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glRenderbufferStorage(int target, int internalformat, int width, int height);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glShaderBinary(int n, ConstIntPtr shaders, int binaryformat, ConstVoidPtr binary,
            int length);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glShaderSource(int shader, int count,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] string,
            ConstIntPtr length);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glStencilFuncSeparate(int face, int func, int ref, int mask);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glStencilMaskSeparate(int face, int mask);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glStencilOpSeparate(int face, int fail, int zfail, int zpass);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform1f(int location, float x);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform1fv(int location, int count, ConstFloatPtr v);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform1i(int location, int x);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform1iv(int location, int count, ConstIntPtr v);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform2f(int location, float x, float y);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform2fv(int location, int count, ConstFloatPtr v);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform2i(int location, int x, int y);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform2iv(int location, int count, ConstIntPtr v);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform3f(int location, float x, float y, float z);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform3fv(int location, int count, ConstFloatPtr v);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform3i(int location, int x, int y, int z);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform3iv(int location, int count, ConstIntPtr v);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform4f(int location, float x, float y, float z, float w);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform4fv(int location, int count, ConstFloatPtr v);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform4i(int location, int x, int y, int z, int w);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform4iv(int location, int count, ConstIntPtr v);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniformMatrix2fv(int location, int count, byte transpose, ConstFloatPtr value);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniformMatrix3fv(int location, int count, byte transpose, ConstFloatPtr value);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniformMatrix4fv(int location, int count, byte transpose, ConstFloatPtr value);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUseProgram(int program);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glValidateProgram(int program);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttrib1f(int indx, float x);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttrib1fv(int indx, ConstFloatPtr values);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttrib2f(int indx, float x, float y);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttrib2fv(int indx, ConstFloatPtr values);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttrib3f(int indx, float x, float y, float z);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttrib3fv(int indx, ConstFloatPtr values);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttrib4f(int indx, float x, float y, float z, float w);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttrib4fv(int indx, ConstFloatPtr values);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttribPointer(int indx, int size, int type, byte normalized, int stride,
            ConstVoidPtr ptr);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native GLsync glFenceSyncAPPLE(int condition, int flags);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsSyncAPPLE(GLsync sync);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteSyncAPPLE(GLsync sync);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int glClientWaitSyncAPPLE(GLsync sync, int flags, long timeout);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glWaitSyncAPPLE(GLsync sync, int flags, long timeout);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetInteger64vAPPLE(int pname, LongPtr params);

    /**
     * API-Since: 6.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetSyncivAPPLE(GLsync sync, int pname, int bufSize, IntPtr length, IntPtr values);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawArraysInstancedEXT(int mode, int first, int count, int instanceCount);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawElementsInstancedEXT(int mode, int count, int type, ConstVoidPtr indices,
            int instanceCount);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttribDivisorEXT(int index, int divisor);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenQueriesEXT(int n, IntPtr ids);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteQueriesEXT(int n, ConstIntPtr ids);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsQueryEXT(int id);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBeginQueryEXT(int target, int id);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glEndQueryEXT(int target);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetQueryivEXT(int target, int pname, IntPtr params);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetQueryObjectuivEXT(int id, int pname, IntPtr params);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUseProgramStagesEXT(int pipeline, int stages, int program);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glActiveShaderProgramEXT(int pipeline, int program);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int glCreateShaderProgramvEXT(int type, int count,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] strings);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindProgramPipelineEXT(int pipeline);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteProgramPipelinesEXT(int n, ConstIntPtr pipelines);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenProgramPipelinesEXT(int n, IntPtr pipelines);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsProgramPipelineEXT(int pipeline);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramParameteriEXT(int program, int pname, int value);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetProgramPipelineivEXT(int pipeline, int pname, IntPtr params);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glValidateProgramPipelineEXT(int pipeline);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetProgramPipelineInfoLogEXT(int pipeline, int bufSize, IntPtr length, BytePtr infoLog);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform1iEXT(int program, int location, int x);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform2iEXT(int program, int location, int x, int y);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform3iEXT(int program, int location, int x, int y, int z);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform4iEXT(int program, int location, int x, int y, int z, int w);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform1fEXT(int program, int location, float x);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform2fEXT(int program, int location, float x, float y);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform3fEXT(int program, int location, float x, float y, float z);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform4fEXT(int program, int location, float x, float y, float z, float w);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform1ivEXT(int program, int location, int count, ConstIntPtr value);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform2ivEXT(int program, int location, int count, ConstIntPtr value);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform3ivEXT(int program, int location, int count, ConstIntPtr value);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform4ivEXT(int program, int location, int count, ConstIntPtr value);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform1fvEXT(int program, int location, int count, ConstFloatPtr value);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform2fvEXT(int program, int location, int count, ConstFloatPtr value);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform3fvEXT(int program, int location, int count, ConstFloatPtr value);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform4fvEXT(int program, int location, int count, ConstFloatPtr value);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniformMatrix2fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniformMatrix3fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniformMatrix4fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    /**
     * OpenGL ES 3.0
     * 
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glReadBuffer(int mode);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawRangeElements(int mode, int start, int end, int count, int type,
            ConstVoidPtr indices);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth,
            int border, int format, int type, ConstVoidPtr pixels);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width,
            int height, int depth, int format, int type, ConstVoidPtr pixels);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x,
            int y, int width, int height);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height,
            int depth, int border, int imageSize, ConstVoidPtr data);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
            int width, int height, int depth, int format, int imageSize, ConstVoidPtr data);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenQueries(int n, IntPtr ids);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteQueries(int n, ConstIntPtr ids);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsQuery(int id);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBeginQuery(int target, int id);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glEndQuery(int target);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetQueryiv(int target, int pname, IntPtr params);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetQueryObjectuiv(int id, int pname, IntPtr params);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glUnmapBuffer(int target);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetBufferPointerv(int target, int pname, Ptr<VoidPtr> params);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawBuffers(int n, ConstIntPtr bufs);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniformMatrix2x3fv(int location, int count, byte transpose, ConstFloatPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniformMatrix3x2fv(int location, int count, byte transpose, ConstFloatPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniformMatrix2x4fv(int location, int count, byte transpose, ConstFloatPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniformMatrix4x2fv(int location, int count, byte transpose, ConstFloatPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniformMatrix3x4fv(int location, int count, byte transpose, ConstFloatPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniformMatrix4x3fv(int location, int count, byte transpose, ConstFloatPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0,
            int dstX1, int dstY1, int mask, int filter);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width,
            int height);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native VoidPtr glMapBufferRange(int target, @NInt long offset, @NInt long length, int access);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glFlushMappedBufferRange(int target, @NInt long offset, @NInt long length);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindVertexArray(int array);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteVertexArrays(int n, ConstIntPtr arrays);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenVertexArrays(int n, IntPtr arrays);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsVertexArray(int array);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetIntegeri_v(int target, int index, IntPtr data);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBeginTransformFeedback(int primitiveMode);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glEndTransformFeedback();

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindBufferRange(int target, int index, int buffer, @NInt long offset, @NInt long size);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindBufferBase(int target, int index, int buffer);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTransformFeedbackVaryings(int program, int count,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] varyings,
            int bufferMode);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetTransformFeedbackVarying(int program, int index, int bufSize, IntPtr length,
            IntPtr size, IntPtr type, BytePtr name);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttribIPointer(int index, int size, int type, int stride, ConstVoidPtr pointer);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetVertexAttribIiv(int index, int pname, IntPtr params);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetVertexAttribIuiv(int index, int pname, IntPtr params);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttribI4i(int index, int x, int y, int z, int w);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttribI4ui(int index, int x, int y, int z, int w);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttribI4iv(int index, ConstIntPtr v);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttribI4uiv(int index, ConstIntPtr v);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetUniformuiv(int program, int location, IntPtr params);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int glGetFragDataLocation(int program,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform1ui(int location, int v0);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform2ui(int location, int v0, int v1);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform3ui(int location, int v0, int v1, int v2);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform4ui(int location, int v0, int v1, int v2, int v3);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform1uiv(int location, int count, ConstIntPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform2uiv(int location, int count, ConstIntPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform3uiv(int location, int count, ConstIntPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniform4uiv(int location, int count, ConstIntPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glClearBufferiv(int buffer, int drawbuffer, ConstIntPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glClearBufferuiv(int buffer, int drawbuffer, ConstIntPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glClearBufferfv(int buffer, int drawbuffer, ConstFloatPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String glGetStringi(int name, int index);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glCopyBufferSubData(int readTarget, int writeTarget, @NInt long readOffset,
            @NInt long writeOffset, @NInt long size);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetUniformIndices(int program, int uniformCount,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] uniformNames,
            IntPtr uniformIndices);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetActiveUniformsiv(int program, int uniformCount, ConstIntPtr uniformIndices,
            int pname, IntPtr params);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int glGetUniformBlockIndex(int program,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String uniformBlockName);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntPtr params);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize,
            IntPtr length, BytePtr uniformBlockName);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawArraysInstanced(int mode, int first, int count, int instancecount);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDrawElementsInstanced(int mode, int count, int type, ConstVoidPtr indices,
            int instancecount);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native GLsync glFenceSync(int condition, int flags);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsSync(GLsync sync);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteSync(GLsync sync);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int glClientWaitSync(GLsync sync, int flags, long timeout);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glWaitSync(GLsync sync, int flags, long timeout);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetInteger64v(int pname, LongPtr params);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetSynciv(GLsync sync, int pname, int bufSize, IntPtr length, IntPtr values);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetInteger64i_v(int target, int index, LongPtr data);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetBufferParameteri64v(int target, int pname, LongPtr params);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenSamplers(int count, IntPtr samplers);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteSamplers(int count, ConstIntPtr samplers);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsSampler(int sampler);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindSampler(int unit, int sampler);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glSamplerParameteri(int sampler, int pname, int param);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glSamplerParameteriv(int sampler, int pname, ConstIntPtr param);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glSamplerParameterf(int sampler, int pname, float param);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glSamplerParameterfv(int sampler, int pname, ConstFloatPtr param);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetSamplerParameteriv(int sampler, int pname, IntPtr params);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetSamplerParameterfv(int sampler, int pname, FloatPtr params);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glVertexAttribDivisor(int index, int divisor);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glBindTransformFeedback(int target, int id);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glDeleteTransformFeedbacks(int n, ConstIntPtr ids);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGenTransformFeedbacks(int n, IntPtr ids);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native byte glIsTransformFeedback(int id);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glPauseTransformFeedback();

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glResumeTransformFeedback();

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetProgramBinary(int program, int bufSize, IntPtr length, IntPtr binaryFormat,
            VoidPtr binary);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramBinary(int program, int binaryFormat, ConstVoidPtr binary, int length);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramParameteri(int program, int pname, int value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glInvalidateFramebuffer(int target, int numAttachments, ConstIntPtr attachments);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glInvalidateSubFramebuffer(int target, int numAttachments, ConstIntPtr attachments, int x,
            int y, int width, int height);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexStorage2D(int target, int levels, int internalformat, int width, int height);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glTexStorage3D(int target, int levels, int internalformat, int width, int height,
            int depth);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glGetInternalformativ(int target, int internalformat, int pname, int bufSize,
            IntPtr params);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform1uiEXT(int program, int location, int x);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform2uiEXT(int program, int location, int x, int y);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform3uiEXT(int program, int location, int x, int y, int z);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform4uiEXT(int program, int location, int x, int y, int z, int w);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform1uivEXT(int program, int location, int count, ConstIntPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform2uivEXT(int program, int location, int count, ConstIntPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform3uivEXT(int program, int location, int count, ConstIntPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniform4uivEXT(int program, int location, int count, ConstIntPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniformMatrix2x3fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniformMatrix3x2fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniformMatrix2x4fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniformMatrix4x2fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniformMatrix3x4fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void glProgramUniformMatrix4x3fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    /**
     * EAGL Functions
     * 
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void EAGLGetVersion(IntPtr major, IntPtr minor);

    /**
     * Keys for EAGLDrawable drawableProperties dictionary
     * kEAGLDrawablePropertyRetainedBacking:
     * Type: NSNumber (boolean)
     * Legal Values: True/False
     * Default Value: False
     * Description: True if EAGLDrawable contents are retained after a
     * call to presentRenderbuffer. False, if they are not
     * kEAGLDrawablePropertyColorFormat:
     * Type: NSString
     * Legal Values: kEAGLColorFormat*
     * Default Value: kEAGLColorFormatRGBA8
     * Description: Format of pixels in renderbuffer
     * 
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kEAGLDrawablePropertyRetainedBacking();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kEAGLDrawablePropertyColorFormat();

    /**
     * Values for kEAGLDrawablePropertyColorFormat key
     * 
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kEAGLColorFormatRGBA8();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kEAGLColorFormatRGB565();

    /**
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kEAGLColorFormatSRGBA8();

    @Generated public static final double EAGL_MAJOR_VERSION = 1.0;
    @Generated public static final double EAGL_MINOR_VERSION = 0.0;
    @Generated public static final double GL_ES_VERSION_2_0 = 1.0;
    @Generated public static final double GL_DEPTH_BUFFER_BIT = 256.0;
    @Generated public static final double GL_STENCIL_BUFFER_BIT = 1024.0;
    @Generated public static final double GL_COLOR_BUFFER_BIT = 16384.0;
    @Generated public static final double GL_FALSE = 0.0;
    @Generated public static final double GL_TRUE = 1.0;
    @Generated public static final double GL_POINTS = 0.0;
    @Generated public static final double GL_LINES = 1.0;
    @Generated public static final double GL_LINE_LOOP = 2.0;
    @Generated public static final double GL_LINE_STRIP = 3.0;
    @Generated public static final double GL_TRIANGLES = 4.0;
    @Generated public static final double GL_TRIANGLE_STRIP = 5.0;
    @Generated public static final double GL_TRIANGLE_FAN = 6.0;
    @Generated public static final double GL_ZERO = 0.0;
    @Generated public static final double GL_ONE = 1.0;
    @Generated public static final double GL_SRC_COLOR = 768.0;
    @Generated public static final double GL_ONE_MINUS_SRC_COLOR = 769.0;
    @Generated public static final double GL_SRC_ALPHA = 770.0;
    @Generated public static final double GL_ONE_MINUS_SRC_ALPHA = 771.0;
    @Generated public static final double GL_DST_ALPHA = 772.0;
    @Generated public static final double GL_ONE_MINUS_DST_ALPHA = 773.0;
    @Generated public static final double GL_DST_COLOR = 774.0;
    @Generated public static final double GL_ONE_MINUS_DST_COLOR = 775.0;
    @Generated public static final double GL_SRC_ALPHA_SATURATE = 776.0;
    @Generated public static final double GL_FUNC_ADD = 32774.0;
    @Generated public static final double GL_BLEND_EQUATION = 32777.0;
    @Generated public static final double GL_BLEND_EQUATION_RGB = 32777.0;
    @Generated public static final double GL_BLEND_EQUATION_ALPHA = 34877.0;
    @Generated public static final double GL_FUNC_SUBTRACT = 32778.0;
    @Generated public static final double GL_FUNC_REVERSE_SUBTRACT = 32779.0;
    @Generated public static final double GL_BLEND_DST_RGB = 32968.0;
    @Generated public static final double GL_BLEND_SRC_RGB = 32969.0;
    @Generated public static final double GL_BLEND_DST_ALPHA = 32970.0;
    @Generated public static final double GL_BLEND_SRC_ALPHA = 32971.0;
    @Generated public static final double GL_CONSTANT_COLOR = 32769.0;
    @Generated public static final double GL_ONE_MINUS_CONSTANT_COLOR = 32770.0;
    @Generated public static final double GL_CONSTANT_ALPHA = 32771.0;
    @Generated public static final double GL_ONE_MINUS_CONSTANT_ALPHA = 32772.0;
    @Generated public static final double GL_BLEND_COLOR = 32773.0;
    @Generated public static final double GL_ARRAY_BUFFER = 34962.0;
    @Generated public static final double GL_ELEMENT_ARRAY_BUFFER = 34963.0;
    @Generated public static final double GL_ARRAY_BUFFER_BINDING = 34964.0;
    @Generated public static final double GL_ELEMENT_ARRAY_BUFFER_BINDING = 34965.0;
    @Generated public static final double GL_STREAM_DRAW = 35040.0;
    @Generated public static final double GL_STATIC_DRAW = 35044.0;
    @Generated public static final double GL_DYNAMIC_DRAW = 35048.0;
    @Generated public static final double GL_BUFFER_SIZE = 34660.0;
    @Generated public static final double GL_BUFFER_USAGE = 34661.0;
    @Generated public static final double GL_CURRENT_VERTEX_ATTRIB = 34342.0;
    @Generated public static final double GL_FRONT = 1028.0;
    @Generated public static final double GL_BACK = 1029.0;
    @Generated public static final double GL_FRONT_AND_BACK = 1032.0;
    @Generated public static final double GL_TEXTURE_2D = 3553.0;
    @Generated public static final double GL_CULL_FACE = 2884.0;
    @Generated public static final double GL_BLEND = 3042.0;
    @Generated public static final double GL_DITHER = 3024.0;
    @Generated public static final double GL_STENCIL_TEST = 2960.0;
    @Generated public static final double GL_DEPTH_TEST = 2929.0;
    @Generated public static final double GL_SCISSOR_TEST = 3089.0;
    @Generated public static final double GL_POLYGON_OFFSET_FILL = 32823.0;
    @Generated public static final double GL_SAMPLE_ALPHA_TO_COVERAGE = 32926.0;
    @Generated public static final double GL_SAMPLE_COVERAGE = 32928.0;
    @Generated public static final double GL_NO_ERROR = 0.0;
    @Generated public static final double GL_INVALID_ENUM = 1280.0;
    @Generated public static final double GL_INVALID_VALUE = 1281.0;
    @Generated public static final double GL_INVALID_OPERATION = 1282.0;
    @Generated public static final double GL_OUT_OF_MEMORY = 1285.0;
    @Generated public static final double GL_CW = 2304.0;
    @Generated public static final double GL_CCW = 2305.0;
    @Generated public static final double GL_LINE_WIDTH = 2849.0;
    @Generated public static final double GL_ALIASED_POINT_SIZE_RANGE = 33901.0;
    @Generated public static final double GL_ALIASED_LINE_WIDTH_RANGE = 33902.0;
    @Generated public static final double GL_CULL_FACE_MODE = 2885.0;
    @Generated public static final double GL_FRONT_FACE = 2886.0;
    @Generated public static final double GL_DEPTH_RANGE = 2928.0;
    @Generated public static final double GL_DEPTH_WRITEMASK = 2930.0;
    @Generated public static final double GL_DEPTH_CLEAR_VALUE = 2931.0;
    @Generated public static final double GL_DEPTH_FUNC = 2932.0;
    @Generated public static final double GL_STENCIL_CLEAR_VALUE = 2961.0;
    @Generated public static final double GL_STENCIL_FUNC = 2962.0;
    @Generated public static final double GL_STENCIL_FAIL = 2964.0;
    @Generated public static final double GL_STENCIL_PASS_DEPTH_FAIL = 2965.0;
    @Generated public static final double GL_STENCIL_PASS_DEPTH_PASS = 2966.0;
    @Generated public static final double GL_STENCIL_REF = 2967.0;
    @Generated public static final double GL_STENCIL_VALUE_MASK = 2963.0;
    @Generated public static final double GL_STENCIL_WRITEMASK = 2968.0;
    @Generated public static final double GL_STENCIL_BACK_FUNC = 34816.0;
    @Generated public static final double GL_STENCIL_BACK_FAIL = 34817.0;
    @Generated public static final double GL_STENCIL_BACK_PASS_DEPTH_FAIL = 34818.0;
    @Generated public static final double GL_STENCIL_BACK_PASS_DEPTH_PASS = 34819.0;
    @Generated public static final double GL_STENCIL_BACK_REF = 36003.0;
    @Generated public static final double GL_STENCIL_BACK_VALUE_MASK = 36004.0;
    @Generated public static final double GL_STENCIL_BACK_WRITEMASK = 36005.0;
    @Generated public static final double GL_VIEWPORT = 2978.0;
    @Generated public static final double GL_SCISSOR_BOX = 3088.0;
    @Generated public static final double GL_COLOR_CLEAR_VALUE = 3106.0;
    @Generated public static final double GL_COLOR_WRITEMASK = 3107.0;
    @Generated public static final double GL_UNPACK_ALIGNMENT = 3317.0;
    @Generated public static final double GL_PACK_ALIGNMENT = 3333.0;
    @Generated public static final double GL_MAX_TEXTURE_SIZE = 3379.0;
    @Generated public static final double GL_MAX_VIEWPORT_DIMS = 3386.0;
    @Generated public static final double GL_SUBPIXEL_BITS = 3408.0;
    @Generated public static final double GL_RED_BITS = 3410.0;
    @Generated public static final double GL_GREEN_BITS = 3411.0;
    @Generated public static final double GL_BLUE_BITS = 3412.0;
    @Generated public static final double GL_ALPHA_BITS = 3413.0;
    @Generated public static final double GL_DEPTH_BITS = 3414.0;
    @Generated public static final double GL_STENCIL_BITS = 3415.0;
    @Generated public static final double GL_POLYGON_OFFSET_UNITS = 10752.0;
    @Generated public static final double GL_POLYGON_OFFSET_FACTOR = 32824.0;
    @Generated public static final double GL_TEXTURE_BINDING_2D = 32873.0;
    @Generated public static final double GL_SAMPLE_BUFFERS = 32936.0;
    @Generated public static final double GL_SAMPLES = 32937.0;
    @Generated public static final double GL_SAMPLE_COVERAGE_VALUE = 32938.0;
    @Generated public static final double GL_SAMPLE_COVERAGE_INVERT = 32939.0;
    @Generated public static final double GL_NUM_COMPRESSED_TEXTURE_FORMATS = 34466.0;
    @Generated public static final double GL_COMPRESSED_TEXTURE_FORMATS = 34467.0;
    @Generated public static final double GL_DONT_CARE = 4352.0;
    @Generated public static final double GL_FASTEST = 4353.0;
    @Generated public static final double GL_NICEST = 4354.0;
    @Generated public static final double GL_GENERATE_MIPMAP_HINT = 33170.0;
    @Generated public static final double GL_BYTE = 5120.0;
    @Generated public static final double GL_UNSIGNED_BYTE = 5121.0;
    @Generated public static final double GL_SHORT = 5122.0;
    @Generated public static final double GL_UNSIGNED_SHORT = 5123.0;
    @Generated public static final double GL_INT = 5124.0;
    @Generated public static final double GL_UNSIGNED_INT = 5125.0;
    @Generated public static final double GL_FLOAT = 5126.0;
    @Generated public static final double GL_FIXED = 5132.0;
    @Generated public static final double GL_DEPTH_COMPONENT = 6402.0;
    @Generated public static final double GL_ALPHA = 6406.0;
    @Generated public static final double GL_RGB = 6407.0;
    @Generated public static final double GL_RGBA = 6408.0;
    @Generated public static final double GL_LUMINANCE = 6409.0;
    @Generated public static final double GL_LUMINANCE_ALPHA = 6410.0;
    @Generated public static final double GL_UNSIGNED_SHORT_4_4_4_4 = 32819.0;
    @Generated public static final double GL_UNSIGNED_SHORT_5_5_5_1 = 32820.0;
    @Generated public static final double GL_UNSIGNED_SHORT_5_6_5 = 33635.0;
    @Generated public static final double GL_FRAGMENT_SHADER = 35632.0;
    @Generated public static final double GL_VERTEX_SHADER = 35633.0;
    @Generated public static final double GL_MAX_VERTEX_ATTRIBS = 34921.0;
    @Generated public static final double GL_MAX_VERTEX_UNIFORM_VECTORS = 36347.0;
    @Generated public static final double GL_MAX_VARYING_VECTORS = 36348.0;
    @Generated public static final double GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 35661.0;
    @Generated public static final double GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 35660.0;
    @Generated public static final double GL_MAX_TEXTURE_IMAGE_UNITS = 34930.0;
    @Generated public static final double GL_MAX_FRAGMENT_UNIFORM_VECTORS = 36349.0;
    @Generated public static final double GL_SHADER_TYPE = 35663.0;
    @Generated public static final double GL_DELETE_STATUS = 35712.0;
    @Generated public static final double GL_LINK_STATUS = 35714.0;
    @Generated public static final double GL_VALIDATE_STATUS = 35715.0;
    @Generated public static final double GL_ATTACHED_SHADERS = 35717.0;
    @Generated public static final double GL_ACTIVE_UNIFORMS = 35718.0;
    @Generated public static final double GL_ACTIVE_UNIFORM_MAX_LENGTH = 35719.0;
    @Generated public static final double GL_ACTIVE_ATTRIBUTES = 35721.0;
    @Generated public static final double GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 35722.0;
    @Generated public static final double GL_SHADING_LANGUAGE_VERSION = 35724.0;
    @Generated public static final double GL_CURRENT_PROGRAM = 35725.0;
    @Generated public static final double GL_NEVER = 512.0;
    @Generated public static final double GL_LESS = 513.0;
    @Generated public static final double GL_EQUAL = 514.0;
    @Generated public static final double GL_LEQUAL = 515.0;
    @Generated public static final double GL_GREATER = 516.0;
    @Generated public static final double GL_NOTEQUAL = 517.0;
    @Generated public static final double GL_GEQUAL = 518.0;
    @Generated public static final double GL_ALWAYS = 519.0;
    @Generated public static final double GL_KEEP = 7680.0;
    @Generated public static final double GL_REPLACE = 7681.0;
    @Generated public static final double GL_INCR = 7682.0;
    @Generated public static final double GL_DECR = 7683.0;
    @Generated public static final double GL_INVERT = 5386.0;
    @Generated public static final double GL_INCR_WRAP = 34055.0;
    @Generated public static final double GL_DECR_WRAP = 34056.0;
    @Generated public static final double GL_VENDOR = 7936.0;
    @Generated public static final double GL_RENDERER = 7937.0;
    @Generated public static final double GL_VERSION = 7938.0;
    @Generated public static final double GL_EXTENSIONS = 7939.0;
    @Generated public static final double GL_NEAREST = 9728.0;
    @Generated public static final double GL_LINEAR = 9729.0;
    @Generated public static final double GL_NEAREST_MIPMAP_NEAREST = 9984.0;
    @Generated public static final double GL_LINEAR_MIPMAP_NEAREST = 9985.0;
    @Generated public static final double GL_NEAREST_MIPMAP_LINEAR = 9986.0;
    @Generated public static final double GL_LINEAR_MIPMAP_LINEAR = 9987.0;
    @Generated public static final double GL_TEXTURE_MAG_FILTER = 10240.0;
    @Generated public static final double GL_TEXTURE_MIN_FILTER = 10241.0;
    @Generated public static final double GL_TEXTURE_WRAP_S = 10242.0;
    @Generated public static final double GL_TEXTURE_WRAP_T = 10243.0;
    @Generated public static final double GL_TEXTURE = 5890.0;
    @Generated public static final double GL_TEXTURE_CUBE_MAP = 34067.0;
    @Generated public static final double GL_TEXTURE_BINDING_CUBE_MAP = 34068.0;
    @Generated public static final double GL_TEXTURE_CUBE_MAP_POSITIVE_X = 34069.0;
    @Generated public static final double GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 34070.0;
    @Generated public static final double GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 34071.0;
    @Generated public static final double GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 34072.0;
    @Generated public static final double GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 34073.0;
    @Generated public static final double GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 34074.0;
    @Generated public static final double GL_MAX_CUBE_MAP_TEXTURE_SIZE = 34076.0;
    @Generated public static final double GL_TEXTURE0 = 33984.0;
    @Generated public static final double GL_TEXTURE1 = 33985.0;
    @Generated public static final double GL_TEXTURE2 = 33986.0;
    @Generated public static final double GL_TEXTURE3 = 33987.0;
    @Generated public static final double GL_TEXTURE4 = 33988.0;
    @Generated public static final double GL_TEXTURE5 = 33989.0;
    @Generated public static final double GL_TEXTURE6 = 33990.0;
    @Generated public static final double GL_TEXTURE7 = 33991.0;
    @Generated public static final double GL_TEXTURE8 = 33992.0;
    @Generated public static final double GL_TEXTURE9 = 33993.0;
    @Generated public static final double GL_TEXTURE10 = 33994.0;
    @Generated public static final double GL_TEXTURE11 = 33995.0;
    @Generated public static final double GL_TEXTURE12 = 33996.0;
    @Generated public static final double GL_TEXTURE13 = 33997.0;
    @Generated public static final double GL_TEXTURE14 = 33998.0;
    @Generated public static final double GL_TEXTURE15 = 33999.0;
    @Generated public static final double GL_TEXTURE16 = 34000.0;
    @Generated public static final double GL_TEXTURE17 = 34001.0;
    @Generated public static final double GL_TEXTURE18 = 34002.0;
    @Generated public static final double GL_TEXTURE19 = 34003.0;
    @Generated public static final double GL_TEXTURE20 = 34004.0;
    @Generated public static final double GL_TEXTURE21 = 34005.0;
    @Generated public static final double GL_TEXTURE22 = 34006.0;
    @Generated public static final double GL_TEXTURE23 = 34007.0;
    @Generated public static final double GL_TEXTURE24 = 34008.0;
    @Generated public static final double GL_TEXTURE25 = 34009.0;
    @Generated public static final double GL_TEXTURE26 = 34010.0;
    @Generated public static final double GL_TEXTURE27 = 34011.0;
    @Generated public static final double GL_TEXTURE28 = 34012.0;
    @Generated public static final double GL_TEXTURE29 = 34013.0;
    @Generated public static final double GL_TEXTURE30 = 34014.0;
    @Generated public static final double GL_TEXTURE31 = 34015.0;
    @Generated public static final double GL_ACTIVE_TEXTURE = 34016.0;
    @Generated public static final double GL_REPEAT = 10497.0;
    @Generated public static final double GL_CLAMP_TO_EDGE = 33071.0;
    @Generated public static final double GL_MIRRORED_REPEAT = 33648.0;
    @Generated public static final double GL_FLOAT_VEC2 = 35664.0;
    @Generated public static final double GL_FLOAT_VEC3 = 35665.0;
    @Generated public static final double GL_FLOAT_VEC4 = 35666.0;
    @Generated public static final double GL_INT_VEC2 = 35667.0;
    @Generated public static final double GL_INT_VEC3 = 35668.0;
    @Generated public static final double GL_INT_VEC4 = 35669.0;
    @Generated public static final double GL_BOOL = 35670.0;
    @Generated public static final double GL_BOOL_VEC2 = 35671.0;
    @Generated public static final double GL_BOOL_VEC3 = 35672.0;
    @Generated public static final double GL_BOOL_VEC4 = 35673.0;
    @Generated public static final double GL_FLOAT_MAT2 = 35674.0;
    @Generated public static final double GL_FLOAT_MAT3 = 35675.0;
    @Generated public static final double GL_FLOAT_MAT4 = 35676.0;
    @Generated public static final double GL_SAMPLER_2D = 35678.0;
    @Generated public static final double GL_SAMPLER_CUBE = 35680.0;
    @Generated public static final double GL_VERTEX_ATTRIB_ARRAY_ENABLED = 34338.0;
    @Generated public static final double GL_VERTEX_ATTRIB_ARRAY_SIZE = 34339.0;
    @Generated public static final double GL_VERTEX_ATTRIB_ARRAY_STRIDE = 34340.0;
    @Generated public static final double GL_VERTEX_ATTRIB_ARRAY_TYPE = 34341.0;
    @Generated public static final double GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 34922.0;
    @Generated public static final double GL_VERTEX_ATTRIB_ARRAY_POINTER = 34373.0;
    @Generated public static final double GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 34975.0;
    @Generated public static final double GL_IMPLEMENTATION_COLOR_READ_TYPE = 35738.0;
    @Generated public static final double GL_IMPLEMENTATION_COLOR_READ_FORMAT = 35739.0;
    @Generated public static final double GL_COMPILE_STATUS = 35713.0;
    @Generated public static final double GL_INFO_LOG_LENGTH = 35716.0;
    @Generated public static final double GL_SHADER_SOURCE_LENGTH = 35720.0;
    @Generated public static final double GL_SHADER_COMPILER = 36346.0;
    @Generated public static final double GL_SHADER_BINARY_FORMATS = 36344.0;
    @Generated public static final double GL_NUM_SHADER_BINARY_FORMATS = 36345.0;
    @Generated public static final double GL_LOW_FLOAT = 36336.0;
    @Generated public static final double GL_MEDIUM_FLOAT = 36337.0;
    @Generated public static final double GL_HIGH_FLOAT = 36338.0;
    @Generated public static final double GL_LOW_INT = 36339.0;
    @Generated public static final double GL_MEDIUM_INT = 36340.0;
    @Generated public static final double GL_HIGH_INT = 36341.0;
    @Generated public static final double GL_FRAMEBUFFER = 36160.0;
    @Generated public static final double GL_RENDERBUFFER = 36161.0;
    @Generated public static final double GL_RGBA4 = 32854.0;
    @Generated public static final double GL_RGB5_A1 = 32855.0;
    @Generated public static final double GL_RGB565 = 36194.0;
    @Generated public static final double GL_DEPTH_COMPONENT16 = 33189.0;
    @Generated public static final double GL_STENCIL_INDEX8 = 36168.0;
    @Generated public static final double GL_RENDERBUFFER_WIDTH = 36162.0;
    @Generated public static final double GL_RENDERBUFFER_HEIGHT = 36163.0;
    @Generated public static final double GL_RENDERBUFFER_INTERNAL_FORMAT = 36164.0;
    @Generated public static final double GL_RENDERBUFFER_RED_SIZE = 36176.0;
    @Generated public static final double GL_RENDERBUFFER_GREEN_SIZE = 36177.0;
    @Generated public static final double GL_RENDERBUFFER_BLUE_SIZE = 36178.0;
    @Generated public static final double GL_RENDERBUFFER_ALPHA_SIZE = 36179.0;
    @Generated public static final double GL_RENDERBUFFER_DEPTH_SIZE = 36180.0;
    @Generated public static final double GL_RENDERBUFFER_STENCIL_SIZE = 36181.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 36048.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 36049.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 36050.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 36051.0;
    @Generated public static final double GL_COLOR_ATTACHMENT0 = 36064.0;
    @Generated public static final double GL_DEPTH_ATTACHMENT = 36096.0;
    @Generated public static final double GL_STENCIL_ATTACHMENT = 36128.0;
    @Generated public static final double GL_NONE = 0.0;
    @Generated public static final double GL_FRAMEBUFFER_COMPLETE = 36053.0;
    @Generated public static final double GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 36054.0;
    @Generated public static final double GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 36055.0;
    @Generated public static final double GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 36057.0;
    @Generated public static final double GL_FRAMEBUFFER_UNSUPPORTED = 36061.0;
    @Generated public static final double GL_FRAMEBUFFER_BINDING = 36006.0;
    @Generated public static final double GL_RENDERBUFFER_BINDING = 36007.0;
    @Generated public static final double GL_MAX_RENDERBUFFER_SIZE = 34024.0;
    @Generated public static final double GL_INVALID_FRAMEBUFFER_OPERATION = 1286.0;
    @Generated public static final double GL_VERSION_ES_CM_1_0 = 1.0;
    @Generated public static final double GL_VERSION_ES_CL_1_0 = 1.0;
    @Generated public static final double GL_VERSION_ES_CM_1_1 = 1.0;
    @Generated public static final double GL_VERSION_ES_CL_1_1 = 1.0;
    @Generated public static final double GL_OES_VERSION_1_0 = 1.0;
    @Generated public static final double GL_OES_VERSION_1_1 = 1.0;
    @Generated public static final double GL_OES_byte_coordinates = 1.0;
    @Generated public static final double GL_OES_compressed_paletted_texture = 1.0;
    @Generated public static final double GL_OES_draw_texture = 1.0;
    @Generated public static final double GL_OES_fixed_point = 1.0;
    @Generated public static final double GL_OES_matrix_get = 1.0;
    @Generated public static final double GL_OES_matrix_palette = 1.0;
    @Generated public static final double GL_OES_point_size_array = 1.0;
    @Generated public static final double GL_OES_point_sprite = 1.0;
    @Generated public static final double GL_OES_read_format = 1.0;
    @Generated public static final double GL_OES_single_precision = 1.0;
    @Generated public static final double GL_CLIP_PLANE0 = 12288.0;
    @Generated public static final double GL_CLIP_PLANE1 = 12289.0;
    @Generated public static final double GL_CLIP_PLANE2 = 12290.0;
    @Generated public static final double GL_CLIP_PLANE3 = 12291.0;
    @Generated public static final double GL_CLIP_PLANE4 = 12292.0;
    @Generated public static final double GL_CLIP_PLANE5 = 12293.0;
    @Generated public static final double GL_FOG = 2912.0;
    @Generated public static final double GL_LIGHTING = 2896.0;
    @Generated public static final double GL_ALPHA_TEST = 3008.0;
    @Generated public static final double GL_COLOR_LOGIC_OP = 3058.0;
    @Generated public static final double GL_POINT_SMOOTH = 2832.0;
    @Generated public static final double GL_LINE_SMOOTH = 2848.0;
    @Generated public static final double GL_COLOR_MATERIAL = 2903.0;
    @Generated public static final double GL_NORMALIZE = 2977.0;
    @Generated public static final double GL_RESCALE_NORMAL = 32826.0;
    @Generated public static final double GL_VERTEX_ARRAY = 32884.0;
    @Generated public static final double GL_NORMAL_ARRAY = 32885.0;
    @Generated public static final double GL_COLOR_ARRAY = 32886.0;
    @Generated public static final double GL_TEXTURE_COORD_ARRAY = 32888.0;
    @Generated public static final double GL_MULTISAMPLE = 32925.0;
    @Generated public static final double GL_SAMPLE_ALPHA_TO_ONE = 32927.0;
    @Generated public static final double GL_STACK_OVERFLOW = 1283.0;
    @Generated public static final double GL_STACK_UNDERFLOW = 1284.0;
    @Generated public static final double GL_EXP = 2048.0;
    @Generated public static final double GL_EXP2 = 2049.0;
    @Generated public static final double GL_FOG_DENSITY = 2914.0;
    @Generated public static final double GL_FOG_START = 2915.0;
    @Generated public static final double GL_FOG_END = 2916.0;
    @Generated public static final double GL_FOG_MODE = 2917.0;
    @Generated public static final double GL_FOG_COLOR = 2918.0;
    @Generated public static final double GL_CURRENT_COLOR = 2816.0;
    @Generated public static final double GL_CURRENT_NORMAL = 2818.0;
    @Generated public static final double GL_CURRENT_TEXTURE_COORDS = 2819.0;
    @Generated public static final double GL_POINT_SIZE = 2833.0;
    @Generated public static final double GL_POINT_SIZE_MIN = 33062.0;
    @Generated public static final double GL_POINT_SIZE_MAX = 33063.0;
    @Generated public static final double GL_POINT_FADE_THRESHOLD_SIZE = 33064.0;
    @Generated public static final double GL_POINT_DISTANCE_ATTENUATION = 33065.0;
    @Generated public static final double GL_SMOOTH_POINT_SIZE_RANGE = 2834.0;
    @Generated public static final double GL_SMOOTH_LINE_WIDTH_RANGE = 2850.0;
    @Generated public static final double GL_SHADE_MODEL = 2900.0;
    @Generated public static final double GL_MATRIX_MODE = 2976.0;
    @Generated public static final double GL_MODELVIEW_STACK_DEPTH = 2979.0;
    @Generated public static final double GL_PROJECTION_STACK_DEPTH = 2980.0;
    @Generated public static final double GL_TEXTURE_STACK_DEPTH = 2981.0;
    @Generated public static final double GL_MODELVIEW_MATRIX = 2982.0;
    @Generated public static final double GL_PROJECTION_MATRIX = 2983.0;
    @Generated public static final double GL_TEXTURE_MATRIX = 2984.0;
    @Generated public static final double GL_ALPHA_TEST_FUNC = 3009.0;
    @Generated public static final double GL_ALPHA_TEST_REF = 3010.0;
    @Generated public static final double GL_BLEND_DST = 3040.0;
    @Generated public static final double GL_BLEND_SRC = 3041.0;
    @Generated public static final double GL_LOGIC_OP_MODE = 3056.0;
    @Generated public static final double GL_MAX_LIGHTS = 3377.0;
    @Generated public static final double GL_MAX_CLIP_PLANES = 3378.0;
    @Generated public static final double GL_MAX_MODELVIEW_STACK_DEPTH = 3382.0;
    @Generated public static final double GL_MAX_PROJECTION_STACK_DEPTH = 3384.0;
    @Generated public static final double GL_MAX_TEXTURE_STACK_DEPTH = 3385.0;
    @Generated public static final double GL_MAX_TEXTURE_UNITS = 34018.0;
    @Generated public static final double GL_VERTEX_ARRAY_SIZE = 32890.0;
    @Generated public static final double GL_VERTEX_ARRAY_TYPE = 32891.0;
    @Generated public static final double GL_VERTEX_ARRAY_STRIDE = 32892.0;
    @Generated public static final double GL_NORMAL_ARRAY_TYPE = 32894.0;
    @Generated public static final double GL_NORMAL_ARRAY_STRIDE = 32895.0;
    @Generated public static final double GL_COLOR_ARRAY_SIZE = 32897.0;
    @Generated public static final double GL_COLOR_ARRAY_TYPE = 32898.0;
    @Generated public static final double GL_COLOR_ARRAY_STRIDE = 32899.0;
    @Generated public static final double GL_TEXTURE_COORD_ARRAY_SIZE = 32904.0;
    @Generated public static final double GL_TEXTURE_COORD_ARRAY_TYPE = 32905.0;
    @Generated public static final double GL_TEXTURE_COORD_ARRAY_STRIDE = 32906.0;
    @Generated public static final double GL_VERTEX_ARRAY_POINTER = 32910.0;
    @Generated public static final double GL_NORMAL_ARRAY_POINTER = 32911.0;
    @Generated public static final double GL_COLOR_ARRAY_POINTER = 32912.0;
    @Generated public static final double GL_TEXTURE_COORD_ARRAY_POINTER = 32914.0;
    @Generated public static final double GL_IMPLEMENTATION_COLOR_READ_TYPE_OES = 35738.0;
    @Generated public static final double GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES = 35739.0;
    @Generated public static final double GL_PERSPECTIVE_CORRECTION_HINT = 3152.0;
    @Generated public static final double GL_POINT_SMOOTH_HINT = 3153.0;
    @Generated public static final double GL_LINE_SMOOTH_HINT = 3154.0;
    @Generated public static final double GL_FOG_HINT = 3156.0;
    @Generated public static final double GL_LIGHT_MODEL_AMBIENT = 2899.0;
    @Generated public static final double GL_LIGHT_MODEL_TWO_SIDE = 2898.0;
    @Generated public static final double GL_AMBIENT = 4608.0;
    @Generated public static final double GL_DIFFUSE = 4609.0;
    @Generated public static final double GL_SPECULAR = 4610.0;
    @Generated public static final double GL_POSITION = 4611.0;
    @Generated public static final double GL_SPOT_DIRECTION = 4612.0;
    @Generated public static final double GL_SPOT_EXPONENT = 4613.0;
    @Generated public static final double GL_SPOT_CUTOFF = 4614.0;
    @Generated public static final double GL_CONSTANT_ATTENUATION = 4615.0;
    @Generated public static final double GL_LINEAR_ATTENUATION = 4616.0;
    @Generated public static final double GL_QUADRATIC_ATTENUATION = 4617.0;
    @Generated public static final double GL_CLEAR = 5376.0;
    @Generated public static final double GL_AND = 5377.0;
    @Generated public static final double GL_AND_REVERSE = 5378.0;
    @Generated public static final double GL_COPY = 5379.0;
    @Generated public static final double GL_AND_INVERTED = 5380.0;
    @Generated public static final double GL_NOOP = 5381.0;
    @Generated public static final double GL_XOR = 5382.0;
    @Generated public static final double GL_OR = 5383.0;
    @Generated public static final double GL_NOR = 5384.0;
    @Generated public static final double GL_EQUIV = 5385.0;
    @Generated public static final double GL_OR_REVERSE = 5387.0;
    @Generated public static final double GL_COPY_INVERTED = 5388.0;
    @Generated public static final double GL_OR_INVERTED = 5389.0;
    @Generated public static final double GL_NAND = 5390.0;
    @Generated public static final double GL_SET = 5391.0;
    @Generated public static final double GL_EMISSION = 5632.0;
    @Generated public static final double GL_SHININESS = 5633.0;
    @Generated public static final double GL_AMBIENT_AND_DIFFUSE = 5634.0;
    @Generated public static final double GL_MODELVIEW = 5888.0;
    @Generated public static final double GL_PROJECTION = 5889.0;
    @Generated public static final double GL_FLAT = 7424.0;
    @Generated public static final double GL_SMOOTH = 7425.0;
    @Generated public static final double GL_MODULATE = 8448.0;
    @Generated public static final double GL_DECAL = 8449.0;
    @Generated public static final double GL_ADD = 260.0;
    @Generated public static final double GL_TEXTURE_ENV_MODE = 8704.0;
    @Generated public static final double GL_TEXTURE_ENV_COLOR = 8705.0;
    @Generated public static final double GL_TEXTURE_ENV = 8960.0;
    @Generated public static final double GL_GENERATE_MIPMAP = 33169.0;
    @Generated public static final double GL_CLIENT_ACTIVE_TEXTURE = 34017.0;
    @Generated public static final double GL_PALETTE4_RGB8_OES = 35728.0;
    @Generated public static final double GL_PALETTE4_RGBA8_OES = 35729.0;
    @Generated public static final double GL_PALETTE4_R5_G6_B5_OES = 35730.0;
    @Generated public static final double GL_PALETTE4_RGBA4_OES = 35731.0;
    @Generated public static final double GL_PALETTE4_RGB5_A1_OES = 35732.0;
    @Generated public static final double GL_PALETTE8_RGB8_OES = 35733.0;
    @Generated public static final double GL_PALETTE8_RGBA8_OES = 35734.0;
    @Generated public static final double GL_PALETTE8_R5_G6_B5_OES = 35735.0;
    @Generated public static final double GL_PALETTE8_RGBA4_OES = 35736.0;
    @Generated public static final double GL_PALETTE8_RGB5_A1_OES = 35737.0;
    @Generated public static final double GL_LIGHT0 = 16384.0;
    @Generated public static final double GL_LIGHT1 = 16385.0;
    @Generated public static final double GL_LIGHT2 = 16386.0;
    @Generated public static final double GL_LIGHT3 = 16387.0;
    @Generated public static final double GL_LIGHT4 = 16388.0;
    @Generated public static final double GL_LIGHT5 = 16389.0;
    @Generated public static final double GL_LIGHT6 = 16390.0;
    @Generated public static final double GL_LIGHT7 = 16391.0;
    @Generated public static final double GL_VERTEX_ARRAY_BUFFER_BINDING = 34966.0;
    @Generated public static final double GL_NORMAL_ARRAY_BUFFER_BINDING = 34967.0;
    @Generated public static final double GL_COLOR_ARRAY_BUFFER_BINDING = 34968.0;
    @Generated public static final double GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING = 34970.0;
    @Generated public static final double GL_SUBTRACT = 34023.0;
    @Generated public static final double GL_COMBINE = 34160.0;
    @Generated public static final double GL_COMBINE_RGB = 34161.0;
    @Generated public static final double GL_COMBINE_ALPHA = 34162.0;
    @Generated public static final double GL_RGB_SCALE = 34163.0;
    @Generated public static final double GL_ADD_SIGNED = 34164.0;
    @Generated public static final double GL_INTERPOLATE = 34165.0;
    @Generated public static final double GL_CONSTANT = 34166.0;
    @Generated public static final double GL_PRIMARY_COLOR = 34167.0;
    @Generated public static final double GL_PREVIOUS = 34168.0;
    @Generated public static final double GL_OPERAND0_RGB = 34192.0;
    @Generated public static final double GL_OPERAND1_RGB = 34193.0;
    @Generated public static final double GL_OPERAND2_RGB = 34194.0;
    @Generated public static final double GL_OPERAND0_ALPHA = 34200.0;
    @Generated public static final double GL_OPERAND1_ALPHA = 34201.0;
    @Generated public static final double GL_OPERAND2_ALPHA = 34202.0;
    @Generated public static final double GL_ALPHA_SCALE = 3356.0;
    @Generated public static final double GL_SRC0_RGB = 34176.0;
    @Generated public static final double GL_SRC1_RGB = 34177.0;
    @Generated public static final double GL_SRC2_RGB = 34178.0;
    @Generated public static final double GL_SRC0_ALPHA = 34184.0;
    @Generated public static final double GL_SRC1_ALPHA = 34185.0;
    @Generated public static final double GL_SRC2_ALPHA = 34186.0;
    @Generated public static final double GL_DOT3_RGB = 34478.0;
    @Generated public static final double GL_DOT3_RGBA = 34479.0;
    @Generated public static final double GL_TEXTURE_CROP_RECT_OES = 35741.0;
    @Generated public static final double GL_MODELVIEW_MATRIX_FLOAT_AS_INT_BITS_OES = 35213.0;
    @Generated public static final double GL_PROJECTION_MATRIX_FLOAT_AS_INT_BITS_OES = 35214.0;
    @Generated public static final double GL_TEXTURE_MATRIX_FLOAT_AS_INT_BITS_OES = 35215.0;
    @Generated public static final double GL_MAX_VERTEX_UNITS_OES = 34468.0;
    @Generated public static final double GL_MAX_PALETTE_MATRICES_OES = 34882.0;
    @Generated public static final double GL_MATRIX_PALETTE_OES = 34880.0;
    @Generated public static final double GL_MATRIX_INDEX_ARRAY_OES = 34884.0;
    @Generated public static final double GL_WEIGHT_ARRAY_OES = 34477.0;
    @Generated public static final double GL_CURRENT_PALETTE_MATRIX_OES = 34883.0;
    @Generated public static final double GL_MATRIX_INDEX_ARRAY_SIZE_OES = 34886.0;
    @Generated public static final double GL_MATRIX_INDEX_ARRAY_TYPE_OES = 34887.0;
    @Generated public static final double GL_MATRIX_INDEX_ARRAY_STRIDE_OES = 34888.0;
    @Generated public static final double GL_MATRIX_INDEX_ARRAY_POINTER_OES = 34889.0;
    @Generated public static final double GL_MATRIX_INDEX_ARRAY_BUFFER_BINDING_OES = 35742.0;
    @Generated public static final double GL_WEIGHT_ARRAY_SIZE_OES = 34475.0;
    @Generated public static final double GL_WEIGHT_ARRAY_TYPE_OES = 34473.0;
    @Generated public static final double GL_WEIGHT_ARRAY_STRIDE_OES = 34474.0;
    @Generated public static final double GL_WEIGHT_ARRAY_POINTER_OES = 34476.0;
    @Generated public static final double GL_WEIGHT_ARRAY_BUFFER_BINDING_OES = 34974.0;
    @Generated public static final double GL_POINT_SIZE_ARRAY_OES = 35740.0;
    @Generated public static final double GL_POINT_SIZE_ARRAY_TYPE_OES = 35210.0;
    @Generated public static final double GL_POINT_SIZE_ARRAY_STRIDE_OES = 35211.0;
    @Generated public static final double GL_POINT_SIZE_ARRAY_POINTER_OES = 35212.0;
    @Generated public static final double GL_POINT_SIZE_ARRAY_BUFFER_BINDING_OES = 35743.0;
    @Generated public static final double GL_POINT_SPRITE_OES = 34913.0;
    @Generated public static final double GL_COORD_REPLACE_OES = 34914.0;
    @Generated public static final double GL_APPLE_copy_texture_levels = 1.0;
    @Generated public static final double GL_APPLE_framebuffer_multisample = 1.0;
    @Generated public static final double GL_APPLE_texture_2D_limited_npot = 1.0;
    @Generated public static final double GL_APPLE_texture_format_BGRA8888 = 1.0;
    @Generated public static final double GL_APPLE_texture_max_level = 1.0;
    @Generated public static final double GL_EXT_blend_minmax = 1.0;
    @Generated public static final double GL_EXT_debug_label = 1.0;
    @Generated public static final double GL_EXT_debug_marker = 1.0;
    @Generated public static final double GL_EXT_discard_framebuffer = 1.0;
    @Generated public static final double GL_EXT_map_buffer_range = 1.0;
    @Generated public static final double GL_EXT_read_format_bgra = 1.0;
    @Generated public static final double GL_EXT_texture_filter_anisotropic = 1.0;
    @Generated public static final double GL_EXT_texture_lod_bias = 1.0;
    @Generated public static final double GL_EXT_texture_storage = 1.0;
    @Generated public static final double GL_IMG_read_format = 1.0;
    @Generated public static final double GL_IMG_texture_compression_pvrtc = 1.0;
    @Generated public static final double GL_OES_blend_equation_separate = 1.0;
    @Generated public static final double GL_OES_blend_func_separate = 1.0;
    @Generated public static final double GL_OES_blend_subtract = 1.0;
    @Generated public static final double GL_OES_depth24 = 1.0;
    @Generated public static final double GL_OES_element_index_uint = 1.0;
    @Generated public static final double GL_OES_fbo_render_mipmap = 1.0;
    @Generated public static final double GL_OES_framebuffer_object = 1.0;
    @Generated public static final double GL_OES_mapbuffer = 1.0;
    @Generated public static final double GL_OES_packed_depth_stencil = 1.0;
    @Generated public static final double GL_OES_rgb8_rgba8 = 1.0;
    @Generated public static final double GL_OES_stencil_wrap = 1.0;
    @Generated public static final double GL_OES_stencil8 = 1.0;
    @Generated public static final double GL_OES_texture_mirrored_repeat = 1.0;
    @Generated public static final double GL_OES_vertex_array_object = 1.0;
    @Generated public static final double GL_RENDERBUFFER_SAMPLES_APPLE = 36011.0;
    @Generated public static final double GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_APPLE = 36182.0;
    @Generated public static final double GL_MAX_SAMPLES_APPLE = 36183.0;
    @Generated public static final double GL_READ_FRAMEBUFFER_APPLE = 36008.0;
    @Generated public static final double GL_DRAW_FRAMEBUFFER_APPLE = 36009.0;
    @Generated public static final double GL_DRAW_FRAMEBUFFER_BINDING_APPLE = 36006.0;
    @Generated public static final double GL_READ_FRAMEBUFFER_BINDING_APPLE = 36010.0;
    @Generated public static final double GL_BGRA_EXT = 32993.0;
    @Generated public static final double GL_BGRA = 32993.0;
    @Generated public static final double GL_TEXTURE_MAX_LEVEL_APPLE = 33085.0;
    @Generated public static final double GL_MIN_EXT = 32775.0;
    @Generated public static final double GL_MAX_EXT = 32776.0;
    @Generated public static final double GL_BUFFER_OBJECT_EXT = 37201.0;
    @Generated public static final double GL_VERTEX_ARRAY_OBJECT_EXT = 37204.0;
    @Generated public static final double GL_COLOR_EXT = 6144.0;
    @Generated public static final double GL_DEPTH_EXT = 6145.0;
    @Generated public static final double GL_STENCIL_EXT = 6146.0;
    @Generated public static final double GL_MAP_READ_BIT_EXT = 1.0;
    @Generated public static final double GL_MAP_WRITE_BIT_EXT = 2.0;
    @Generated public static final double GL_MAP_INVALIDATE_RANGE_BIT_EXT = 4.0;
    @Generated public static final double GL_MAP_INVALIDATE_BUFFER_BIT_EXT = 8.0;
    @Generated public static final double GL_MAP_FLUSH_EXPLICIT_BIT_EXT = 16.0;
    @Generated public static final double GL_MAP_UNSYNCHRONIZED_BIT_EXT = 32.0;
    @Generated public static final double GL_UNSIGNED_SHORT_4_4_4_4_REV_EXT = 33637.0;
    @Generated public static final double GL_UNSIGNED_SHORT_1_5_5_5_REV_EXT = 33638.0;
    @Generated public static final double GL_UNSIGNED_SHORT_1_5_5_5_REV = 33638.0;
    @Generated public static final double GL_UNSIGNED_SHORT_4_4_4_4_REV = 33637.0;
    @Generated public static final double GL_TEXTURE_MAX_ANISOTROPY_EXT = 34046.0;
    @Generated public static final double GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT = 34047.0;
    @Generated public static final double GL_MAX_TEXTURE_LOD_BIAS_EXT = 34045.0;
    @Generated public static final double GL_TEXTURE_FILTER_CONTROL_EXT = 34048.0;
    @Generated public static final double GL_TEXTURE_LOD_BIAS_EXT = 34049.0;
    @Generated public static final double GL_TEXTURE_IMMUTABLE_FORMAT_EXT = 37167.0;
    @Generated public static final double GL_ALPHA8_EXT = 32828.0;
    @Generated public static final double GL_LUMINANCE8_EXT = 32832.0;
    @Generated public static final double GL_LUMINANCE8_ALPHA8_EXT = 32837.0;
    @Generated public static final double GL_BGRA8_EXT = 37793.0;
    @Generated public static final double GL_BGRA_IMG = 32993.0;
    @Generated public static final double GL_UNSIGNED_SHORT_4_4_4_4_REV_IMG = 33637.0;
    @Generated public static final double GL_COMPRESSED_RGB_PVRTC_4BPPV1_IMG = 35840.0;
    @Generated public static final double GL_COMPRESSED_RGB_PVRTC_2BPPV1_IMG = 35841.0;
    @Generated public static final double GL_COMPRESSED_RGBA_PVRTC_4BPPV1_IMG = 35842.0;
    @Generated public static final double GL_COMPRESSED_RGBA_PVRTC_2BPPV1_IMG = 35843.0;
    @Generated public static final double GL_BLEND_EQUATION_RGB_OES = 32777.0;
    @Generated public static final double GL_BLEND_EQUATION_ALPHA_OES = 34877.0;
    @Generated public static final double GL_BLEND_DST_RGB_OES = 32968.0;
    @Generated public static final double GL_BLEND_SRC_RGB_OES = 32969.0;
    @Generated public static final double GL_BLEND_DST_ALPHA_OES = 32970.0;
    @Generated public static final double GL_BLEND_SRC_ALPHA_OES = 32971.0;
    @Generated public static final double GL_BLEND_EQUATION_OES = 32777.0;
    @Generated public static final double GL_FUNC_ADD_OES = 32774.0;
    @Generated public static final double GL_FUNC_SUBTRACT_OES = 32778.0;
    @Generated public static final double GL_FUNC_REVERSE_SUBTRACT_OES = 32779.0;
    @Generated public static final double GL_DEPTH_COMPONENT24_OES = 33190.0;
    @Generated public static final double GL_UNSIGNED_INT_OES = 5125.0;
    @Generated public static final double GL_FRAMEBUFFER_OES = 36160.0;
    @Generated public static final double GL_RENDERBUFFER_OES = 36161.0;
    @Generated public static final double GL_RGBA4_OES = 32854.0;
    @Generated public static final double GL_RGB5_A1_OES = 32855.0;
    @Generated public static final double GL_RGB565_OES = 36194.0;
    @Generated public static final double GL_DEPTH_COMPONENT16_OES = 33189.0;
    @Generated public static final double GL_RENDERBUFFER_WIDTH_OES = 36162.0;
    @Generated public static final double GL_RENDERBUFFER_HEIGHT_OES = 36163.0;
    @Generated public static final double GL_RENDERBUFFER_INTERNAL_FORMAT_OES = 36164.0;
    @Generated public static final double GL_RENDERBUFFER_RED_SIZE_OES = 36176.0;
    @Generated public static final double GL_RENDERBUFFER_GREEN_SIZE_OES = 36177.0;
    @Generated public static final double GL_RENDERBUFFER_BLUE_SIZE_OES = 36178.0;
    @Generated public static final double GL_RENDERBUFFER_ALPHA_SIZE_OES = 36179.0;
    @Generated public static final double GL_RENDERBUFFER_DEPTH_SIZE_OES = 36180.0;
    @Generated public static final double GL_RENDERBUFFER_STENCIL_SIZE_OES = 36181.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_OES = 36048.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_OES = 36049.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_OES = 36050.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_OES = 36051.0;
    @Generated public static final double GL_COLOR_ATTACHMENT0_OES = 36064.0;
    @Generated public static final double GL_DEPTH_ATTACHMENT_OES = 36096.0;
    @Generated public static final double GL_STENCIL_ATTACHMENT_OES = 36128.0;
    @Generated public static final double GL_FRAMEBUFFER_COMPLETE_OES = 36053.0;
    @Generated public static final double GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_OES = 36054.0;
    @Generated public static final double GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_OES = 36055.0;
    @Generated public static final double GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_OES = 36057.0;
    @Generated public static final double GL_FRAMEBUFFER_INCOMPLETE_FORMATS_OES = 36058.0;
    @Generated public static final double GL_FRAMEBUFFER_UNSUPPORTED_OES = 36061.0;
    @Generated public static final double GL_FRAMEBUFFER_BINDING_OES = 36006.0;
    @Generated public static final double GL_RENDERBUFFER_BINDING_OES = 36007.0;
    @Generated public static final double GL_MAX_RENDERBUFFER_SIZE_OES = 34024.0;
    @Generated public static final double GL_INVALID_FRAMEBUFFER_OPERATION_OES = 1286.0;
    @Generated public static final double GL_WRITE_ONLY_OES = 35001.0;
    @Generated public static final double GL_BUFFER_ACCESS_OES = 35003.0;
    @Generated public static final double GL_BUFFER_MAPPED_OES = 35004.0;
    @Generated public static final double GL_BUFFER_MAP_POINTER_OES = 35005.0;
    @Generated public static final double GL_DEPTH_STENCIL_OES = 34041.0;
    @Generated public static final double GL_UNSIGNED_INT_24_8_OES = 34042.0;
    @Generated public static final double GL_DEPTH24_STENCIL8_OES = 35056.0;
    @Generated public static final double GL_RGB8_OES = 32849.0;
    @Generated public static final double GL_RGBA8_OES = 32856.0;
    @Generated public static final double GL_INCR_WRAP_OES = 34055.0;
    @Generated public static final double GL_DECR_WRAP_OES = 34056.0;
    @Generated public static final double GL_STENCIL_INDEX8_OES = 36168.0;
    @Generated public static final double GL_MIRRORED_REPEAT_OES = 33648.0;
    @Generated public static final double GL_VERTEX_ARRAY_BINDING_OES = 34229.0;
    @Generated public static final double GL_APPLE_clip_distance = 1.0;
    @Generated public static final double GL_APPLE_color_buffer_packed_float = 1.0;
    @Generated public static final double GL_APPLE_rgb_422 = 1.0;
    @Generated public static final double GL_APPLE_sync = 1.0;
    @Generated public static final double GL_APPLE_texture_packed_float = 1.0;
    @Generated public static final double GL_EXT_color_buffer_half_float = 1.0;
    @Generated public static final double GL_EXT_draw_instanced = 1.0;
    @Generated public static final double GL_EXT_instanced_arrays = 1.0;
    @Generated public static final double GL_EXT_occlusion_query_boolean = 1.0;
    @Generated public static final double GL_EXT_pvrtc_sRGB = 1.0;
    @Generated public static final double GL_EXT_separate_shader_objects = 1.0;
    @Generated public static final double GL_EXT_shader_framebuffer_fetch = 1.0;
    @Generated public static final double GL_EXT_shader_texture_lod = 1.0;
    @Generated public static final double GL_EXT_shadow_samplers = 1.0;
    @Generated public static final double GL_EXT_sRGB = 1.0;
    @Generated public static final double GL_EXT_texture_rg = 1.0;
    @Generated public static final double GL_OES_depth_texture = 1.0;
    @Generated public static final double GL_OES_standard_derivatives = 1.0;
    @Generated public static final double GL_OES_texture_float = 1.0;
    @Generated public static final double GL_OES_texture_half_float = 1.0;
    @Generated public static final double GL_OES_texture_half_float_linear = 1.0;
    @Generated public static final double GL_R11F_G11F_B10F_APPLE = 35898.0;
    @Generated public static final double GL_RGB9_E5_APPLE = 35901.0;
    @Generated public static final double GL_CLIP_DISTANCE0_APPLE = 12288.0;
    @Generated public static final double GL_CLIP_DISTANCE1_APPLE = 12289.0;
    @Generated public static final double GL_CLIP_DISTANCE2_APPLE = 12290.0;
    @Generated public static final double GL_CLIP_DISTANCE3_APPLE = 12291.0;
    @Generated public static final double GL_CLIP_DISTANCE4_APPLE = 12292.0;
    @Generated public static final double GL_CLIP_DISTANCE5_APPLE = 12293.0;
    @Generated public static final double GL_CLIP_DISTANCE6_APPLE = 12294.0;
    @Generated public static final double GL_CLIP_DISTANCE7_APPLE = 12295.0;
    @Generated public static final double GL_MAX_CLIP_DISTANCES_APPLE = 3378.0;
    @Generated public static final double GL_UNSIGNED_INT_10F_11F_11F_REV_APPLE = 35899.0;
    @Generated public static final double GL_UNSIGNED_INT_5_9_9_9_REV_APPLE = 35902.0;
    @Generated public static final double GL_RGB_422_APPLE = 35359.0;
    @Generated public static final double GL_UNSIGNED_SHORT_8_8_APPLE = 34234.0;
    @Generated public static final double GL_UNSIGNED_SHORT_8_8_REV_APPLE = 34235.0;
    @Generated public static final double GL_MAX_SERVER_WAIT_TIMEOUT_APPLE = 37137.0;
    @Generated public static final double GL_OBJECT_TYPE_APPLE = 37138.0;
    @Generated public static final double GL_SYNC_CONDITION_APPLE = 37139.0;
    @Generated public static final double GL_SYNC_STATUS_APPLE = 37140.0;
    @Generated public static final double GL_SYNC_FLAGS_APPLE = 37141.0;
    @Generated public static final double GL_SYNC_FENCE_APPLE = 37142.0;
    @Generated public static final double GL_SYNC_GPU_COMMANDS_COMPLETE_APPLE = 37143.0;
    @Generated public static final double GL_UNSIGNALED_APPLE = 37144.0;
    @Generated public static final double GL_SIGNALED_APPLE = 37145.0;
    @Generated public static final double GL_ALREADY_SIGNALED_APPLE = 37146.0;
    @Generated public static final double GL_TIMEOUT_EXPIRED_APPLE = 37147.0;
    @Generated public static final double GL_CONDITION_SATISFIED_APPLE = 37148.0;
    @Generated public static final double GL_WAIT_FAILED_APPLE = 37149.0;
    @Generated public static final double GL_SYNC_FLUSH_COMMANDS_BIT_APPLE = 1.0;
    @Generated public static final double GL_SYNC_OBJECT_APPLE = 35411.0;
    @Generated public static final double GL_RGBA16F_EXT = 34842.0;
    @Generated public static final double GL_RGB16F_EXT = 34843.0;
    @Generated public static final double GL_RG16F_EXT = 33327.0;
    @Generated public static final double GL_R16F_EXT = 33325.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = 33297.0;
    @Generated public static final double GL_UNSIGNED_NORMALIZED_EXT = 35863.0;
    @Generated public static final double GL_SHADER_OBJECT_EXT = 35656.0;
    @Generated public static final double GL_PROGRAM_OBJECT_EXT = 35648.0;
    @Generated public static final double GL_QUERY_OBJECT_EXT = 37203.0;
    @Generated public static final double GL_PROGRAM_PIPELINE_OBJECT_EXT = 35407.0;
    @Generated public static final double GL_VERTEX_ATTRIB_ARRAY_DIVISOR_EXT = 35070.0;
    @Generated public static final double GL_ANY_SAMPLES_PASSED_EXT = 35887.0;
    @Generated public static final double GL_ANY_SAMPLES_PASSED_CONSERVATIVE_EXT = 36202.0;
    @Generated public static final double GL_CURRENT_QUERY_EXT = 34917.0;
    @Generated public static final double GL_QUERY_RESULT_EXT = 34918.0;
    @Generated public static final double GL_QUERY_RESULT_AVAILABLE_EXT = 34919.0;
    @Generated public static final double GL_COMPRESSED_SRGB_PVRTC_2BPPV1_EXT = 35412.0;
    @Generated public static final double GL_COMPRESSED_SRGB_PVRTC_4BPPV1_EXT = 35413.0;
    @Generated public static final double GL_COMPRESSED_SRGB_ALPHA_PVRTC_2BPPV1_EXT = 35414.0;
    @Generated public static final double GL_COMPRESSED_SRGB_ALPHA_PVRTC_4BPPV1_EXT = 35415.0;
    @Generated public static final double GL_VERTEX_SHADER_BIT_EXT = 1.0;
    @Generated public static final double GL_FRAGMENT_SHADER_BIT_EXT = 2.0;
    @Generated public static final double GL_PROGRAM_SEPARABLE_EXT = 33368.0;
    @Generated public static final double GL_ACTIVE_PROGRAM_EXT = 33369.0;
    @Generated public static final double GL_PROGRAM_PIPELINE_BINDING_EXT = 33370.0;
    @Generated public static final double GL_FRAGMENT_SHADER_DISCARDS_SAMPLES_EXT = 35410.0;
    @Generated public static final double GL_TEXTURE_COMPARE_MODE_EXT = 34892.0;
    @Generated public static final double GL_TEXTURE_COMPARE_FUNC_EXT = 34893.0;
    @Generated public static final double GL_COMPARE_REF_TO_TEXTURE_EXT = 34894.0;
    @Generated public static final double GL_SAMPLER_2D_SHADOW_EXT = 35682.0;
    @Generated public static final double GL_SRGB_EXT = 35904.0;
    @Generated public static final double GL_SRGB_ALPHA_EXT = 35906.0;
    @Generated public static final double GL_SRGB8_ALPHA8_EXT = 35907.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT = 33296.0;
    @Generated public static final double GL_RED_EXT = 6403.0;
    @Generated public static final double GL_RG_EXT = 33319.0;
    @Generated public static final double GL_R8_EXT = 33321.0;
    @Generated public static final double GL_RG8_EXT = 33323.0;
    @Generated public static final double GL_RGBA32F_EXT = 34836.0;
    @Generated public static final double GL_RGB32F_EXT = 34837.0;
    @Generated public static final double GL_RG32F_EXT = 33328.0;
    @Generated public static final double GL_R32F_EXT = 33326.0;
    @Generated public static final double GL_ALPHA32F_EXT = 34838.0;
    @Generated public static final double GL_LUMINANCE32F_EXT = 34840.0;
    @Generated public static final double GL_LUMINANCE_ALPHA32F_EXT = 34841.0;
    @Generated public static final double GL_ALPHA16F_EXT = 34844.0;
    @Generated public static final double GL_LUMINANCE16F_EXT = 34846.0;
    @Generated public static final double GL_LUMINANCE_ALPHA16F_EXT = 34847.0;
    @Generated public static final double GL_DEPTH_COMPONENT32_OES = 33191.0;
    @Generated public static final double GL_RGB_RAW_422_APPLE = 35409.0;
    @Generated public static final double GL_FRAGMENT_SHADER_DERIVATIVE_HINT_OES = 35723.0;
    @Generated public static final double GL_HALF_FLOAT_OES = 36193.0;
    @Generated public static final double GL_ES_VERSION_3_0 = 1.0;
    @Generated public static final double GL_READ_BUFFER = 3074.0;
    @Generated public static final double GL_UNPACK_ROW_LENGTH = 3314.0;
    @Generated public static final double GL_UNPACK_SKIP_ROWS = 3315.0;
    @Generated public static final double GL_UNPACK_SKIP_PIXELS = 3316.0;
    @Generated public static final double GL_PACK_ROW_LENGTH = 3330.0;
    @Generated public static final double GL_PACK_SKIP_ROWS = 3331.0;
    @Generated public static final double GL_PACK_SKIP_PIXELS = 3332.0;
    @Generated public static final double GL_COLOR = 6144.0;
    @Generated public static final double GL_DEPTH = 6145.0;
    @Generated public static final double GL_STENCIL = 6146.0;
    @Generated public static final double GL_RED = 6403.0;
    @Generated public static final double GL_RGB8 = 32849.0;
    @Generated public static final double GL_RGBA8 = 32856.0;
    @Generated public static final double GL_RGB10_A2 = 32857.0;
    @Generated public static final double GL_TEXTURE_BINDING_3D = 32874.0;
    @Generated public static final double GL_UNPACK_SKIP_IMAGES = 32877.0;
    @Generated public static final double GL_UNPACK_IMAGE_HEIGHT = 32878.0;
    @Generated public static final double GL_TEXTURE_3D = 32879.0;
    @Generated public static final double GL_TEXTURE_WRAP_R = 32882.0;
    @Generated public static final double GL_MAX_3D_TEXTURE_SIZE = 32883.0;
    @Generated public static final double GL_UNSIGNED_INT_2_10_10_10_REV = 33640.0;
    @Generated public static final double GL_MAX_ELEMENTS_VERTICES = 33000.0;
    @Generated public static final double GL_MAX_ELEMENTS_INDICES = 33001.0;
    @Generated public static final double GL_TEXTURE_MIN_LOD = 33082.0;
    @Generated public static final double GL_TEXTURE_MAX_LOD = 33083.0;
    @Generated public static final double GL_TEXTURE_BASE_LEVEL = 33084.0;
    @Generated public static final double GL_TEXTURE_MAX_LEVEL = 33085.0;
    @Generated public static final double GL_MIN = 32775.0;
    @Generated public static final double GL_MAX = 32776.0;
    @Generated public static final double GL_DEPTH_COMPONENT24 = 33190.0;
    @Generated public static final double GL_MAX_TEXTURE_LOD_BIAS = 34045.0;
    @Generated public static final double GL_TEXTURE_COMPARE_MODE = 34892.0;
    @Generated public static final double GL_TEXTURE_COMPARE_FUNC = 34893.0;
    @Generated public static final double GL_CURRENT_QUERY = 34917.0;
    @Generated public static final double GL_QUERY_RESULT = 34918.0;
    @Generated public static final double GL_QUERY_RESULT_AVAILABLE = 34919.0;
    @Generated public static final double GL_BUFFER_MAPPED = 35004.0;
    @Generated public static final double GL_BUFFER_MAP_POINTER = 35005.0;
    @Generated public static final double GL_STREAM_READ = 35041.0;
    @Generated public static final double GL_STREAM_COPY = 35042.0;
    @Generated public static final double GL_STATIC_READ = 35045.0;
    @Generated public static final double GL_STATIC_COPY = 35046.0;
    @Generated public static final double GL_DYNAMIC_READ = 35049.0;
    @Generated public static final double GL_DYNAMIC_COPY = 35050.0;
    @Generated public static final double GL_MAX_DRAW_BUFFERS = 34852.0;
    @Generated public static final double GL_DRAW_BUFFER0 = 34853.0;
    @Generated public static final double GL_DRAW_BUFFER1 = 34854.0;
    @Generated public static final double GL_DRAW_BUFFER2 = 34855.0;
    @Generated public static final double GL_DRAW_BUFFER3 = 34856.0;
    @Generated public static final double GL_DRAW_BUFFER4 = 34857.0;
    @Generated public static final double GL_DRAW_BUFFER5 = 34858.0;
    @Generated public static final double GL_DRAW_BUFFER6 = 34859.0;
    @Generated public static final double GL_DRAW_BUFFER7 = 34860.0;
    @Generated public static final double GL_DRAW_BUFFER8 = 34861.0;
    @Generated public static final double GL_DRAW_BUFFER9 = 34862.0;
    @Generated public static final double GL_DRAW_BUFFER10 = 34863.0;
    @Generated public static final double GL_DRAW_BUFFER11 = 34864.0;
    @Generated public static final double GL_DRAW_BUFFER12 = 34865.0;
    @Generated public static final double GL_DRAW_BUFFER13 = 34866.0;
    @Generated public static final double GL_DRAW_BUFFER14 = 34867.0;
    @Generated public static final double GL_DRAW_BUFFER15 = 34868.0;
    @Generated public static final double GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 35657.0;
    @Generated public static final double GL_MAX_VERTEX_UNIFORM_COMPONENTS = 35658.0;
    @Generated public static final double GL_SAMPLER_3D = 35679.0;
    @Generated public static final double GL_SAMPLER_2D_SHADOW = 35682.0;
    @Generated public static final double GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 35723.0;
    @Generated public static final double GL_PIXEL_PACK_BUFFER = 35051.0;
    @Generated public static final double GL_PIXEL_UNPACK_BUFFER = 35052.0;
    @Generated public static final double GL_PIXEL_PACK_BUFFER_BINDING = 35053.0;
    @Generated public static final double GL_PIXEL_UNPACK_BUFFER_BINDING = 35055.0;
    @Generated public static final double GL_FLOAT_MAT2x3 = 35685.0;
    @Generated public static final double GL_FLOAT_MAT2x4 = 35686.0;
    @Generated public static final double GL_FLOAT_MAT3x2 = 35687.0;
    @Generated public static final double GL_FLOAT_MAT3x4 = 35688.0;
    @Generated public static final double GL_FLOAT_MAT4x2 = 35689.0;
    @Generated public static final double GL_FLOAT_MAT4x3 = 35690.0;
    @Generated public static final double GL_SRGB = 35904.0;
    @Generated public static final double GL_SRGB8 = 35905.0;
    @Generated public static final double GL_SRGB8_ALPHA8 = 35907.0;
    @Generated public static final double GL_COMPARE_REF_TO_TEXTURE = 34894.0;
    @Generated public static final double GL_MAJOR_VERSION = 33307.0;
    @Generated public static final double GL_MINOR_VERSION = 33308.0;
    @Generated public static final double GL_NUM_EXTENSIONS = 33309.0;
    @Generated public static final double GL_RGBA32F = 34836.0;
    @Generated public static final double GL_RGB32F = 34837.0;
    @Generated public static final double GL_RGBA16F = 34842.0;
    @Generated public static final double GL_RGB16F = 34843.0;
    @Generated public static final double GL_VERTEX_ATTRIB_ARRAY_INTEGER = 35069.0;
    @Generated public static final double GL_MAX_ARRAY_TEXTURE_LAYERS = 35071.0;
    @Generated public static final double GL_MIN_PROGRAM_TEXEL_OFFSET = 35076.0;
    @Generated public static final double GL_MAX_PROGRAM_TEXEL_OFFSET = 35077.0;
    @Generated public static final double GL_MAX_VARYING_COMPONENTS = 35659.0;
    @Generated public static final double GL_TEXTURE_2D_ARRAY = 35866.0;
    @Generated public static final double GL_TEXTURE_BINDING_2D_ARRAY = 35869.0;
    @Generated public static final double GL_R11F_G11F_B10F = 35898.0;
    @Generated public static final double GL_UNSIGNED_INT_10F_11F_11F_REV = 35899.0;
    @Generated public static final double GL_RGB9_E5 = 35901.0;
    @Generated public static final double GL_UNSIGNED_INT_5_9_9_9_REV = 35902.0;
    @Generated public static final double GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 35958.0;
    @Generated public static final double GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 35967.0;
    @Generated public static final double GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 35968.0;
    @Generated public static final double GL_TRANSFORM_FEEDBACK_VARYINGS = 35971.0;
    @Generated public static final double GL_TRANSFORM_FEEDBACK_BUFFER_START = 35972.0;
    @Generated public static final double GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 35973.0;
    @Generated public static final double GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 35976.0;
    @Generated public static final double GL_RASTERIZER_DISCARD = 35977.0;
    @Generated public static final double GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 35978.0;
    @Generated public static final double GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 35979.0;
    @Generated public static final double GL_INTERLEAVED_ATTRIBS = 35980.0;
    @Generated public static final double GL_SEPARATE_ATTRIBS = 35981.0;
    @Generated public static final double GL_TRANSFORM_FEEDBACK_BUFFER = 35982.0;
    @Generated public static final double GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 35983.0;
    @Generated public static final double GL_RGBA32UI = 36208.0;
    @Generated public static final double GL_RGB32UI = 36209.0;
    @Generated public static final double GL_RGBA16UI = 36214.0;
    @Generated public static final double GL_RGB16UI = 36215.0;
    @Generated public static final double GL_RGBA8UI = 36220.0;
    @Generated public static final double GL_RGB8UI = 36221.0;
    @Generated public static final double GL_RGBA32I = 36226.0;
    @Generated public static final double GL_RGB32I = 36227.0;
    @Generated public static final double GL_RGBA16I = 36232.0;
    @Generated public static final double GL_RGB16I = 36233.0;
    @Generated public static final double GL_RGBA8I = 36238.0;
    @Generated public static final double GL_RGB8I = 36239.0;
    @Generated public static final double GL_RED_INTEGER = 36244.0;
    @Generated public static final double GL_RGB_INTEGER = 36248.0;
    @Generated public static final double GL_RGBA_INTEGER = 36249.0;
    @Generated public static final double GL_SAMPLER_2D_ARRAY = 36289.0;
    @Generated public static final double GL_SAMPLER_2D_ARRAY_SHADOW = 36292.0;
    @Generated public static final double GL_SAMPLER_CUBE_SHADOW = 36293.0;
    @Generated public static final double GL_UNSIGNED_INT_VEC2 = 36294.0;
    @Generated public static final double GL_UNSIGNED_INT_VEC3 = 36295.0;
    @Generated public static final double GL_UNSIGNED_INT_VEC4 = 36296.0;
    @Generated public static final double GL_INT_SAMPLER_2D = 36298.0;
    @Generated public static final double GL_INT_SAMPLER_3D = 36299.0;
    @Generated public static final double GL_INT_SAMPLER_CUBE = 36300.0;
    @Generated public static final double GL_INT_SAMPLER_2D_ARRAY = 36303.0;
    @Generated public static final double GL_UNSIGNED_INT_SAMPLER_2D = 36306.0;
    @Generated public static final double GL_UNSIGNED_INT_SAMPLER_3D = 36307.0;
    @Generated public static final double GL_UNSIGNED_INT_SAMPLER_CUBE = 36308.0;
    @Generated public static final double GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 36311.0;
    @Generated public static final double GL_BUFFER_ACCESS_FLAGS = 37151.0;
    @Generated public static final double GL_BUFFER_MAP_LENGTH = 37152.0;
    @Generated public static final double GL_BUFFER_MAP_OFFSET = 37153.0;
    @Generated public static final double GL_DEPTH_COMPONENT32F = 36012.0;
    @Generated public static final double GL_DEPTH32F_STENCIL8 = 36013.0;
    @Generated public static final double GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 36269.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 33296.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 33297.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 33298.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 33299.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 33300.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 33301.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 33302.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 33303.0;
    @Generated public static final double GL_FRAMEBUFFER_DEFAULT = 33304.0;
    @Generated public static final double GL_FRAMEBUFFER_UNDEFINED = 33305.0;
    @Generated public static final double GL_DEPTH_STENCIL_ATTACHMENT = 33306.0;
    @Generated public static final double GL_DEPTH_STENCIL = 34041.0;
    @Generated public static final double GL_UNSIGNED_INT_24_8 = 34042.0;
    @Generated public static final double GL_DEPTH24_STENCIL8 = 35056.0;
    @Generated public static final double GL_UNSIGNED_NORMALIZED = 35863.0;
    @Generated public static final double GL_READ_FRAMEBUFFER = 36008.0;
    @Generated public static final double GL_DRAW_FRAMEBUFFER = 36009.0;
    @Generated public static final double GL_READ_FRAMEBUFFER_BINDING = 36010.0;
    @Generated public static final double GL_RENDERBUFFER_SAMPLES = 36011.0;
    @Generated public static final double GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 36052.0;
    @Generated public static final double GL_MAX_COLOR_ATTACHMENTS = 36063.0;
    @Generated public static final double GL_COLOR_ATTACHMENT1 = 36065.0;
    @Generated public static final double GL_COLOR_ATTACHMENT2 = 36066.0;
    @Generated public static final double GL_COLOR_ATTACHMENT3 = 36067.0;
    @Generated public static final double GL_COLOR_ATTACHMENT4 = 36068.0;
    @Generated public static final double GL_COLOR_ATTACHMENT5 = 36069.0;
    @Generated public static final double GL_COLOR_ATTACHMENT6 = 36070.0;
    @Generated public static final double GL_COLOR_ATTACHMENT7 = 36071.0;
    @Generated public static final double GL_COLOR_ATTACHMENT8 = 36072.0;
    @Generated public static final double GL_COLOR_ATTACHMENT9 = 36073.0;
    @Generated public static final double GL_COLOR_ATTACHMENT10 = 36074.0;
    @Generated public static final double GL_COLOR_ATTACHMENT11 = 36075.0;
    @Generated public static final double GL_COLOR_ATTACHMENT12 = 36076.0;
    @Generated public static final double GL_COLOR_ATTACHMENT13 = 36077.0;
    @Generated public static final double GL_COLOR_ATTACHMENT14 = 36078.0;
    @Generated public static final double GL_COLOR_ATTACHMENT15 = 36079.0;
    @Generated public static final double GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 36182.0;
    @Generated public static final double GL_MAX_SAMPLES = 36183.0;
    @Generated public static final double GL_HALF_FLOAT = 5131.0;
    @Generated public static final double GL_MAP_READ_BIT = 1.0;
    @Generated public static final double GL_MAP_WRITE_BIT = 2.0;
    @Generated public static final double GL_MAP_INVALIDATE_RANGE_BIT = 4.0;
    @Generated public static final double GL_MAP_INVALIDATE_BUFFER_BIT = 8.0;
    @Generated public static final double GL_MAP_FLUSH_EXPLICIT_BIT = 16.0;
    @Generated public static final double GL_MAP_UNSYNCHRONIZED_BIT = 32.0;
    @Generated public static final double GL_RG = 33319.0;
    @Generated public static final double GL_RG_INTEGER = 33320.0;
    @Generated public static final double GL_R8 = 33321.0;
    @Generated public static final double GL_RG8 = 33323.0;
    @Generated public static final double GL_R16F = 33325.0;
    @Generated public static final double GL_R32F = 33326.0;
    @Generated public static final double GL_RG16F = 33327.0;
    @Generated public static final double GL_RG32F = 33328.0;
    @Generated public static final double GL_R8I = 33329.0;
    @Generated public static final double GL_R8UI = 33330.0;
    @Generated public static final double GL_R16I = 33331.0;
    @Generated public static final double GL_R16UI = 33332.0;
    @Generated public static final double GL_R32I = 33333.0;
    @Generated public static final double GL_R32UI = 33334.0;
    @Generated public static final double GL_RG8I = 33335.0;
    @Generated public static final double GL_RG8UI = 33336.0;
    @Generated public static final double GL_RG16I = 33337.0;
    @Generated public static final double GL_RG16UI = 33338.0;
    @Generated public static final double GL_RG32I = 33339.0;
    @Generated public static final double GL_RG32UI = 33340.0;
    @Generated public static final double GL_VERTEX_ARRAY_BINDING = 34229.0;
    @Generated public static final double GL_R8_SNORM = 36756.0;
    @Generated public static final double GL_RG8_SNORM = 36757.0;
    @Generated public static final double GL_RGB8_SNORM = 36758.0;
    @Generated public static final double GL_RGBA8_SNORM = 36759.0;
    @Generated public static final double GL_SIGNED_NORMALIZED = 36764.0;
    @Generated public static final double GL_PRIMITIVE_RESTART_FIXED_INDEX = 36201.0;
    @Generated public static final double GL_COPY_READ_BUFFER = 36662.0;
    @Generated public static final double GL_COPY_WRITE_BUFFER = 36663.0;
    @Generated public static final double GL_UNIFORM_BUFFER = 35345.0;
    @Generated public static final double GL_UNIFORM_BUFFER_BINDING = 35368.0;
    @Generated public static final double GL_UNIFORM_BUFFER_START = 35369.0;
    @Generated public static final double GL_UNIFORM_BUFFER_SIZE = 35370.0;
    @Generated public static final double GL_MAX_VERTEX_UNIFORM_BLOCKS = 35371.0;
    @Generated public static final double GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 35373.0;
    @Generated public static final double GL_MAX_COMBINED_UNIFORM_BLOCKS = 35374.0;
    @Generated public static final double GL_MAX_UNIFORM_BUFFER_BINDINGS = 35375.0;
    @Generated public static final double GL_MAX_UNIFORM_BLOCK_SIZE = 35376.0;
    @Generated public static final double GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 35377.0;
    @Generated public static final double GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 35379.0;
    @Generated public static final double GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 35380.0;
    @Generated public static final double GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 35381.0;
    @Generated public static final double GL_ACTIVE_UNIFORM_BLOCKS = 35382.0;
    @Generated public static final double GL_UNIFORM_TYPE = 35383.0;
    @Generated public static final double GL_UNIFORM_SIZE = 35384.0;
    @Generated public static final double GL_UNIFORM_NAME_LENGTH = 35385.0;
    @Generated public static final double GL_UNIFORM_BLOCK_INDEX = 35386.0;
    @Generated public static final double GL_UNIFORM_OFFSET = 35387.0;
    @Generated public static final double GL_UNIFORM_ARRAY_STRIDE = 35388.0;
    @Generated public static final double GL_UNIFORM_MATRIX_STRIDE = 35389.0;
    @Generated public static final double GL_UNIFORM_IS_ROW_MAJOR = 35390.0;
    @Generated public static final double GL_UNIFORM_BLOCK_BINDING = 35391.0;
    @Generated public static final double GL_UNIFORM_BLOCK_DATA_SIZE = 35392.0;
    @Generated public static final double GL_UNIFORM_BLOCK_NAME_LENGTH = 35393.0;
    @Generated public static final double GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 35394.0;
    @Generated public static final double GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 35395.0;
    @Generated public static final double GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 35396.0;
    @Generated public static final double GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 35398.0;
    @Generated public static final double GL_MAX_VERTEX_OUTPUT_COMPONENTS = 37154.0;
    @Generated public static final double GL_MAX_FRAGMENT_INPUT_COMPONENTS = 37157.0;
    @Generated public static final double GL_MAX_SERVER_WAIT_TIMEOUT = 37137.0;
    @Generated public static final double GL_OBJECT_TYPE = 37138.0;
    @Generated public static final double GL_SYNC_CONDITION = 37139.0;
    @Generated public static final double GL_SYNC_STATUS = 37140.0;
    @Generated public static final double GL_SYNC_FLAGS = 37141.0;
    @Generated public static final double GL_SYNC_FENCE = 37142.0;
    @Generated public static final double GL_SYNC_GPU_COMMANDS_COMPLETE = 37143.0;
    @Generated public static final double GL_UNSIGNALED = 37144.0;
    @Generated public static final double GL_SIGNALED = 37145.0;
    @Generated public static final double GL_ALREADY_SIGNALED = 37146.0;
    @Generated public static final double GL_TIMEOUT_EXPIRED = 37147.0;
    @Generated public static final double GL_CONDITION_SATISFIED = 37148.0;
    @Generated public static final double GL_WAIT_FAILED = 37149.0;
    @Generated public static final double GL_SYNC_FLUSH_COMMANDS_BIT = 1.0;
    @Generated public static final double GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 35070.0;
    @Generated public static final double GL_ANY_SAMPLES_PASSED = 35887.0;
    @Generated public static final double GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 36202.0;
    @Generated public static final double GL_SAMPLER_BINDING = 35097.0;
    @Generated public static final double GL_RGB10_A2UI = 36975.0;
    @Generated public static final double GL_TEXTURE_SWIZZLE_R = 36418.0;
    @Generated public static final double GL_TEXTURE_SWIZZLE_G = 36419.0;
    @Generated public static final double GL_TEXTURE_SWIZZLE_B = 36420.0;
    @Generated public static final double GL_TEXTURE_SWIZZLE_A = 36421.0;
    @Generated public static final double GL_GREEN = 6404.0;
    @Generated public static final double GL_BLUE = 6405.0;
    @Generated public static final double GL_INT_2_10_10_10_REV = 36255.0;
    @Generated public static final double GL_TRANSFORM_FEEDBACK = 36386.0;
    @Generated public static final double GL_TRANSFORM_FEEDBACK_PAUSED = 36387.0;
    @Generated public static final double GL_TRANSFORM_FEEDBACK_ACTIVE = 36388.0;
    @Generated public static final double GL_TRANSFORM_FEEDBACK_BINDING = 36389.0;
    @Generated public static final double GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 33367.0;
    @Generated public static final double GL_PROGRAM_BINARY_LENGTH = 34625.0;
    @Generated public static final double GL_NUM_PROGRAM_BINARY_FORMATS = 34814.0;
    @Generated public static final double GL_PROGRAM_BINARY_FORMATS = 34815.0;
    @Generated public static final double GL_COMPRESSED_R11_EAC = 37488.0;
    @Generated public static final double GL_COMPRESSED_SIGNED_R11_EAC = 37489.0;
    @Generated public static final double GL_COMPRESSED_RG11_EAC = 37490.0;
    @Generated public static final double GL_COMPRESSED_SIGNED_RG11_EAC = 37491.0;
    @Generated public static final double GL_COMPRESSED_RGB8_ETC2 = 37492.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ETC2 = 37493.0;
    @Generated public static final double GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 37494.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 37495.0;
    @Generated public static final double GL_COMPRESSED_RGBA8_ETC2_EAC = 37496.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 37497.0;
    @Generated public static final double GL_TEXTURE_IMMUTABLE_FORMAT = 37167.0;
    @Generated public static final double GL_MAX_ELEMENT_INDEX = 36203.0;
    @Generated public static final double GL_NUM_SAMPLE_COUNTS = 37760.0;
    @Generated public static final double GL_TEXTURE_IMMUTABLE_LEVELS = 33503.0;
    @Generated public static final double GL_KHR_texture_compression_astc_ldr = 1.0;
    @Generated public static final double GL_SAMPLER = 33510.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_4x4_KHR = 37808.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_5x4_KHR = 37809.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_5x5_KHR = 37810.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_6x5_KHR = 37811.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_6x6_KHR = 37812.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_8x5_KHR = 37813.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_8x6_KHR = 37814.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_8x8_KHR = 37815.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_10x5_KHR = 37816.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_10x6_KHR = 37817.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_10x8_KHR = 37818.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_10x10_KHR = 37819.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_12x10_KHR = 37820.0;
    @Generated public static final double GL_COMPRESSED_RGBA_ASTC_12x12_KHR = 37821.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR = 37840.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR = 37841.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR = 37842.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR = 37843.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR = 37844.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR = 37845.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR = 37846.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR = 37847.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR = 37848.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR = 37849.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR = 37850.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR = 37851.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR = 37852.0;
    @Generated public static final double GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR = 37853.0;
}
