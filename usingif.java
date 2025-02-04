import java.util.Scanner;

public class usingif {

    
    public static void main(String[]args){
Scanner one = new Scanner(System.in);
System.out.println("Enter PIN: ");
int number = one.nextInt();
final int pin =2298;
if(number!=pin){
    System.out.println("Wrong pin try again later");
}
else{
    System.out.println("Welcome");
}
}
    }
