package proramming.batch.m56;

public class CalculatePower {

	public static void main(String[] args) {
		int n = 5;
		int p = 3;
		int prod = 1;
		for (int i = 1; i <= p; i++) {
			prod = prod * n;
		}
		System.out.println(prod);
		System.out.println((int) Math.pow(n, p));
	}

}
