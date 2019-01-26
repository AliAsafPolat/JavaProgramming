package com.asaf;

public class Main {

    public static void main(String[] args) {
        Integer a=1515;
        String b="1515";
        int c=Integer.parseInt(b);
        int d=Integer.valueOf(b);

        System.out.println(b.compareTo("1515"));//It returns 0 if it is same otherwise it returns non-zero value
        System.out.println(b);                  //It returns string depends on data types.
        System.out.println(c);                  //It parses string to integer.
        System.out.println(a.toString());       //It parses integer to string.
        System.out.println(a.compareTo(1506));  //If it is same return 0 but if it is not same return non-zero value;

       String g= b.concat("asaf");              //It appends "asaf" end of "1515"
        System.out.println(g);
        int x= g.indexOf("f");
        System.out.println(x);                  //It returns index of 'f' char in the String.

    }
}
