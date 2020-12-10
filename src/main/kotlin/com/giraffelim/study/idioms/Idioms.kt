package com.giraffelim.study.idioms

import java.io.File
import java.lang.IllegalArgumentException
import java.lang.IllegalStateException
import java.math.BigDecimal

fun main() {
    val customer = Customer("sun", "sun@gmail.com")
    customer.name = "taeyang"
    println(customer.email)
    println(customer.toString())
    println(customer.component1())
    println(customer.component2())
    val newCustomer = customer.copy(email = "sun@naver.com")
    println(newCustomer.toString())
    foo()
    println("--------------------")
    filterOfList()
    println("--------------------")
    checkElementPresenceInCollection()
    println("--------------------")
    stringInterpolation()
    println("--------------------")
    println(instanceChecks("sun"))
    println("--------------------")
    traversingMapAndListOfPairs()
    println("--------------------")
    usingRanges()
    println("--------------------")
    readonlyList()
    println("--------------------")
    readonlyMap()
    println("--------------------")
    accessMap()
    println("--------------------")
    lazyProperty()
    println("--------------------")
    extensionFunction()
    println("--------------------")
    createSingleton()
    println("--------------------")
    isNotNull()
    println("--------------------")
    isNotNullAndElse()
//    println("--------------------")
//    executingStatementIfNull()
    println("--------------------")
    getFirstItemEmptyCollection()
    println("--------------------")
    executeIfNotNull()
    println("--------------------")
    println(transform("Red"))
    println("--------------------")
    ifExpression(3)
    println("--------------------")
    println(singleExpressionFunctions("Blue"));
    println("--------------------")
    nullableBoolean()
    println("--------------------")
    swappingVariables()
    println("--------------------")
    calcTaxes()
}

data class Customer(var name: String, val email:String)

fun foo(a:Int = 30, b: String = "sun") {
    println(a)
    println(b)
}

fun filterOfList() {
    val list = listOf("apple", "banana", "avocado")
    val charAList = list.filter { it.startsWith("a") }
    println(charAList)
}

fun checkElementPresenceInCollection() {
    val list = listOf("apple", "banana", "avocado")
    if ("apple" in list) {
        println("apple is red")
    }
    if ("grape" !in list) {
        println("grape is purple")
    }
}

fun stringInterpolation() {
    val name = "sun"
    println("my name is $name")
}

fun instanceChecks(obj: Any): Any {
    return when(obj) {
        is String   -> "shine"
        is Int      -> 30
        else        -> "Unknown"
    }
}

fun traversingMapAndListOfPairs() {
    val aMap = mapOf(1 to "One", 2 to "Two")

    for ((k, v) in aMap) {
        println("$k -> $v")
    }
}

fun usingRanges() {
    for (i in 1..100) { println(i) }
    for (i in 1 until 100) { println(i) } // does not include 100
    for (x in 2..10 step 2) { println(x) } // 2 to 10 increments of 2
    for (x in 10 downTo 1) { println(x) } // 10 to 1
    val x = 7
    if(x in 1..10) { println("x = $x is included the range") }
}

fun readonlyList() {
    val list = listOf("apple", "banana", "avocado")
    list.forEach { println(it) }
}

fun readonlyMap() {
    val map = mapOf(1 to "apple", 2 to "banana", 3 to "avocado")
    for((k, v) in map) {
        println("$k -> $v")
    }
}

fun accessMap() {
    val map = mapOf(1 to "apple", 2 to "banana", 3 to "avocado")
    println(map[1])
//    map[1] = "grape" mutableMap일 경우만 가능
}

fun lazyProperty() {
    val p: String by lazy { // val일 경우만 가능
        println("init") // 한번만 호출
        "pojo"
    }
    println(p);
}

fun extensionFunction() {
    fun String.spaceToCamelCase(): String {
        return this.toUpperCase()
    }

    println("Convert this to camelcase".spaceToCamelCase())
}

fun createSingleton() {
    val obj1 = Resource
    val obj2 = Resource
    println(Resource.name)
    println(Resource.name)
    println("obj1 identityHashCode = ${System.identityHashCode(obj1)}")
    println("obj2 identityHashCode = ${System.identityHashCode(obj2)}")
    println(obj1 === obj2)
}

object Resource {
    val name = "sun"
}

fun isNotNull() {
    val files = File("Test").listFiles()
    println(files?.size)
}

fun isNotNullAndElse() {
    val files = File("Test").listFiles()
    println(files?.size ?: "empty")
}

fun executingStatementIfNull() {
    val values = mapOf("name" to "sun", "address" to "seoul", "phone" to "tel)")
    val email = values["email"] ?: throw IllegalStateException("Email is Not Exist")
}

fun getFirstItemEmptyCollection() {
//    val emails = listOf(null)
    val emails = listOf("sun@gmail.com")
    val mainEmail = emails.firstOrNull() ?: "emptyEmail" // not null : null
    println(mainEmail)
}


fun executeIfNotNull() {
    val value: String = "HELLO"
    value?. let {
        println("is not null")
    }
}


fun transform(color: String): Int {
    return when (color) {
        "Red"   -> 0
        "Green" -> 1
        "Blue"  -> 2
        else    -> throw IllegalArgumentException("invalid color param value")
    }
}

fun ifExpression(param: Int) {
    val result = if (param == 1) {
        "one"
    } else if ( param == 2 ){
        "two"
    } else {
        "three"
    }
    println(result)
}

fun singleExpressionFunctions(color: String) = when(color) {
    "Red"   ->  0
    "Green" ->  1
    "Blue"  ->  2
    else    -> throw IllegalArgumentException("invalid color param value")
}

fun nullableBoolean() {
    val b: Boolean? = null
    if (b == true) {
        println("true")
    } else {
        println("b is false or null")
    }
}

fun swappingVariables() {
    var a = 1
    var b = 2
    println("a = $a b = $b")
    a = b.also { b = a }
    println("a = $a b = $b")
}

fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")