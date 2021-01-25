package practice1;

public class Ball {
    private double radius;
    private String color;
    private double x;
    private double y;

    public Ball(double radius, String color, double x, double y) {
        this.radius = radius;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void kickBall(double tempX, double tempY) {
        x+=tempX;
        y+=tempY;
    }
    public String toString() {
        return "Радиус мячика: " + getRadius() + "\nЦвет мячика: " + getColor() + "\nПоложение X: "+ getX() + "\nПоложение Y: "+ getY();
    }
}
