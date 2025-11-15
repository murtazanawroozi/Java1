package chapter_2;
import java.util.Scanner;

public class Chapter_2 {

    
    public static void main(String[] args) {
 // Comput Change (HW5)
       //Murtaza Nowroozi:
       
       Scanner input  = new Scanner(System.in);
        System.out.println("Enter an amount in double:");
        double amount = input.nextDouble();
        int amount_Remain = (int)(amount * 100);
        int Dollers = amount_Remain/100;
        amount_Remain = amount_Remain % 100;
        int Quarter = amount_Remain/25;
        amount_Remain = amount_Remain % 25;
        int Dimes = amount_Remain/10;
        amount_Remain = amount_Remain % 10;
        int Nickles = amount_Remain/5;
        amount_Remain = amount_Remain % 5;
        int Pennies = amount_Remain;
        System.out.println("your total amout = " + Dollers + " Doller " + Quarter +
                " Quarter " + Dimes + " Dimes " + Nickles + "Nickles" + Pennies +" Pennies");
}
}
       