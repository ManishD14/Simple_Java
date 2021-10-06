package com.algo.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionIntersection {
        public static void main(String args[])
        {
        	Scanner sc=new Scanner(System.in);
        	int n1,n2,a1[],a2[];
        	System.out.println("Enter Array 1 Size");
        	n1=sc.nextInt();
        	System.out.println("Enter Array 2 Size");
        	n2=sc.nextInt();
        	System.out.println("now Elements of array");
        	a1=new int[n1];
        	a2=new int[n2];
        	System.out.println("now Elements of array for a1");
        	Set<Integer>s=new HashSet<Integer>();
        	for(int i=0;i<n1;i++)
        	{
        		int a=sc.nextInt();
        		a1[i]=a;
                s.add(a);
        	}
        	System.out.println("now Elements of array for a2");
        	for(int i=0;i<n2;i++)
        	{
        		int a=sc.nextInt();
        		a2[i]=a;
        		s.add(a);
        	}
        	
        	System.out.println(s);
           
           
        	
        	
        }
}
