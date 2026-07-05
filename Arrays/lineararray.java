package Arrays;


public class lineararray {
    public static void main(String[] args){
        int [][] arr = {{1,2,3}, {4,5,6,}, {7,8,9}};
        int row = arr.length;
        int col = arr[0].length;

        for(int rows= 0; rows<=row-1; rows++){
            for (int colum =0; colum <= col-1; colum++){
              System.out.print(arr[rows][colum] +" ");
            }
            System.out.println();
        }
    }
}
