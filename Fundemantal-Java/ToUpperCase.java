package com.asaf;

public class Main {

    public static void main(String[] args) {
	String Str1="Ali Asaf";
	String Str2="saf";
        System.out.println(Str1.contains(Str2));
        Str2="Alas";
        System.out.println(Str1.contains(Str2));
        Str2.toUpperCase();
        System.out.println(Str2);//it will not change because UpperCase string is not assigned another String
        String Str3=Str1.toUpperCase();
        System.out.println(Str3);//it will change because it is assigned to another string.
        
    }
}
