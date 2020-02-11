class A { // implicit label @A
    inner class B { // implicit label @B
        fun Int.foods() { // implicit label @foo
            val a = this@A // A's this
            val b = this@B // B's this

            val c = this // foods()'s receiver, an Int
            val c1 = this@foods // foods()'s receiver, an Int

            val funLit = lambda@ fun String.() {
                val d = this // funLit's receiver
            }


            val funLit2 = { s: String ->
                // foods()'s receiver, since enclosing lambda expression
                // doesn't have any receiver
                val d1 = this
            }
        }
    }
}