import java.util.Objects;
class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

    public String getTitle(){
        return title;
    }
    public Author getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    @Override
    public String toString() {
        return "Книга: " + title + ", автор: " + author.toString() + ", год: " + year;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

}
class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName(){
        return authorName;
    }
    public String getAuthorSurname(){
        return authorSurname;
    }
    @Override
    public String toString() {
        return authorName + " " + authorSurname;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return Objects.equals(authorName, author.authorName) &&
                Objects.equals(authorSurname, author.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }
}

public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Джоан", "Роулинг");
        Author author2 = new Author("Чарльз", "Диккенс");

        Book book1 = new Book("Гарри Поттер", author1, 1997);
        Book book2 = new Book("Оливер Твист", author2, 1838);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println("Книги равны? " + book1.equals(book2));
    }
}

