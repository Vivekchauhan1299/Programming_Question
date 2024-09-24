package proramming.batch.m56;
import java.util.Scanner;
public class isArm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int num = i;
		int count = (int) (Math.log10(i) + 1);
		int sum = 0;
		while (i != 0) {
			int digit = i % 10;
			int total = ((int) (Math.pow(digit, count)));
			sum = sum + total;
			i = i / 10;
		}
		if (sum == num) {
			System.out.println("armstrong");

		} else {
			System.out.println("not arm strong");

		}

	}

}
