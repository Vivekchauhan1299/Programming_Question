// program to create reverse of string 

package String_of_java;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java Programming language";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

}
