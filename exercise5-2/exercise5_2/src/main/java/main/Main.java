package main;

public class Main 
{
    public static void main( String[] args )
    {
        Author georgeOrwell = new Author("George Orwell", "British");

        Book book1 = new Book("1984", "978-0451524935", georgeOrwell);
        Book book2 = new Book("Animal Farm", "978-0451526342", georgeOrwell);

        Bookshelf shelf = new Bookshelf();
        
        System.out.println("Initial bookshelf contents:");
        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.displayBooks();

        System.out.println("\nRemoving 1984...");
        shelf.removeBook(book1);

        System.out.println("\nUpdated bookshelf contents:");
        shelf.displayBooks();
    }
}
