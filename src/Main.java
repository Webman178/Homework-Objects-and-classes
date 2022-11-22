

public class Main {

    public static void main(String[] args) {
        String firstBook = "Harry Potter and the Philosophers Stone";
        String secondBook = "Alice in Wonderland";

        String firstAuthor = "Rowling Joanne";
        String secondAuthor = "Lewis Carrol";

        Author joanne = new Author("Joanne", "Rowling");
        Author carrol = new Author("Carrol", "Lewis");
        Book harry = new Book(firstBook, joanne, 2014);
        Book alice = new Book(secondBook, carrol, 2000);
        System.out.println("Книга 1 - " + harry.getNameBook() + " выпущенная автором " + harry.getNameAuthor() + " опубликованная в " + harry.getPublicationYear() + " году");
        System.out.println("Книга 2 - " + alice.getNameBook() + " выпущенная автором " + alice.getNameAuthor() + " опубликованная в " + alice.getPublicationYear() + " году");
        harry.setPublicationYear(2020);
        System.out.println("Книга 3 - " + harry.getNameBook() + " выпущенная автором " + harry.getNameAuthor() + " опубликованная в " + harry.getPublicationYear() + " году");

    }
}