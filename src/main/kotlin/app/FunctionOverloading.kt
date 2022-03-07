package app

import data.Person

fun main() {
    val human = Person()
    human.firstName = "januar"

    human.sayHello("Asep")
    human.sayHello("Joko, Anwar")
}