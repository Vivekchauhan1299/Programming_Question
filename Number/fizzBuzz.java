package proramming.batch.m56;

public class fizzBuzz {

	public static void main(String[] args) {
		int i = 100;
		for (int j = 1; j <= i; j++) {

			if (j % 3 == 0 && j % 5 == 0) {
				System.out.println("fizz-buzz");

			} else if (j % 3 == 0) {
				System.out.println("fizz");

			} else if (j % 5 == 0) {
				System.out.println("buzz");

			} else {
				System.out.println(j);
			}
			{

			}

		}

	}

}
