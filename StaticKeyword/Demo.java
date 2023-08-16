package StaticKeyword;

class Mobile{

    String brand;
    int price;
    // It is common variable for all the object.
    static String name;

    public void display() {
        System.out.println(brand + " : " + price + " : " + name);
    }

  
}

public class Demo {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 90000;
        Mobile.name = "Smartphone";
    }
}
