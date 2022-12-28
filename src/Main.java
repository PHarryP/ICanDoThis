
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int userChoice;
		do {
			System.out.println("Make your choice");
			System.out.println("1. Arrays");
			System.out.println("2. Nested");
			System.out.println("3. Operators");
			System.out.println("4. Repetition");
			System.out.println("5. Selection");
			System.out.println("6. Subprograms");
			System.out.println("7. Variables");
			System.out.println("8. Quit");
			try {
				userChoice = in.nextInt();
			} catch (InputMismatchException e) {
				userChoice = in.nextInt();
				System.out.println(" BYE ");
			}
			if (userChoice==1) {
				Arraaay.Run();
			}else if (userChoice==2) {
				Nested.Run();
			}else if (userChoice==3) {
				Operators.run();
			}else if (userChoice==4) {
				Repetition.Run();
			}else if (userChoice==5) {
				Selection.Run();
			}else if (userChoice==6) {
				Subprograms.Run();
			}else if (userChoice==7) {
				Variables.Run();
			}else if (userChoice==8) {
				System.out.println("BYE");
			}
		} while (userChoice !=8);
		
		System.out.println("Bye");
		in.close();
	}

}
