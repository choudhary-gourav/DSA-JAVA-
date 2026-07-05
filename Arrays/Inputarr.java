package Arrays;

import java.util.Scanner;

public class Inputarr {
    public static void main(String [] args){
        int arr[]= new int [5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for (int i =0; i<=n-1;i++){
            System.out.println("the value for the index " + i);
            arr[i] = sc.nextInt();
        }
        for (int val: arr){
            System.out.println("the input value taken is " + val);
        }
        sc.close();

    }
}
