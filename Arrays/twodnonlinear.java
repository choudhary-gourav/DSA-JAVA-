package Arrays;

public class twodnonlinear{
    public static void main(String[] args){
        int [][] arr = {{1,2,3}, {4,5}, {6,7,8,9}};

        int rowLength = arr.length;
        //for printing this non linear 2D array we use the nested for loop

        for (int rowIndex =0; rowIndex <= rowLength-1; rowIndex++){

            int conLength = arr[rowIndex].length;
            for (int colIndex =0; colIndex <= conLength -1; colIndex++){
                System.out.print(arr[rowIndex][colIndex]);
            }
            System.out.println();
        }
    }
}