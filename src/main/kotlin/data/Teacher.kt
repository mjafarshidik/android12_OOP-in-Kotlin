package data

open class Teacher(val name: String) {

    protected open fun teach() {
        println("Teach!")
    }
}

class SuperTeacher(name: String) : Teacher(name) {

    public override fun teach() {
        super.teach()
    }
}