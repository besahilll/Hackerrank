/* problem
The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
*/

//solution
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=1;
        while(sc.hasNextLine()){
            String s= sc.nextLine();
            System.out.println(i + " " + s);
            i++;
        }
    }
}
