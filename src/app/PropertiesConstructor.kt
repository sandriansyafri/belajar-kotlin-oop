package app

import data.User

fun main(){

    val user1 = User("sandrian","sandrian@gmail.com","111")

    println(user1.username)
    println(user1.email)
    println(user1.password)

}