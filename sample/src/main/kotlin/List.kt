fun main() {

    // listOf is read-only method we cont add the extra element here
    val names: List<String> = listOf(
        "sai",
        "sai1",
        "sai2",
        "sai3"
    )
    println(names.get(0))
    println(names.size)
    println(names.contains("sai8"))
    println(names)
}