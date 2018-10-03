fun check_array(nilai : Array<Any>) {
    for (item in nilai) {
        when(item){
            is Int -> println("[$item] is integer")
            is Boolean -> println("[$item] is Boolean")
            is Float -> println("[$item] is Float")
            is Double -> println("[$item] is Double")
            is String -> println("[$item] is String")
            is Char -> println("[$item] is Char")
        }

    }
}

fun main(args: Array<String>) {
    var test_array = arrayOf(1, 2, "tiga", false, 'T', 6.5)
    check_array(test_array)
}

