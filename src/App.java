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
}
public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Джоан", "Роулинг");
        Author author2 = new Author("Чарльз", "Диккенс");

        Book book1 = new Book("Гарри Поттер", author1, 1997);
        Book book2 = new Book("Оливер Твист", author2, 1838);
        book2.setYear(1840);

        System.out.println("Книга: " + book1.getTitle() + ", автор: " + book1.getAuthor().getAuthorName() + " " + book1.getAuthor().getAuthorSurname() + ", год: " + book1.getYear());
        System.out.println("Книга: " + book2.getTitle() + ", автор: " + book2.getAuthor().getAuthorName() + " " + book2.getAuthor().getAuthorSurname() + ", год: " + book2.getYear());
    }
}

