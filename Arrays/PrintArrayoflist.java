package ArrayofJava;

public class PrintArrayoflist {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10 };
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}


		for (int j : arr)
	{
		System.out.println(j);
	}
}
}
