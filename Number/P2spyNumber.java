// program to find spy number or not
package proramming.batch.m56;

public class P2spyNumber {
	public static void main(String[] args) {

		int n = 123;
	int sum =0;
	int prod =1;
	while( n != 0) {
		int digit = n % 10;
		sum = sum + digit;
		prod = prod * digit;
		n = n / 10;
	}
	if (sum == prod) {
		System.out.println("spy numer");
	} else {
		System.out.println("not spy numer");
	}
}
}