package com.chainsys.codingchallenge;

import java.util.Scanner;

public class OutputFormating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			System.out.printf("%-15s%03d%n", s1, x);
		}
		System.out.println("================================");
		sc.close();
	}
}
