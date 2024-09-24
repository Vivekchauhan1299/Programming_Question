package proramming.batch.m56;

public class isPrime {
	public static void main(String[] args) {
		int n = 73;
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}

		}

		if (count == 0) {
			System.out.println("the number isprime");
		} else {
			System.out.println("the number is Notprime");
		}

	}
}
