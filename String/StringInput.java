package String;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String input = sc.nextLine();
        System.out.println("the sentence is '" + input + "'");
        sc.close();
    }
}
