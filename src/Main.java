public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Александр", "Пушкин");

        Book book = new Book("Война и мир", author, 1876);
        Book book1 = new Book("Капитанская дочка", author1, 1845);
        Book book2= new Book("Капитанская дочка", author2, 1845);

        //System.out.println(book.getNameBook() + " / " + book.authorName.getNameAuthor() + " " + book.authorName.getSurnameAuthor() + " / " + book.getYearPublication());
        //System.out.println(book1.getNameBook() + " / " + book1.authorName.getNameAuthor() + " " + book1.authorName.getSurnameAuthor() + " / " + book1.getYearPublication());
        //book1.setYearPublication(1466);

        System.out.println(book);
        System.out.println(author);
        System.out.println();

        System.out.println(book1);
        System.out.println(author1);
        System.out.println();

        System.out.println(book2);
        System.out.println(author2);
        System.out.println();

        System.out.println("Одинаковые обьекты автор и автор1? - " + author.equals(author1));
        System.out.println("HashCode первого объекта - " + author.hashCode());
        System.out.println("HashCode второго объекта - " + author1.hashCode());
        if (author.hashCode() == author1.hashCode()) {
            System.out.println("Содержимое объектов одинаковое");
        } else {
            System.out.println("Содержимое объектов разное");}
        System.out.println();

        System.out.println("Одинаковые обьекты автор1 и автор2? - " + author1.equals(author2));
        System.out.println("HashCode первого объекта - " + author1.hashCode());
        System.out.println("HashCode второго объекта - " + author2.hashCode());
        if (author1.hashCode() == author2.hashCode()) {
            System.out.println("Содержимое объектов одинаковое");
        } else {
            System.out.println("Содержимое объектов разное");}
        System.out.println();

        System.out.println("Одинаковые обьекты книга и книга 1? - " + book.equals(book1));
        System.out.println("HashCode первого объекта - " + book.hashCode());
        System.out.println("HashCode второго объекта - " + book1.hashCode());
        if (book.hashCode() == book1.hashCode()) {
            System.out.println("Содержимое объектов одинаковое");
        } else {
            System.out.println("Содержимое объектов разное");}
        System.out.println();


        System.out.println("Одинаковые обьекты книга1 и книга 2? - " + book1.equals(book2));
        System.out.println("HashCode первого объекта - " + book1.hashCode());
        System.out.println("HashCode второго объекта - " + book2.hashCode());
        if (book1.hashCode() == book2.hashCode()) {
            System.out.println("Содержимое объектов одинаковое");
        } else {
            System.out.println("Содержимое объектов разное");}

    }
}