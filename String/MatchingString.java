package com.string;

import java.util.Arrays;

public class MatchingString {

	public static void main(String[] args) {
		String a="six lacs";
		String b="seven lacks";
		
		char[] ch1=a.toCharArray();
		char[] ch2=b.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=0;i<b.length();i++)
		{
			for(int j=0;j<a.length();j++)
			{
				if(b.charAt(i)!=a.charAt(j))
					continue;
				else
					System.out.print(b.charAt(i)+" ");
					
			}
			
		}
			/*int[] arr= {1,2,3,4};
			int sum=0;
			int n=arr.length-1;
			for(int i=0;i<arr.length;i++)
			{
				sum=(int) (sum+(arr[i]*Math.pow(10, n)));
				n=n-1;
			}
			System.out.println(sum);
	*/
	}

}
