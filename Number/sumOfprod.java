package proramming.batch.m56;

import java.util.Scanner;

public class sumOfprod {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int prod = 1;
		for (int i = 0; i <= n; i++) {

			if (i % 2 != 0) {
				prod = prod * i;
			}
		}
		System.out.println(prod);


	}

}
