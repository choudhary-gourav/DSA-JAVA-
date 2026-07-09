package Arrays;

import java.util.Scanner;

public class twodmaximumvalue {
    public static void main(String[] args){
        //this is with the fixex array now we do same with the user input
        // int arr[][] = {{98,20},{30,46},{58,60}};
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int rowLength = arr.length;
        int colLength = arr[0].length;
        int max = arr[0][0];
        //this is for the input 
        for (int i =0; i<=rowLength-1; i++){
            for (int j = 0; j<=colLength-1; j++){
                System.out.println("Enter the element in the row ["+i +"] and the column ["+j +"]");
                arr[i][j] = sc.nextInt();     
            }
        }



        //this is for the main logic and the output
        for (int rowIndex = 0; rowIndex <= rowLength-1; rowIndex++){
            for(int colIndex = 0; colIndex <=colLength-1; colIndex++){
                if(arr[rowIndex][colIndex]> max){
                    max = arr[rowIndex][colIndex];
                }
            }
        }
        System.out.println("the biggest element in the array is the " + max);
         sc.close();
    }
   
}
