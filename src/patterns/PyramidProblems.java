package patterns;

import java.util.Scanner;

public class PyramidProblems {
	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		//printHalfPyramid();
		printInvertedHalfPyramid();
	}


	static void  printHalfPyramid() {
		/*
		 **
		 ***
		 ****
		 *****/
		System.out.println("provide line number");
		int m= sc.nextInt();

		//i to handle rows
		//j to handle columns

		for (int i=1;i<=m;i++) {
			for(int j=1;j<=i;j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void printInvertedHalfPyramid() {
		/*****
		 ****
		 ***
		 */
		System.out.println("Provide the number:-");
		int m= sc.nextInt();

		for(int i=m;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}	
			System.out.println();
		}
	}

}

