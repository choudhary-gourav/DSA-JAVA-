package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to check");
        String string = sc.nextLine();
        String reversed ="";

        for (int i = string.length()-1 ;i >= 0 ; i--){
            reversed += string.charAt(i);
        }
        if(string.equalsIgnoreCase(reversed)){
            System.out.println("the string " + string + " is the palindrome");
        }
        else{
            System.out.println("the string is not the palindrome");
        }
        sc.close();
    }
    
}
