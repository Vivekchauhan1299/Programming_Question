package proramming.batch.m56;

public class DigitSepetation {
	public static void main(String[] args) {
		int n = 35654;
		int count = 0;
		while (n != 0) { // (int) (math.log10(n)+1);
			count++;
			n = n / 10;
		}

		System.out.println(count);

	}
}
