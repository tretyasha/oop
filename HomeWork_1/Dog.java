package HomeWork_1;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color,4);
    }

    public Dog(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void swim() {}

    @Override
    public void fly() {}
}