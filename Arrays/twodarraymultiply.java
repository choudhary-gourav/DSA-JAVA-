package Arrays;

public class twodarraymultiply {
    public static void main(String[] args){
        int arr[][]={{1,2}, {3,4}, {5,6}};
        int mul=1;
        int rowLength = arr.length;
        int colLength = arr[0].length;
          

        for (int rowIndex = 0; rowIndex <= rowLength-1; rowIndex ++){
            for (int colIndex = 0; colIndex <= colLength-1; colIndex ++){
              mul = mul * arr[rowIndex][colIndex];
            }
        }
        System.out.println("the multiplication of the array is " + mul);
    }
}
