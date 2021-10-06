package com.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a="silent";
		String b="listen";
		check(a,b);

	}
	static void check(String a,String b)
	{
		if(a.length()==b.length())
		{
			char[] c1=a.toCharArray();
			char[] c2=b.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean r=Arrays.equals(c1, c2);
			if(r) {
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anaghrsam");
			}
		}
		
	}

}
