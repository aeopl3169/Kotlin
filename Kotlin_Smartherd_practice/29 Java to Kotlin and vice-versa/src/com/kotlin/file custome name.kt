@file: JvmName("CustomName")
package com.kotlin

import com.myjava.MyJavaFile

fun main() {
    // Calling Java method into kotlin.
    var area = MyJavaFile.getArea(10, 5)
    println(area)
    println(addition(2,6))
}

fun addition(a: Int, b: Int): Int {
    return a + b
}