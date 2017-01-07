package ${_PLACEHOLDER_PACKAGE_NAME}.ui

import apple.coregraphics.struct.CGRect
import apple.foundation.NSBundle
import apple.foundation.NSString
import apple.foundation.enums.Enums.NSUTF8StringEncoding
import apple.glkit.GLKBaseEffect
import apple.glkit.GLKView
import apple.glkit.GLKViewController
import apple.glkit.c.GLKit.*
import apple.glkit.enums.GLKVertexAttrib
import apple.glkit.enums.GLKViewDrawableDepthFormat
import apple.opengles.EAGLContext
import apple.opengles.c.OpenGLES.*
import apple.opengles.enums.EAGLRenderingAPI
import apple.opengles.enums.ES2.*
import org.moe.natj.general.Pointer
import org.moe.natj.general.ann.ByValue
import org.moe.natj.general.ann.Owned
import org.moe.natj.general.ann.RegisterOnStartup
import org.moe.natj.general.ptr.impl.PtrFactory
import org.moe.natj.objc.ObjCRuntime
import org.moe.natj.objc.ann.ObjCClassName
import org.moe.natj.objc.ann.Selector
import java.util.concurrent.atomic.AtomicInteger
import ${_PLACEHOLDER_PACKAGE_NAME}.ui.GameViewController.Uniforms.*

@org.moe.natj.general.ann.Runtime(ObjCRuntime::class)
@ObjCClassName("GameViewController")
@RegisterOnStartup
class GameViewController protected constructor(peer: Pointer) : GLKViewController(peer) {

    @Selector("init")
    override external fun init(): GameViewController

    // Uniform index.
    internal enum class Uniforms {
        UNIFORM_MODELVIEWPROJECTION_MATRIX,
        UNIFORM_NORMAL_MATRIX,
        NUM_UNIFORMS
    }

    internal var uniforms = IntArray(NUM_UNIFORMS.ordinal)

    // Attribute index.
    internal enum class Attributes {
        ATTRIB_VERTEX,
        ATTRIB_NORMAL,
        NUM_ATTRIBUTES
    }

    internal var gCubeVertexData = floatArrayOf(
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
    )

    internal var program: Int = 0
    internal var modelViewProjectionMatrix = GLKMatrix4Identity()
    internal var normalMatrix = GLKMatrix3Identity()
    internal var rotation: Float = 0.toFloat()

    internal var vertexArray: Int = 0
    internal var vertexBuffer: Int = 0

    internal var context: EAGLContext? = null
    internal var effect: GLKBaseEffect? = null

    override fun viewDidLoad() {
        super.viewDidLoad()

        context = EAGLContext.alloc().initWithAPI(EAGLRenderingAPI.GLES2)

        if (context == null) {
            System.err.println("Failed to create ES context")
        }

        val view = view() as GLKView
        view.setContext(context)
        view.setDrawableDepthFormat(GLKViewDrawableDepthFormat.Format24)

        setupGL()
    }

    @Throws(Throwable::class)
    override fun finalize() {
        try {
            tearDownGL()

            if (EAGLContext.currentContext() === context) {
                EAGLContext.setCurrentContext(null)
            }
        } finally {
            super.finalize()
        }
    }

    override fun didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()

