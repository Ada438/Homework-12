

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

