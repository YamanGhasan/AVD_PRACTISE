public class StringManipulator {

    private String string ;

  public  StringManipulator(String string){
        this.string=string;
    }
    public String convertToUpercase(){
     return  string.toUpperCase();
    }
    public String convertToLowercase(){
        return  string.toLowerCase();
    }
    public String reverseString() {
        return new StringBuilder(string).reverse().toString(); //
        // The StringBuilder class in Java is a mutable sequence of characters that allows for
        // dynamic string manipulation.
        // Unlike the String class, which is immutable,
        // StringBuilder enables modifications to the character
        // sequence after its creation.
    }

    public boolean isPalindrome() {
        return string.equalsIgnoreCase(reverseString());
    }
}
