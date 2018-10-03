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
    var a: String? = null
    if (a.isNullOrEmpty()) {
        println(a)
    }
    var b = if (null == a) "bilangan null" else "bukan null"
    println(b)


    var c = 8
    when {
        c % 3 == 0 -> print("habis dibagi 3")
        else -> {
            println("tidak habis dibagi 3")
        }
    }

    //for
    var d = 10
    for (i in 0..d) {
        println(i)
    }
    println("----")
    for (i in 0 until d) {
        println(i)
    }
    println("----")
    for (i in d downTo 0) {
        println(i)
    }

    val test_array = arrayOf(1, 2, 3, 4, "test", false)
    for (i in test_array) { // i : Int ==> memaksakan nilai yang di array bernilai integer
        println(i)
    }

//    while
    var e = 10
    while (e < 100) {
        println(e);
        e += 10;
    }
    e=0
    do {
        println(e)
        e++
    }while (e<20)



}

