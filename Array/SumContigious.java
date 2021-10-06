package com.algo.array;

import java.util.HashMap;
import java.util.Map;

public class SumContigious {

	public static void main(String[] args) {
		int[] a= {5,6,-5,-8,1,3,5,-9,7};
		int target =8;
		findmax(a,target);
		System.out.println("Maximum contiguous sum is " +
                maxsubarray(a));

	}
	public static void findmax(int[] a,int s)
	{
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		map.put(0, -1);
		int target=0;
		int len=0;
		int end=-1;
		for(int i=0;i<a.length;i++)
		{
			target+=a[i];
			
			map.putIfAbsent(target, i);
			if(map.containsKey(target-s)&& len<i-map.get(target-s))
			{
				len=i-map.get(target-s);
				end=i;
			}
		}
		System.out.println("[" + (end - len + 1) + ", " + end + "]");
	}
	static int maxsubarray(int[] a )
	{
		int size=a.length;
		int maxfar=Integer.MIN_VALUE,maxend=0;
		for(int i=0;i<size;i++)
		{
			maxend=maxend+a[i];
			if(maxfar<maxend)
				maxfar=maxend;
			if(maxend<0)
				maxend=0;
			
		}
		return maxfar;
	}

}
