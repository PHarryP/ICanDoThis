import java.util.Scanner;

public class Nested {
	public static void Run() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = in.nextInt();
		System.out.println("Enter num2");
		int num2 = in.nextInt();
		for (int x = num1; x<=num2;x++) {
			System.out.print(x+"\t");
			for (int y=num1; y<=num2; y++) {
				System.out.print((x*y)+"\t");
//				for (int x2 = num1+1; x<=num2; x++ ) {
//					for (int y2 = num1+1; y<=num2+1; y++)
//					System.out.println("\t"+y*x+"\n");
//				}
			}
			System.out.println();
				
			}
			
		
	}

}
