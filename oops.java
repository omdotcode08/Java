public class oops{
    public static void main(String[] args) {
        Student rahul = new Student();
        //new keyword dynamically allocates memory to objects in heap in RunTime also remember , static memory is at compile time
        /*here, rahul is a student , and most common mistake we do by calling rahul as an object,
        rahul is a reference object, it points towards the address of student class inside the heap,
        rahul as a reference object is stored in stack memory and points to (stores) the adress of heap memory where the student
        object is stored*/
        
        /* If you dont initialize these values here and just declare them and then try to print them
           the default values will be printed, because these are the instance variables , every variable which is 
           declared inside a class is the instance variable, and every variable which is decalred inside a function is a
           local variable which does not holds any default value, because it has a very limited time use, where as the instance
           will be stored for a longer time inside a heap 
           default values are as follows:
           int -> 0
           float -> 0.0
           char -> null
           boolean -> false
           string -> null
            */
        rahul.surname="gandhi";
        rahul.age = 21;
        rahul.marks=98;
        rahul.adress="delhi";
        System.out.println(rahul.surname);
        System.out.println(rahul.marks);
        System.out.println(rahul.adress);
        System.out.println(rahul.age);
        rahul.laughs();
    } //learn static in and non static classes further , do not worry about it here
}

 /* this is a student class, and now we can create 
    objects of this students class in the main method */
class Student{  /*One important thing to note is that when we are making a class
                we add characteristics into it ,like name , age , height, weight 
                but behaviour also needs to be added like eats , makessound, etc that 
                is added by creating methods.*/
        String surname;
        int age;
        int marks;
        String adress;
        void laughs(){
            System.out.println(surname + "is laughing");
        }
    }