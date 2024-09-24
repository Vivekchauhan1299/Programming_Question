// wap to find leader

package ArrayofJava;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			for (int i = 0; i < arr.length; i++) {
				boolean isleader = true;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						isleader = false;

					}
				}
				if (isleader) {
					System.out.println(arr[i] + "");
				}
			}
		}

	}

}
