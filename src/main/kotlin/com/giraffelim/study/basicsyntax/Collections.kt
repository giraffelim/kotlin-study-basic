package com.giraffelim.study.basicsyntax

fun main() {
    iterCollections()
    println("----------------")
    checkCollections()
    println("----------------")
    lambdaExpression()
}

fun iterCollections() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}

fun checkCollections() {
    val items = listOf("apple", "banana", "kiwifruit")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}

fun lambdaExpression() {
    val fruits = listOf("apple", "banana", "kiwifruit", "avocado")
    val sortedFruits = fruits.sortedBy { it }
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}