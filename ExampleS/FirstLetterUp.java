import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println((A.length()+B.length()));

        if(A.compareTo(B)<=0)
        System.out.println("No");
        else 
        System.out.println("Yes");

    String firstLetter = A.substring(0,1).toUpperCase(); 
      String restLetters = A.substring(1).toLowerCase();
    String F=firstLetter+restLetters;

    String firstl=B.substring(0,1).toUpperCase();
    String other=B.substring(1).toLowerCase();
    String G=firstl+other;
    System.out.println(F+" "+G);



    }
}



