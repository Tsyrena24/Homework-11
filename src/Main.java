public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Book book = new Book("Война и мир", author, 1876);
        System.out.println(book.nameBook + " / " + book.authorName.nameAuthor + " " + book.authorName.surnameAuthor + " / " + book.yearPublication);

        Author author1 = new Author("Александр", "Пушкин");
        Book book1 = new Book("Капитанская дочка", author1, 1845);
        book1.setYearPublication(1465);
        System.out.println(book1.nameBook + " / " + book1.authorName.nameAuthor + " " + book1.authorName.surnameAuthor + " / " + book1.yearPublication);

    }
}