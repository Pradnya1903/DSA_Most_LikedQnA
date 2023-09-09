//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int N) {
      
      int  pos=0,j=0,count=0;
      
       while(N!=0)
       {
           j++;
           if((N&1)==1)
           {
              count++;
              pos=j;
           }
           N=N>>1;
       }
       if(count==1)
       {
           return pos;
       }
       else
       {
           return -1;
       }
    
    }
};
