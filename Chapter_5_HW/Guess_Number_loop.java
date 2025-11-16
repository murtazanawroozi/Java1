
package guss_number_loop;
import java.util.Scanner;

public class Guss_number_loop {

    
    public static void main(String[] args) {
        //Guss number untale correct.
        
        int number = (int)(Math.random()*101);
        Scanner input = new Scanner(System.in);
        
        int answer = 1;
        while(answer != number){
            System.out.println("Imagain anumber bettwen 1---100.");
            int uanswer = input.nextInt();
           if(uanswer == number)
               System.out.println("you'r writh the number is " + number);
        
               else if(uanswer > number)
                   System.out.println("The answer is to high");
           else
                   System.out.println("you'r guss is too loow.");
           
                       
    }
        
      
    }
    
}
