
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}


class Solution {
    int isPalindrome(String S) {
        // code here
        int n=S.length();
        for(int i=0;i<n/2;i++)
        {
            if(S.charAt(i)!=S.charAt(n-1-i))
            {
                return 0;
            }
        }
        return 1;
    }
}
