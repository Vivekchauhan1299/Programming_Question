package ArrayofJava;

public class CountBinary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 4, 7, 1, 10, 5, 8, 9, 6 };
		int maxsetbit = 0;
		int maxnumber = 0;
		for (int i = 0; i < arr.length; i++) {
			int setbit = binaryconsetbit(arr[i]);
			if (setbit > maxsetbit) {
				maxsetbit = setbit;
				maxnumber = arr[i];



			}
		}
		System.out.println(maxnumber);
	}



	public static int binaryconsetbit(int n) {
		int count = 0;
		while (n != 0) {
			int remaider = n % 2;
			if (remaider == 1) {
				count++;
			}
			n = n / 2;
	}
		return count;

}
}