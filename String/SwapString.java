package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapString {

	public static void main(String[] args) {
		/*String a="JAbva";
		String b="platform";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		
		a=a.substring(b.length());
		System.out.println(a+" "+b);
		
		String s="000123";
		StringBuffer sb=new StringBuffer(s);
		sb.replace(0, 2, "");
		System.out.println(sb.toString());;*/
		
		String a="00000000000111100000000";
		char[] ch=a.toCharArray();
		int count=0,i=0,b=0;
		int[] arr=new int[a.length()];
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]=='0')
			{
				count++;
				arr[i]=count;
			}
			else {
				count=0;}
			
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		
		
		
		

	}

}
