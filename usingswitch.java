import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class usingswitch {

    public static void main(String[]args){
        Scanner one = new Scanner(System.in);
        System.out.println("Enter the number of day: ");
        int day = one.nextInt();
        switch (day) {
            case 1:
              System.out.println("sunday");
              break;
            case 2:
              System.out.println("monday");
              break;
            case 3:
              System.out.println("tuesday");
              break;
            case 4:
              System.out.println("wednesday");
              break;
            case 5:
              System.out.println("thursday");
              break;
            case 6:
              System.out.println("friday");
              break;
            case 7:
              System.out.println("sartuday");
              break;
              default:
              System.out.println("No such day");
          }
    }
}