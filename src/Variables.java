
import java.util.Scanner;

public class Variables {
	public static void Run() {
		Scanner in = new Scanner(System.in);	
		System.out.println("Enter an Integer");
		int val = in.nextInt();
		System.out.println("Enter a Double");
		double dub = in.nextDouble();
		in.nextLine();
		System.out.println("Enter a String");
		String str = in.nextLine();
		int d = (int)dub;
		System.out.println("The converted double is " + dub);
		System.out.println("The original int is "+val+ " and the Converrted double is " +d);
		System.out.println("The new string is " +str.toUpperCase());
		if (str.length()<4) {
			System.out.println("Unable to print two lines");
		}else {
		System.out.println(str.substring(0,3));
		System.out.println(str.substring(3));
		}
	}

}
