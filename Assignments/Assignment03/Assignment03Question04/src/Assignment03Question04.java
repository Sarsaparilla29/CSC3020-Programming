import java.util.Scanner;
public class Assignment03Question04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // object 1
        RegularPolygon RPobj1 = new RegularPolygon();
        System.out.println("n = " + RPobj1.getN() + " side = " + RPobj1.getSide() + " x = " + RPobj1.getX() + " y = " + RPobj1.getY());
        System.out.println("Perimeter = " + RPobj1.getPerimeter(RPobj1));
        System.out.println("Area = " + RPobj1.getArea(RPobj1));
        System.out.println();
        // object 2
        RegularPolygon RPobj2 = new RegularPolygon(6,4);
        System.out.println("n = " + RPobj2.getN() + " side = " + RPobj2.getSide() + " x = " + RPobj2.getX() + " y = " + RPobj2.getY());
        System.out.println("Perimeter = " + RPobj2.getPerimeter(RPobj2));
        System.out.println("Area = " + RPobj2.getArea(RPobj2));
        System.out.println();
        // object 3
        RegularPolygon RPobj3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("n = " + RPobj3.getN() + " side = " + RPobj3.getSide() + " x = " + RPobj3.getX() + " y = " + RPobj3.getY());
        System.out.println("Perimeter = " + RPobj3.getPerimeter(RPobj3));
        System.out.println("Area = " + RPobj3.getArea(RPobj3));
    }
}

class RegularPolygon {
    private int n = 3; // defines number of sides in a polygon default 3
    private double side = 1; // stores length of the side with default 1
    private double x = 0; // defines x-coordinate of polygons center
    private double y = 0; // defines y-coordinate
    // no-arg constructor creates a regular polygon with default values
    RegularPolygon() {
    }
    RegularPolygon(int numSides, double sideLength) {
        n = numSides;
        side = sideLength;

    }
    RegularPolygon(int numSides, double sideLength, double xCord, double yCord) {
        n = numSides;
        side = sideLength;
        x = xCord;
        y = yCord;
    }
    // mutator's
    void setN(int numSides) {n = numSides;}
    void setSide(double sideLength) {side = sideLength;}
    void setX(double xCord) {x = xCord;}
    void setY(double yCord) {y = yCord;}
    //accessor's
    int getN() {return n;}
    double getSide() {return side;}
    double getX() {return x;}
    double getY() {return y;}
    // returns perimeter
    double getPerimeter(RegularPolygon pObj) {
        //RegularPolygon pObj = new RegularPolygon();
        double perimeter = pObj.getN() * pObj.getSide();
        return perimeter;
    }
    // returns area
    double getArea(RegularPolygon aObj) {
        double numerator = (aObj.getN() *(Math.pow(aObj.getSide(), 2)));
        double denominator = (4 * (Math.tan(Math.PI/aObj.getN())));  //((Math.PI)/aObj.getN())));

        return numerator/denominator;
    }
}