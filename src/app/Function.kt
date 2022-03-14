package app

import data.User

fun main(){
    var user1 = User("Sandrian","sandrian@gmail.com","111")
    println(user1.username)
    println(user1.login())
}