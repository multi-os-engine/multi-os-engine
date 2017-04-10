package ${_PLACEHOLDER_PACKAGE_NAME}.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

import java.util.concurrent.atomic.AtomicInteger;

import apple.coregraphics.struct.CGRect;
import apple.foundation.NSBundle;
import apple.foundation.NSString;
import apple.glkit.GLKBaseEffect;
import apple.glkit.GLKView;
import apple.glkit.GLKViewController;
import apple.glkit.enums.GLKVertexAttrib;
import apple.glkit.enums.GLKViewDrawableDepthFormat;
import apple.glkit.struct.GLKMatrix3;
import apple.glkit.struct.GLKMatrix4;
import apple.opengles.EAGLContext;
import apple.opengles.enums.EAGLRenderingAPI;

import static apple.foundation.enums.Enums.NSUTF8StringEncoding;
import static apple.glkit.c.GLKit.GLKMathDegreesToRadians;
import static apple.glkit.c.GLKit.GLKMatrix3Identity;
import static apple.glkit.c.GLKit.GLKMatrix3InvertAndTranspose;
import static apple.glkit.c.GLKit.GLKMatrix4GetMatrix3;
import static apple.glkit.c.GLKit.GLKMatrix4Identity;
import static apple.glkit.c.GLKit.GLKMatrix4MakePerspective;
import static apple.glkit.c.GLKit.GLKMatrix4MakeTranslation;
import static apple.glkit.c.GLKit.GLKMatrix4Multiply;
import static apple.glkit.c.GLKit.GLKMatrix4Rotate;
import static apple.glkit.c.GLKit.GLKVector4Make;
import static apple.opengles.c.OpenGLES.glAttachShader;
import static apple.opengles.c.OpenGLES.glBindAttribLocation;
import static apple.opengles.c.OpenGLES.glBindBuffer;
import static apple.opengles.c.OpenGLES.glBindVertexArrayOES;
import static apple.opengles.c.OpenGLES.glBufferData;
import static apple.opengles.c.OpenGLES.glClear;
import static apple.opengles.c.OpenGLES.glClearColor;
import static apple.opengles.c.OpenGLES.glCompileShader;
import static apple.opengles.c.OpenGLES.glCreateProgram;
import static apple.opengles.c.OpenGLES.glCreateShader;
import static apple.opengles.c.OpenGLES.glDeleteBuffers;
import static apple.opengles.c.OpenGLES.glDeleteProgram;
import static apple.opengles.c.OpenGLES.glDeleteShader;
import static apple.opengles.c.OpenGLES.glDeleteVertexArraysOES;
import static apple.opengles.c.OpenGLES.glDetachShader;
import static apple.opengles.c.OpenGLES.glDrawArrays;
import static apple.opengles.c.OpenGLES.glEnable;
import static apple.opengles.c.OpenGLES.glEnableVertexAttribArray;
import static apple.opengles.c.OpenGLES.glGenBuffers;
import static apple.opengles.c.OpenGLES.glGenVertexArraysOES;
import static apple.opengles.c.OpenGLES.glGetProgramInfoLog;
import static apple.opengles.c.OpenGLES.glGetProgramiv;
import static apple.opengles.c.OpenGLES.glGetShaderInfoLog;
import static apple.opengles.c.OpenGLES.glGetShaderiv;
import static apple.opengles.c.OpenGLES.glGetUniformLocation;
import static apple.opengles.c.OpenGLES.glLinkProgram;
import static apple.opengles.c.OpenGLES.glShaderSource;
import static apple.opengles.c.OpenGLES.glUniformMatrix3fv;
import static apple.opengles.c.OpenGLES.glUniformMatrix4fv;
import static apple.opengles.c.OpenGLES.glUseProgram;
import static apple.opengles.c.OpenGLES.glValidateProgram;
import static apple.opengles.c.OpenGLES.glVertexAttribPointer;
import static apple.opengles.enums.ES2.ARRAY_BUFFER;
import static apple.opengles.enums.ES2.COLOR_BUFFER_BIT;
import static apple.opengles.enums.ES2.COMPILE_STATUS;
import static apple.opengles.enums.ES2.DEPTH_BUFFER_BIT;
import static apple.opengles.enums.ES2.DEPTH_TEST;
import static apple.opengles.enums.ES2.FALSE;
import static apple.opengles.enums.ES2.FLOAT;
import static apple.opengles.enums.ES2.FRAGMENT_SHADER;
import static apple.opengles.enums.ES2.INFO_LOG_LENGTH;
import static apple.opengles.enums.ES2.LINK_STATUS;
import static apple.opengles.enums.ES2.STATIC_DRAW;
import static apple.opengles.enums.ES2.TRIANGLES;
import static apple.opengles.enums.ES2.TRUE;
import static apple.opengles.enums.ES2.VALIDATE_STATUS;
import static apple.opengles.enums.ES2.VERTEX_SHADER;
import static ${_PLACEHOLDER_PACKAGE_NAME}.ui.GameViewController.Uniforms.NUM_UNIFORMS;
import static ${_PLACEHOLDER_PACKAGE_NAME}.ui.GameViewController.Uniforms.UNIFORM_MODELVIEWPROJECTION_MATRIX;
import static ${_PLACEHOLDER_PACKAGE_NAME}.ui.GameViewController.Uniforms.UNIFORM_NORMAL_MATRIX;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("GameViewController")
@RegisterOnStartup
public class GameViewController extends GLKViewController {

