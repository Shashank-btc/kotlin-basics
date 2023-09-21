fun main() {
    val gender = "m"
//    when(gender){
//        "f"-> println("female")
//        "m" -> println("male")
//        else->{
//            println("unknow gender")
//        }
//    }
   val g= when(gender){
        "f"-> { "female"}
        "m" -> {"male"}
        else->{
            "unknow gender"
        }
    }
    println(g)
}