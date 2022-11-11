package test

import test.Resources.marioPng

val artifact = Artifact("test") {
    application {
        "Context" to ::Context
    }
}

/* content */

object Resources {
    val marioPng = "images/mario.png"
}

val bootstrapResources = listOf(
    marioPng,
)

/* runtime */

fun run(setup: Context.() -> Unit = {}) = bootstrapApplication(include = test.artifact) {
    val context: Context = import()
    val loader: Loader = import()

    context.setup()
    app.delegate = context
    loader.load(bootstrapResources)
}
