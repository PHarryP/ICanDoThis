import java.util.Random;
import java.util.Scanner;

public class Repetition {
	public static void Run() {
		Random rand = new Random();
		int[] firstSet=new int[3];
		int[] nextSet;
		//Keep track of the number of repetitions
		int counter =0;
		//Generate the first set of 3 random digits
		for(int i=0;i<3;i++) {
			firstSet[i] = rand.nextInt(10);
		}
	
	//generate new sets of 3 digits until they match the first three
		do {
			nextSet = new int[3];
			for (int i=0;i<3;i++) {
				nextSet[i]=rand.nextInt(10);
			}
			//increase the counter
			counter++;
		}while(!matchingSets(firstSet, nextSet));
		System.out.println("Matching sets found:"+ firstSet[0]+firstSet[1]+firstSet[2]+"="+nextSet[0]+nextSet[1]+nextSet[2]);
		System.out.println("Number of repetitions"+counter);
	}
	//check if two sets of digits match
	public static boolean matchingSets(int[] set1, int[] set2) {
		for(int i =0;i<3;i++) {
			if(set1[i]!=set2[i]) {
				return false;
			}
		}
		return true;
	}

	

}
