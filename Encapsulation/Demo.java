package Encapsulation;

class Human {

    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(54);
        obj.setName("Karan");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
