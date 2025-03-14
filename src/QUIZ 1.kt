fun main() {
    Recomendation()
    store()
}

fun Recomendation () {
    var Size: Char = 'M'
    println(Size)
}

fun store () {
    var clothes = mutableMapOf(
        "U" to "Uniqlo",
        "Z" to "ZARA",
        "H" to "HnM"
    )
    println(clothes)
}