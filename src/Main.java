import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

    }
    // Factorial
    public static BigInteger factorial(BigInteger bigInteger){
        if (bigInteger.intValue()==0 || bigInteger.intValue()==1){
            return bigInteger;
        }
        else {
            return bigInteger.multiply(factorial(bigInteger.subtract(new BigInteger("1"))));
        }
    }

    //Permutation
    //P(n,k) = n! / (n-k)!
    public static BigInteger P(BigInteger n,BigInteger k){
        return factorial(n).divide(factorial(n.subtract(k)));
    }

    //Combination
    //C(n,k) - n! / k!(n-k)!
    public static BigInteger C(BigInteger n,BigInteger k){
        BigInteger first = factorial(n);
        BigInteger second = factorial(k);
        BigInteger third= factorial(n.subtract(k));

        return first.divide(second.multiply(third));
    }
}