    private static final boolean DEBUG = false;

    private static final int FLOAT_BYTES = 4;

    @Owned
    @Selector("alloc")
    public static native GameViewController alloc();

    @Selector("init")
    public native GameViewController init();

    protected GameViewController(Pointer peer) {
        super(peer);
    }

    // Uniform index.
    enum Uniforms {
        UNIFORM_MODELVIEWPROJECTION_MATRIX,
        UNIFORM_NORMAL_MATRIX,
        NUM_UNIFORMS
    }

    int uniforms[] = new int[NUM_UNIFORMS.ordinal()];

    // Attribute index.
    enum Attributes {
        ATTRIB_VERTEX,
        ATTRIB_NORMAL,
        NUM_ATTRIBUTES
    }

    float gCubeVertexData[] = new float[]{
        // @formatter:off
        // Data layout for each line below is:
        // positionX, positionY, positionZ,     normalX, normalY, normalZ,
        0.5f, -0.5f, -0.5f,        1.0f, 0.0f, 0.0f,
        0.5f, 0.5f, -0.5f,         1.0f, 0.0f, 0.0f,
        0.5f, -0.5f, 0.5f,         1.0f, 0.0f, 0.0f,
        0.5f, -0.5f, 0.5f,         1.0f, 0.0f, 0.0f,
        0.5f, 0.5f, -0.5f,         1.0f, 0.0f, 0.0f,
        0.5f, 0.5f, 0.5f,          1.0f, 0.0f, 0.0f,

        0.5f, 0.5f, -0.5f,         0.0f, 1.0f, 0.0f,
        -0.5f, 0.5f, -0.5f,        0.0f, 1.0f, 0.0f,
        0.5f, 0.5f, 0.5f,          0.0f, 1.0f, 0.0f,
        0.5f, 0.5f, 0.5f,          0.0f, 1.0f, 0.0f,
        -0.5f, 0.5f, -0.5f,        0.0f, 1.0f, 0.0f,
        -0.5f, 0.5f, 0.5f,         0.0f, 1.0f, 0.0f,

        -0.5f, 0.5f, -0.5f,        -1.0f, 0.0f, 0.0f,
        -0.5f, -0.5f, -0.5f,       -1.0f, 0.0f, 0.0f,
        -0.5f, 0.5f, 0.5f,         -1.0f, 0.0f, 0.0f,
        -0.5f, 0.5f, 0.5f,         -1.0f, 0.0f, 0.0f,
        -0.5f, -0.5f, -0.5f,       -1.0f, 0.0f, 0.0f,
        -0.5f, -0.5f, 0.5f,        -1.0f, 0.0f, 0.0f,

        -0.5f, -0.5f, -0.5f,       0.0f, -1.0f, 0.0f,
        0.5f, -0.5f, -0.5f,        0.0f, -1.0f, 0.0f,
        -0.5f, -0.5f, 0.5f,        0.0f, -1.0f, 0.0f,
        -0.5f, -0.5f, 0.5f,        0.0f, -1.0f, 0.0f,
        0.5f, -0.5f, -0.5f,        0.0f, -1.0f, 0.0f,
        0.5f, -0.5f, 0.5f,         0.0f, -1.0f, 0.0f,

        0.5f, 0.5f, 0.5f,          0.0f, 0.0f, 1.0f,
        -0.5f, 0.5f, 0.5f,         0.0f, 0.0f, 1.0f,
        0.5f, -0.5f, 0.5f,         0.0f, 0.0f, 1.0f,
        0.5f, -0.5f, 0.5f,         0.0f, 0.0f, 1.0f,
        -0.5f, 0.5f, 0.5f,         0.0f, 0.0f, 1.0f,
        -0.5f, -0.5f, 0.5f,        0.0f, 0.0f, 1.0f,

        0.5f, -0.5f, -0.5f,        0.0f, 0.0f, -1.0f,
        -0.5f, -0.5f, -0.5f,       0.0f, 0.0f, -1.0f,
        0.5f, 0.5f, -0.5f,         0.0f, 0.0f, -1.0f,
        0.5f, 0.5f, -0.5f,         0.0f, 0.0f, -1.0f,
        -0.5f, -0.5f, -0.5f,       0.0f, 0.0f, -1.0f,
        -0.5f, 0.5f, -0.5f,        0.0f, 0.0f, -1.0f
        // @formatter:on
    };

