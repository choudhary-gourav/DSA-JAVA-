package BasicMath;
import java.util.Scanner;

public class countdigit {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        while (num != 0){
            
            count ++;
            num = num/10;
        }
        System.out.println("the total digit in number is " +count);
        sc.close();

    }
}
