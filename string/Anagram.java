package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
 
     String s1="car";
     String s2="acr";
     char[] c1=s1.toCharArray();
     char[] c2 =s2.toCharArray();
     
    Arrays.parallelSort(c1);
    Arrays.parallelSort(c2);
      
    for(int i=0;i<3;i++)
    {
    	if(c1[i]==c2[i])
    	{
    		System.out.println(c1[i]+" = " +c2[i]+"True");
    	}
    }
   
     

	}

}
