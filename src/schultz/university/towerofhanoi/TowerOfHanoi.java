package schultz.university.towerofhanoi;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		
		System.out.println("Took " + moveDisks(n, 'A', 'B', 'C') + " moves");
	}

	/*
	 *  Ex:
	 *  
	 *  Source  Dest   Spare
 	 *    A      B       C
 	 *    
 	 *  (Can be changed in the arguments)
	 */
	public static int moveDisks(int n, char source, char dest, char spare) {
		int count = 0;
		
		if(n == 1) {
			System.out.println("Moved from " + source + " to " + dest);
			count++;
		}
		
		else {
			count += moveDisks(n - 1, source, spare, dest);
			System.out.println("Moved from " + source + " to " + dest);
			count++;
			count += moveDisks(n - 1, spare, dest, source);
		}		
		return count;
	}

}
