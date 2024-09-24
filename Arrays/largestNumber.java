package ArrayofJava;

public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 7, 8, 3, 9 };
		int large = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		System.out.println(large);
	}

}
