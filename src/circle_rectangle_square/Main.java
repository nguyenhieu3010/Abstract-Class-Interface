package circle_rectangle_square;

public class Main {
    public static void main(String[] args) {
       Resizeable[] resizeables  =new Resizeable[3];
       resizeables[0] = new Square(12,12,"red");
       resizeables[1] = new Rectangle(12,7);
       resizeables[2] = new Circle(12);
       for (Resizeable resizeable : resizeables){
           if (resizeable instanceof Rectangle){
               System.out.println(resizeable.toString());
               Rectangle abc= (Rectangle) resizeable;
               System.out.println(abc.S());
           }
       for (Resizeable resizeable1 : resizeables) {
           if(resizeable1 instanceof Colorable) {
                Square abc = (Square) resizeable1;
               System.out.println(abc.toString());
               System.out.println(abc.howToColor());
           }
       }


       }

    }
}
