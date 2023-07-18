package HomeWork_1;


public class Shark extends Animal {
    public Shark(String name, String color) {
        super(name, color, 0);
    }

    public Shark(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Wooo!");
    }

    @Override
    public void toGo() {}

    @Override
    public void fly() {}
}