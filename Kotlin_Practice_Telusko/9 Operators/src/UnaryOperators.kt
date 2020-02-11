fun main(args: Array<String>) {
    val a = 8
    val b = true
    var c = 5

    var result: Int
    var booleanResult: Boolean

    result = -a
    println("-a = $result")

    var res : Int
    res = +a
    println("+a = $res")

    booleanResult = !b
    println("b = $booleanResult")

    --c
    println("--c = $c")

    ++c
    println("++c = $c")
}