package BasicMath;
import java.util.Scanner;

public class gcd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int a = sc.nextInt();
        System.out.println("enter the number 2: ");
        int b = sc.nextInt();
        while (b != 0){
            int reminder = a % b;
            a = b;
            b = reminder;
        }
        System.out.println("the HCF of the both number is: " + a);
        sc.close();
    }
}