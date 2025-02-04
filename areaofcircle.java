
import java.util.Scanner;

public class areaofcircle {

    public static void main(String[] args){
    Scanner one =  new Scanner(System.in);
    System.out.println("Enter radius of circle: ");
    float radius = one.nextFloat();

    double area;
    final float pi = 22/7;
    area=pi*radius*radius;
    System.out.println("The area of the circle is" +area);
    }
}