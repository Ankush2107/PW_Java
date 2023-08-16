package Inheritance;

public class Demo {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(5, 8);
        int r2 = obj.sub(16, 8);
        int r3 = obj.mul(5, 6);
        System.out.println(r1 + " " + r2 + " " + r3);
    }
}