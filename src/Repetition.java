import java.util.Random;
import java.util.Scanner;

public class Repetition {
	public static void Run() {
		//Scanner in = new Scanner(System.in);
//		Random rnd=new Random();
//		int upperbound = 10;
		//int[] array = new int[3];
		//for (int i = 0;i<array.length;i++) {
		//	int  int_ar = rnd.nextInt(upperbound);
		//	array[i] = rnd.nextInt(upperbound);
		//}
//		int[] array = new int[rnd.nextInt(upperbound)];
//		System.out.println(array);
//		int  int_ar = rnd.nextInt(upperbound);
//		System.out.println(int_ar);

		int[] ar = new int[3];
		Random rnd = new Random();
		int rndnum = rnd.nextInt(10);
		for(int i = 0; i<10; i++) {
			 rndnum = rnd.nextInt(ar.length);
		}
		System.out.println(rndnum);
	}

}
