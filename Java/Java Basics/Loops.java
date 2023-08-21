/*
Given an integer,N, print its first  multiples. Each multiple N*I (where 1<i<=10) should be printed on a new line in the form: N x i = result.
*/

//Solution
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d%n", N, i, N * i);
        }
        bufferedReader.close();
    }
}
