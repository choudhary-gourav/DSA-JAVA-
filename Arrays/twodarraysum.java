package Arrays;

public class twodarraysum {
    public static void main(String[] args){
        int arr[][] = {{1,2}, {3,4}, {5,6}};
        int rowLength = arr.length;
        int colLength =arr[0].length;
        int sum =0;

        for (int rowIndex = 0; rowIndex <= rowLength-1; rowIndex ++){
            for (int colIndex = 0; colIndex <= colLength-1; colIndex ++){
                 sum = sum + arr[rowIndex][colIndex];
                 
            }
          
        }
        System.out.print("The sum of the element is the " + sum);
    }
}
