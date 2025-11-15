package chapter_2;
import java.util.Scanner;

public class Chapter_2 {

    
    public static void main(String[] args) {
  // Murtaza Nowroozi:
        // Display Time (HW2):
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an enteger for seconds.");
        int seconds = input.nextInt();
        int minutes = seconds/60;
        int minutes_remain = seconds % 60;
        System.out.println(" Tha " + seconds + " seconds is " + minutes + " minutes and " + minutes_remain + " seconds ");
    }
}
       