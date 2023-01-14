package it.develhope.exercise6

fun main(){
    val test = User.EmailUser("XXXX","YYYY")
    log(test)
    val test1 = User.GoogleUser("Hello","Hi")
    log(test1)
}

sealed class User(open val id:String) {

    data class EmailUser(override val id: String, val password: String): User(id)
    data class FacebookUser(override val id: String, val password: String): User(id)
    data class GoogleUser(override val id: String, val password: String): User(id)
}
fun log (user: User) = when (user) {
    is User.EmailUser -> println("Email user: $user")
    is User.FacebookUser -> println("Facebook user: $user")
    is User.GoogleUser -> println("Google user: $user")
}

