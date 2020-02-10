package com.kotlin

import com.myjava.MyJavaFile

fun main() {
    // Calling Java method into kotlin.
    var area = MyJavaFile.getArea(10, 4)
    println(area)
}

fun add(a: Int, b: Int): Int {
    return a + b
}