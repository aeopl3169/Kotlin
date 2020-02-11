// To create a range for your class, call the rangeTo() function on the range start value and provide the end value as an argument.
// rangeTo() is often called in its operator form ..
class Version(val major: Int, val minor: Int): Comparable<Version> {
    override fun compareTo(other: Version): Int {
        if (this.major != other.major) {
            return this.major - other.major
        }
        return this.minor - other.minor
    }
}

fun main() {
    val versionRange = Version(1, 11)..Version(1, 30)
    println(versionRange)
    println(Version(0, 9) in versionRange)
    println(Version(1, 20) in versionRange)
}