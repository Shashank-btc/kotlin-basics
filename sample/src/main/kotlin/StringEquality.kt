fun main() {
    val  name1 = "sai"
    val name2 = "shashi"
//    val  name3 = "sai"
    val  name3 = String("sai".toCharArray())


    println(name1 == name2)
    println(name1 == name3)
    println(name1.equals(name3))
    println(name1.equals(name2))

    // "===" is act same as "==" in the Java
    // it will be reffering to memory allcation
    println(name1 === name3)


}