package app

import data.Employee
import data.Manager
import data.SuperManager

fun main(){
    val employee = Employee("Hafid","BE")
    val manager = Manager("Faiz","PM")
    val superManager = SuperManager("Fikri","VicePresident")

    println("Employee : ${employee.name} (${employee.position})")
    println("Manager : ${manager.name} (${employee.position})")
    println("Super Manager : ${superManager.name}(${employee.position})")

    employee.sayHello("Afifah")
    manager.sayHello("Afifah")
    superManager.sayHello("Afifah")

}