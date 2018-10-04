/*
*
* */

//fun calculator(angka1:Float,angka2:Float){
//    println ("$angka1 + $angka2 = "+ (angka1+angka2))
//    println("$angka1 - $angka2 = "+ (angka1-angka2))
//    println ("$angka1 : $angka2 = "+ (angka1/angka2))
//    println ("$angka1 x $angka2 = "+ (angka1*angka2))
//}
//fun main(args: Array<String>){
//    calculator(2.0f,4.0f)
//
//}

fun main(args: Array<String>) {
//    var a: String? = null
//    if (a.isNullOrEmpty()) {
//        println(a)
//    }
//    var b = if (null == a) "bilangan null" else "bukan null"
//    println(b)
//
//
//    var c = 8
//    when {
//        c % 3 == 0 -> print("habis dibagi 3")
//        else -> {
//            println("tidak habis dibagi 3")
//        }
//    }
//
//    //for
//    var d = 10
//    for (i in 0..d) {
//        println(i)
//    }
//    println("----")
//    for (i in 0 until d) {
//        println(i)
//    }
//    println("----")
//    for (i in d downTo 0) {
//        println(i)
//    }
//
//    val test_array = arrayOf(1, 2, 3, 4, "test", false)
//    for (i in test_array) { // i : Int ==> memaksakan nilai yang di array bernilai integer
//        println(i)
//    }
//
////    while
//    var e = 10
//    while (e < 100) {
//        println(e);
//        e += 10;
//    }
//    e=0
//    do {
//        println(e)
//        e++
//    }while (e<20)
//
//
//    var user = User1("rega",22);
//    println(user.name)
//    println(user.age)
//
//    var userlagi = User2();
//    userlagi.name = "Budi"
//    userlagi.age = 19
//
//    println(userlagi.name)
//    println(userlagi.age)

    val listOfItems: List<Any> = listOf(1, 2, 3, 4) //tidak immutable, tidak bisa diedit

    val mutableListOfItems: MutableList<Any> = mutableListOf(1, 2, 3, 4) //mutable, bisa dianti
    val mutableListOfItems= mutableListOf(1, 2, 3, 4) //mutable, bisa dianti


//  val mutableList= arrayOf()

    val arrayOfItem = arrayOf(1, 2, 3, 4)

//    var user = User1()

    val mutableListUser = mutableListOf<User1>() //mutable, bisa dianti

    mutableListUser.add(User1("Rega", 21))
    mutableListUser.add(User1("Ika", 20))
    mutableListUser.add(User1("Agil", 19))
    var searhing = mutableListUser.find {
        it.name == "Rega"
    }
    println(searhing?.age);


}

