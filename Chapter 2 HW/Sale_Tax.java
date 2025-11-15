package chapter_2;
import java.util.Scanner;

public class Chapter_2 {

    
    public static void main(String[] args) {
     //Sale Tax(HW4)
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the sale:");
        double sale = input.nextDouble();
        double Tax = 0.05*sale;
        System.out.println(" your sale tax for " + sale + " $ is  " + Tax + "$" );
    }
}
