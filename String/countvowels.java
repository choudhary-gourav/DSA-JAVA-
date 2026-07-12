package String;

public class countvowels {
    public static void main(String[] args){
        String string = "gourav";
        int count =0;
        string = string.toLowerCase();
        for (int i = 0; i< string.length();i++){
            char ch = string.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
                count++;
            }
        }
        System.out.println("the number of the vowels in the string is = " + count);
    }
}
