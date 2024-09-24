package ArrayofJava;

import java.util.Scanner;

public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner =new Scanner(System.in);
		 int n= scanner.nextInt();
		 int []arr =new int [n];

			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
		 }
		int target =scanner.nextInt()	;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("[" + i + j + "]");
				}
				
			}
			
		}
		
	}	
			
			
}
		 
			
		
		

	


