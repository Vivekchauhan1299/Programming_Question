package ArrayofJava;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 9, 4, 1, 6, 3 };
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int index = i;
			while (index > 0 && arr[index - 1] > temp) {
				arr[index] = arr[index - 1];
				index--;
			}
			arr[index] = temp;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}

// shifting is performed in insertion