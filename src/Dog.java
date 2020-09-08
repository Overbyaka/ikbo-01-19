public class Dog {
    private String name;
    private double length;
    private double height;
    private String color;

    public Dog(String n, double l, double h, String c) {
        name = n;
        length = l;
        height = h;
        color = c;
    }

    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public double getLength() {
        return length;
    }
    public String getColor() {
        return color;
    }
    public String toString() {
        return "Имя собаки: " + getName() + "\nДлина собаки: " + getLength() + "\nВысота собаки: "+getHeight() + "\nЦвет собаки: "+getColor();
    }
}
