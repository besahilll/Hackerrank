/*A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are 2,3,5,7,11 and 13 .

Given a large integer,n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Scanner scan= new Scanner(System.in);
        BigInteger n= scan.nextBigInteger();
        scan.close();
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}
