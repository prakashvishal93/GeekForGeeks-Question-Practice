//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution { 
    static int get(int N)
    {
        int sum=0;
        while(N>0)
        {
            int rem=N%10;
            sum=sum+rem*rem;
            N=N/10;
        }
        return sum;
    }
  
     static int isHappy(int N) { 
         //code here
         Set<Integer>s=new HashSet<>();
         while(N!=1 && !s.contains(N))
         {
             s.add(N);
             N=get(N);
         }
         if(N==1)
         {
             return 1;
         }
         else
         {
             return 0;
         }
     }
}