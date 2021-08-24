/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

package codegen.lateinit.localCapturedNotInitialized

import kotlin.native.internal.*
import kotlin.test.*

@Test fun runTest() {
    val frame = runtimeGetCurrentFrame()
    lateinit var s: String

    fun foo() = s

    try {
        println(foo())
    }
    catch (e: RuntimeException) {
        assertTrue(runtimeCurrentFrameIsEqual(frame))
        println("OK")
        return
    }
    println("Fail")
}