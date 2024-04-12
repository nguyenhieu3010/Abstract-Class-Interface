package circle_rectangle_square;

public class Rectangle implements Resizeable{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double S(){
        return this.width*this.height;
    }

    public void resize(double percent){
        width *= (1 + percent / 100);
        height *= (1 + percent / 100);
    }
    public double V(){
        return (height+height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}' + S();
    }
}
