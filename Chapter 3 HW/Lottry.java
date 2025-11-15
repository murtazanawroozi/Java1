
package chapter_3;
import java.util.Scanner;

public class Chapter_3 {

   
    
    public static void main(String[] args) {


 
       Scanner input = new Scanner(System.in);
       
       int lottery = (int)(Math.random()*100);
        System.out.println("Enter two digit number.");
        int your_guss = input.nextInt();
        
        int lotteryDigit1 = lottery/10;
        int lotteryDigit2 = lottery % 10;
        
        int your_guss1 = your_guss/10;
        int your_guss2 = your_guss % 10;
        
        if(your_guss == lottery)
            System.out.println(" you win 10000$. ");
        else if (your_guss1 == lotteryDigit2 && your_guss2 == lotteryDigit1)
            System.out.println(" you win 3000$ ");
        else if (your_guss1 == lotteryDigit1
                || your_guss1 == lotteryDigit2
                || your_guss2 == lotteryDigit1
                || your_guss2 == lotteryDigit2)
            System.out.println(" you win 1000$ ");
         else System.out.println(" you losse ");
    }
}