package homework_0412;

class Point{
    int X;
    int Y;

    public Point() {
    }

    String setXY(int X, int Y) {
        this.X = X;
        this.Y = Y;
        return "(" + X + ", " + Y + ")";

    }
}
class ColorPoint extends Point {
    String color;
     ColorPoint(int X, int Y, String color){
         super();
         this.color = color;
         setXY(X,Y);
    }
    void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "(" + X + ", " + Y + ") color: " + color;

    }
}
public class ColorPointEx  {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "¿‘¥œ¥Ÿ.");
    }
}
