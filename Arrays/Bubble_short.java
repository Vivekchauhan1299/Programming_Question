package ArrayofJava;

import java.util.Arrays;
public class Bubble_short {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 9, 5, 1, 7, 6, 1 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; i++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}

	}

}
