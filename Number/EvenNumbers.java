package proramming.batch.m56;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				System.out.println(i);

			}

		}

	}

}
