package app

import data.Rectangle
import data.Triangle

fun main(){

    val shape1 = Rectangle()
    val shape2 = Triangle()

    println(shape1.corner)
    println(shape2.corner)
    println(shape2.originCorner)

}