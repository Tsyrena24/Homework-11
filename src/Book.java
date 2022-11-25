public class Book {
    String nameBook;
    Author authorName;
    int yearPublication;

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

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
