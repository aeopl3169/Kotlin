data class Book(var name: String, var price: Int)

// here the BookShelf works as singleton class and object by using the keyword "object".
object BookShelf {
    var books = arrayListOf<Book>()
    fun showBooks() {
        for (i in books) {
            println(i)
        }
    }
}

fun main() {
    BookShelf.books.add(Book("JAVA", 50))
    BookShelf.books.add(Book("Sql", 40))
    BookShelf.books.add(Book("Kotlin", 80))
    BookShelf.showBooks()
}