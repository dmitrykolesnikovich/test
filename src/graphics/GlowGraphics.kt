package test

import featurea.math.*
import featurea.opengl.*
import test.Resources.glowShader

class GlowGraphics : ShaderGraphics() {

    val program = Program(glowShader)
    val buffer = Buffer()

    override fun build() {
        gl.buildProgram(program)
        gl.buildBuffer(buffer)
    }

    fun drawGlow(bounds: Rectangle, color: Color) {
        val (left, top, right. bottom) = bounds

        gl.useProgram(program)
        gl.useBuffer(buffer.assign(left, top, right, bottom, right, top, left, top, right, bottom, left, bottom))
        gl.uniforms["color"] = color
        gl.drawArrays(TRIANGLE)
    }

}
