package com.girrafelim.study.basicsyntax

fun main() {
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))
}

fun printLength(obj: Any) {
    println("'$obj' String length is ${getStringLength(obj) ?: "...err, not a String"}")
}

//fun getStringLength(obj: Any): Int? {
//    if (obj is String) {
//        return obj.length
//    }
//
//    return null
//}

//fun getStringLength(obj: Any): Int? {
//    if (obj !is String) return null
//    return obj.length
//}

fun getStringLength(obj: Any): Int? {
    // obj는 '&&' 연산자의 오른편에서 자동으로 'String'으로 형변환
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}