
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
        //table();
        //calculator();
        //factorial();
        //sumofN();
        //reverse();
        //count();
        //palidrome();
        //armstrong();
        //issquare(18);
        //System.out.println(isprime(10));
        //System.out.println(findmax(89 , 88));
        //halftri();
        //reversehalftri();
        //rectangle();
        //nohalftri();
        //nohalftri2();
        //mirrortri();
        //diagonal();
        //reversemirrortri();
        //pyramid();
        //reversepyramid();
        //halfdiamond();
        //diamond();
        //rightdiagonal();
        //leftdiagonal();
        //mirrorleftcross();
        cross();
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
        public static void table(){
            System.out.println("Enter a number :");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            for (int i= 1 ;  i <= 10 ; i++){
                System.out.println(number + "*" + i + "=" + number*i);
            }   
        }
        public static void calculator(){
            System.out.println("Enter the first Number : ");
            Scanner sc = new Scanner(System.in);
            int number1 = sc.nextInt();
            System.out.println("Enter the second Number : ");
            int number2 = sc.nextInt();
            System.out.println("Enter which operation you want to perform on the entered NUmbers : [1-5]");
            System.out.println("1]. Addition \n"  + "2]. Susbtraction \n" + "3]. Multiplication \n" + "4]. Division \n");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1: 
                    int sum = number1 + number2;
                    System.out.println("The sum is : " + sum);
                    break;
                case 2: 
                    int sub = number1 - number2;
                    System.out.println("The Substraction is : " + sub);
                    break; 
                case 3:
                    int multi = number1* number2;
                        System.out.println("The Multipication is : " + multi);
                    break;
                case 4: 
                    int div = number1 / number2;
                    System.out.println("The division is : " + div);
                    break;
                default:
                    System.out.println("Enter a correct Choice!");
            }

        }
        public static void factorial(){
            System.out.println("Enter a number for calculating its factorial :");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            int factorial = 1;
            for (int i = 1 ; i <= number ; i++){
                factorial = i*factorial ;
        }
            System.out.println("The factorial is : " + factorial);
            }
        
        public static void sumofN(){
            System.out.println("Enter the number of Natural Numbers you want to calculate the Sum of : ");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int sum = 0;
            for(int i = 1 ; i <= n ; i++){
                sum = i + sum;
            }
            System.out.println("The Sum of " + n + " Natural Numbers is :" + sum);
        }

        public static void reverse(){
            System.out.println("Enter a number that you want to reverse : ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            int reverse = 0;
            while(number > 0){
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number = number / 10;
            }
            System.out.println("Reverse is :" +  reverse);
        }

        public static void count(){
            System.out.println("Enter a number whose length you want to count : ");
            Scanner input = new Scanner(System.in);
            long number = input.nextLong();
            if(number == 0){
                System.out.println("The number of digits are 1");
            }   
            int count = 0;
            while (number > 0){
                number = number / 10;
                count++;
            } 
            System.out.println("The Number of digits of the number you entered are : " + count );
        }

        public static void palidrome(){
            System.out.println("Enter the number that you want to check if it is a palidrome or not : ");
            Scanner input = new Scanner(System.in);
            int number  = input.nextInt();
            int ognumber = number ;
            int reverse = 0;
            int digit; 
            while(number > 0){
                digit = number % 10;
                reverse = reverse * 10 + digit;
                number = number / 10 ; 
            }
            if (ognumber == reverse) {
                System.out.println("The number is a palidrome!");
            }
            else {
                System.out.println("The number is not a palidrome!");
            }
        }

        public static void armstrong(){
            System.out.println("Enter a number to check if it is armstrong or not : ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            int ognumber = number ;
            int ognumber2 = ognumber;
            int digit;
            double armstrong = 0;
            int power = 0;
            while(number > 0 ) {
                number = number / 10;
                power++;
            }
            while(ognumber > 0) {
                digit = ognumber % 10;
                armstrong = armstrong + Math.pow(digit ,power);
                ognumber = ognumber / 10;
            }
            if (ognumber2 == armstrong){
                System.out.println("The entered Number is an Armstrong number!");
            }
            else{
                System.out.println("It is not an Armstrong number!");
            }
        }

        public static int issquare(int n){
            n = n * n;
            System.out.println("The Square of the number you entered is : " + n);
            return n ;
        }

        public static boolean isprime(int n){
            boolean isprime=true;
            if (n <= 1 ) {
                return false;
            }
            for(int i = 2 ; i <= Math.sqrt(n) ; i++){
                if (n % i == 0) {
                   isprime = false;
                }
            }
            return isprime;
        }
        public static int findmax(int a , int b ){
            int maximum; 
            if(a>b){
               maximum = a; 
        }
        else {
               maximum = b;
        }
        return maximum; 
        }  

        //Pattern Printing

        public static void halftri(){
            for(int i = 1 ; i<= 5 ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print("*");
                } 
                System.out.print("\n");  
            }
        }

        public static void reversehalftri(){
            int n = 5;
            for(int i = 1 ; i <= n ; i++){
                for(int j = n ; j >= i ; j--){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }

        public static void rectangle(){
            int n = 5;
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= n ; j++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }

        public static void nohalftri(){
            int n = 5;
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j<= i ; j++){
                    System.out.print(j);
                }
                System.out.print("\n");
            }
        }

        public static void nohalftri2(){
            int n = 5;
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j<= i ; j++){
                    System.out.print(i);
                }
                System.out.print("\n");
            }
        }

        public static void mirrortri(){
            int n = 5;
            for(int i = 1 ; i<= n ;i++){
                for(int j = 1 ; j<=n-i ;j++){
                    System.out.print(" ");
                }
                for(int k = 1 ; k <= i ; k++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        public static void reversemirrortri(){
            int n = 5;
            for(int i = 1 ; i <= n ; i++){
                for( int j = 1 ; j <= i ; j++ ){
                    System.out.print(" ");
                }
                for(int k = n ; k >= i ; k--){
                    System.out.print("*"); 
                }
                System.out.print("\n");
            }
            
        }
        public static void diagonal(){
            int n = 5;
            for(int i = 1 ; i <= n ;i++){
                for(int j = 1 ; j <= n-i ;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.print("\n");       
            }
        }

        public static void pyramid(){

            int n = 5;
            for(int i = 1 ; i <= n ;i++){
                for(int j = n ; j>= i ; j--){
                    System.out.print(" ");
                }
                for(int k = 1 ; k <= i ;k++){
                    System.out.print("*");
                }
                for(int r = 2 ; r <= i ; r++){
                    System.out.print("*");
                }
                System.out.print("\n");  
            }
        }

        public static void reversepyramid(){
            int n = 5;
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j<= i ; j++){
                    System.out.print(" ");
                }
                for(int k = n ; k >= i ; k--){
                    System.out.print("*");
                }
                for(int r = n-1 ; r >= i ; r--){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }

        public static void halfdiamond(){
            int n = 5;
            for(int i = 1 ; i<=n ; i++){
                for (int j = n ; j>=i ; j--) {
                    System.out.print(" ");
                }
                for(int k = 1 ; k<= i ;k++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            for(int i= 2 ; i<=5 ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(" ");
                }
                for(int k = 5 ; k >= i ;k--){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }


        public static void diamond(){
            int n =10;
            for(int i = 1 ; i<=n ; i++){
                for(int j = n ; j >= i ; j --){
                  System.out.print(" ");
                }
                for(int k = 1 ; k<=i ; k++){
                    System.out.print("*");
                }
                for(int r = 2 ; r<=i ; r++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }

            for(int i = 2; i <= n ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(" ");
                }
                for(int k = n ; k >= i ; k--){
                    System.out.print("*");
                }
                for(int r = n-1 ; r>=i ; r--){
                    System.out.print("*");
                }
                System.out.print("\n");
                
            }
        }

        public static void rightdiagonal(){
            int n = 5;
            for(int i = 1 ; i<=n ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.print("\n");
            }
        }
        public static void leftdiagonal(){
            int n = 5;
            for(int i = 1 ; i<=n ; i++){
                for(int j = 1 ; j<=n-i; j++){
                    System.out.print(" ");
                }
                System.out.println("*"); 
                
            }
        }
        public static void mirrorleftcross(){
            int n = 5; 
            for(int i = 1 ; i<=n ;i++){
                for(int j = n ; j>=i ; j--){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.print("\n");
            }
            for(int i = 2 ; i<=n ; i++){
                for(int j = 1 ; j<= i; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.print("\n");
            }
        }
        public static void cross(){
            int n = 5;
            for(int i=1; i<= n ; i++){
                for(int j = 1 ; j<=i ; j++){
                    System.out.print(" ");
                }
                for(int k = 1 ; k<=i ;k++){
                    System.out.print("*");
                }
                
                System.out.print("\n");
                
            }
            for(int i = 2 ; i <= n ; i++){
                for(int j = n ; j>=i ; j--){
                    System.out.print(" ");
                }
                for(int k = n ; k>=i ; k--){
                    System.out.print("*");
                }
                
                System.out.print("\n");

            }
        }

        }
    
        

        