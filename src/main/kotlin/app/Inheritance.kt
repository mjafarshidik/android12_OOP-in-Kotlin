package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Abidin")
    manager.sayHello("Yusuf")

    val vicePresident = VicePresident("Ujang")
    vicePresident.sayHello("Alex")
}