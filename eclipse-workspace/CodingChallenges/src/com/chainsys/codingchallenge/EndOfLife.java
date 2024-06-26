package com.chainsys.codingchallenge;

import java.util.Scanner;

public class EndOfLife {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int lNumber = 1;

		while (scanner.hasNext()) {
			String l = scanner.nextLine();
			System.out.println(lNumber + " " + l);
			lNumber++;
		}
		scanner.close();
	}
}
