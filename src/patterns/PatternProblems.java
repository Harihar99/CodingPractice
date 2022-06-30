package patterns;

import java.util.Scanner;

public class PatternProblems {
	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
//		halfPyramid();
//		invertedHalfPyramid();
//		rightHalfPyramid();		
//		halfPyramidOfNos();
		invertedHalfPyramidOfNos();
		
		
	}


	


	static void  halfPyramid() {
		/*
		 **
		 ***
		 ****
		 *****/
		
		System.out.println("Calling halfPyramid()");
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

	static void invertedHalfPyramid() {
		/*****
		 ****
		 ***
		 */
		
		System.out.println("Calling invertedHalfPyramid()");
		System.out.println("Provide the number:-");
		int m= sc.nextInt();

		for(int i=m;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}	
			System.out.println();
		}
	}
	
	static void rightHalfPyramid() {
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****/
		
		System.out.println("Calling rightHalfPyramid()");
		System.out.println("Provide the number:-");
		int m = sc.nextInt();
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void solidSquare() {
		/*******
		 *******
		 *******
		 *******
		 *******/
		
		System.out.println("Calling solidSquare()");
		System.out.println("Provide the number:-");
		int m = sc.nextInt();
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void halfPyramidOfNos() {
		/*1
		 *12
		 *123
		 *1234
		 *12345
		 */
		
		System.out.println("Calling invertedHalfPyramid()");
		System.out.println("Provide the number:-");
		int m=sc.nextInt();
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	static void invertedHalfPyramidOfNos() {
		/* 1 2 3 4 5
		 * 1 2 3 4
		 * 1 2 3
		 * 1 2
		 * 1
		 */
		
		System.out.println("Calling invertedHalfPyramidOfNos()");
		System.out.println("Provide the number:-");
		int m=sc.nextInt();
		
		for(int i=m;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
	

}

