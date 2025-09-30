import java.util.Scanner;
//this file is named as condistate which means it includes codes for conditional and decision making statements.
//code to check if a number is even or odd
public class ifelse{
    public static void main(String[] args){
    eligible();
    oddeven();
    }


//code to check if a person is older than 18 and is eligible to vote or not
public static void eligible(){
    System.out.println("Enter your age :");
    Scanner input1 = new Scanner(System.in);
    int number = input1.nextInt();
    if( number>=18 ){
        System.out.println("Congratulations! You are eligible to vote!");
    }
    else {
        System.out.println("Sorry! You are not eligible to vote!");
    }
}

public static void oddeven(){
       System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if( number%2==0 ){
            System.out.println("It is a even number");
        }
        else {
            System.out.println("It is a odd number");
        }

}
}
