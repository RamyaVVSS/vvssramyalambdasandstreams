package maven.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class StringWithAandLength3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length;
		List<String> list  = new ArrayList<String>();
		System.out.println("Enter the size of the list");
		length = sc.nextInt();
		System.out.println("Enter the elements of list");
		for(int i = 0; i < length; i++) {
			list.add(sc.next());
		}
		List<String> result  = CheckFirstLetterAndLength(list, (String element) -> element.charAt(0) == 'a' && element.length() == 3);
		System.out.println("Strings with starting character 'a' and length 3 are:");
		result.stream().forEach((i) -> System.out.println(i));
	}
	public static List<String> CheckFirstLetterAndLength(List<String> list, Predicate<String> predicate) {
		List<String> finalList = new ArrayList<String>();
		for(String element : list) {
			if(predicate.test(element)) {
				finalList.add(element);
			}
		} 
		return finalList;
	}

}
