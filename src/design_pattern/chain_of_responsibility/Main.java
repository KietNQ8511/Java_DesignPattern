package design_pattern.chain_of_responsibility;

import java.util.Scanner;

/**
  * Chain of responsibility 
  */
public class Main {
	/*
	 * Chain of responsibility send request to an object 
	 */
	
	
	static int getBit(int x, int pos) {
		return (x >> pos) & 1;
	}
	
	static void printBinary(int x, int n) {
		for(int i = n; i >= 0; i--) {
			if(getBit(x, i) == 1) System.out.print("1");
			else System.out.print("0");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		printBinary(a, 10);
//		printBinary(b, 10);
//		int c = a ^ b;
//		
//		printBinary(c, 10);
//		System.out.println(c);		
//		
//		long x = a|= b;
//		
		System.out.println("=====================");
		
//		System.out.println(getBit(4, 2));
		System.out.println(2<<3);
		System.out.println(4>>2);
	}
}
