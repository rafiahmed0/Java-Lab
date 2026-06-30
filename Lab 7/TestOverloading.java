class Calculate {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class TestOverloading{
    public static void main(String[] args) {
        Calculate cal = new Calculate();

        System.out.println("Sum of 2 integers: " + cal.add(10, 20));
        System.out.println("Sum of 2 doubles: " + cal.add(10.5, 20.5));
        System.out.println("Sum of 3 integers: " + cal.add(5, 10, 15));
    }
}