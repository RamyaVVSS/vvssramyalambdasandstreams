package maven.streams;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length;
		System.out.println("Enter the size of the list");
	    length = sc.nextInt();
	    int[] list = new int[length];
	    System.out.println("Enter the elements of the list");
	    for(int i = 0;i < length;i++) {
	    	list[i] = sc.nextInt();
	    }
	    IntStream liststream = Arrays.stream(list);
	    System.out.print("Average of the numbers in the list is: "+((liststream.sum())/length));
	}
}
