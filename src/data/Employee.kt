package data

open class Employee(var name:String, val position: String) {
    open fun sayHello(name:String){
        println("Hello $name, my name is ${this.name} and i am ${this.position} here")
    }
}

open class Manager(name:String, position:String) : Employee(name,position){
     final override fun sayHello(name: String) {
        println("Hi $name, i am ${this.name}, nice to meet you!")
    }

}

 class SuperManager(name:String, position:String) : Manager(name,position){

}