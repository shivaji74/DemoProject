/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
  public class CandidateCode {
        static int jumpcount(int x, int y, int n,  
              int height[]) 
   { 
   int jumps = 0; 
   for (int i = 0; i < n; i++) { 
    jumps++; 
   
    if (height[i] > x) 
    { 
        int h = height[i] - (x - y); 
        jumps += h/(x - y); 

    if (h % (x-y) > 1) 
        jumps++; 
    } 
    } 
        return jumps; 
    } 
        public static void main(String args[]) 
 { 
	Scanner sc=new Scanner(System.in);
    int  jump=sc.nextInt();
    int slip=sc.nextInt();
    int nwall=sc.nextInt();
    int height[]=new int[nwall];
    for(int j=0;j<nwall;j++)
 {
	height[j]=sc.nextInt();
 }

        int n = height.length; 
        System.out.println(jumpcount(jump, slip, n, height)); 
 } 
 } 

   

