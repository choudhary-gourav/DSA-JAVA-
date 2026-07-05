/* 
in this we divide the problem in two parts firstly print the spaces and then the stars
    * * * * * 
   * * * * * 
  * * * * * 
 * * * * * 
* * * * * 
  */

public class Parallel {
    public static void main(String[] args) {
        int n = 5;
       for (int row = 1; row<= n; row++){
        //for the spaces 
        for (int col = 1; col<=n-row;col++){
            System.out.print(" ");
        }
        //for the stars
        for (int col= 1; col<=n; col++){
            System.out.print("* ");
        }
        System.out.println();
       }
    }
}
