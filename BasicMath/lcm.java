package BasicMath;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args){
        //the formula for the lcm is the LCM = a*b/gcd(a,b)
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        System.out.println("enter the secound number");
        int b = sc.nextInt();

        int originala =a;
        int originalb = b;
        //firstly we find the gcd 
        while(b!=0){
            int reminder = a%b;
            a = b;
            b = reminder;
        }
        int gcd = a;

        int lcm = (originala*originalb)/gcd;
        System.out.println("the lcm of the two numbers is " + lcm);
        
    }
}
