package com.asaf;


import java.util.Scanner;

import static java.io.File.*;

public class Main {

    public static void main(String[] args) {


	int mtr[][]=new int[4][];
	mtr[0]=new int[1];  //it allows us 1th row has 1 column
	mtr[1]=new int[2];	//	  allows us 2nd row has 2 columns
	mtr[2]=new int[3]; //	  allows us 3th row has 3 columns
	mtr[3]=new int[4]; //    allows us 4th row has 4 columns

		for(int i=0;i<4;i++){
			for(int j=0;j<i+1;j++){
				System.out.print(mtr[i][j]);

			}
			System.out.println();
		}


    }
}
