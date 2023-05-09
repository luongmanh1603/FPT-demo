package demo4;

public class Car {
    private String brand;
    private float price;
    //class variable
    public static String type = "Car"; // ko liên quan đến đối tượng khi được tạo ra, độc lập ô nhớ

    public final String madeIn = "VN"; // không thể set lại giá trị sau 1 lần

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price>0?price:0;
    }
    public void run() {

    }
}
