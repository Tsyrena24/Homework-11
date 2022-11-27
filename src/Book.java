import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Author authorName;
    private int yearPublication;

    public Book(String nameBook, Author authorName, int yearPublication) {
        this.nameBook = nameBook;
        this.authorName = authorName;
        this.yearPublication = yearPublication;
    }

    public String getNameBook () {
        return this.nameBook;
    }

    public  int getYearPublication () {
        return this.yearPublication;
    }

    public void setYearPublication (int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Название книги - " + nameBook + " / Год издания - " + yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book99 = (Book) o;
        return yearPublication == book99.yearPublication && Objects.equals(nameBook, book99.nameBook) && Objects.equals(authorName, book99.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, authorName, yearPublication);
    }
}
