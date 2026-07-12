package String;

public class CommanStringMethod {
    public static void main(String[] args){
         String name = "gourav choudhary";
         String NAME = "GOURAV CHOUDHARY";

         //.length() this is used to find the length of the string
         System.out.println("the length of string is" + name.length());

         //.charAt(Index) this is used to find the char at particular index
         System.out.println("the character at 4 place is  " + name.charAt(4));

         //.substring(StartIndex, endIndex) this is used to find the particular text from the sentence
         System.out.println("the word in the index between 0 to 4 is " + name.substring(0, 4));

         //.contains this check that the particual word is present in it or not
         System.out.println("the word " + name.contains("gourav") + " is present in the String");

         //.equals this is used to check the two string are same or not(but this is case sensitive)
         if(name.equals(NAME)){
            System.out.println("the both String are same ");
         }
         else {
            System.out.println("Both the string is different");
         }

         //.equalsIgnoreCase() this is also used to check wheter the both string are same irresepective of the case
         if (name.equalsIgnoreCase(NAME)){
            System.out.println("Both the string is the same");
         }
         else{
            System.out.println("Both the string is different");
         }
         //toUpperCase() it convert the string lateral to the upper case
         System.out.println("the upper case of the string name is " + name.toUpperCase());

         //toLowerCase() it convert the string to the lower case
         System.out.println("the lower case of the NAME is " +  name.toLowerCase());

         //.trim() is remove the extra space from the String lateral
         System.out.println("the string after the trim is " + name.trim());

         //.split() it make the different string fromt the string basically it seprate the string or remove which we give
         System.out.println("the string after the split is " + name.split(" "));

         //.startsWith() it give the output where the string is started with particular input
         System.out.println(name.startsWith("gourav"));

         //.endsWith() It checks whether a String ends with a particular character, word, or extension
         System.out.println(name.endsWith("choudhary"));

         //.valueOf()  it is used to convert the another data type into the string
         int num =17;
         String Stringconverter = String.valueOf(num);
         System.out.println("the integer after the conversion to string is " + Stringconverter);

         //.toCharArray it is used to convert the string into the array
         char[] arr = name.toCharArray();
         System.out.println("the character in the String is " + arr);

         //.isEmpty check whether the string is empty or not 
         if (name.isEmpty()){
            System.out.println("the string is empty");
         }
         else {
            System.out.println("the String is not empty");
         }

         //.isBlank is used to check whether there is character or not 
         System.out.println("the string is not blank" + name.isBlank());

         //.replace 
         String replace = name.replace("gourav", "Gourav");
         System.out.println("after the replacment  the string is " + replace);
        

    }
}
