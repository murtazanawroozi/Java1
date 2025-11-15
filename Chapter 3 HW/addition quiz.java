
package chapter_3;
import java.util.Scanner;

public class Chapter_3 {

   
    
    public static void main(String[] args) {
        
       //انجنیر صاحب مرتضی

    
                Scanner input = new Scanner(System.in);
                int number1 = (int)(Math.random()*100);
                int number2 = (int)(Math.random()*100);
                System.out.println("What is the resalt of " + number1 + " + " + number2 );
                int answer = input.nextInt();
                if(number1 + number2==answer){
                    System.out.println("The answer is tru.");
                }else{
                    System.out.println("The answer is rong.");
                }
    }
}
  