    int program;
    GLKMatrix4 modelViewProjectionMatrix = GLKMatrix4Identity();
    GLKMatrix3 normalMatrix = GLKMatrix3Identity();
    float rotation;

    int vertexArray;
    int vertexBuffer;

    EAGLContext context;
    GLKBaseEffect effect;

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        context = EAGLContext.alloc().initWithAPI(EAGLRenderingAPI.GLES2);

        if (context == null) {
            System.err.println("Failed to create ES context");
        }

        GLKView view = (GLKView) view();
        view.setContext(context);
        view.setDrawableDepthFormat(GLKViewDrawableDepthFormat.Format24);

        setupGL();
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            tearDownGL();

            if (EAGLContext.currentContext() == context) {
                EAGLContext.setCurrentContext(null);
            }
        } finally {
            super.finalize();
        }
    }

    @Override
    public void didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning();

        if (isViewLoaded() && view().window() == null) {
            setView(null);

            tearDownGL();

            if (EAGLContext.currentContext() == context) {
                EAGLContext.setCurrentContext(null);
            }
            context = null;
        }
    }

    @Override
    public boolean prefersStatusBarHidden() {
        return true;
    }

    private void setupGL() {
        EAGLContext.setCurrentContext(context);

        loadShaders();

        effect = GLKBaseEffect.alloc().init();
        effect.light0().setEnabled((byte) TRUE);
        effect.light0().setDiffuseColor(GLKVector4Make(1.0f, 0.4f, 0.4f, 1.0f));

        glEnable(DEPTH_TEST);

        final IntPtr target = PtrFactory.newIntReference();
        glGenVertexArraysOES(1, target);
        vertexArray = target.getValue();
        glBindVertexArrayOES(vertexArray);

        glGenBuffers(1, target);
        vertexBuffer = target.getValue();
        glBindBuffer(ARRAY_BUFFER, vertexBuffer);
        glBufferData(ARRAY_BUFFER, gCubeVertexData.length * FLOAT_BYTES, PtrFactory.newFloatArray
                (gCubeVertexData), STATIC_DRAW);

        glEnableVertexAttribArray(GLKVertexAttrib.Position);
        glVertexAttribPointer(GLKVertexAttrib.Position, 3, FLOAT, (byte) FALSE, 24, PtrFactory
                .newWeakVoidPtr(0));
        glEnableVertexAttribArray(GLKVertexAttrib.Normal);
        glVertexAttribPointer(GLKVertexAttrib.Normal, 3, FLOAT, (byte) FALSE, 24, PtrFactory
                .newWeakVoidPtr(12));

        glBindVertexArrayOES(0);
    }

    private void tearDownGL() {
        EAGLContext.setCurrentContext(context);

        final IntPtr target = PtrFactory.newIntReference(vertexBuffer);
        glDeleteBuffers(1, target);
        target.setValue(vertexArray);
        glDeleteVertexArraysOES(1, target);

        effect = null;

        if (program != 0) {
            glDeleteProgram(program);
            program = 0;
        }
    }

    @Selector("update")
    public void update() {
        float aspect = (float) Math.abs(view().bounds().size().width() / view().bounds().size()
                .height());
        GLKMatrix4 projectionMatrix = GLKMatrix4MakePerspective(GLKMathDegreesToRadians(65.0f),
                aspect, 0.1f, 100.0f);

        effect.transform().setProjectionMatrix(projectionMatrix);

        GLKMatrix4 baseModelViewMatrix = GLKMatrix4MakeTranslation(0.0f, 0.0f, -4.0f);
        baseModelViewMatrix = GLKMatrix4Rotate(baseModelViewMatrix, rotation, 0.0f, 1.0f, 0.0f);

        // Compute the model view matrix for the object rendered with GLKit
        GLKMatrix4 modelViewMatrix = GLKMatrix4MakeTranslation(0.0f, 0.0f, -1.5f);
        modelViewMatrix = GLKMatrix4Rotate(modelViewMatrix, rotation, 1.0f, 1.0f, 1.0f);
        modelViewMatrix = GLKMatrix4Multiply(baseModelViewMatrix, modelViewMatrix);

        effect.transform().setModelviewMatrix(modelViewMatrix);

        // Compute the model view matrix for the object rendered with ES2
        modelViewMatrix = GLKMatrix4MakeTranslation(0.0f, 0.0f, 1.5f);
        modelViewMatrix = GLKMatrix4Rotate(modelViewMatrix, rotation, 1.0f, 1.0f, 1.0f);
        modelViewMatrix = GLKMatrix4Multiply(baseModelViewMatrix, modelViewMatrix);

        normalMatrix = GLKMatrix3InvertAndTranspose(GLKMatrix4GetMatrix3(modelViewMatrix), null);

        modelViewProjectionMatrix = GLKMatrix4Multiply(projectionMatrix, modelViewMatrix);

        rotation += timeSinceLastUpdate() * 0.5f;
    }

    @Override
    public void glkViewDrawInRect(GLKView glkView, @ByValue CGRect cgRect) {
        glClearColor(0.65f, 0.65f, 0.65f, 1.0f);
        glClear(COLOR_BUFFER_BIT | DEPTH_BUFFER_BIT);

        glBindVertexArrayOES(vertexArray);

        // Render the object with GLKit
        effect.prepareToDraw();

        glDrawArrays(TRIANGLES, 0, 36);

        // Render the object again with ES2
        glUseProgram(program);

        glUniformMatrix4fv(uniforms[UNIFORM_MODELVIEWPROJECTION_MATRIX.ordinal()], 1, (byte) 0,
                PtrFactory.newWeakVoidPtr(modelViewProjectionMatrix.getPeerPointer()).getFloatPtr
                        ());
        glUniformMatrix3fv(uniforms[UNIFORM_NORMAL_MATRIX.ordinal()], 1, (byte) 0, PtrFactory
                .newWeakVoidPtr(normalMatrix.getPeerPointer()).getFloatPtr());

        glDrawArrays(TRIANGLES, 0, 36);
    }

    private boolean loadShaders() {
        AtomicInteger vertShader = new AtomicInteger();
        AtomicInteger fragShader = new AtomicInteger();
        String vertShaderPathname, fragShaderPathname;

        // Create shader program.
        program = glCreateProgram();

        // Create and compile vertex shader.
        vertShaderPathname = NSBundle.mainBundle().pathForResourceOfType("Shader", "vsh");
        if (!compileShader(vertShader, VERTEX_SHADER, vertShaderPathname)) {
            System.err.println("Failed to compile vertex shader");
            return false;
        }

        // Create and compile fragment shader.
        fragShaderPathname = NSBundle.mainBundle().pathForResourceOfType("Shader", "fsh");
        if (!compileShader(fragShader, FRAGMENT_SHADER, fragShaderPathname)) {
            System.err.println("Failed to compile fragment shader");
            return false;
        }

        // Attach vertex shader to program.
        glAttachShader(program, vertShader.get());

        // Attach fragment shader to program.
        glAttachShader(program, fragShader.get());

        // Bind attribute locations.
        // This needs to be done prior to linking.
        glBindAttribLocation(program, GLKVertexAttrib.Position, "position");
        glBindAttribLocation(program, GLKVertexAttrib.Normal, "normal");

        // Link program.
        if (!linkProgram(program)) {
            System.err.println("Failed to link program: " + program);

            if (vertShader.get() != 0) {
                glDeleteShader(vertShader.get());
                vertShader.set(0);
            }
            if (fragShader.get() != 0) {
                glDeleteShader(fragShader.get());
                fragShader.set(0);
            }
            if (program != 0) {
                glDeleteProgram(program);
                program = 0;
            }

            return false;
        }

        // Get uniform locations.
        uniforms[UNIFORM_MODELVIEWPROJECTION_MATRIX.ordinal()] = glGetUniformLocation(program,
                "modelViewProjectionMatrix");
        uniforms[UNIFORM_NORMAL_MATRIX.ordinal()] = glGetUniformLocation(program, "normalMatrix");

        // Release vertex and fragment shaders.
        if (vertShader.get() != 0) {
            glDetachShader(program, vertShader.get());
            glDeleteShader(vertShader.get());
        }
        if (fragShader.get() != 0) {
            glDetachShader(program, fragShader.get());
            glDeleteShader(fragShader.get());
        }

        return true;
    }

    private boolean compileShader(AtomicInteger _shader, int type, String file) {
        final IntPtr status = PtrFactory.newIntReference();

        final NSString contentsOfFile = NSString.stringWithContentsOfFileEncodingError(file,
                NSUTF8StringEncoding, null);
        if (contentsOfFile == null) {
            System.err.println("Failed to load vertex shader");
            return false;
        }

        int shader = glCreateShader(type);
        _shader.set(shader);
        glShaderSource(shader, 1, new String[]{contentsOfFile.description()}, null);
        glCompileShader(shader);

        if (DEBUG) {
            final IntPtr logLength = PtrFactory.newIntReference();
            glGetShaderiv(shader, INFO_LOG_LENGTH, logLength);
            final int logLengthValue = logLength.getValue();
            if (logLengthValue > 0) {
                BytePtr log = PtrFactory.newByteArray(logLengthValue);
                glGetShaderInfoLog(shader, logLengthValue, logLength, log);
                System.err.println("Shader compile log:\n" + log.toASCIIString());
            }
        }

        glGetShaderiv(shader, COMPILE_STATUS, status);
        if (status.getValue() != TRUE) {
            glDeleteShader(shader);
            return false;
        }

        return true;
    }

    private boolean linkProgram(int prog) {
        final IntPtr status = PtrFactory.newIntReference();
        glLinkProgram(prog);

        if (DEBUG) {
            final IntPtr logLength = PtrFactory.newIntReference();
            glGetProgramiv(prog, INFO_LOG_LENGTH, logLength);
            final int logLengthValue = logLength.getValue();
            if (logLengthValue > 0) {
                BytePtr log = PtrFactory.newByteArray(logLengthValue);
                glGetProgramInfoLog(prog, logLengthValue, logLength, log);
                System.err.println("Program link log:\n" + log.toASCIIString());
            }
        }

        glGetProgramiv(prog, LINK_STATUS, status);
        if (status.getValue() != TRUE) {
            return false;
        }

        return true;
    }

    private boolean validateProgram(int prog) {
        final IntPtr status = PtrFactory.newIntReference();

        glValidateProgram(prog);
        final IntPtr logLength = PtrFactory.newIntReference();
        glGetProgramiv(prog, INFO_LOG_LENGTH, logLength);
        final int logLengthValue = logLength.getValue();
        if (logLengthValue > 0) {
            BytePtr log = PtrFactory.newByteArray(logLengthValue);
            glGetProgramInfoLog(prog, logLengthValue, logLength, log);
            System.err.println("Program validate log:\n" + log.toASCIIString());
        }

        glGetProgramiv(prog, VALIDATE_STATUS, status);
        if (status.getValue() != TRUE) {
            return false;
        }

        return true;
    }
}
