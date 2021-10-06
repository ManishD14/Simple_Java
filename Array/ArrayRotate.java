package com.algo.array;

public class ArrayRotate {

	public static void main(String[] args) {
		int[] arr= {1,5,8,6,7,6,4,9};
		int[] b;
		int d=1;
		int l=arr.length;
		for(int j:arr)
		{
			System.out.print(j+"");
		}
		b=new int[l];
		for(int i=0;i<d;i++)
		{
			for(int j=0;j<l-1;j++)
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		System.out.println("------------------------");
		for(int j:arr)
		{
			System.out.print(j+"");
		}

	}

}
