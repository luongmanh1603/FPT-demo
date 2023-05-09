package demo4;

import demo5.Honda;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Car.type = "Moto...";
        System.out.println(Car.type);
        Toyota t = new Toyota();
        t.run();
        System.out.println(t.getBrand());
        Honda h = new Honda();
        h.run();
        System.out.println(h.getBrand());
        h.Addprice();
        System.out.println(h.getPrice());
        Human human = new Human() { // lop an danh
            @Override
            public void eat() {

            }

            @Override
            public void walk() {

            }
        };
    }
}
