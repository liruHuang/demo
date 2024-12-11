fun main() {

    var s : String ? = "asdfghjkl"
//    s = null;
    println(s!!.length)
    println(s?.substring(3))
    println(s?.get(3))

//    Human().hello();
//    val h = Human("Jack", weight = 50f, height = 1.6f)
//    println(h.bmi())

//    val score = 88
//    println(score > 60)
//
//    val c = 'A'
//    println(c.toInt() > 60)

}

class Human(var name : String = "Jack", var weight: Float = 50f, var height: Float = 1.6f) {
    fun hello(){
        println("Hello Kotlin");
    }
    fun bmi(): Float{
        val bmi = weight / (height * height)
        return bmi;
    }

    init {
        println("test + $weight");
    }
}