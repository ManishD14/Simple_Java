package com.algo.array;

import java.util.ArrayList;
import java.util.HashMap;

class Pair{
	int first,second;
	Pair(int a,int b){
		first=a;
		second=b;
	}
}
public class ArraySumZero {

	static ArrayList<Pair> find(int[] arr,int n)
	{
		HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Pair> out=new ArrayList<Pair>();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			if(sum==0)
				out.add(new Pair(0,i));
			ArrayList<Integer> al=new ArrayList<Integer>();
			
			if(map.containsKey(sum))
			{
				al=map.get(sum);
				for(int it=0;it<al.size();it++)
				{
					out.add(new Pair(al.get(it)+1,i));
				}
				
			}
			al.add(i);
			map.put(sum,al);
		}
		return out;
	}
	static void print(ArrayList<Pair> out)
	{
		for(int i=0;i<out.size();i++)
		{
			Pair p=out.get(i);
			System.out.println("SubArray Found at"
			+p.first+" to "+p.second);
		}
	}
	public static void main(String[] args) {
		int[] arr= {6,-1,3,7,-5,-8,1,5,9,23,4,-2};
		int n=arr.length;
		ArrayList<Pair> out=find(arr, n);
		if(out.size()==0)
			System.out.println("No SubArray Exists");
		else
			print(out);

	}

}
