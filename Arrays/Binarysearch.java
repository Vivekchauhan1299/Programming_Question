package ArrayofJava;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 9, 4, 1, 6, 3 };
		sort(arr);
		int search = 9;
		int starting_point = 0, ending_point = arr.length - 1;
		while (starting_point <= ending_point) {
			int middle_point = (starting_point + ending_point) / 2;
			if (search == arr[middle_point]) {
				System.out.println("present at " + middle_point);
				break;
			} else if (search > arr[middle_point]) {
				starting_point = middle_point + 1;

			} else if (search < arr[middle_point]) {
				ending_point = ending_point - 1;
			}

		}
		if (starting_point > ending_point) {
			System.out.println("not in range");
		}
	}


	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int index = i;
			while (index > 0 && arr[index - 1] > temp) {
				arr[index] = arr[index - 1];
				index--;
			}
			arr[index] = temp;
		}

	}

	}

