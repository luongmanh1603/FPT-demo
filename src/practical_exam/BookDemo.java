package practical_exam;

public class BookDemo {
    public static void main(String[] args) {
        Author author = new Author("Russel","Winderand");
        Book book = new Book("Developing Java" ,author,79.75);
        System.out.println("Title :"+book.getTitle());
        System.out.println("Author:"+author);
        System.out.println("Price :"+book.getPrice());
    }
}
