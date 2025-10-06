import java.util.Scanner;
public class loops{

    public static void main(String[] args){
        //here we understood that static methods can be called by dot operator [questions.methodname] where questions is a class name that has the two static methods , if they were in the same class as the class that has the main method , they could have been called directly for exaple even() and loopstype().
       questions.loopstypes();
       questions.even();
   }
}

public class questions{
public static void loopstypes(){
System.out.println("This is the for loop: ");
        // Scanner input = new Scanner(System.in);
        // int A = input.nextInt();
        for(int i=0 ; i<6 ; i++){
            System.out.println("i: "+ i);
        }
        System.out.println("This is the while loop: ");
        int i = 0;
        while(i<6){
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("This is a do while loop: ");
        int j=0;
        do{
            System.out.println("j: "+ j );
            j++;
        }
        while(j < 6);
    }
//this is the method that prints even nnumbers in the range 1 to 50
    public static void even(){
       System.out.println("The prime numbers from 1 to 50 are: ");
       for(int i = 0; i<50 ; i++){
          if(i%2==0){
              System.out.println("i: " + i);
           }
       }
   }
}
