class Shape {
    void area(double length, double width) {
        double result = length * width;
        System.out.println("Rectangle Area: " + result);
    }
 
    void area(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Circle Area: " + result);
    }
}
 
public class TestShape {
    public static void main(String[] args) {
        Shape s = new Shape();
        
        s.area(10.0, 5.0);
        s.area(7.0);
    }
}