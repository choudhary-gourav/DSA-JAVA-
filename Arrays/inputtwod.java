package Arrays;

import java.util.Scanner;

public class inputtwod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] [] = new int [3][3];
         
        int rowLength = arr.length;
        int colLength = arr[0].length;
       // Taking input
        for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {
            for (int colIndex = 0; colIndex <= colLength - 1; colIndex++) {
                System.out.println("Enter the element");
                System.out.print("Enter element at [" + rowIndex + "][" + colIndex + "]: ");
                arr[rowIndex][colIndex] = sc.nextInt();
            }
        }
            // for displaying the output 
             System.out.println("The 2D array is:");

           for (int outputrow = 0; outputrow <= rowLength-1; outputrow ++){
        //for the column for the non linear array
        int outputcloum = arr[outputrow].length;
        for (int outputcol = 0; outputcol <= outputcloum-1; outputcol++){

            System.out.print(arr[outputrow][outputcol] +" " );
        }
        System.out.println();
    }
    sc.close();
    }


 
}
