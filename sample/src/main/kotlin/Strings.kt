fun main() {
    val name = "Sai"
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())
    println(name[2])
//    name= "123"
    println(name.toBigDecimalOrNull())
    println("".isBlank())
    println("".isNotEmpty())

    val age = 10;

    var mesg = "$name $age"
    println(mesg)

    // multi line

    val email = """
        hello %s
        how
        are 
        you %s
    """.trimIndent()
    println(email.format("sai","sai2"))

}