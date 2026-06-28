public class functions{
    public static void main(String[] args) {
        /* java has functions just like the other languages , where 
        when we call a function we pass arguements and when we define a function we pass parameters 
        fumctions can be of different type on basis of what is its datatype and 
        what is it gonna return , or is it even gonna return, in simple language io and op
        1. no io no op
        2. io , no op
        3. no ip=o , op
        4. io , op*/
        System.out.println(sum(85,56)); 
        sum(5, 9);
        marks();
        fun();
        name("Om Manglani");
        System.out.println(sum(45, 55, 55));

        fun1();
        System.out.println("Hello, Welcome to function chaining:");
    }

    static int sum(int a , int b){
        // This is a function that is of type input+output [4]
        int sum = a + b;
        return sum;
    }
    static void name(String name){
        // This is a function of type 2, it takes input , but returns no op
        System.out.println("Hello " + name);
    }

    static int marks(){
        int marks = 25;
        System.out.println(marks);
        return marks;
    }

    static void fun(){
        System.out.println("Hello World!!");
    }

    //The concept of method overloading: 
    /*Method overloading happens when the number of parameters are not sufficient
    to use a fucntion for performing an operation , for an instance , if i have a function 
    that adds two numbers , but for operation i have three numbers , at that time this function wont work 
    this scenario is called as method overloading, in such cases we have to created different methods, 
    --> If two method have same name but different parameters then the compiler can differentiate the two functions while they 
    are called */
    static int sum(int a , int b , int c ){
        int sum = a + b + c;
        return sum;
    }
    /* this was allowed by method overloading, siilarly you can do it with different types of functions,
     its just that compiler should be able to differentiate */


     static void fun1(){
        fun2();
        System.out.println("How are you?");
     }

     static void fun2(){
        fun3();
        System.out.println("How is leetcode going?");
     }
     static void fun3(){
        System.out.println("Function chain exit..........");
     }
     
     /*Scope of variable is another concept we need to understand which is a variable is declared where and is accessible where?
     if it is a global variable , ie decalred in the start of code outside all the curly braces , it can be accessed anywhere
     but if it is declared inside any block of code such as inside a loop of a if statement ,
     it will only be accessible inside that block of code*/
}