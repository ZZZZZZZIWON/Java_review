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
    
     ColorPoint() {
    	 this.color = "black";
    	 setXY(0,0);
     }
    
     ColorPoint(int X, int Y) {
    	 this.color = "black";
    	 setXY(X,Y);
     }
     
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
        return color+"색의 "+ "(" + X + ", " + Y + ")의 점";

    }
}
public class ColorPointEx  {
    public static void main(String[] args) {
//        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//        cp.setXY(10, 20);
//        cp.setColor("RED");
//        String str = cp.toString();
//        System.out.println(str + "입니다.");
    	
    	ColorPoint zeroPoint = new ColorPoint();
    	System.out.println(zeroPoint.toString() + "입니다.");
    	
    	ColorPoint cp = new ColorPoint(10, 10);
    	cp.setXY(5, 5);
    	cp.setColor("RED");
    	System.out.println(cp.toString() + "입니다.");
    }
}
