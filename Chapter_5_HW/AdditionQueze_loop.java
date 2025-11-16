
package additon_quize_loop;
import java.util.Scanner;

public class Additon_quize_loop {

    
    public static void main(String[] args) {
        int num1  = (int)( Math.random()*10);
        int num2 = (int)(Math.random()*10);
    Scanner input  =new Scanner(System.in);
        System.out.println("what is " + num1 + " + " + num2);
        int answer = input.nextInt();
        int answercom = num1 + num2;
        while(answer != answercom){
          System.out.println(" you'r answer is wrong");
                  System.out.println("what is " + num1 + " + " + num2 + " = ");
                  answer = input.nextInt();
        }
        System.out.println("You got it");
    }
    
}
