import java.util.Scanner;

public class ScannerDemo{
    public static void main(String[]args){
        // create object of scanner class
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String name = obj.nextLine();
        //read string
        System.out.println("enter age: ");
        int age = obj.nextInt();
        
        System.out.println("enter the GPA: ");
        double GPA = obj.nextDouble();

        System.out.println("enter second name: ");
        String secondname = obj.nextLine();

        System.out.println("my name is" +name);
        
        System.out.println("i am" +age);
        System.out.println("my gpa is" +GPA);
        System.out.println("my second name is" +secondname);


    }
}
    

