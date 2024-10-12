public class Main {
    public static void main(String[] args) {

        StringManipulator manipulator = new StringManipulator("Yaman");

        System.out.println("Convert to uppercase: " + manipulator.convertToUpercase());
        System.out.println("Convert to lowercase: " + manipulator.convertToLowercase());
        System.out.println("Convert to reverse: " + manipulator.reverseString());

        if (manipulator.isPalindrome()) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        StringOperation toUperCase = input -> input.toUpperCase();
        StringOperation toLowerCase = input -> input.toLowerCase();
        StringOperation Reverse = input -> new StringBuilder(input).reverse().toString();
        StringOperation isPalindrome = input -> {
            String reverse = new StringBuilder(input).reverse().toString();
            return input.equalsIgnoreCase(reverse) ? "true " : "false";
        };


        // Testing lambda expressions
        System.out.println("Using lambda:");
        System.out.println("Convert to uppercase: " + toUperCase.operate("hello"));
        System.out.println("Convert to lowercase: " + toLowerCase.operate("WORLD"));
        System.out.println("Convert to Reverse : " + Reverse.operate("WORLD"));
        System.out.println("Is a palindrome? " + isPalindrome.operate("yaman"));





    }
}
