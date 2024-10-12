public class FunctionalWay {
    public static void main(String[] args) {
         Calculator addition = (x, y) -> x + y;
        Calculator subtraction = (x, y) -> x - y;
        Calculator multiplication = (x, y) -> x * y;

        Calculator division = (x, y) -> {
            if (y != 0) {
                return x / y;
            } else {
                throw new ArithmeticException("Cannot divide by zero");
            }
        };

        Calculator mod = (x, y) -> {
            if (y != 0) {
                return x % y;
            } else {
                throw new ArithmeticException("Cannot perform modulus by zero");
            }
        };

         double x = 93;
        double y = 9;

        System.out.println("Addition operation : " + addition.calculate(x, y));
        System.out.println("Subtraction operation: " + subtraction.calculate(x, y));
        System.out.println("Multiplication operation: " + multiplication.calculate(x, y));

        try {
            System.out.println("Division operation: " + division.calculate(x, y));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("Mod operation: " + mod.calculate(x, y));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}