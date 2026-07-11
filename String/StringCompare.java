package String;

public class StringCompare{
    public static void main (String[] args){
        String s1 = "Gourav";
        String s2 = "Gourav";
        String s3 = "gourav";

        //there are three type to compare the string first is "==", "equals", "equalIgnorecase";

        if ( s1 == s2){
            System.out.println("the String is the same");

        }
        else{
            System.out.println("the String is not same");
        }

        if (s1.equals(s2)){
            System.out.println("the string is the same");
        }
        else{
            System.out.println("the string is not the same");
        }

        if (s1.equalsIgnoreCase(s3)){
            System.out.println("the string is same errespective of the case");
        }
        else{
            System.out.println("the string is not same ");
        }
    }
}