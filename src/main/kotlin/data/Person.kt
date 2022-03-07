package data

class Person {
    var firstName: String = ""

    fun sayHello(name: String) {
        println("Hello $name, My Name is ${this.firstName}")
    }

    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, My Name is ${this.firstName}")
    }
}