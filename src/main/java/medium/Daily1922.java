package medium;

import java.math.BigInteger;

public class Daily1922 {

    public static final BigInteger EVEN_NUMBERS_FACTORIAL = BigInteger.valueOf(5);
    public static final BigInteger PRIME_NUMBERS_FACTORIAL = BigInteger.valueOf(4);
    public static final BigInteger MODULO = BigInteger.valueOf(1000000007);

    public int countGoodNumbers(long n) {
        BigInteger l = BigInteger.valueOf(n % 2 == 0 ? n / 2 : (n + 1) / 2);
        BigInteger r = BigInteger.valueOf(n).subtract(l);

        return (r.equals(BigInteger.ZERO) ?
                EVEN_NUMBERS_FACTORIAL :
                EVEN_NUMBERS_FACTORIAL.modPow(l, MODULO).multiply(PRIME_NUMBERS_FACTORIAL.modPow(r, MODULO)).mod(MODULO))
                .intValue();
    }
}
