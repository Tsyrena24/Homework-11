import java.util.Objects;

public class Author {
    private final String nameAuthor;
    private final String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor () {
        return this.surnameAuthor;
    }

    @Override
    public String toString () {
        return "Имя и фамилия автора: " + nameAuthor + " " + surnameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author99 = (Author) o;
        return Objects.equals(nameAuthor, author99.nameAuthor) && Objects.equals(surnameAuthor, author99.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }
}
