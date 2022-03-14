package data

open class Shape {
    open val corner = 0
}

class Rectangle: Shape(){
    override val corner = 4
}

class Triangle: Shape(){
    override val corner = 3
    val originCorner = super.corner
}

