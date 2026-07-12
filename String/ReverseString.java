package String;

public class ReverseString {
    public static void main(String[] args){
        String string = "varuog";
        String reversed = "";

        //instead of the straight loop we start from the end and save it to the resvered
        for (int i = string.length() -1; i>=0;i--){
            reversed += string.charAt(i);
        }
        System.out.println("the reversed string is " + reversed);
    }
}
