
package chapter_3;
import java.util.Scanner;

public class Chapter_3 {

   
    
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
         System.out.println("Enter an integer number:");
         int number = input.nextInt();
         if(number % 5 == 0 && number % 2 == 0){
             System.out.println("The number is both Hifive and Hieven.");
         }
         else if(number % 5 == 0){
             System.out.println("The number is Hifive.");}
        else if(number % 2 == 0){
             System.out.println("The number is Hieven.");
         }
    }
}
   