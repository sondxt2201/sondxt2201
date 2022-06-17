package Author;

public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("Nguyen Van B", "qwe@gmail.com", 'm');
        System.out.println(author.toString() + '\n');
        
        Book book = new Book("TestBook", author, 123456, 5);
        System.out.println(book.toString() + '\n');

        book.setPrice(789123);
        book.setQuantity(15);
        System.out.println(book.toString() + '\n');

        System.out.println("Book's name: " + book.getName());
        System.out.println("Book's price: " + book.getPrice());
        System.out.println("Book's quantity: " + book.getQuantity());
        System.out.println("Book's author: " + book.getAuthor() + '\n');

        System.out.println("Author's name: " + book.getAuthor().getName());
        System.out.println("Author's gender: " + book.getAuthor().getGender());
        System.out.println("Author's email: " + author.getEmail() + '\n');

        Book anotherBook = new Book("TestBook2", 
            new Author("Nguyen Van B", "jkl@gmail.com", 'm'), 512673, 20);
        System.out.println(anotherBook.toString());

    }
    
}
