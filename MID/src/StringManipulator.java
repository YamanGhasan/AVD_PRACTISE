public class StringManipulator {
    private String word;

    StringManipulator(String word) {
        this.word = word;
    }

    public String convertToUpperCase() {
        return word.toUpperCase();
    }

    public String convertToLowerCase() {
        return word.toLowerCase();
    }

    public String reverceWord() {
        return new StringBuilder(word).reverse().toString();
    }

    public String palindromeWord(){
        String palindrome = reverceWord();
        if(palindrome.equals(word)){
            return "it is palindrome Word";
        }
        else{
            return "it is not  palindrome Word";
        }
     }
}