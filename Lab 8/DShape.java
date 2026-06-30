class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class DShape {
    public static void main(String[] args) {
        Shape a1 = new Shape();
        Shape a2 = new Circle();
        Shape a3 = new Rectangle();

        a1.draw();  
        a2.draw();  
        a3.draw(); 
    }
}