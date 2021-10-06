package com.string;

import java.util.ArrayList;
import java.util.List;

public class AllSubsequences {

	static List<String> al=new ArrayList<String>();
	
	public static void findsubsequences(String s,String ans)
	{
		if(s.length()==0) {
			al.add(ans);
			return ;
		}
		// We add adding 1st character in string
        findsubsequences(s.substring(1), ans + s.charAt(0));
 
        // Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not
        findsubsequences(s.substring(1), ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcderfe";
        findsubsequences(s, ""); // Calling a function
        System.out.println(al);
	}

}
