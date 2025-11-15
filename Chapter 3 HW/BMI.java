
package chapter_3;
import java.util.Scanner;

public class Chapter_3 {

   
    
    public static void main(String[] args) {
        
       
       //BMI:
       //Murtaza Nowroozi:
       
       
       Scanner input = new Scanner (System.in);
        System.out.println("Enter the wight in pound:");
        double wight = input.nextDouble();
        System.out.println("Enter the hight in inche:");
        double hight = input.nextDouble();
        
        final double kilogram_per_pound = 0.453592;
        final double meter_per_inche = 0.0254;
        
      double wightInKilogram = wight*kilogram_per_pound;
      double hightInMeter = hight*meter_per_inche;
      
      double BMI = wightInKilogram/(hightInMeter*hightInMeter);
        System.out.println("Your BMI is " + BMI);
        if(BMI<18.5)
            System.out.println("You are under wight.");
        else if (BMI>18.5)
            System.out.println("You are normall.");
        else if (BMI>25.0)
            System.out.println("You are owerwight.");
        else
            System.out.println("Obase"); 
    }
}