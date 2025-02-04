import java.util.Scanner;

public class scanner {
public static void main(String[] args){
    Scanner mine = new Scanner(System.in);
    System.out.println("Enter your name");
  
    String username = mine.nextLine();

    System.out.println("Enter your age");
    int age =mine.nextInt();
    System.out.println("Enter your kg");
    float kg = mine.nextFloat();
    System.out.println("My name is" +username);
    System.out.println("i am " +age);
    System.out.println("i am " +kg +"kg");
}
    
}