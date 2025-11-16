package comput_gcd_loop;
import java.util.Scanner;

public class Comput_GCD_loop {

    
    public static void main(String[] args) {
        // مرتضی جان
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first positive intiger:");
        byte n1 = input.nextByte();
        System.out.println("Enter the secound positive integer:");
        byte n2 = input.nextByte();
        int d = Math.min(n2, n2);
                for (; d >= 1; d--) {
            if (n1 % d == 0 && n2 % d == 0) {
                System.out.println("The greatest common divisor is: " + d);
                break; 
            }
                }
        
        
    }
    
}
