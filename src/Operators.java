import java.util.Scanner;

public class Operators {
	public static void run() {
		Scanner in = new Scanner(System.in);
		int num1,num;
		System.out.println("Enter a number");
		 num1 = in.nextInt();
		 num = num1-1;
		 num = num*3;
		 num = num+12;
		 num = num/3;
		 num = num+5;
		 num = num-num1;
		 System.out.println("Your Solution is " + num);
	}

}
