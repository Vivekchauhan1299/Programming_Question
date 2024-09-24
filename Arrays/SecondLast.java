package ArrayofJava;

public class SecondLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 7, 8, 3, 9, 9 };
		int large = Integer.MIN_VALUE;
		int slarge = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				slarge = large;
				large = arr[i];
			} else if (arr[i] > slarge && arr[i] != large) {
				slarge = arr[i];

			}

		}

		System.out.println("large " + large);
		System.out.println("Second large " + slarge);

	}

}
