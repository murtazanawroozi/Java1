
package subbstrution_quize_loop;
import java.util.Scanner;

public class Subbstrution_quize_loop {

    
    public static void main(String[] args) {
        
        final int number_of_question = 5;
        int correct_count = 0;
        int count = 0;
        long start_time = System.currentTimeMillis();
        String output = "";
        Scanner input = new Scanner(System.in);
        while(count < number_of_question){
            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10);
            if(num1 < num2){
               num1 = num1 + num2;
               num2 = num1 - num2;
               num1 = num1 - num2;
            }
            System.out.println("what is " + num1 + " - " + num2);
            int answer = input.nextInt();
            if(num1 - num2 == answer){
                System.out.println("correct");
                correct_count++;
            
            } else
                System.out.println("The answer is wrong /n " + num1  + " - " + num2 + "should be" + (num1 - num2));
            count++;
        
        output += "/n" + num1 + " - " + num2 + " = " + answer + ((num1 - num2 ==answer)? "correct" : " wrong");
       
    }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - start_time;
        System.out.println("correct count is " + correct_count + " Test time is " + testTime/+1000 + "second " + output);
    }  
}
