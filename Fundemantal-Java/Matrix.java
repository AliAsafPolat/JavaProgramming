package com.asaf;


import java.util.Scanner;

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

	int [][]mtr=new int[4][5];
		Scanner scan=new Scanner(System.in);

for (int i=0;i<4;i++){
	for(int j=0;j<5;j++){
		System.out.println("Enter "+(i+1)+" th row"+(j+1)+" th column member");
		mtr[i][j]=scan.nextInt();
	}
}


		for (int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				System.out.print(mtr[i][j]+"  ");
			}
			System.out.println();
		}

    }
}
