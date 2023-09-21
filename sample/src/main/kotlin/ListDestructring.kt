fun main() {

    val names: MutableList<String> = mutableListOf(
        "sai",
        "sai1",
        "sai2",
        "sai3"
    )
//  val (s,s1,s2) = names
//    println("$s,$s1,$s2")

    val (s,s1,_,s3) = names
    println("$s,$s1,$s3")

}