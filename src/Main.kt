/*
*
* */

fun main(args: Array<String>) {

    val mutableListUser = mutableListOf<User>() //mutable, bisa dianti

    var testHashMap = HashMap<String,Int>()

    testHashMap["rega"]=21
    testHashMap["ika"]=19
    testHashMap["agil"]=22
    testHashMap["andi"]=30

    var sortedHasMap = testHashMap.toList().sortedBy {
        it.first
    }
    sortedHasMap.forEach(){
        println("${it.first} => ${it.second}")
    }

    var listbiasa = listOf(10,3,50,4,44,3,22,1,22,3,5,5)

    var sorted = listbiasa.sortedBy { it }

    sorted.forEach(){
        print("$it ")
    }
    println("====")

    mutableListUser.add(User("Rega", 100))
    mutableListUser.add(User("Ika", 50))
    mutableListUser.add(User("Agil", 90))
    mutableListUser.add(User("Budi", 90))
    mutableListUser.add(User("Andi", 90))
    mutableListUser.add(User("Andi", 90))

    var sorting = mutableListUser.sortedBy {
        it.age
    }

    sorting.forEach(){
        println("${it.name} = ${it.age} ")
    }

//    sorting
    var filtering = mutableListUser.find {
        it.age < 100
    }
    println(filtering?.age);




}

