package com.giraffelim.study.basicsyntax

fun main() {
    printProduct("3", "5")
}

fun printProduct(arg1: String, arg2: String): Unit {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number")
    }
}