package HomeWork_1;

public class Bird extends Animal{
    public Bird(String name, String color) {
        super(name, color,0);
    }
    
    public Bird(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Eeeaw!");
    }

    @Override
    public void toGo() {}

    @Override
    public void swim() {}
}
