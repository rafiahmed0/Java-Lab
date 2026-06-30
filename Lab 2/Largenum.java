
import java.util.Scanner;

public class Largenum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number ");
        double num1 = sc.nextDouble();
        System.out.print("Enter your second number ");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println(num1+" is Larger than "+num2 
              );
            }
        else if(num2>num1){
        System.out.println(num2+" is Larger than "+num1);
        }
        else{
        System.out.println("Both number is equal");
        }
    }
}
