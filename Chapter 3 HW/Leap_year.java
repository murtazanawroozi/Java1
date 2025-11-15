
package chapter_3;
import java.util.Scanner;

public class Chapter_3 {

   
    
    public static void main(String[] args) {
        
       
  
       Scanner input = new Scanner (System.in);
        System.out.println("Enter your sightly year:");
        int Year = input.nextInt();
        boolean LeapYear = ( Year % 4 == 0 && Year % 100!= 0) || (Year % 400 == 0);
        System.out.println(" is " + Year + " a leap year ?" + LeapYear);
    }
}
       