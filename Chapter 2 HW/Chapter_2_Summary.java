
package chapter2summary;
import java.util.Scanner;

public class Chapter2Summary {

    
    public static void main(String[] args) {
        
        // 1:(convert celsiuse to fahrenhite)
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the celsiuse digree:");
        double celsiuse = input.nextDouble();
        double fahrenhite = (9/5)*celsiuse + 32;
        System.out.println("The " + celsiuse + "  celsiuse digree is = " + fahrenhite + "  fahrehite digree");
*/
        
        
        // 2: (compute the volume of cylinder)
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radiuse of cylinder:");
        short radiuse = input.nextShort();
        System.out.println("Enter the lenght of cylinder:");
        short lenght = input .nextShort();
        double area = radiuse*radiuse*3.14159;
        double volume  = area*lenght;
        System.out.println("The area is " + area + " and the volume is " + volume);
*/
        
        // 3: (convert feet into meters)
        /*
        Scanner input  =new Scanner(System.in);
        System.out.println("Enter the feet's:");
        double feet = input.nextDouble();
        double meter = (feet*0.305);
        System.out.println("The " + feet + " feet is = " + meter + " meters");     
       */
        
        // 4: (convert pound into kilograme)
        // Murtaza jan
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ppound number:");
        double pound = input.nextDouble();
        double kilograme = pound * 0.454;
        System.out.println("The " + pound + " pound is = " + kilograme + "kilogram.");
        */
        
        
        // 5: (Financial application: culculate tips)
        /*
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the substale and rate:");
        double substale = input.nextDouble();
        double rate = input.nextDouble();
        double gratuity = (substale * (rate/100));
        double total = (gratuity + substale);
        System.out.println("The gratuity is " + gratuity + " and the total is = " + total);
          */
        
        //6: (Sum the digits in an integer)
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 1000:");
        int number = input.nextInt();
        int number1 = number/10;
        int a = number%10;
        int number2 = number1/10;
        int b =  number1%10;
        int number3 = number2/10;
        int c = number2%10;
        int sum = a+b+c;
        System.out.println("The sum is " + sum);
        */




      
        
        // 7: (find the number of year)
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of second's:");
        long second = input.nextLong();
        long year = second/31536000;
        long remain = second % 31536000;
        long day = remain/86400;
        System.out.println("All of this seconds is = " + year + "year and " + day + "days")
        */
        
        
        // 8: (Current time)
       
        
        
        
        
        
        
        
        
        
        
        // 9:(Physics:acceleration)
        // En.Murtaza
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting volaity at m/s:");
        double v1 = input.nextDouble();
        System.out.println("Enter the inding volacity at m/s:");
        double v2 = input.nextDouble();
        System.out.println("Enter the time:");
        double time = input.nextDouble();
        double acceleration = (v2-v1)/time;
        System.out.println("The accelerationis " + acceleration);
*/
        
        
        // 10: (Since: calcuting energy)
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Eter the weight:");
        double weight = input.nextDouble();
        System.out.println("Ente the initial energy:");
        double energy1 = input.nextDouble();
        System.out.println("Enter the final enery:");
        double energy2 = input.nextDouble();
        double Q = weight*(energy2 - energy1)* 4184;
        System.out.println("You need about " + Q + " joul energy");
        */
        
        
              
        //11: (Population projecton)
        
        
        
        
        
        
        
        
        //12:(physice: finding runway lenght)
        /*
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the speed at m/s:");
        int speed = input.nextInt();
        System.out.println("Enter the acceleration:");
        int acceleration = input.nextInt();
        double lenght = (speed*speed)/(2*acceleration);
        System.out.println("The lenght is " + lenght);
        */
        
        
        // 13: (Fnancial application: Copput value)
      /*
        Scanner input = new Scanner(System.in);
        System.out.println("Eter mountly saving amount:");
        double save = input.nextDouble();
        System.out.println("Enter the annual rate:");
        double rate = input.nextDouble();
        double m1 = save*(1+rate/12);
        double m2 = (save+m1)*(1+rate/12);
        double m3 = (save+m2)*(1+rate/12);
        double m4 = (save+m3)*(1+rate/12);
        double m5 = (save+m4)*(1+rate/12);
        double m6 = (save+m5)*(1+rate/12);
        System.out.println("The total mony after 6 mounth is " + m6);
       */
      
      
     
       
       
    }
    
}
