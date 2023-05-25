package practical_exam;

public class Book {
    String title;
    String author_name;
    double price;

    public Book(String title, String author_name, double price) {
      this.title = title;
      this.author_name = author_name;
      this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public  String toString(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author_name);
        System.out.println("Price: "+ price);
        return null;
    }
}
