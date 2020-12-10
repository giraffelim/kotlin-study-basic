package com.girrafelim.study.basicsyntax

import java.lang.NumberFormatException

fun main() {
    print("sum of 3 and 5 is ")
    println(sum(3, 5))
    println(inferredSum(3, 5));
    printSum(3, 7);

    val a : Int = 100
    val boxedA : Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA)

    val b : Int = 10000
    val boxedB : Int? = b
    val anotherBoxedB : Int? = b
    println(boxedB === anotherBoxedB)

    println(stringTemplates())

    println(parseInt("O1O"))
}

fun sum(a: Int, b: Int): Int {
    return a+b
}

fun inferredSum(a: Int, b: Int) = a+b

fun printSum(a: Int, b: Int) {
    println("sum of " + a + " and $b is ${a+b}")
}

fun stringTemplates(): String {
    var a = 1
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    return s2
}

fun maxOfValue(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun ifExpression(a: Int, b:Int) = if (a > b) a else b

fun parseInt(str: String): Int? {
    return try{
        str.toInt();
    }catch (e: NumberFormatException){
        println("numberFormatException")
        null;
    }
}