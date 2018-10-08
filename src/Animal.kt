abstract class Animal {
    var legs: Int = 0
    var alatNafas: String = ""

    open fun printLegs() {
        "kaki hewan = $legs"
    }

    open fun printAlatNafas() {
        "alat nafas hewan = $alatNafas"
    }
}