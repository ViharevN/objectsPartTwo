public class Main {


    public static void main(String[] args) {
        Author author = new Author("Mark", "Twain");
        System.out.println("author.name = " + author.getFirstName());
        System.out.println("author.secondName = " + author.getLastName());

        Book book = new Book("Tom Sayer", author, 1876);
        System.out.println("book.name = " + book.getName());
        System.out.println("book.author = " + book.getAuthor());
        System.out.println("book.year = " + book.getYear());
        book.setYear(1999);
        System.out.println("book.year = " + book.getYear());



        Author author1 = new Author("Alexander", "Pushkin");
        Book book1 = new Book("Golden fish", author1, 1833);
        book1.setYear(13_10_1833);
        System.out.println("book1.getYear() = " + book1.getYear());
        System.out.println("book1.getAuthor() = " + book1.getAuthor());
        System.out.println("book1.toString() = " + book1.toString());
        System.out.println("book1.equals(book) = " + book1.equals(book));
        System.out.println("book1.hashCode() = " + book1.hashCode());


    }
}