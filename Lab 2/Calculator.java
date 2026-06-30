import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your First Number :");
        double num1 = sc.nextDouble();
        System.out.print("Enter an Operator (+,-,*,/):");
        char Operator=sc.next().charAt(0);
        System.out.print("Enter Your Second Number ");
        double num2=sc.nextDouble();
        double result;
        switch (Operator) {
            case '+':
                result=num1+num2;
                System.out.println("Your Sum is "+ result);
                break;
        case '-':
            result=num1-num2;
            System.out.println("Your Substraction is "+ result);
            break;
        case '*':
            result=num1*num2;
            System.out.println("Your Multiplication is "+ result);
            break;
            case '/':
                if(num1 !=0){
                result=num1/num2;
                System.out.println("Your Division is "+ result);
                }
                else{
                    System.out.println("Number can'nt divided by zero");
                }
                break;
            default: System.out.println("Wrong Operator");
                break;
        }
    }
}