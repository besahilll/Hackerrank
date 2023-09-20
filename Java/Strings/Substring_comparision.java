// This is the code to compare the substring
import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String currString=s.substring(0,k);
        String smallest = "";
        String largest = "";
        smallest=largest=currString;
        for(int i=k; i<s.length(); i++){
            currString=s.substring(i-k+1,i+1);
            if(largest.compareTo(currString)<0){
                largest=currString;
            }
            if(smallest.compareTo(currString)>0){
                smallest=currString;
            }
        }
        return smallest + "\n" + largest;
    }

 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
