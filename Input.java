import java.util.Scanner;
class test {

public static void main(String[] args){
    System.out.println("This is a test file and the test is to check if the another print statement that is inside a curly block will executre the same way unconditionally or not.");
    {
        System.out.println("This is inside the curly block.");
    }
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = obj.nextLine();
    System.out.println("Hello "+ name + "!");

    Scanner intdt = new Scanner(System.in);
    System.out.println("Enter your age:");
    int age = intdt.nextInt();
    System.out.println("Your age is:" + age + "yo!");

    Scanner floatdt = new Scanner(System.in);
    System.out.println("Enter your exact weight");
    float weight = floatdt.nextFloat();
    System.out.println("Your exact weight is: " + weight + "kgs");
}

}
