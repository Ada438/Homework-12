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