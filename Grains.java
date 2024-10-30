import java.math.BigInteger;

public class Grains {
    public static void main(String [] args){

        System.out.println(findTotal());

        System.out.println(grainsOnSquare(31));
        System.out.println(grainsOnSquare(1));
        System.out.println(grainsOnSquare(64));

    }

    public static BigInteger findTotal(){
        // Sum of series 2^0 + 2^1 + 2^2 + .... + 2^n = 2^(n+1) - 1
        BigInteger result = BigInteger.valueOf(2).pow(65).subtract(BigInteger.ONE);
        return result;
    }

    public static BigInteger grainsOnSquare(int square){
        if(square > 64 || square < 1)   return BigInteger.valueOf(-1);  // -1 for invalid input
        BigInteger result = BigInteger.valueOf(2).pow(square - 1);
        return result;
    }

}
