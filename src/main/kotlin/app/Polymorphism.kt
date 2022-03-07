package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee: Employee = Employee("Yusuf")
    employee.sayHello("Sidik")

    employee = Manager("Yolanda")
    employee.sayHello("Rojak")

    employee = VicePresident("Lukman")
    employee.sayHello("Dimas")
}