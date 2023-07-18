package HomeWork_1;

public class Animal {
    private String name;
    private String color;
    public int pawsCount;

    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
    }

    public Animal(String name) {
        this(name, null, 0);
    }

    public Animal() {
        this(null);
    }

    @Override
    public String toString() {
        return String.format(":Животное %s, Имя: %s, Цвет: %s", this.getType(), this.name, this.color);
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public void speak() {
        System.out.println("Yarr!!");
    }

    public void toGo() {
        System.out.println(String.format("%s %s умеет бегать!", this.getType(), this.name));
    }

    public void fly() {
        System.out.println(String.format("%s %s умеет летать!", this.getType(), this.name));
    }

    public void swim() {
        System.out.println(String.format("%s %s умеет плавать!", this.getType(), this.name));
    }
}
