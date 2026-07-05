package Arrays;

import java.util.Scanner;

public class elementsum {
    public static void main(String[] args){
        int arr[] = new int [4];
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int n= arr.length;
        for(int i=0; i<=n-1;i++){
            System.out.println("enter the element");
            arr[i] = sc.nextInt();
            int value = arr[i];
            sum= sum + value;
            System.out.println("the sum is the " + sum);
        }
        sc.close();
    }
}
