package com.string;

public class ReverseString_Recursion {

	/*public String reverseString(String str)  
	{  
	//checks if the string is empty   
	if(str.isEmpty())  
	{  
	System.out.println("String is empty.")  ;
	//if the above condition is true returns the same string      
	return str;  
	}   
	else   
	{  
	return reverseString(str.substring(1))+str.charAt(0);  
	}  
	}  
	public static void main(String[] args)   
	{  
		ReverseString_Recursion rs = new ReverseString_Recursion();  
	String resultantSting1 = rs.reverseString("JAVATPOINT");  
	String resultantSting2 = rs.reverseString("COMPUTER");  
	String resultantSting3 = rs.reverseString("INDIA");  
	System.out.println(resultantSting1);  
	System.out.println(resultantSting2);  
	System.out.println(resultantSting3);   
	}  
	}*/
	public String reverse(String s)
	{
		if(s.isEmpty()) {
			return s;
		}
		else
			return reverse(s.substring(1))+s.charAt(0);
	
		
			
	}
	public static void main(String[] args) {

		ReverseString_Recursion rs = new ReverseString_Recursion();
     System.out.println(rs.reverse("CDAC"));

	}

}
