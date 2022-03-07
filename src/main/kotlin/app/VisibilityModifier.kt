package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher = SuperTeacher("Yuki")
    println(teacher.name)
    teacher.teach()
}