package com.giraffelim.study.basicsyntax

fun main() {
    whileLoop();
    println("--------------")
    forLoop()
    println("--------------")
    forEachLoop()
    println("--------------")
    forLoopIndices()
}

fun whileLoop(): Unit {
    // listOf == 읽기전용 list, add() 불가능
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++;
    }
}

fun forLoop() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}

fun forLoopIndices() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun forEachLoop() {
    val items = listOf("apple", "banana", "kiwifruit")
    items.forEach { data -> println(data) }
}