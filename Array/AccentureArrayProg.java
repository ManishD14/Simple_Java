package com.algo.array;

public class AccentureArrayProg {

	public static void main(String[] args) {
		int arr[]= {8,7,5,6,4,9,1,3};
		int n=arr.length;
		ans(arr,n);
		for(int i:arr)
			System.out.print(i+" ");
		

	}
	static int[] ans(int arr[],int n)
	{
		if(n==0)
			return null;
		for(int i=0;i<n;i++)
		{
			int s=0,l=0;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[i])
				{
					s=s+arr[j];
					
				}
				else
					l=l+arr[j];
			}
			arr[i]=s*l;
		}
		return arr;
	}

}
