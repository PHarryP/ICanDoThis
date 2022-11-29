import java.util.Scanner;

public class Array {
	public static void Run() {
		Scanner in = new Scanner(System.in);
		System.out.println("I'm running!");
		System.out.println("Enter a size of array");
		int size = in.nextInt();
		double array[] ;
		array = new double[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter a number");
			array[i] = in.nextDouble();
			
		}
		double temp = array[0];
		for (int i = 0; i<array.length-1; i++) {
			for (int j=0; j<(array.length-1); j++) {
				if (array[j+1]<array[j]) {
					temp = array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}		
		}
		System.out.println("Your min is");
		System.out.println(array[0]);
		System.out.println("Your max is");
		System.out.println(array[array.length-1]);
		System.out.println("Your average is");
		int average;
		
	}
}
