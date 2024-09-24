package proramming.batch.m56;

public class StrongNumber {
	public static void main(String[] args) {
		
	
	
		int n = 145;
		int Temp = n;
		int sum =0;
		while(n!=0) {
			int digit = n % 10;
			int fact = 1;
			for (int i = 1; i <= digit; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
		}
		if (Temp == sum) {
			System.out.print("strong number");
		} else {
			System.out.print("not a strong number");

		}
	}
}