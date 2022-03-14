package data

class Student(var name:String,var age:String) {
    fun sayHello(name:String){
        println("hello $name, i am ${this.name} and i am ${this.age}")
    }
}