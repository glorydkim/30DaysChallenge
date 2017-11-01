/*

https://www.hackerrank.com/challenges/30-binary-numbers/problem

*/

import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int bin = 0, s = 0, t = 0;


    while(n>0)
        {
        bin = n%2;
        n=n/2;
        if(bin == 1)
         {   s++;
           if(s>=t)

            t=s;

        }
        else{

            s=0;
        }   
    }

    System.out.println(t);
    
  }
}
