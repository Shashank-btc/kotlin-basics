fun main() {
//    val name : String ="sai", "sai1"
    val names = arrayOf("sai","sai1","shashi")

    println(names.contentDeepToString())

    if("shashi" in names) println("found") else println("nor found")
    println(names.count())
    println(names.size)
}