// Progressions implement Iterable<N>, where N is Int, Long, or Char respectively,
// so you can use them in various collection functions like map, filter, and other.
fun main() {
    println((1..10).filter {it % 2 == 0 })
}