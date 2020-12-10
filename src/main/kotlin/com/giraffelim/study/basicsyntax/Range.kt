package com.girrafelim.study.basicsyntax

fun main() {
    fitInRage()
    println("---------------")
    outOfRange()
    println("---------------")
    iterOverRange()
    println("---------------")
    overProgression()
}

fun fitInRage() {
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits In Range");
    }
}

fun outOfRange() {
    val list = listOf("a", "b", "c");

    if(-1 !in 0..list.lastIndex) {
        println("-1 is out of Range")
    }

    if(list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
}

fun iterOverRange() {
    for (x in 1..5) {
        println(x)
    }
}

fun overProgression() {
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo  0 step 3) {
        print(x)
    }
}