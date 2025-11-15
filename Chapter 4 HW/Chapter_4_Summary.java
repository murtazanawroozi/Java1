
package chapter_4_summary;

import java .util.Scanner;

 
 
public class Chapter_4_Summary {

   
    public static void main(String[] args) {
        
        //انجنیر مرتضی نوروزی
        
        
        //1:(Geometry: area of a pentagon).
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radues of pentagon:");
        double r = input.nextDouble();
        double s = 2 * r * Math.sin(Math.PI / 5);
        
       double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
       System.out.println("The erea of pentagon is " + area);
               
    }
    
}*/

     /* 
      //2:(Geometry: great circle distance).
      Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        
        System.out.println("Enter point 2 (latitude and longitude) in degrees");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
                x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        
       double radius = 6371.01;
       
       double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("The distance bettwen two point is " + distance + " km");
       
          }
}
*/
 
     
     //3:(Geography: estimate areas).
      //کار نشود خیلی سخت بود
      /*
     Scanner input = new Scanner(System.in);

    }
}*/
  
      
      //4:(Geometry: area of a hexagon).
      /*
      Scanner input = new Scanner(System.in);
        System.out.println("Enter the radues of hexagon:");
        double r = input.nextDouble();
        double s = 2*r*Math.sin(Math.PI/6);
        double area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The erea of this hexagon is " + area);
    }
}
*/
      /*
      //5:(Geometry: area of a regular polygon).
      
      Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of side:");
        int n = input.nextInt();
        System.out.println("Enter the side:");
        double s = input.nextDouble();
        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
        System.out.println("The area of this polygon is " + area);
      
      
    }
}
  */
     
      
      //6:(Random points on a circle).
      /*
      double r = 40;
      double angle1 = Math.random() * 2 * Math.PI;
        double angle2 = Math.random() * 2 * Math.PI;
        double angle3 = Math.random() * 2 * Math.PI;

        double x1 = r * Math.cos(angle1);
        double y1 = r * Math.sin(angle1);

        double x2 = r * Math.cos(angle2);
        double y2 = r * Math.sin(angle2);

        double x3 = r * Math.cos(angle3);
        double y3 = r * Math.sin(angle3);
       System.out.println("point one is " + x1 + " and " + y1);
       System.out.println("point two is " + x2 + " and " + y2);
       System.out.println("point three is " + x3 + " and " + y3);
       
        
    }
}
 */
      
      
      //7:(Corner point coordinates).
      /*
      Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double r = input.nextDouble();
      	double initialAngle = 90;
        for (int i = 0; i < 5; i++) {
        double angle = initialAngle - i * 72;
	double rad = Math.toRadians(angle);
        double x = r * Math.cos(rad);
	double y = r * Math.sin(rad);
       	System.out.printf("(%.2f, %.2f)\n", x, y);

        }

    }
}
*/
      /*
      //8:(Find the character of an ASCII code).
      
      Scanner input = new Scanner(System.in);
        System.out.println("Enter the  ASCII code bettwen 1_127:");
        byte code = input.nextByte();
        if(code >= 1 && code<= 127) {
        char character = (char) code;
            System.out.println("The character for ASCII " + code + " is " +  character);
        }
      
    }
}
*/
      
      /*
      //9:(Find the Unicode of a character).
      Scanner input = new Scanner(System.in);
        System.out.println("Enter a charectar:");
        String text = input.next();
        char character = text.charAt(0);
        int unicode = (int) character;
        System.out.println("The UniCoude of thes character is " + unicode);
      
    }
}
*/
  
      //10:(Guess BirthDay).
      //یک بار کار کردم
      
      
      /*
      //11: (Decimal to hex).
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

            if (decimal >= 0 && decimal <= 15) {
            if (decimal < 10) {
                System.out.println("The hex value is " + decimal);
            } else {
                char hexChar = (char) ('A' + (decimal - 10));
                System.out.println("The hex value is " + hexChar);
            }
        } else {
            System.out.println(decimal + " is an invalid input");
        }

    }
}
*/
      
      //12: (Hex to binary).
     //کار نشود 
     
     /*
     //13: (Vowel or consonant?).
     Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.next();
        if(letter.length()==1){
            Character ch = Character.toLowerCase(letter.charAt(0));
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(letter + " is a vowel");
                } else {
                    System.out.println(letter + " is a consonant");
                }
            } else {
                System.out.println(letter + " is an invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }


            }
        }

*/
     

     //14: (Convert letter grade to number).
     //کار نشود 
     
     
     
     //15: (Phone key pads) .
     Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter:");
            String str = input.next();
            int number;
            if (str.length() == 1 && Character.isLetter(str.charAt(0))) {
            char ch = Character.toUpperCase(str.charAt(0));
                        if (ch >= 'A' && ch <= 'C') {
                number = 2;
            } else if (ch >= 'D' && ch <= 'F') {
                number = 3;
            } else if (ch >= 'G' && ch <= 'I') {
                number = 4;
            } else if (ch >= 'J' && ch <= 'L') {
                number = 5;
            } else if (ch >= 'M' && ch <= 'O') {
                number = 6;
            } else if (ch >= 'P' && ch <= 'S') {
                number = 7;
            } else if (ch >= 'T' && ch <= 'V') {
                number = 8;
            } else {
                number = 9; // W, X, Y, Z
            }

            System.out.println("The corresponding number is " + number);

        } else {
            System.out.println(str + " is an invalid input");
        }



    }
}
     
    
   