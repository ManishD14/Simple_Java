package string;

import java.util.Arrays;

public class Sortingtoarrray {

	public static void main(String[] args) {
		String s="Manish";
		
		char[] a= s.toCharArray();
		Arrays.parallelSort(a);
		for(char b:a)
			System.out.println(b);
		

	}

}
