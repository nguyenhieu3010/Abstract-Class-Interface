package circle_rectangle_square;

public class Square implements Colorable,Resizeable{
    private double width;
    private double height;
    private String color;

    public Square(double width, double height , String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public String howToColor(){
      return " Color all four sides..";
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
    public void resize(double percent){
        width *= (1 + percent / 100);
        height *= (1 + percent / 100);
    }
    public double S(){
        return this.width*this.height;
    }
    public double v(){
        return width * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                "} " + S();
    }
}
