/* Null safe operators
* ?. - safe call operator - returns the length if present else returns null.
* ?: - elvis operator - returns the right side value when left side is null
* !! - not null assertion - use it when you are sure the value is NOT NULL. It throws NullPointerException if the value is found null.
* ?.let{..} - safe call with let operator - It executes the block only if name is not null */
fun main() {
    val name: String = "Perry"
    val name1: String? = null

    // ?. - safe call operator - returns the length if present else returns null.
    println("Safe call operator ${name?.length} and ${name1?.length}")

    // ?.let{..} - safe call with let operator - It executes the block only if name is not null
    name.let {
        println("Safe call with let operator : ${name?.length} and ${name1?.length}")
    }

    name1.let {
        println("Safe call with let operator : ${name?.length} and ${name1?.length}")
    }
    //?: - elvis operator - returns the right side value when left side is null
    // elvis is like ternary operator in java.
    val length = name?.length ?: 10
    println("Elvis operator: ${length}")
    val length1 = name1?.length ?: 10
    println("Elvis operator: ${length1}")

    // OR below is same as elvis operator
    val len = if (name != null) {
        name.length
    } else {
        10
    }

    // !! - not null assertion - use it when you are sure the value is NOT NULL. It throws NullPointerException if the value is found null.
    println("Not null assertion: ${name!!.length} ")
    println("Not null assertion - Null value : ${name1!!.length}")
}