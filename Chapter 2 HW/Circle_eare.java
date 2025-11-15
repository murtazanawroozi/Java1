package chapter_2;
import java.util.Scanner;

public class Chapter_2 {

    
    public static void main(String[] args) {
 // Circle Area (1)
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the raduise:");
        double radius = input.nextDouble();
        double area;
        area = 3.14159*(radius*radius);
        System.out.println(area);
    }
}

    