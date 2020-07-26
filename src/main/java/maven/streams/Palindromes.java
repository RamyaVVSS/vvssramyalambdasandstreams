package maven.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length;
		List<String> list  = new ArrayList<String>();
		System.out.println("Enter the size of the list");
		length = sc.nextInt();
		System.out.println("Enter the elements of the list");
		for(int i = 0; i < length; i++) {
			list.add(sc.next());
		}
		List<String> result = isPalindrome(list);
		System.out.println("Palindromes in the given list are:");
    	result.stream().forEach((i) -> System.out.println(i));

	}
	
	public static List<String> isPalindrome(List<String> list){
    	List<String> palindromes = new ArrayList<String>();
        list.forEach(str -> {StringBuilder strbuilder = new StringBuilder();
            for (char c : str.toCharArray()) {
                if (Character.isLetter(c)) {
                    strbuilder.append(c);
                }
            }
            String fwd = strbuilder.toString().toLowerCase();
            String bwd = strbuilder.reverse().toString().toLowerCase();
            if(fwd.equals(bwd)) {
            	palindromes.add(str);
            }
        });
        return palindromes;
    }

}
