package Arrays;

public class elemetnmul {
    public static void main(String[] args){
        int arr[] = {10,20,30};
        
        int ans = 1;
        int value;
        for (int i =0; i<=arr.length-1; i++){
           value=  arr[i];
            ans = ans*value;


        }
        System.out.println("the multiplicatoin is " + ans);
         
    }
}
