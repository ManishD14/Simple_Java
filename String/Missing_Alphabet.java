package com.string;

public class Missing_Alphabet {

	public static void main(String[] args) {
		String str="aZ";
		str=str.toLowerCase();
		String sorted="";
		int len=str.length();
		for(char ch='a';ch <='z';ch++)
		{
			for(int i=0;i<str.length();i++)
			{
				char strch=str.charAt(i);
				if(ch==strch)
					sorted+=strch;
			}
		}
		String filled="";
		for(int i=0;i<str.length()-1;i++) {
			char strch=sorted.charAt(i);
			filled +=strch;
			for(int j=strch+1;j<sorted.charAt(i+1);j++)
				filled+=(char)j;
		}
		filled+=sorted.charAt(len-1);
		System.out.println(filled);

	}

}
