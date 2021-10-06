package com.string;

public class LongestReoccuring {

	  public static String lcp(String s, String t){  
	        int n = Math.min(s.length(),t.length());  
	        for(int i = 0; i < n; i++){  
	            if(s.charAt(i) != t.charAt(i)){  
	                return s.substring(0,i);  
	            }  
	        }  
	        return s.substring(0,n);  
	    }  
	static void repeated(String str)
	{
		String s="";
		int n=str.length();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				String x=lcp(str.substring(i,n),str.substring(j, n));
				if(x.length() > s.length()) s=x;
			}
		}
		
		
		System.out.println("Longest repeating sequence: "+s);  
				
	}
	public static void main(String[] args) {
		String s="asdefddsffff";
		repeated(s);

	}

}
