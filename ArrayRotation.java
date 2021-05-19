import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	private static Scanner scan;

	public static void main(String[] args) {		
		scan = new Scanner(System.in);
		
		System.out.println("Enter the array size:");
		int number = scan.nextInt();
		
		int[] array = new int[number];
		
		System.out.println("Enter the array elements:");
		for (int i = 0; i < number; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("Enter the rotation number:");
		int rotation = scan.nextInt();
		
		int newArray[] = new int[number];
		
		int j=0;
		for (int i = rotation; i < number; i++) {
			newArray[j] = array[i];
			j++;
		}
		
		for (int i = 0; i < rotation; i++) {
			newArray[j] = array[i];
			j++;
		}
	
		System.out.println(Arrays.toString(newArray));
	}
}
