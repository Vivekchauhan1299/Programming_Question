package proramming.batch.m56;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int total = n;
		int fact = 153;
		int count = (int) (Math.log10(n) + 1);
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			int sum1 = digit;
			for (int i = 1; i < count; i++) {
				sum1 = sum1 * digit;
			}
			sum = sum + sum1;
			n /= 10;

		}
		if (total == sum) {
			System.out.println("Armstron  number");

		} else {
			System.out.println("Not an armstrong number");
		}

	}

}
