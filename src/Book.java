public class Book {

    private String nameBook;

    private int publicationYear;

    private Author auth;
    public Book(String nameBook, Author fullName, int publicationYear) {
        this.nameBook = nameBook;
        this.publicationYear = publicationYear;
        this.auth = new Author(fullName);
    }

    public String getNameBook() {
        return this.nameBook;
    }
    public String getNameAuthor(){
        return  this.auth.getFirstName()+" "+this.auth.getLastName();
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int year){
        this.publicationYear = year;
    }

}
