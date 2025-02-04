import java.util.Scanner;

public class usingwhie {

    public static void main(String[]args){
Scanner one = new Scanner(System.in);
System.out.println("Enter countdown: ");
int coutdown = one.nextInt();
while (coutdown>0) {
    System.out.println(coutdown);
    coutdown--;
}
System.out.println("Happy new year");
    }
    
}