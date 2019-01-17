package com.asaf;


import java.util.Scanner;

import static java.io.File.*;

public class Main {

   public static void main(String[] args) {


   int i;
 
for(i=0;i<=12;i++) {
	switch (i) {
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Autumn");
			break;
			default:
				System.out.println("Invalid value!");
	}
}


   }
}
