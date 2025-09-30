

public class basics {
    public static void main(String[] args){
        test newtest = new test();
        System.out.println("Hello Om!" + newtest.append);
        System.out.println("My age is " + newtest.number);
        newtest.height=5.10f;
        newtest.isMarried=false;
        newtest.hobby="coding";
        System.out.println("My height is " + newtest.height);
        System.out.println("Am I married? " + newtest.isMarried);
        System.out.println("My hobby is " + newtest.hobby);
        System.out.println("The  Maximum integer value is "+ Integer.MAX_VALUE);
        System.out.println("The  Minimum integer value is "+ Integer.MIN_VALUE);
        System.out.println("The  Maximum float value is "+ Float.MAX_VALUE);
        System.out.println("The  Minimum float value is "+ Float.MIN_VALUE); 

    }
}
class test{
    String append = "How are you?";
    int number = 28;
    float height;
    boolean isMarried;
    String hobby;
}
