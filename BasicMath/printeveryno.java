package BasicMath;
import java.util.Scanner;

public class printeveryno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print seprately");
        int num = sc.nextInt();
        while (num !=0){
            int digit = num%10;
            System.out.println("the digits in number is " + digit);
            num = num/10;
        }
        sc.close();
        
    }
}
