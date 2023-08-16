package Interface;

interface Computer {
    void code();
}

class Laptop implements Computer{

    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer{

    public void code() {
        System.out.println("code, compile, run, Faster");
    }
}

class Developer {

    public void devApp(Laptop lap) {
       lap.code();
    }
}

public class Demo {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer des = new Desktop();

    }
}
