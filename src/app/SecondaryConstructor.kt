package app

import data.Vehichle

fun main(){
    var vehichle1 = Vehichle("Car","Toyota Xxx","TOYOTA","2002")
    var vehichle2 = Vehichle("Motorcycle","Yamaha XXX","2010")

    println("Vehichle1 : ${vehichle1.type} | ${vehichle1.name} | ${vehichle1.brand} | ${vehichle1.years}")
    println("Vehichle2 : ${vehichle2.type} | ${vehichle2.name} | ${vehichle2.years}")
}