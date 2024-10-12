public class OOPWay {
   private  int x,y;

    public OOPWay(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double addition(){
        return x + y;
    }
    public double subtraction(){
        return x-y;
    }
    public double multiplication() {
        return  x*y;

    }
    public double division() {
        if (y != 0) {
            return (double) x / y;
        } else {
            throw new ArithmeticException("divide by zero exception");
        }
    }

    public int mod(){
        if (y != 0) {
            return x % y;
        } else {
            throw new ArithmeticException("Cannot perform modulus by zero");
        }
     }
    }
