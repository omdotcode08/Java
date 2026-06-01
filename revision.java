
import java.util.Scanner;

public class revision{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        {
            System.out.println("print statment check");
        }
        //helloworld
        //sum();
        //oddeven();
        //largest();
        //leapyear();
        
    

    }


    public static void sum(){
        System.out.println("Enter the First number : ");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();
        System.out.println("Enter the Second number : ");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum of First and Second Number is: " + sum);
    }
    public static void oddeven(){
        System.out.println("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number%2==0){
            System.out.println(number + " is an Even number");
        }
        else {
            System.out.println(number + " is an Odd number");
        }
    }

        public static void largest(){
            System.out.println("Enter three numbers :");
            Scanner sc = new Scanner(System.in);
            
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            int number3 = sc.nextInt();
            if (number1 > number2 && number1 > number3) {
                System.out.println(number1 + " is the Greatest of all three numbers");
            } 
             else if (number2 > number3 && number2> number1) {
                System.out.println(number2 + " is the greatest of all three");
            }
            else {
                System.out.println(number3 + " is the greatest of all three");
            }
        }

        public static void leapyear(){
            System.out.println("Enter the Year : ");
            Scanner input = new Scanner(System.in);
            int year = input.nextInt();
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("It is a leap year");
            }
            else {
             System.out.println("It is not a leap year");
            }

        }
    
}