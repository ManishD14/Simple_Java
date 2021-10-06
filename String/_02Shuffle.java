package com.string;

public class _02Shuffle {

	static boolean checkLength(String f,String s,String r)
	{
		if(f.length()+s.length() != r.length())
		{
			return false;
		}
		else
			return true;
	}
	static String sortString(String str)
	{
		char[] charArray=str.toCharArray();
		str=String.valueOf(charArray);
		return str;
	}
	static boolean shuffleCheck(String f,String s,String r)
	{
		f=sortString(f);
		s=sortString(s);
		r=sortString(r);
		
		int i=0,j=0,k=0;
		while(k != r.length())
		{
			if(i<f.length() && f.charAt(i)==r.charAt(k))
			    i++;
			else if(j<s.length() && s.charAt(j) ==r.charAt(k))
				j++;
			else
				return false;
			k++;
		}
		if(i<f.length() || j<s.length()) {
			return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		String f="XY";
		String s="12";
		String[] r= {"1XY2", "Y1X2", "Y21XX"};
		for(String result:r) {
			if(checkLength(f, s, result)==true && shuffleCheck(f, s, result)==true) {
				System.out.println(result + " is a valid shuffle of " + f + " and " + s);
		      }
		      else {
		        System.out.println(result + " is not a valid shuffle of " + f + " and " + s);
		      }
		    }
		  }
		}
