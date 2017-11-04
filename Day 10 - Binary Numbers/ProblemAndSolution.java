/*

Objective 
  Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!

Task 
  Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum 
  number of consecutive 1's in n's binary representation.

Input Format
  A single integer, n.

Constraints
  1 ≤ n ≤ 10^6

Output Format
  Print a single base-10 integer denoting the maximum number of consecutive 1's in the binary representation of n.

Sample Input 1
  5

Sample Output 1
  1

Sample Input 2
  13

Sample Output 2
  2

Explanation

Sample Case 1: 
  The binary representation of 5 is 101, so the maximum number of consecutive 1's is 1.

Sample Case 2: 
  The binary representation of 13 is 1101, so the maximum number of consecutive 1's is 2.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int bin = 0, s = 0, t = 0;

    while(n > 0)
        {
        bin = n%2;
        n = n/2;
        if(bin == 1)
         {   s++;
           if(s >= t)
            t = s;
        }
        else{
            s = 0;
        }   
    }

    System.out.println(t);
    }
}
