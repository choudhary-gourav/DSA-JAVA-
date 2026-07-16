package BasicMath;
import java.util.Scanner;

public class digitsum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int count = 0;
        while(num != 0){
            int digit = num % 10;
            count += digit;
            num = num/10;
        }
        System.out.println("the sum of the digits is " + count);
        sc.close();

    }
}
