import java.util.Scanner;
class switchcase{
    public static void main(String[] args){
       week();
       month();
    }

    public static void month(){
        System.out.println("Enter the month that you want to know of the year!");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;    
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octomber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;   
        }
    }
    public static void week(){
         System.out.println("Enter the day of the week(1-7)");
        Scanner input = new Scanner(System.in);
        int day= input.nextInt();
        switch(day) {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
        }
    }

    public static void calculator(){
        
    }
}