package Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Nguyen Van A", "abc@gmail.com", 'm');
        System.out.println(author.toString() + "\n");

        author.setEmail("cde@gmail.com");
        System.out.println(author.toString() + "\n");

        System.out.println("Author's email is: " + author.getEmail());
        System.out.println("Author's gender is: " + author.getGender());
        System.out.println("Author's name is: " + author.getName());
    }
    
}
