
import java.util.Arrays;



public class array{
    public static void fillarray(){
        int[] arr1 = new int[10];
        //fill array from 28 to 38
        int x=28;
        for(int i = 0 ; i <  10 ; i++){
            arr1[i] = x;
            x++;
        }
        System.out.println(Arrays.toString(arr1));
    }
        
     public static int findmin(int[] arr){
        int minimum = arr[0];
        for(int i = 0 ; i<= arr.length -2 ; i++){
            if (arr[i]<minimum) {
                minimum = arr[i];
            }
        }
        System.out.println(minimum);
        return minimum; 

    }
    public static int maximum(int[] arr){
        int maximum = arr[0];
        for(int i = 0 ; i <= arr.length - 1 ; i++){
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println(maximum);
        return maximum;
    }


    //Multidimentional arrays: 
    public static void multiarray(){
        //single dimension array is : [1D]
        //int[] oneD = new int[5];

        //TwoD arrays are: An array whose every element itself is an array: 
        //An Array can be declared in multiple ways: The first one is:
        int marks[][] = new int [3] [3];
        marks[0][0] = 25;
        marks[0][1] = 25;
        marks[0][2] = 25;

        marks[1][0] = 25;
        marks[1][1] = 25;
        marks[1][2] = 25;

        marks[2][0] = 25;
        marks[2][1] = 25;
        marks[2][2] = 25;
        for(int i = 0 ; i < marks.length ; i++){
            for(int j = 0 ; j< marks[i].length; j++){
                System.out.print(marks [i][j] + " ");
            }
            System.out.println("");
        }

        //And the second way of declaring an array is:
        int marks1[][] = {
            {9,5,6,4},
            {5,6,1},
            {9,5}

        };
        for(int i = 0 ; i < marks1.length ; i++){
            for (int j = 0 ; j < marks1[i].length; j++) {
                System.out.print(marks1[i][j] + " ");
            }
            System.out.println("");
        } 

    }
    public static void main(String[] args) {
        //findmin(new int[]{8,2,5,6,4,3,15});
        //maximum(new int[]{2,5,6,4,8,3,1});
        //fillarray();
    //     int[] rollnumbers = new int[] {5,10,69,15,21,312,22};
    //     for(int i = 0 ; i<= 6; i++){
    //         if(rollnumbers[i]==21){
    //             System.out.println(i + "is the index of the target roll number!");  
    //     }  
    // }
// to take input from the user for elements in an array , you do : 
//         int[] rollnumber = new int[6];
//         Scanner sc = new Scanner(System.in);
//         for(int i = 0 ; i < rollnumber.length ; i++){
//             System.out.println("Enter the value to insert in array for " + i+"th element :");
//             rollnumber[i] = sc.nextInt();
//         }   
// //Arrays.toString is a method of arrays class that converts the array into a string, we can use it to read the array without traversing with loop.  
//             System.out.println(Arrays.toString(rollnumber));
multiarray();

    }
   

}
