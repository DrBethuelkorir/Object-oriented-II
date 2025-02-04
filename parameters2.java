import java.util.Scanner;

public class parameters2 {
   

static void checkage(int age){
if(age<18){
    System.out.println("You are not elligible to vote");
}
else{
    System.out.println("you are eligible to vote");
}
    }
    public static void main(String[]args){
        Scanner one = new Scanner(System.in);
        System.out.print("Enter you age");
        int age =one.nextInt();
        checkage(age);
    }
    }
    