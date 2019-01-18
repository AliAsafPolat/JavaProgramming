package com.asaf;

public class Main {

    public static void main(String[] args) {
	String numberStr="1581.12121";

        System.out.println("This is String :"+numberStr);
        double number=Double.parseDouble(numberStr);
        System.out.println("This is integer :"+number);
numberStr+=1; //This will automatically parse to string and append end of the numberStr || numberStr <- 15811  ||
number+=1;     //This is an sum operator and answer will be 1582
        System.out.println("This is String :"+numberStr);
        System.out.println("This is integer :"+number);
    }
}
