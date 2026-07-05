package Arrays;

public class minarray{

    public static void main(String[] args){
        int arr[]= {10,20,30,4,50};
        int min = arr[0];
        for (int i=0; i<=arr.length-1;i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println("minimum value is: "+ min);
    }
}