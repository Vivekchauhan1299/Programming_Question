// program to reverse number
package proramming.batch.m56;


public class P1 {
	public static void main(String[] args) {
		
		int n = 453;
		int rev = 0;
		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;

		}
		System.out.println(rev);


	}

}
