import java.util.Scanner;

public class Solution {
    static void sortCharArray(char[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    char temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    static boolean isAnagram(String a, String b) {
        boolean f=false;
        a=a.toUpperCase();
        b=b.toUpperCase(); 
        char[] c= a.toCharArray();
        sortCharArray(c);
        char[] d=b.toCharArray();
        sortCharArray(d);
        String A=new String(c);
        String B=new String(d);
        if(A.equals(B)){
            f=true;
        }
        return f;
    }
 public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
