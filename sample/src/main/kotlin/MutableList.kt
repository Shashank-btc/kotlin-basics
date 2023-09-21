fun main() {

    val names: MutableList<String> = mutableListOf(
        "sai",
        "sai1",
        "sai2",
        "sai3"
    )
    names.add(2,"shashi")
    println(names.get(0))
    println(names.size)
    println(names.contains("sai8"))
    println(names)
    println(names.removeAt(3))
    println(names)

}