package test

import featurea.app.*
import featurea.runtime.*

fun main() = run {
    val context: Context = import()

    // Level 1
    val level1 = Level()
    level1.bodies.add(Body())
    context.level = level1
}
