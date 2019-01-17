package com.asaf;


import static java.io.File.*;

public class Main {

    public static void main(String[] args) {
	int a=257;
	float b=5.6565f;

	System.out.println(b+a);
	int[] years={1,2,5};
	for (int i=0;i<3;i++){
		System.out.println("Year is: "+years[i]);
	}

	int[] days=new int[7];
for (int i=0;i<7;i++){
	days[i]=i;
	System.out.println("Today is:" + days[i]);
}
    }
}
