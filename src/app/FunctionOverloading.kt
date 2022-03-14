package app

import data.User

fun main(){
    var user = User("sandrian","sandrian@gmail.com","123")
    println(user.sayHello("hafid","morning!"))
}