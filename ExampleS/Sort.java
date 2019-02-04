package com.asaf;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int []dizi={1,2,8,9,4};
        System.out.println("Before Sorting: ");
        for (int deger:dizi) {
            System.out.print(deger+" ");
        }
        System.out.println();
        System.out.println("After Sorting: ");
	Arrays.sort(dizi);
        for (int deger:dizi) {
            System.out.print(deger+" ");
        }

    }
}
