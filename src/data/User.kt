package data

class User(var username: String, var email:String, var password:String ) {


    fun login(){
        println("Login!")
    }

    fun logout(){
        println("Logout!")
    }


    // ---------------------
    // FUNCTION OVERLOADING
    // ---------------------
    fun sayHello(name: String): Unit{
        println("Hello $name")
    }

    fun sayHello(name: String, time: String): Unit{
        println("Hello $name, good $time")
    }



}