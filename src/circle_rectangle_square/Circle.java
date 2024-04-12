package circle_rectangle_square;

public class Circle implements Resizeable {
    private final double PI = 3.14;
    private double  radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void resize(double percent){
        radius *= (1 + percent / 100);
    }
    public double S(){
        return radius * PI;
    };

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                '}';
    }
}
