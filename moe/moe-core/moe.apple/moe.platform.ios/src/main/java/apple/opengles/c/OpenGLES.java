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

    @Generated
    @CFunction
    public static native void glAlphaFunc(int func, float ref);

    @Generated
    @CFunction
    public static native void glClearColor(float red, float green, float blue, float alpha);

    @Generated
    @CFunction
    public static native void glClearDepthf(float depth);

    @Generated
    @CFunction
    public static native void glClipPlanef(int plane, ConstFloatPtr equation);

    @Generated
    @CFunction
    public static native void glColor4f(float red, float green, float blue, float alpha);

    @Generated
    @CFunction
    public static native void glDepthRangef(float zNear, float zFar);

    @Generated
    @CFunction
    public static native void glFogf(int pname, float param);

    @Generated
    @CFunction
    public static native void glFogfv(int pname, ConstFloatPtr params);

    @Generated
    @CFunction
    public static native void glFrustumf(float left, float right, float bottom, float top, float zNear, float zFar);

    @Generated
    @CFunction
    public static native void glGetClipPlanef(int pname, FloatPtr equation);

    @Generated
    @CFunction
    public static native void glGetFloatv(int pname, FloatPtr params);

    @Generated
    @CFunction
    public static native void glGetLightfv(int light, int pname, FloatPtr params);

    @Generated
    @CFunction
    public static native void glGetMaterialfv(int face, int pname, FloatPtr params);

    @Generated
    @CFunction
    public static native void glGetTexEnvfv(int env, int pname, FloatPtr params);

    @Generated
    @CFunction
    public static native void glGetTexParameterfv(int target, int pname, FloatPtr params);

    @Generated
    @CFunction
    public static native void glLightModelf(int pname, float param);

    @Generated
    @CFunction
    public static native void glLightModelfv(int pname, ConstFloatPtr params);

    @Generated
    @CFunction
    public static native void glLightf(int light, int pname, float param);

    @Generated
    @CFunction
    public static native void glLightfv(int light, int pname, ConstFloatPtr params);

    @Generated
    @CFunction
    public static native void glLineWidth(float width);

    @Generated
    @CFunction
    public static native void glLoadMatrixf(ConstFloatPtr m);

    @Generated
    @CFunction
    public static native void glMaterialf(int face, int pname, float param);

    @Generated
    @CFunction
    public static native void glMaterialfv(int face, int pname, ConstFloatPtr params);

    @Generated
    @CFunction
    public static native void glMultMatrixf(ConstFloatPtr m);

    @Generated
    @CFunction
    public static native void glMultiTexCoord4f(int target, float s, float t, float r, float q);

    @Generated
    @CFunction
    public static native void glNormal3f(float nx, float ny, float nz);

    @Generated
    @CFunction
    public static native void glOrthof(float left, float right, float bottom, float top, float zNear, float zFar);

    @Generated
    @CFunction
    public static native void glPointParameterf(int pname, float param);

    @Generated
    @CFunction
    public static native void glPointParameterfv(int pname, ConstFloatPtr params);

    @Generated
    @CFunction
    public static native void glPointSize(float size);

    @Generated
    @CFunction
    public static native void glPolygonOffset(float factor, float units);

    @Generated
    @CFunction
    public static native void glRotatef(float angle, float x, float y, float z);

    @Generated
    @CFunction
    public static native void glSampleCoverage(float value, byte invert);

    @Generated
    @CFunction
    public static native void glScalef(float x, float y, float z);

    @Generated
    @CFunction
    public static native void glTexEnvf(int target, int pname, float param);

    @Generated
    @CFunction
    public static native void glTexEnvfv(int target, int pname, ConstFloatPtr params);

    @Generated
    @CFunction
    public static native void glTexParameterf(int target, int pname, float param);

    @Generated
    @CFunction
    public static native void glTexParameterfv(int target, int pname, ConstFloatPtr params);

    @Generated
    @CFunction
    public static native void glTranslatef(float x, float y, float z);

    @Generated
    @CFunction
    public static native void glActiveTexture(int texture);

    @Generated
    @CFunction
    public static native void glAlphaFuncx(int func, int ref);

    @Generated
    @CFunction
    public static native void glBindBuffer(int target, int buffer);

    @Generated
    @CFunction
    public static native void glBindTexture(int target, int texture);

    @Generated
    @CFunction
    public static native void glBlendFunc(int sfactor, int dfactor);

    @Generated
    @CFunction
    public static native void glBufferData(int target, @NInt long size, ConstVoidPtr data, int usage);

    @Generated
    @CFunction
    public static native void glBufferSubData(int target, @NInt long offset, @NInt long size, ConstVoidPtr data);

    @Generated
    @CFunction
    public static native void glClear(int mask);

    @Generated
    @CFunction
    public static native void glClearColorx(int red, int green, int blue, int alpha);

    @Generated
    @CFunction
    public static native void glClearDepthx(int depth);

    @Generated
    @CFunction
    public static native void glClearStencil(int s);

    @Generated
    @CFunction
    public static native void glClientActiveTexture(int texture);

    @Generated
    @CFunction
    public static native void glClipPlanex(int plane, ConstIntPtr equation);

    @Generated
    @CFunction
    public static native void glColor4ub(byte red, byte green, byte blue, byte alpha);

    @Generated
    @CFunction
    public static native void glColor4x(int red, int green, int blue, int alpha);

    @Generated
    @CFunction
    public static native void glColorMask(byte red, byte green, byte blue, byte alpha);

    @Generated
    @CFunction
    public static native void glColorPointer(int size, int type, int stride, ConstVoidPtr pointer);

    @Generated
    @CFunction
    public static native void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height,
            int border, int imageSize, ConstVoidPtr data);

    @Generated
    @CFunction
    public static native void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width,
            int height, int format, int imageSize, ConstVoidPtr data);

    @Generated
    @CFunction
    public static native void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width,
            int height, int border);

    @Generated
    @CFunction
    public static native void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y,
            int width, int height);

    @Generated
    @CFunction
    public static native void glCullFace(int mode);

    @Generated
    @CFunction
    public static native void glDeleteBuffers(int n, ConstIntPtr buffers);

    @Generated
    @CFunction
    public static native void glDeleteTextures(int n, ConstIntPtr textures);

    @Generated
    @CFunction
    public static native void glDepthFunc(int func);

    @Generated
    @CFunction
    public static native void glDepthMask(byte flag);

    @Generated
    @CFunction
    public static native void glDepthRangex(int zNear, int zFar);

    @Generated
    @CFunction
    public static native void glDisable(int cap);

    @Generated
    @CFunction
    public static native void glDisableClientState(int array);

    @Generated
    @CFunction
    public static native void glDrawArrays(int mode, int first, int count);

    @Generated
    @CFunction
    public static native void glDrawElements(int mode, int count, int type, ConstVoidPtr indices);

    @Generated
    @CFunction
    public static native void glEnable(int cap);

    @Generated
    @CFunction
    public static native void glEnableClientState(int array);

    @Generated
    @CFunction
    public static native void glFinish();

    @Generated
    @CFunction
    public static native void glFlush();

    @Generated
    @CFunction
    public static native void glFogx(int pname, int param);

    @Generated
    @CFunction
    public static native void glFogxv(int pname, ConstIntPtr params);

    @Generated
    @CFunction
    public static native void glFrontFace(int mode);

    @Generated
    @CFunction
    public static native void glFrustumx(int left, int right, int bottom, int top, int zNear, int zFar);

    @Generated
    @CFunction
    public static native void glGenBuffers(int n, IntPtr buffers);

    @Generated
    @CFunction
    public static native void glGenTextures(int n, IntPtr textures);

    @Generated
    @CFunction
    public static native void glGetBooleanv(int pname, BytePtr params);

    @Generated
    @CFunction
    public static native void glGetBufferParameteriv(int target, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native int glGetError();

    @Generated
    @CFunction
    public static native void glGetFixedv(int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetIntegerv(int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetLightxv(int light, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetMaterialxv(int face, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetPointerv(int pname, Ptr<VoidPtr> params);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String glGetString(int name);

    @Generated
    @CFunction
    public static native void glGetTexEnviv(int env, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetTexEnvxv(int env, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetTexParameteriv(int target, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetTexParameterxv(int target, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glHint(int target, int mode);

    @Generated
    @CFunction
    public static native byte glIsBuffer(int buffer);

    @Generated
    @CFunction
    public static native byte glIsEnabled(int cap);

    @Generated
    @CFunction
    public static native byte glIsTexture(int texture);

    @Generated
    @CFunction
    public static native void glLightModelx(int pname, int param);

    @Generated
    @CFunction
    public static native void glLightModelxv(int pname, ConstIntPtr params);

    @Generated
    @CFunction
    public static native void glLightx(int light, int pname, int param);

    @Generated
    @CFunction
    public static native void glLightxv(int light, int pname, ConstIntPtr params);

    @Generated
    @CFunction
    public static native void glLineWidthx(int width);

    @Generated
    @CFunction
    public static native void glLoadIdentity();

    @Generated
    @CFunction
    public static native void glLoadMatrixx(ConstIntPtr m);

    @Generated
    @CFunction
    public static native void glLogicOp(int opcode);

    @Generated
    @CFunction
    public static native void glMaterialx(int face, int pname, int param);

    @Generated
    @CFunction
    public static native void glMaterialxv(int face, int pname, ConstIntPtr params);

    @Generated
    @CFunction
    public static native void glMatrixMode(int mode);

    @Generated
    @CFunction
    public static native void glMultMatrixx(ConstIntPtr m);

    @Generated
    @CFunction
    public static native void glMultiTexCoord4x(int target, int s, int t, int r, int q);

    @Generated
    @CFunction
    public static native void glNormal3x(int nx, int ny, int nz);

    @Generated
    @CFunction
    public static native void glNormalPointer(int type, int stride, ConstVoidPtr pointer);

    @Generated
    @CFunction
    public static native void glOrthox(int left, int right, int bottom, int top, int zNear, int zFar);

    @Generated
    @CFunction
    public static native void glPixelStorei(int pname, int param);

    @Generated
    @CFunction
    public static native void glPointParameterx(int pname, int param);

    @Generated
    @CFunction
    public static native void glPointParameterxv(int pname, ConstIntPtr params);

    @Generated
    @CFunction
    public static native void glPointSizex(int size);

    @Generated
    @CFunction
    public static native void glPolygonOffsetx(int factor, int units);

    @Generated
    @CFunction
    public static native void glPopMatrix();

    @Generated
    @CFunction
    public static native void glPushMatrix();

    @Generated
    @CFunction
    public static native void glReadPixels(int x, int y, int width, int height, int format, int type, VoidPtr pixels);

    @Generated
    @CFunction
    public static native void glRotatex(int angle, int x, int y, int z);

    @Generated
    @CFunction
    public static native void glSampleCoveragex(int value, byte invert);

    @Generated
    @CFunction
    public static native void glScalex(int x, int y, int z);

    @Generated
    @CFunction
    public static native void glScissor(int x, int y, int width, int height);

    @Generated
    @CFunction
    public static native void glShadeModel(int mode);

    @Generated
    @CFunction
    public static native void glStencilFunc(int func, int ref, int mask);

    @Generated
    @CFunction
    public static native void glStencilMask(int mask);

    @Generated
    @CFunction
    public static native void glStencilOp(int fail, int zfail, int zpass);

    @Generated
    @CFunction
    public static native void glTexCoordPointer(int size, int type, int stride, ConstVoidPtr pointer);

    @Generated
    @CFunction
    public static native void glTexEnvi(int target, int pname, int param);

    @Generated
    @CFunction
    public static native void glTexEnvx(int target, int pname, int param);

    @Generated
    @CFunction
    public static native void glTexEnviv(int target, int pname, ConstIntPtr params);

    @Generated
    @CFunction
    public static native void glTexEnvxv(int target, int pname, ConstIntPtr params);

    @Generated
    @CFunction
    public static native void glTexImage2D(int target, int level, int internalformat, int width, int height, int border,
            int format, int type, ConstVoidPtr pixels);

    @Generated
    @CFunction
    public static native void glTexParameteri(int target, int pname, int param);

    @Generated
    @CFunction
    public static native void glTexParameterx(int target, int pname, int param);

    @Generated
    @CFunction
    public static native void glTexParameteriv(int target, int pname, ConstIntPtr params);

    @Generated
    @CFunction
    public static native void glTexParameterxv(int target, int pname, ConstIntPtr params);

    @Generated
    @CFunction
    public static native void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height,
            int format, int type, ConstVoidPtr pixels);

    @Generated
    @CFunction
    public static native void glTranslatex(int x, int y, int z);

    @Generated
    @CFunction
    public static native void glVertexPointer(int size, int type, int stride, ConstVoidPtr pointer);

    @Generated
    @CFunction
    public static native void glViewport(int x, int y, int width, int height);

    @Generated
    @CFunction
    public static native void glCurrentPaletteMatrixOES(int matrixpaletteindex);

    @Generated
    @CFunction
    public static native void glLoadPaletteFromModelViewMatrixOES();

    @Generated
    @CFunction
    public static native void glMatrixIndexPointerOES(int size, int type, int stride, ConstVoidPtr pointer);

    @Generated
    @CFunction
    public static native void glWeightPointerOES(int size, int type, int stride, ConstVoidPtr pointer);

    @Generated
    @CFunction
    public static native void glPointSizePointerOES(int type, int stride, ConstVoidPtr pointer);

    @Generated
    @CFunction
    public static native void glDrawTexsOES(short x, short y, short z, short width, short height);

    @Generated
    @CFunction
    public static native void glDrawTexiOES(int x, int y, int z, int width, int height);

    @Generated
    @CFunction
    public static native void glDrawTexxOES(int x, int y, int z, int width, int height);

    @Generated
    @CFunction
    public static native void glDrawTexsvOES(ConstShortPtr coords);

    @Generated
    @CFunction
    public static native void glDrawTexivOES(ConstIntPtr coords);

    @Generated
    @CFunction
    public static native void glDrawTexxvOES(ConstIntPtr coords);

    @Generated
    @CFunction
    public static native void glDrawTexfOES(float x, float y, float z, float width, float height);

    @Generated
    @CFunction
    public static native void glDrawTexfvOES(ConstFloatPtr coords);

    @Generated
    @CFunction
    public static native void glCopyTextureLevelsAPPLE(int destinationTexture, int sourceTexture, int sourceBaseLevel,
            int sourceLevelCount);

    @Generated
    @CFunction
    public static native void glRenderbufferStorageMultisampleAPPLE(int target, int samples, int internalformat,
            int width, int height);

    @Generated
    @CFunction
    public static native void glResolveMultisampleFramebufferAPPLE();

    @Generated
    @CFunction
    public static native void glLabelObjectEXT(int type, int object, int length,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label);

    @Generated
    @CFunction
    public static native void glGetObjectLabelEXT(int type, int object, int bufSize, IntPtr length, BytePtr label);

    @Generated
    @CFunction
    public static native void glInsertEventMarkerEXT(int length,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String marker);

    @Generated
    @CFunction
    public static native void glPushGroupMarkerEXT(int length,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String marker);

    @Generated
    @CFunction
    public static native void glPopGroupMarkerEXT();

    @Generated
    @CFunction
    public static native void glDiscardFramebufferEXT(int target, int numAttachments, ConstIntPtr attachments);

    @Generated
    @CFunction
    public static native VoidPtr glMapBufferRangeEXT(int target, @NInt long offset, @NInt long length, int access);

    @Generated
    @CFunction
    public static native void glFlushMappedBufferRangeEXT(int target, @NInt long offset, @NInt long length);

    @Generated
    @CFunction
    public static native void glTexStorage2DEXT(int target, int levels, int internalformat, int width, int height);

    @Generated
    @CFunction
    public static native void glBlendEquationSeparateOES(int modeRGB, int modeAlpha);

    @Generated
    @CFunction
    public static native void glBlendFuncSeparateOES(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

    @Generated
    @CFunction
    public static native void glBlendEquationOES(int mode);

    @Generated
    @CFunction
    public static native byte glIsRenderbufferOES(int renderbuffer);

    @Generated
    @CFunction
    public static native void glBindRenderbufferOES(int target, int renderbuffer);

    @Generated
    @CFunction
    public static native void glDeleteRenderbuffersOES(int n, ConstIntPtr renderbuffers);

    @Generated
    @CFunction
    public static native void glGenRenderbuffersOES(int n, IntPtr renderbuffers);

    @Generated
    @CFunction
    public static native void glRenderbufferStorageOES(int target, int internalformat, int width, int height);

    @Generated
    @CFunction
    public static native void glGetRenderbufferParameterivOES(int target, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native byte glIsFramebufferOES(int framebuffer);

    @Generated
    @CFunction
    public static native void glBindFramebufferOES(int target, int framebuffer);

    @Generated
    @CFunction
    public static native void glDeleteFramebuffersOES(int n, ConstIntPtr framebuffers);

    @Generated
    @CFunction
    public static native void glGenFramebuffersOES(int n, IntPtr framebuffers);

    @Generated
    @CFunction
    public static native int glCheckFramebufferStatusOES(int target);

    @Generated
    @CFunction
    public static native void glFramebufferRenderbufferOES(int target, int attachment, int renderbuffertarget,
            int renderbuffer);

    @Generated
    @CFunction
    public static native void glFramebufferTexture2DOES(int target, int attachment, int textarget, int texture,
            int level);

    @Generated
    @CFunction
    public static native void glGetFramebufferAttachmentParameterivOES(int target, int attachment, int pname,
            IntPtr params);

    @Generated
    @CFunction
    public static native void glGenerateMipmapOES(int target);

    @Generated
    @CFunction
    public static native void glGetBufferPointervOES(int target, int pname, Ptr<VoidPtr> params);

    @Generated
    @CFunction
    public static native VoidPtr glMapBufferOES(int target, int access);

    @Generated
    @CFunction
    public static native byte glUnmapBufferOES(int target);

    @Generated
    @CFunction
    public static native void glBindVertexArrayOES(int array);

    @Generated
    @CFunction
    public static native void glDeleteVertexArraysOES(int n, ConstIntPtr arrays);

    @Generated
    @CFunction
    public static native void glGenVertexArraysOES(int n, IntPtr arrays);

    @Generated
    @CFunction
    public static native byte glIsVertexArrayOES(int array);

    @Generated
    @CFunction
    public static native void glAttachShader(int program, int shader);

    @Generated
    @CFunction
    public static native void glBindAttribLocation(int program, int index,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    @Generated
    @CFunction
    public static native void glBindFramebuffer(int target, int framebuffer);

    @Generated
    @CFunction
    public static native void glBindRenderbuffer(int target, int renderbuffer);

    @Generated
    @CFunction
    public static native void glBlendColor(float red, float green, float blue, float alpha);

    @Generated
    @CFunction
    public static native void glBlendEquation(int mode);

    @Generated
    @CFunction
    public static native void glBlendEquationSeparate(int modeRGB, int modeAlpha);

    @Generated
    @CFunction
    public static native void glBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

    @Generated
    @CFunction
    public static native int glCheckFramebufferStatus(int target);

    @Generated
    @CFunction
    public static native void glCompileShader(int shader);

    @Generated
    @CFunction
    public static native int glCreateProgram();

    @Generated
    @CFunction
    public static native int glCreateShader(int type);

    @Generated
    @CFunction
    public static native void glDeleteFramebuffers(int n, ConstIntPtr framebuffers);

    @Generated
    @CFunction
    public static native void glDeleteProgram(int program);

    @Generated
    @CFunction
    public static native void glDeleteRenderbuffers(int n, ConstIntPtr renderbuffers);

    @Generated
    @CFunction
    public static native void glDeleteShader(int shader);

    @Generated
    @CFunction
    public static native void glDetachShader(int program, int shader);

    @Generated
    @CFunction
    public static native void glDisableVertexAttribArray(int index);

    @Generated
    @CFunction
    public static native void glEnableVertexAttribArray(int index);

    @Generated
    @CFunction
    public static native void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget,
            int renderbuffer);

    @Generated
    @CFunction
    public static native void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level);

    @Generated
    @CFunction
    public static native void glGenerateMipmap(int target);

    @Generated
    @CFunction
    public static native void glGenFramebuffers(int n, IntPtr framebuffers);

    @Generated
    @CFunction
    public static native void glGenRenderbuffers(int n, IntPtr renderbuffers);

    @Generated
    @CFunction
    public static native void glGetActiveAttrib(int program, int index, int bufsize, IntPtr length, IntPtr size,
            IntPtr type, BytePtr name);

    @Generated
    @CFunction
    public static native void glGetActiveUniform(int program, int index, int bufsize, IntPtr length, IntPtr size,
            IntPtr type, BytePtr name);

    @Generated
    @CFunction
    public static native void glGetAttachedShaders(int program, int maxcount, IntPtr count, IntPtr shaders);

    @Generated
    @CFunction
    public static native int glGetAttribLocation(int program,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    @Generated
    @CFunction
    public static native void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname,
            IntPtr params);

    @Generated
    @CFunction
    public static native void glGetProgramiv(int program, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetProgramInfoLog(int program, int bufsize, IntPtr length, BytePtr infolog);

    @Generated
    @CFunction
    public static native void glGetRenderbufferParameteriv(int target, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetShaderiv(int shader, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetShaderInfoLog(int shader, int bufsize, IntPtr length, BytePtr infolog);

    @Generated
    @CFunction
    public static native void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntPtr range,
            IntPtr precision);

    @Generated
    @CFunction
    public static native void glGetShaderSource(int shader, int bufsize, IntPtr length, BytePtr source);

    @Generated
    @CFunction
    public static native void glGetUniformfv(int program, int location, FloatPtr params);

    @Generated
    @CFunction
    public static native void glGetUniformiv(int program, int location, IntPtr params);

    @Generated
    @CFunction
    public static native int glGetUniformLocation(int program,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    @Generated
    @CFunction
    public static native void glGetVertexAttribfv(int index, int pname, FloatPtr params);

    @Generated
    @CFunction
    public static native void glGetVertexAttribiv(int index, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetVertexAttribPointerv(int index, int pname, Ptr<VoidPtr> pointer);

    @Generated
    @CFunction
    public static native byte glIsFramebuffer(int framebuffer);

    @Generated
    @CFunction
    public static native byte glIsProgram(int program);

    @Generated
    @CFunction
    public static native byte glIsRenderbuffer(int renderbuffer);

    @Generated
    @CFunction
    public static native byte glIsShader(int shader);

    @Generated
    @CFunction
    public static native void glLinkProgram(int program);

    @Generated
    @CFunction
    public static native void glReleaseShaderCompiler();

    @Generated
    @CFunction
    public static native void glRenderbufferStorage(int target, int internalformat, int width, int height);

    @Generated
    @CFunction
    public static native void glShaderBinary(int n, ConstIntPtr shaders, int binaryformat, ConstVoidPtr binary,
            int length);

    @Generated
    @CFunction
    public static native void glShaderSource(int shader, int count,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] string,
            ConstIntPtr length);

    @Generated
    @CFunction
    public static native void glStencilFuncSeparate(int face, int func, int ref, int mask);

    @Generated
    @CFunction
    public static native void glStencilMaskSeparate(int face, int mask);

    @Generated
    @CFunction
    public static native void glStencilOpSeparate(int face, int fail, int zfail, int zpass);

    @Generated
    @CFunction
    public static native void glUniform1f(int location, float x);

    @Generated
    @CFunction
    public static native void glUniform1fv(int location, int count, ConstFloatPtr v);

    @Generated
    @CFunction
    public static native void glUniform1i(int location, int x);

    @Generated
    @CFunction
    public static native void glUniform1iv(int location, int count, ConstIntPtr v);

    @Generated
    @CFunction
    public static native void glUniform2f(int location, float x, float y);

    @Generated
    @CFunction
    public static native void glUniform2fv(int location, int count, ConstFloatPtr v);

    @Generated
    @CFunction
    public static native void glUniform2i(int location, int x, int y);

    @Generated
    @CFunction
    public static native void glUniform2iv(int location, int count, ConstIntPtr v);

    @Generated
    @CFunction
    public static native void glUniform3f(int location, float x, float y, float z);

    @Generated
    @CFunction
    public static native void glUniform3fv(int location, int count, ConstFloatPtr v);

    @Generated
    @CFunction
    public static native void glUniform3i(int location, int x, int y, int z);

    @Generated
    @CFunction
    public static native void glUniform3iv(int location, int count, ConstIntPtr v);

    @Generated
    @CFunction
    public static native void glUniform4f(int location, float x, float y, float z, float w);

    @Generated
    @CFunction
    public static native void glUniform4fv(int location, int count, ConstFloatPtr v);

    @Generated
    @CFunction
    public static native void glUniform4i(int location, int x, int y, int z, int w);

    @Generated
    @CFunction
    public static native void glUniform4iv(int location, int count, ConstIntPtr v);

    @Generated
    @CFunction
    public static native void glUniformMatrix2fv(int location, int count, byte transpose, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glUniformMatrix3fv(int location, int count, byte transpose, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glUniformMatrix4fv(int location, int count, byte transpose, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glUseProgram(int program);

    @Generated
    @CFunction
    public static native void glValidateProgram(int program);

    @Generated
    @CFunction
    public static native void glVertexAttrib1f(int indx, float x);

    @Generated
    @CFunction
    public static native void glVertexAttrib1fv(int indx, ConstFloatPtr values);

    @Generated
    @CFunction
    public static native void glVertexAttrib2f(int indx, float x, float y);

    @Generated
    @CFunction
    public static native void glVertexAttrib2fv(int indx, ConstFloatPtr values);

    @Generated
    @CFunction
    public static native void glVertexAttrib3f(int indx, float x, float y, float z);

    @Generated
    @CFunction
    public static native void glVertexAttrib3fv(int indx, ConstFloatPtr values);

    @Generated
    @CFunction
    public static native void glVertexAttrib4f(int indx, float x, float y, float z, float w);

    @Generated
    @CFunction
    public static native void glVertexAttrib4fv(int indx, ConstFloatPtr values);

    @Generated
    @CFunction
    public static native void glVertexAttribPointer(int indx, int size, int type, byte normalized, int stride,
            ConstVoidPtr ptr);

    @Generated
    @CFunction
    public static native GLsync glFenceSyncAPPLE(int condition, int flags);

    @Generated
    @CFunction
    public static native byte glIsSyncAPPLE(GLsync sync);

    @Generated
    @CFunction
    public static native void glDeleteSyncAPPLE(GLsync sync);

    @Generated
    @CFunction
    public static native int glClientWaitSyncAPPLE(GLsync sync, int flags, long timeout);

    @Generated
    @CFunction
    public static native void glWaitSyncAPPLE(GLsync sync, int flags, long timeout);

    @Generated
    @CFunction
    public static native void glGetInteger64vAPPLE(int pname, LongPtr params);

    @Generated
    @CFunction
    public static native void glGetSyncivAPPLE(GLsync sync, int pname, int bufSize, IntPtr length, IntPtr values);

    @Generated
    @CFunction
    public static native void glDrawArraysInstancedEXT(int mode, int first, int count, int instanceCount);

    @Generated
    @CFunction
    public static native void glDrawElementsInstancedEXT(int mode, int count, int type, ConstVoidPtr indices,
            int instanceCount);

    @Generated
    @CFunction
    public static native void glVertexAttribDivisorEXT(int index, int divisor);

    @Generated
    @CFunction
    public static native void glGenQueriesEXT(int n, IntPtr ids);

    @Generated
    @CFunction
    public static native void glDeleteQueriesEXT(int n, ConstIntPtr ids);

    @Generated
    @CFunction
    public static native byte glIsQueryEXT(int id);

    @Generated
    @CFunction
    public static native void glBeginQueryEXT(int target, int id);

    @Generated
    @CFunction
    public static native void glEndQueryEXT(int target);

    @Generated
    @CFunction
    public static native void glGetQueryivEXT(int target, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetQueryObjectuivEXT(int id, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glUseProgramStagesEXT(int pipeline, int stages, int program);

    @Generated
    @CFunction
    public static native void glActiveShaderProgramEXT(int pipeline, int program);

    @Generated
    @CFunction
    public static native int glCreateShaderProgramvEXT(int type, int count,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] strings);

    @Generated
    @CFunction
    public static native void glBindProgramPipelineEXT(int pipeline);

    @Generated
    @CFunction
    public static native void glDeleteProgramPipelinesEXT(int n, ConstIntPtr pipelines);

    @Generated
    @CFunction
    public static native void glGenProgramPipelinesEXT(int n, IntPtr pipelines);

    @Generated
    @CFunction
    public static native byte glIsProgramPipelineEXT(int pipeline);

    @Generated
    @CFunction
    public static native void glProgramParameteriEXT(int program, int pname, int value);

    @Generated
    @CFunction
    public static native void glGetProgramPipelineivEXT(int pipeline, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glValidateProgramPipelineEXT(int pipeline);

    @Generated
    @CFunction
    public static native void glGetProgramPipelineInfoLogEXT(int pipeline, int bufSize, IntPtr length, BytePtr infoLog);

    @Generated
    @CFunction
    public static native void glProgramUniform1iEXT(int program, int location, int x);

    @Generated
    @CFunction
    public static native void glProgramUniform2iEXT(int program, int location, int x, int y);

    @Generated
    @CFunction
    public static native void glProgramUniform3iEXT(int program, int location, int x, int y, int z);

    @Generated
    @CFunction
    public static native void glProgramUniform4iEXT(int program, int location, int x, int y, int z, int w);

    @Generated
    @CFunction
    public static native void glProgramUniform1fEXT(int program, int location, float x);

    @Generated
    @CFunction
    public static native void glProgramUniform2fEXT(int program, int location, float x, float y);

    @Generated
    @CFunction
    public static native void glProgramUniform3fEXT(int program, int location, float x, float y, float z);

    @Generated
    @CFunction
    public static native void glProgramUniform4fEXT(int program, int location, float x, float y, float z, float w);

    @Generated
    @CFunction
    public static native void glProgramUniform1ivEXT(int program, int location, int count, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniform2ivEXT(int program, int location, int count, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniform3ivEXT(int program, int location, int count, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniform4ivEXT(int program, int location, int count, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniform1fvEXT(int program, int location, int count, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniform2fvEXT(int program, int location, int count, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniform3fvEXT(int program, int location, int count, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniform4fvEXT(int program, int location, int count, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniformMatrix2fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniformMatrix3fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniformMatrix4fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glReadBuffer(int mode);

    @Generated
    @CFunction
    public static native void glDrawRangeElements(int mode, int start, int end, int count, int type,
            ConstVoidPtr indices);

    @Generated
    @CFunction
    public static native void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth,
            int border, int format, int type, ConstVoidPtr pixels);

    @Generated
    @CFunction
    public static native void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width,
            int height, int depth, int format, int type, ConstVoidPtr pixels);

    @Generated
    @CFunction
    public static native void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x,
            int y, int width, int height);

    @Generated
    @CFunction
    public static native void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height,
            int depth, int border, int imageSize, ConstVoidPtr data);

    @Generated
    @CFunction
    public static native void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
            int width, int height, int depth, int format, int imageSize, ConstVoidPtr data);

    @Generated
    @CFunction
    public static native void glGenQueries(int n, IntPtr ids);

    @Generated
    @CFunction
    public static native void glDeleteQueries(int n, ConstIntPtr ids);

    @Generated
    @CFunction
    public static native byte glIsQuery(int id);

    @Generated
    @CFunction
    public static native void glBeginQuery(int target, int id);

    @Generated
    @CFunction
    public static native void glEndQuery(int target);

    @Generated
    @CFunction
    public static native void glGetQueryiv(int target, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetQueryObjectuiv(int id, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native byte glUnmapBuffer(int target);

    @Generated
    @CFunction
    public static native void glGetBufferPointerv(int target, int pname, Ptr<VoidPtr> params);

    @Generated
    @CFunction
    public static native void glDrawBuffers(int n, ConstIntPtr bufs);

    @Generated
    @CFunction
    public static native void glUniformMatrix2x3fv(int location, int count, byte transpose, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glUniformMatrix3x2fv(int location, int count, byte transpose, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glUniformMatrix2x4fv(int location, int count, byte transpose, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glUniformMatrix4x2fv(int location, int count, byte transpose, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glUniformMatrix3x4fv(int location, int count, byte transpose, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glUniformMatrix4x3fv(int location, int count, byte transpose, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0,
            int dstX1, int dstY1, int mask, int filter);

    @Generated
    @CFunction
    public static native void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width,
            int height);

    @Generated
    @CFunction
    public static native void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer);

    @Generated
    @CFunction
    public static native VoidPtr glMapBufferRange(int target, @NInt long offset, @NInt long length, int access);

    @Generated
    @CFunction
    public static native void glFlushMappedBufferRange(int target, @NInt long offset, @NInt long length);

    @Generated
    @CFunction
    public static native void glBindVertexArray(int array);

    @Generated
    @CFunction
    public static native void glDeleteVertexArrays(int n, ConstIntPtr arrays);

    @Generated
    @CFunction
    public static native void glGenVertexArrays(int n, IntPtr arrays);

    @Generated
    @CFunction
    public static native byte glIsVertexArray(int array);

    @Generated
    @CFunction
    public static native void glGetIntegeri_v(int target, int index, IntPtr data);

    @Generated
    @CFunction
    public static native void glBeginTransformFeedback(int primitiveMode);

    @Generated
    @CFunction
    public static native void glEndTransformFeedback();

    @Generated
    @CFunction
    public static native void glBindBufferRange(int target, int index, int buffer, @NInt long offset, @NInt long size);

    @Generated
    @CFunction
    public static native void glBindBufferBase(int target, int index, int buffer);

    @Generated
    @CFunction
    public static native void glTransformFeedbackVaryings(int program, int count,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] varyings,
            int bufferMode);

    @Generated
    @CFunction
    public static native void glGetTransformFeedbackVarying(int program, int index, int bufSize, IntPtr length,
            IntPtr size, IntPtr type, BytePtr name);

    @Generated
    @CFunction
    public static native void glVertexAttribIPointer(int index, int size, int type, int stride, ConstVoidPtr pointer);

    @Generated
    @CFunction
    public static native void glGetVertexAttribIiv(int index, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetVertexAttribIuiv(int index, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glVertexAttribI4i(int index, int x, int y, int z, int w);

    @Generated
    @CFunction
    public static native void glVertexAttribI4ui(int index, int x, int y, int z, int w);

    @Generated
    @CFunction
    public static native void glVertexAttribI4iv(int index, ConstIntPtr v);

    @Generated
    @CFunction
    public static native void glVertexAttribI4uiv(int index, ConstIntPtr v);

    @Generated
    @CFunction
    public static native void glGetUniformuiv(int program, int location, IntPtr params);

    @Generated
    @CFunction
    public static native int glGetFragDataLocation(int program,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    @Generated
    @CFunction
    public static native void glUniform1ui(int location, int v0);

    @Generated
    @CFunction
    public static native void glUniform2ui(int location, int v0, int v1);

    @Generated
    @CFunction
    public static native void glUniform3ui(int location, int v0, int v1, int v2);

    @Generated
    @CFunction
    public static native void glUniform4ui(int location, int v0, int v1, int v2, int v3);

    @Generated
    @CFunction
    public static native void glUniform1uiv(int location, int count, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glUniform2uiv(int location, int count, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glUniform3uiv(int location, int count, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glUniform4uiv(int location, int count, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glClearBufferiv(int buffer, int drawbuffer, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glClearBufferuiv(int buffer, int drawbuffer, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glClearBufferfv(int buffer, int drawbuffer, ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String glGetStringi(int name, int index);

    @Generated
    @CFunction
    public static native void glCopyBufferSubData(int readTarget, int writeTarget, @NInt long readOffset,
            @NInt long writeOffset, @NInt long size);

    @Generated
    @CFunction
    public static native void glGetUniformIndices(int program, int uniformCount,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] uniformNames,
            IntPtr uniformIndices);

    @Generated
    @CFunction
    public static native void glGetActiveUniformsiv(int program, int uniformCount, ConstIntPtr uniformIndices,
            int pname, IntPtr params);

    @Generated
    @CFunction
    public static native int glGetUniformBlockIndex(int program,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String uniformBlockName);

    @Generated
    @CFunction
    public static native void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize,
            IntPtr length, BytePtr uniformBlockName);

    @Generated
    @CFunction
    public static native void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding);

    @Generated
    @CFunction
    public static native void glDrawArraysInstanced(int mode, int first, int count, int instancecount);

    @Generated
    @CFunction
    public static native void glDrawElementsInstanced(int mode, int count, int type, ConstVoidPtr indices,
            int instancecount);

    @Generated
    @CFunction
    public static native GLsync glFenceSync(int condition, int flags);

    @Generated
    @CFunction
    public static native byte glIsSync(GLsync sync);

    @Generated
    @CFunction
    public static native void glDeleteSync(GLsync sync);

    @Generated
    @CFunction
    public static native int glClientWaitSync(GLsync sync, int flags, long timeout);

    @Generated
    @CFunction
    public static native void glWaitSync(GLsync sync, int flags, long timeout);

    @Generated
    @CFunction
    public static native void glGetInteger64v(int pname, LongPtr params);

    @Generated
    @CFunction
    public static native void glGetSynciv(GLsync sync, int pname, int bufSize, IntPtr length, IntPtr values);

    @Generated
    @CFunction
    public static native void glGetInteger64i_v(int target, int index, LongPtr data);

    @Generated
    @CFunction
    public static native void glGetBufferParameteri64v(int target, int pname, LongPtr params);

    @Generated
    @CFunction
    public static native void glGenSamplers(int count, IntPtr samplers);

    @Generated
    @CFunction
    public static native void glDeleteSamplers(int count, ConstIntPtr samplers);

    @Generated
    @CFunction
    public static native byte glIsSampler(int sampler);

    @Generated
    @CFunction
    public static native void glBindSampler(int unit, int sampler);

    @Generated
    @CFunction
    public static native void glSamplerParameteri(int sampler, int pname, int param);

    @Generated
    @CFunction
    public static native void glSamplerParameteriv(int sampler, int pname, ConstIntPtr param);

    @Generated
    @CFunction
    public static native void glSamplerParameterf(int sampler, int pname, float param);

    @Generated
    @CFunction
    public static native void glSamplerParameterfv(int sampler, int pname, ConstFloatPtr param);

    @Generated
    @CFunction
    public static native void glGetSamplerParameteriv(int sampler, int pname, IntPtr params);

    @Generated
    @CFunction
    public static native void glGetSamplerParameterfv(int sampler, int pname, FloatPtr params);

    @Generated
    @CFunction
    public static native void glVertexAttribDivisor(int index, int divisor);

    @Generated
    @CFunction
    public static native void glBindTransformFeedback(int target, int id);

    @Generated
    @CFunction
    public static native void glDeleteTransformFeedbacks(int n, ConstIntPtr ids);

    @Generated
    @CFunction
    public static native void glGenTransformFeedbacks(int n, IntPtr ids);

    @Generated
    @CFunction
    public static native byte glIsTransformFeedback(int id);

    @Generated
    @CFunction
    public static native void glPauseTransformFeedback();

    @Generated
    @CFunction
    public static native void glResumeTransformFeedback();

    @Generated
    @CFunction
    public static native void glGetProgramBinary(int program, int bufSize, IntPtr length, IntPtr binaryFormat,
            VoidPtr binary);

    @Generated
    @CFunction
    public static native void glProgramBinary(int program, int binaryFormat, ConstVoidPtr binary, int length);

    @Generated
    @CFunction
    public static native void glProgramParameteri(int program, int pname, int value);

    @Generated
    @CFunction
    public static native void glInvalidateFramebuffer(int target, int numAttachments, ConstIntPtr attachments);

    @Generated
    @CFunction
    public static native void glInvalidateSubFramebuffer(int target, int numAttachments, ConstIntPtr attachments, int x,
            int y, int width, int height);

    @Generated
    @CFunction
    public static native void glTexStorage2D(int target, int levels, int internalformat, int width, int height);

    @Generated
    @CFunction
    public static native void glTexStorage3D(int target, int levels, int internalformat, int width, int height,
            int depth);

    @Generated
    @CFunction
    public static native void glGetInternalformativ(int target, int internalformat, int pname, int bufSize,
            IntPtr params);

    @Generated
    @CFunction
    public static native void glProgramUniform1uiEXT(int program, int location, int x);

    @Generated
    @CFunction
    public static native void glProgramUniform2uiEXT(int program, int location, int x, int y);

    @Generated
    @CFunction
    public static native void glProgramUniform3uiEXT(int program, int location, int x, int y, int z);

    @Generated
    @CFunction
    public static native void glProgramUniform4uiEXT(int program, int location, int x, int y, int z, int w);

    @Generated
    @CFunction
    public static native void glProgramUniform1uivEXT(int program, int location, int count, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniform2uivEXT(int program, int location, int count, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniform3uivEXT(int program, int location, int count, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniform4uivEXT(int program, int location, int count, ConstIntPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniformMatrix2x3fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniformMatrix3x2fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniformMatrix2x4fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniformMatrix4x2fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniformMatrix3x4fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void glProgramUniformMatrix4x3fvEXT(int program, int location, int count, byte transpose,
            ConstFloatPtr value);

    @Generated
    @CFunction
    public static native void EAGLGetVersion(IntPtr major, IntPtr minor);

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kEAGLDrawablePropertyRetainedBacking();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kEAGLDrawablePropertyColorFormat();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kEAGLColorFormatRGBA8();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kEAGLColorFormatRGB565();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String kEAGLColorFormatSRGBA8();
}
