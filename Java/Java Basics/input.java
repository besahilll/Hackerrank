/*
Task
In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor be

There are  lines of input, and each line contains a single integer.

Sample Input

42
100
125
Sample Output

42
100
125 
*/


//Solution

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b=  s.nextInt();
        int c=  s.nextInt();
        
        System.out.println("" +a);
        System.out.println("" +b);
        System.out.println("" +c);

    }
}
