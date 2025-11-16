
package chapter_5_summary;
import java.util.Scanner;

public class Chapter_5_Summary {

    
    public static void main(String[] args) {
        // مرتضی جان
       
        /*
        //1: (Count positive and negative numbers and compute the average of numbers).
        
          Scanner input = new Scanner(System.in);
          int positives = 0;
          int negatives = 0;
          int count = 0; 
          double total = 0;
          System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();
               if (number == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(0);
        }
               while (number != 0) {
            if (number > 0)
                positives++;
            else
                negatives++;
         total += number;
         count++;
                     number = input.nextInt();
                             double average = total / count;

        System.out.println("The number of positives is " + positives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
    }

     
    }
    
}
*/
        
        //2: (Repeat additions).
        //در کار خانگی روزمره کار شده
        
     /*   
   //3: (Conversion from kilograms to pounds).
   
           System.out.println("Kilograms    Pounds");
        System.out.println("-------------------");

        for (int kg = 1; kg <= 200; kg++) {
            double pounds = kg * 2.2;
          
            System.out.println(kg + " , " + pounds);
        }
 
        
    }
}*/

     
/*
     //4: (Conversion from miles to kilometers).
     
     System.out.println("Inches     Centimeters");
        System.out.println("----------------------");

        for (int inch = 1; inch <= 10; inch++) {
            double cm = inch * 2.54;
            System.out.println(inch + " , " + cm);

    }
}
}
*/

    // 5:(Conversion from kilograms to pounds and pounds to kilograms).
    
    //Murtaza Nowroozi.
    
    
    /*
            System.out.println("Kilograms   Pounds     |     Pounds     Kilograms");
        System.out.println("-------------------------------------------------");

        int kg = 1;
        int lb = 20;

        for (; kg <= 199 && lb <= 515; kg += 2, lb += 5) {
            double toPound = kg * 2.2;
            double toKilogram = lb / 2.2;
            System.out.println(kg + " , " + toPound + " , " + lb + " , " + kg);




    }
}
}  
*/
   /* 
    //6: (Conversion from miles to kilometers).
    
        System.out.println(" km                   mile");
        System.out.println("--------------------------");
        int mile = 1;
        for(mile = 1; mile <= 10; mile ++){
            double km = mile*1.609;
            System.out.printf("%4f%n ",km , mile );
        }


    }
}
*/
   

   
   
     // 7:(Financial application: compute future tuition).
     /*
             double tuition = 10000;
             double rate = 0.06;
             for (int year = 1; year <= 10; year++) {
            tuition = tuition * (1 + rate);
        }
             System.out.println("The tuotion of 10 year is " + tuition);
                     double totalCost = 0;
                     double tuitionAfter10 = tuition;
                     
        for (int i = 1; i <= 4; i++) {
            tuitionAfter10 = tuitionAfter10 * (1 + rate);
            totalCost += tuitionAfter10;
        }
        System.out.println("The tuition after 4 year is " + totalCost);
             

     
     
     
    }
}
  */   
     
     
     
     //Murtaza Nowroozi.
     // 8:(Find the highest score).
     //کار نشود
     //بیخی سخت است
     
     
   
     
     //9:(Find the two highest scores).
     /*
             Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String highestName = "";
        double highestScore = 0.0;

        String secondName = "";
        double secondHighestScore = 0.0;

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter student name: ");
            String name = input.next();

            System.out.print("Enter student score: ");
            double score = input.nextDouble();

            if (score > highestScore) {
                secondHighestScore = highestScore;
                secondName = highestName;

                highestScore = score;
                highestName = name;
            } 
            else if (score > secondHighestScore) {
                secondHighestScore = score;
                secondName = name;
            }
        }

        System.out.println("Highest score: " + highestName + " (" + highestScore + ")");
        System.out.println("Second highest: " + secondName + " (" + secondHighestScore + ")");
    }


    }
*/
     


     //10: (Find numbers divisible by 5 and 6).
     /*
     //بنام خدای رحمت گر مهربان
     int count = 0;
     int num ;
     for(num=1;num<= 100;num++){
         if(num %5 == 0 && num %6 == 0 ){
             
         System.out.println(  " number is"+ num + " ");
         count++;
     }
     }
    
     
        System.out.println("count is " + count);  
             
         }
     }

*/
     
   //11:(Find numbers divisible by 5 or 6, but not both).
   
   /*
   int count = 0;
   int num = 0;
   for(num = 1; num <= 100;num++){
       if(num %5 == 0 ^ num %6 == 0){
           System.out.println("the number is " + num );
           count++;
       }
       
   }
        System.out.println("the count is " + count);     

    }
}
*/
  
   
   
   
   //12:(Find the smallest n such that n2 7 12,000);
   /*
   int n = 1;

        while (n * n <= 12000) {
            n++;
        }

        System.out.println("The smallest n such that n^2 > 12000 is: " + n);

    }
    
}
*/
   

   
   //13:(Find the largest n such that n3 6 12,000).
   //مرتضی جان
   
   /*
   int n = 1;

        while (n * n * n < 12000) {
            n++;
        }

        System.out.println("The largest n such that n^3 < 12000 is: " + (n - 1));


    }
}
*/
   
//14:(Compute the greatest common divisor).
/*
Scanner input = new Scanner(System.in);

        System.out.print("Enter the first positive integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter the second positive integer: ");
        int n2 = input.nextInt();

      int d = Math.min(n1, n2);
              for (; d >= 1; d--) {
            if (n1 % d == 0 && n2 % d == 0) {
                System.out.println("The greatest common divisor is: " + d);
                break;



    }
}*/