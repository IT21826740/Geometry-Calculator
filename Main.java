package Q2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
	private static int value;

	public static void main(String[] args) {
	
		Scanner myScanner = new Scanner(System.in);

		int[] array=new int[5];
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the number "+(i+1)+" :");
			array[i]=myScanner.nextInt();
		}
	Lottery l1 = new Lottery();
	int[] numbers = l1.getLotteryNumbers();
	System.out.println("\n"+"Lottery values are: "+"\n" + Arrays.toString(l1.getLotteryNumbers()));
	System.out.println("User Values are: "+"\n");
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+ " ");
		
	}
	for(int i=0; i<array.length;i++) {
	value=l1.compareLottery(array[i]);
    }
	System.out.println("\n"+ "Number of matching entries are: "+value);
	

    }

	
}	
	
	
	
	
	

