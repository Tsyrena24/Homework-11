public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Book book = new Book("Война и мир", author, 1876);
        System.out.println(book.getNameBook() + " / " + book.authorName.getNameAuthor() + " " + book.authorName.getSurnameAuthor() + " / " + book.getYearPublication());

        Author author1 = new Author("Александр", "Пушкин");
        Book book1 = new Book("Капитанская дочка", author1, 1845);
        book1.setYearPublication(1466);

        System.out.println(book1.getNameBook() + " / " + book1.authorName.getNameAuthor() + " " + book1.authorName.getSurnameAuthor() + " / " + book1.getYearPublication());

    }
}