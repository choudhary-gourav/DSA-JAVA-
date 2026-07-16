package BasicMath;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int reverse = 0;
        int originalNum = num;
        while (num !=0){
            int digit = num %10;
            reverse = reverse*10 + digit;
            num /= 10;
        }
        if(originalNum == reverse){
            System.out.println("the number is palindrome");
        }
        else{
            System.out.println("the number is not palindrome");
        }
        sc.close();

    }
}