        if (isViewLoaded && view().window() == null) {
            setView(null)

            tearDownGL()

            if (EAGLContext.currentContext() === context) {
                EAGLContext.setCurrentContext(null)
            }
            context = null
        }
    }

    override fun prefersStatusBarHidden(): Boolean {
        return true
    }

    private fun setupGL() {
        EAGLContext.setCurrentContext(context)

        loadShaders()

        effect = GLKBaseEffect.alloc().init()
        effect!!.light0().setEnabled(TRUE.toByte())
        effect!!.light0().setDiffuseColor(GLKVector4Make(1.0f, 0.4f, 0.4f, 1.0f))

        glEnable(DEPTH_TEST)

        val target = PtrFactory.newIntReference()
        glGenVertexArraysOES(1, target)
        vertexArray = target.value
        glBindVertexArrayOES(vertexArray)

        glGenBuffers(1, target)
        vertexBuffer = target.value
        glBindBuffer(ARRAY_BUFFER, vertexBuffer)
        glBufferData(ARRAY_BUFFER, (gCubeVertexData.size * java.lang.Float.BYTES).toLong(), PtrFactory.newFloatArray(gCubeVertexData), STATIC_DRAW)

        glEnableVertexAttribArray(GLKVertexAttrib.Position)
        glVertexAttribPointer(GLKVertexAttrib.Position, 3, FLOAT, FALSE.toByte(), 24, PtrFactory
                .newWeakVoidPtr(0))
        glEnableVertexAttribArray(GLKVertexAttrib.Normal)
        glVertexAttribPointer(GLKVertexAttrib.Normal, 3, FLOAT, FALSE.toByte(), 24, PtrFactory
                .newWeakVoidPtr(12))

        glBindVertexArrayOES(0)
    }

    private fun tearDownGL() {
        EAGLContext.setCurrentContext(context)

        val target = PtrFactory.newIntReference(vertexBuffer)
        glDeleteBuffers(1, target)
        target.value = vertexArray
        glDeleteVertexArraysOES(1, target)

        effect = null

        if (program != 0) {
            glDeleteProgram(program)
            program = 0
        }
    }

    @Selector("update")
    fun update() {
        val aspect = Math.abs(view().bounds().size().width() / view().bounds().size()
                .height()).toFloat()
        val projectionMatrix = GLKMatrix4MakePerspective(GLKMathDegreesToRadians(65.0f),
                aspect, 0.1f, 100.0f)

        effect!!.transform().setProjectionMatrix(projectionMatrix)

        var baseModelViewMatrix = GLKMatrix4MakeTranslation(0.0f, 0.0f, -4.0f)
        baseModelViewMatrix = GLKMatrix4Rotate(baseModelViewMatrix, rotation, 0.0f, 1.0f, 0.0f)

        // Compute the model view matrix for the object rendered with GLKit
        var modelViewMatrix = GLKMatrix4MakeTranslation(0.0f, 0.0f, -1.5f)
        modelViewMatrix = GLKMatrix4Rotate(modelViewMatrix, rotation, 1.0f, 1.0f, 1.0f)
        modelViewMatrix = GLKMatrix4Multiply(baseModelViewMatrix, modelViewMatrix)

        effect!!.transform().setModelviewMatrix(modelViewMatrix)

        // Compute the model view matrix for the object rendered with ES2
        modelViewMatrix = GLKMatrix4MakeTranslation(0.0f, 0.0f, 1.5f)
        modelViewMatrix = GLKMatrix4Rotate(modelViewMatrix, rotation, 1.0f, 1.0f, 1.0f)
        modelViewMatrix = GLKMatrix4Multiply(baseModelViewMatrix, modelViewMatrix)

        normalMatrix = GLKMatrix3InvertAndTranspose(GLKMatrix4GetMatrix3(modelViewMatrix), null)

        modelViewProjectionMatrix = GLKMatrix4Multiply(projectionMatrix, modelViewMatrix)

        rotation += (timeSinceLastUpdate() * 0.5f).toFloat()
    }

    override fun glkViewDrawInRect(glkView: GLKView, @ByValue cgRect: CGRect) {
        glClearColor(0.65f, 0.65f, 0.65f, 1.0f)
        glClear(COLOR_BUFFER_BIT or DEPTH_BUFFER_BIT)

        glBindVertexArrayOES(vertexArray)

        // Render the object with GLKit
        effect!!.prepareToDraw()

        glDrawArrays(TRIANGLES, 0, 36)

        // Render the object again with ES2
        glUseProgram(program)

        glUniformMatrix4fv(uniforms[UNIFORM_MODELVIEWPROJECTION_MATRIX.ordinal], 1, 0.toByte(),
                PtrFactory.newWeakVoidPtr(modelViewProjectionMatrix.peerPointer).floatPtr)
        glUniformMatrix3fv(uniforms[UNIFORM_NORMAL_MATRIX.ordinal], 1, 0.toByte(), PtrFactory
                .newWeakVoidPtr(normalMatrix.peerPointer).floatPtr)

        glDrawArrays(TRIANGLES, 0, 36)
    }

    private fun loadShaders(): Boolean {
        val vertShader = AtomicInteger()
        val fragShader = AtomicInteger()
        val vertShaderPathname: String
        val fragShaderPathname: String

        // Create shader program.
        program = glCreateProgram()

        // Create and compile vertex shader.
        vertShaderPathname = NSBundle.mainBundle().pathForResourceOfType("Shader", "vsh")
        if (!compileShader(vertShader, VERTEX_SHADER, vertShaderPathname)) {
            System.err.println("Failed to compile vertex shader")
            return false
        }

        // Create and compile fragment shader.
        fragShaderPathname = NSBundle.mainBundle().pathForResourceOfType("Shader", "fsh")
        if (!compileShader(fragShader, FRAGMENT_SHADER, fragShaderPathname)) {
            System.err.println("Failed to compile fragment shader")
            return false
        }

        // Attach vertex shader to program.
        glAttachShader(program, vertShader.get())

        // Attach fragment shader to program.
        glAttachShader(program, fragShader.get())

        // Bind attribute locations.
        // This needs to be done prior to linking.
        glBindAttribLocation(program, GLKVertexAttrib.Position, "position")
        glBindAttribLocation(program, GLKVertexAttrib.Normal, "normal")

        // Link program.
        if (!linkProgram(program)) {
            System.err.println("Failed to link program: " + program)

            if (vertShader.get() != 0) {
                glDeleteShader(vertShader.get())
                vertShader.set(0)
            }
            if (fragShader.get() != 0) {
                glDeleteShader(fragShader.get())
                fragShader.set(0)
            }
            if (program != 0) {
                glDeleteProgram(program)
                program = 0
            }

            return false
        }

        // Get uniform locations.
        uniforms[UNIFORM_MODELVIEWPROJECTION_MATRIX.ordinal] = glGetUniformLocation(program,
                "modelViewProjectionMatrix")
        uniforms[UNIFORM_NORMAL_MATRIX.ordinal] = glGetUniformLocation(program, "normalMatrix")

        // Release vertex and fragment shaders.
        if (vertShader.get() != 0) {
            glDetachShader(program, vertShader.get())
            glDeleteShader(vertShader.get())
        }
        if (fragShader.get() != 0) {
            glDetachShader(program, fragShader.get())
            glDeleteShader(fragShader.get())
        }

        return true
    }

    private fun compileShader(_shader: AtomicInteger, type: Int, file: String): Boolean {
        val status = PtrFactory.newIntReference()

        val contentsOfFile = NSString.stringWithContentsOfFileEncodingError(file,
                NSUTF8StringEncoding, null)
        if (contentsOfFile == null) {
            System.err.println("Failed to load vertex shader")
            return false
        }

        val shader = glCreateShader(type)
        _shader.set(shader)
        glShaderSource(shader, 1, arrayOf(contentsOfFile.description()), null)
        glCompileShader(shader)

        if (DEBUG) {
            val logLength = PtrFactory.newIntReference()
            glGetShaderiv(shader, INFO_LOG_LENGTH, logLength)
            val logLengthValue = logLength.value
            if (logLengthValue > 0) {
                val log = PtrFactory.newByteArray(logLengthValue)
                glGetShaderInfoLog(shader, logLengthValue, logLength, log)
                System.err.println("Shader compile log:\n" + log.toASCIIString())
            }
        }

        glGetShaderiv(shader, COMPILE_STATUS, status)
        if (status.value != TRUE) {
            glDeleteShader(shader)
            return false
        }

        return true
    }

    private fun linkProgram(prog: Int): Boolean {
        val status = PtrFactory.newIntReference()
        glLinkProgram(prog)

        if (DEBUG) {
            val logLength = PtrFactory.newIntReference()
            glGetProgramiv(prog, INFO_LOG_LENGTH, logLength)
            val logLengthValue = logLength.value
            if (logLengthValue > 0) {
                val log = PtrFactory.newByteArray(logLengthValue)
                glGetProgramInfoLog(prog, logLengthValue, logLength, log)
                System.err.println("Program link log:\n" + log.toASCIIString())
            }
        }

        glGetProgramiv(prog, LINK_STATUS, status)
        if (status.value != TRUE) {
            return false
        }

        return true
    }

    private fun validateProgram(prog: Int): Boolean {
        val status = PtrFactory.newIntReference()

        glValidateProgram(prog)
        val logLength = PtrFactory.newIntReference()
        glGetProgramiv(prog, INFO_LOG_LENGTH, logLength)
        val logLengthValue = logLength.value
        if (logLengthValue > 0) {
            val log = PtrFactory.newByteArray(logLengthValue)
            glGetProgramInfoLog(prog, logLengthValue, logLength, log)
            System.err.println("Program validate log:\n" + log.toASCIIString())
        }

        glGetProgramiv(prog, VALIDATE_STATUS, status)
        if (status.value != TRUE) {
            return false
        }

        return true
    }

    companion object {

        private val DEBUG = false

        @Owned
        @Selector("alloc")
        @JvmStatic external fun alloc(): GameViewController
    }
}
