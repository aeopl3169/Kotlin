fun main(args : Array<String>){
    var tittu = Alien()
    println(tittu.name)
    println(tittu.name?.length)
//    println(tittu?.name)

    println()

    var obj : Alien?  = Alien()
    obj = null
    println(obj?.name)

    var i : String? = null
    println(i?.length)
}