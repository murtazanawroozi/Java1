
package chapter3_summary;
import java.util.Scanner;

public class Chapter3_Summary {

    
    public static void main(String[] args) {
        
        // 1:(Algebra: Solve quadritice ecution).
        //انجنیر صاحب مرتضی.
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Our ecution is(a*x*x) + bx + c");
        System.out.println("Now enter the a .");
        double a = input.nextDouble();
        System.out.println("Enter the b us an entiger.");
        double b = input.nextDouble();
        System.out.println("Enter the c us an entiger.");
        double c = input.nextDouble();
        double dilta = (b*b-4*a*c);
        if ( dilta > 0 ){
            System.out.println("Thise ecution has two root r1="  + ((-b)-Math.sqrt(dilta)/2*a) +  "and r2 = "  + ((-b)+Math.sqrt(dilta)/2*a) );
        } else if (dilta == 0){
          System.out.println(" The ecution has two simlar root r1 = r2 = " +((-b)-Math.sqrt(dilta)/2*a) );
        }else if (dilta < 0 ){
            System.out.println("The ecution has not real root");
             
}

*/
        
        // 2: (additon quize).
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer number.");
        int a = input.nextInt();
        int b  = input.nextInt();
        double sum  = (a+b);
        System.out.println("What is you'r answer.");
        int answer = input.nextInt();
        if(answer == sum){
            System.out.println("you'r answer is correct " + sum);
        }else{
            System.out.println("wrong answer.");
        }
*/
        
        
        
        // 3:  (Algebra: solve 2 * 2 linear equations):
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the a,b,c,d,e and f:");
        int a = input .nextInt();
         int b = input .nextInt();
          int c = input .nextInt();
           int d = input .nextInt();
            int e = input .nextInt();
             int f = input .nextInt();
              double determinan = (a*d)-(b*c);
              if(determinan != 0 ){
                  double x = (e*d - b*f)/determinan;
                  double y = (a*f - e*c)/determinan;
                  System.out.println("The valueof x is " + x + " and the value of y is " + y);
              }else{
                  System.out.println("The eqution has no solotuin");
              }
        
        */
        
        
        
        
        
        
        
        
        //4: (Random mounth).
        /*
      Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of hixagon:");
        double side = input.nextDouble();
        double area = (6*side*side)/(0.577*4);
        System.out.println("The area of hexagon with this side is = " + area);
*/
        
      //5:(Find future dates).
      /*
      Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for today:");
        int number = input.nextInt();
        if(number %7 == 0 )System.out.println("Today is Sunday.");
        if(number %7 == 1 )System.out.println("Today is Monday.");
        if(number %7 == 2 )System.out.println("Today is Teuse day.");
        if(number %7 == 3 )System.out.println("Today is Wends day.");
        if(number %7 == 4 )System.out.println("Today is Thurse day.");
        if(number %7 == 5 )System.out.println("Today is Friday.");
        if(number %7 == 6 )System.out.println("Today is Satar day.");
        System.out.println("Enter a number for the next day:");
        int nextNum = input.nextInt();
        
        if(nextNum %7 == 0 )System.out.println(" the next day is Sunday.");
        if(nextNum %7 == 1 )System.out.println("the next day is Monday.");
        if(nextNum %7 == 2 )System.out.println("the next day is Teuse day.");
        if(nextNum %7 == 3 )System.out.println("the next day is Wends day.");
        if(nextNum %7 == 4 )System.out.println("the next day is Thurse day.");
        if(nextNum %7 == 5 )System.out.println("the next day is Friday.");
        if(nextNum %7 == 6 )System.out.println("the next day is Satar day.");
        */
      
      //6:(Health application BMI).
      /*
      Scanner input = new Scanner(System.in);
        System.out.println("Enter the height in meter:");
         double height = input.nextDouble();
         System.out.println("Enter the wight in killogram:");
         double weight = input.nextDouble();
         double BMI = weight/(height*height);
         System.out.println("Your BMI is " + BMI);
         if(BMI < 17.5)System.out.println("you are under wigth.");
         if(BMI > 17.5 && BMI < 23.5)System.out.println("you are normal");
         if(BMI > 23.5)System.out.println("you are over wigth");
*/
      
      // 8:(Sort three integers) ):
      /*
      Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer:");
        int a =input.nextInt();
        int b =input.nextInt();
        int c =input.nextInt();
        if(a > b && b > c)System.out.println("Sort is " +   a + "   " +   b   + "   "+ c);
        if(a > c && c > b)System.out.println("Sort is " +   a + "   " +   c   + "   "+  b);
        if(b > a && a > c)System.out.println("Sort is " +   b + "   " +   a   + "   "+   c);
        if(b > c && c >a )System.out.println("Sort is " +   b + "   " +   c   + "   "+  a);
        if(c > a && a > b)System.out.println("Sort is " +   c + "   " +   a   + "   "+  b);
        if(c > b && b > a)System.out.println("Sort is " +   c + "   " +   b   + "   "+  a);
               
        if(c == b && b == a)System.out.println("The three nubmber are equeal.");
        */
      
      /*
      //9:(Business: check ISBN-10):
      Scanner input = new Scanner(System.in);
      
      
     
      
      
      
      */
      
      
            
      
      // 10: (Game: addition quiz)
     /*
      Scanner input = new Scanner(System.in);
      int num1 = (int)(Math.random()*10);
      int num2 = (int)(Math.random()*10);
        System.out.println("What is " + num1 + " + " + num2);
        int result = num1 + num2;
        int answer = input.nextInt();
        if(result == answer)System.out.println("you are writh the answer is " + result);
        else System.out.println("you'r answer is wrong and correct answer is " + result);
      */
     
     
     // 11: (Find the number of days in a month).
     /*
           Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();
*/
     
     
     
     //12: (Palindrome integer).
     /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three number:");
        int number = input.nextInt();
        int handred = number/100;
        int tens = (number/100)%10;
        int unit = number %10;
        if(handred == unit)System.out.println("The number is pollindrom");
        else System.out.println("The numbr is not pollindrom ");
        */
     
     
     //13:(Financial application: compute taxes).
     /*
     Scanner input = new Scanner(System.in);
     System.out.print("Enter filing status (0=single,1=married jointly,2=married separately,3=head of household): ");
        int status = input.nextInt();

        System.out.print("Enter taxable income: ");
        double income = input.nextDouble();

        double tax = 0;
        if (income <= 8350)
                    tax = income * 0.10;
           if (income <= 33950);
           tax = 8350 * 0.10 + (income - 8350) * 0.15;
           if (income <= 33950);
           tax = 3350*0.15+(income - 33950)*0.20;
           if(income <= 44850);
           tax = 33950*0.20 + (income - 33950)*0.25;
           System.out.println("The tax is " + tax);
           
            */
     
     
     // 14:(Game: heads or tails).
     /*
     Scanner input = new Scanner(System.in);
                    
    int coin = (int)(Math.random() * 2); 
    System.out.print("Guess heads (0) or tails (1): ");
        int guess = input.nextInt();
     
        if (guess != 0 && guess != 1) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Coin is " + (coin == 0 ? "heads" : "tails"));
            if (guess == coin) {
                System.out.println("You are correct!");
            } else {
                System.out.println("Incorrect guess.");
            }
        }
           */
     
     
  //16:(Random point).
  /*
  Scanner input = new Scanner(System.in);
  double x = (int)(Math.random()*100 - 50);
  double y = (int)(Math.random()*200 - 100);
        System.out.println("The random point in thise rectangle is " + x + " and " + y);
 */
  
  //17: (Game: scissor, rock, paper).
  /*
  Scanner input = new Scanner(System.in);
  
        int computer = (int)(Math.random() * 3); // 0,1,2

        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();

        String[] names = {"scissor", "rock", "paper"};
        System.out.println("The computer is " + names[computer] + ". You are " + names[user] + ".");

        if (user == computer) {
        System.out.println("It is a draw");
        } else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }
    }
}
*/
  
  //18:(Cost of shipping).
  /*
  Scanner input = new Scanner(System.in);
  
        System.out.print("Enter the weight of the package: ");
        double weight = input.nextDouble();

        if (weight <= 0) {
            System.out.println("Invalid input.");
        } else if (weight <= 1) {
            System.out.println("Shipping cost is $3.5");
        } else if (weight <= 3) {
            System.out.println("Shipping cost is $5.5");
        } else if (weight <= 10) {
            System.out.println("Shipping cost is $8.5");
        } else if (weight <= 20) {
            System.out.println("Shipping cost is $10.5");
        } else {
            System.out.println("The package cannot be shipped.");
        }
    }
}

  */
  
  
// 19:(Compute the perimeter of a triangle).
/*
Scanner input = new Scanner(System.in);
System.out.print("Enter three edges of a triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Perimeter of the triangle is " + (a + b + c));
        } else {
            System.out.println("Invalid input: Not a valid triangle");
        }
    }
}
*/

//20:(Science: wind-chill temperature).
/*
Scanner input = new Scanner(System.in);
    System.out.print("Enter temperature in Fahrenheit (-58 to 41): ");
        double temp = input.nextDouble();

        System.out.print("Enter wind speed in mph (>=2): ");
        double speed = input.nextDouble();

        
        if (temp < -58 || temp > 41) {
            System.out.println("Invalid temperature");
        } else if (speed < 2) {
            System.out.println("Invalid wind speed");
        } else {
            
}
            double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);
            System.out.println("Wind-chill temperature is " + windChill);
        }
    }

    */

//21:(Science: day of the week).
/*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year (e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter day of the month (1-31): ");
        int day = input.nextInt();

        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }

        int q = day;
        int m = month;
        int k = year % 100;
          int j = year / 100;

        int h = (q + 26*(m + 1)/10 + k + k/4 + j/4 + 5*j) % 7;

        String[] days = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        System.out.println("Day of the week is " + days[h]);
    }
}
*/

//22:(Geometry: point in a circle?).
/*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (Math.pow(x,2) + Math.pow(y,2) <= 100) {
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");
        }
    }
}

*/

//23:(Geometry: point in a rectangle?).
/*
Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (Math.abs(x) <= 5/2.0 && Math.abs(y) <= 5/2.0) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}
*/

//24:(Game: pick a card).
//حل نتوانستم


  

//25:(Geometry: intersecting point).

/*
  Scanner input = new Scanner(System.in);

                System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

               double a1 = y1 - y2;
        double b1 = x2 - x1;
        double c1 = a1*x1 + b1*y1;

        double a2 = y3 - y4;
        double b2 = x4 - x3;
        double c2 = a2*x3 + b2*y3;

        double determinant = a1*b2 - a2*b1;

        if (determinant == 0) {
            System.out.println("The two lines are parallel"); 
        } else {
            double x = (c1*b2 - c2*b1) / determinant;
            double y = (a1*c2 - a2*c1) / determinant;
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }
    }
}
*/


//26:(Use the &&, ||, and ^ operators).
  Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Is " + number + " divisible by 5 and 6? " + (number % 5 == 0 && number % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 or 6? " + (number % 5 == 0 || number % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + (number % 5 == 0 ^ number % 6 == 0));
    }
}

  
      
           
