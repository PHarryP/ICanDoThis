import java.util.Iterator;
import java.util.Scanner;

public class Subprograms {
	public static void Run() {
		Scanner in = new Scanner(System.in);
		StringBuilder res = new StringBuilder();
		System.out.println("Enter a string");
		String a = in.nextLine();
		System.out.println("Enter a second string");
		String b = in.nextLine();
		
	StringBuilder interlaced = new StringBuilder();
	int maxLength=Math.max(a.length(),b.length());
	for (int i = 0;i<maxLength;i++) {
		if(i<a.length()) {
			interlaced.append(a.charAt(i));
		}
		if (i<b.length()) {
			interlaced.append(b.charAt(i));
		}
	}
		System.out.println(interlaced.toString());
	
		 
	}

}
