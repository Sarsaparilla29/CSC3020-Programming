import java.math.BigInteger;
public class Assignment04Question06 {
    public static void main(String[] args) {
        //System.out.println(Long.MAX_VALUE);
        BigInteger start = BigInteger.valueOf(Long.MAX_VALUE); // initialize value to max long
        start = start.add(BigInteger.ONE); // add one
        //System.out.println(start);
        FindNum obj = new FindNum(); // create class object
        BigInteger[] num = obj.bigArray(start); // create array and set equal to method
        for(int i = 0; i < 10; i++) {
            System.out.println("num[" + i + "] = " + num[i]); // loop to print out BigInteger Array
        }



    }
}

class FindNum {
    public BigInteger[] bigArray(BigInteger x) {
        BigInteger[] num = new BigInteger[10];
        BigInteger b5, b6;
        b5 = new BigInteger("5"); // BigInteger objects 5 and 6
        b6 = new BigInteger("6");
        int i = 0;
        // loop through until 10 numbers are found
        while(i != 10) {
            x = x.add(BigInteger.ONE);
            // x % 5 == 0 || x % 6 == 0
            BigInteger y = x.remainder(b5);
            BigInteger z = x.remainder(b6);
            if (y.equals(BigInteger.ZERO)) {
                num[i] = x;
                i++;
            }
            else if (z.equals(BigInteger.ZERO)) {
                num[i] = x;
                i++;
            }
            //num[i] = x;
            //++i;
        }
        return num;
    }
}
