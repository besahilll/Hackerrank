// A palindrome is a word, phrase, number, or other sequence of characters that reads A the same backward or forward.

Given a string, print Yes if it is a palindrome, print No otherwise.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse = ""; 
        for(int i=A.length()-1; i>=0; i--){
            reverse+=A.charAt(i);
        }
        if(A.equals(reverse)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



