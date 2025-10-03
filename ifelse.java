import java.util.Scanner;

//this file is named as condistate which means it includes codes for conditional and decision making statements.
//code to check if a number is even or odd
public class ifelse {
    public static void main(String[] args) {
        // eligible();
        // oddeven();
        // check();
        // largest();
        // leapyear();
        largestthree();
    }

    // code to check if a person is older than 18 and is eligible to vote or not
    public static void eligible() {
        System.out.println("Enter your age :");
        Scanner input1 = new Scanner(System.in);
        int number = input1.nextInt();
        if (number >= 18) {
            System.out.println("Congratulations! You are eligible to vote!");
        } else {
            System.out.println("Sorry! You are not eligible to vote!");
        }
    }

    public static void oddeven() {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("It is a even number");
        } else {
            System.out.println("It is a odd number");
        }
    }

    // write a code to check if a given number is positive, negative or zero
    public static void check() {
        System.out.println("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("The entered number is positive!!");
        } else if (number == 0) {
            System.out.println("The entered number is zero!!");
        } else {
            System.out.println("The number you entered is Negative!!");
        }
    }

        public static void largest(){
            Scanner inputA = new Scanner(System.in);
            System.out.println("Enter A: ");
            int A = inputA.nextInt();
            Scanner inputB = new Scanner(System.in);
            System.out.println("Enter B: ");
            int B = inputB.nextInt();
            if ( A>B ){
                System.out.println( A + " is the largest number!");
            }
            else {
                System.out.println(B + " is the largest!");
            }
        }

        public static void leapyear(){
            System.out.println("Enter a year to check if it is a leap year: ");
            Scanner input= new Scanner(System.in);
            int year= input.nextInt();
            if (year%400==0){
                System.out.println(year + "is a leap year!!");
            }
            else if(year%100==0&&year%4!=0){
                System.out.println(year + "is not a leap year!!");
            }
        }
        public static void largestthree(){
            System.out.println("Enter A: ");
            Scanner inputA= new Scanner(System.in);
            int A = inputA.nextInt();
            System.out.println("Enter B: ");
            Scanner inputB= new Scanner(System.in);
            int B = inputB.nextInt();
            System.out.println("Enter C: ");
            Scanner inputC= new Scanner(System.in);
            int C= inputC.nextInt();
            if(A>B&&A>C){
                System.out.println("A is the greatest of all three numbers!");
            }
            else if(B>C){
                System.out.println("B is the greatest of all three numbers!");
            }
            else{
                System.out.println("C is the greatest of all three numbers");
            }
        }
    }

// We added these two methods name eligible and odd even in the same class
// (if-else) that has the main method, we may also put both in a different class
// say "methods" and then create their object say "obj" and use them in the main
// class, for example obj.eligible() and obj.oddeven()
