package com.algo.array;

public class KadnesAlgorithm {

	public static int kadaneForMaxSubArray(int[] arr)
	{
		int maxEnd=0;
		int maxFar=0;
		for(int i=0;i<arr.length;i++) {
			maxEnd+=arr[i];
			if(maxEnd<0)
				maxEnd=0;
			if(maxFar<maxEnd)
				maxFar=maxEnd;
		}
		return maxFar;
	}
	public static int kadaneNegative(int[] arr)
	{
		int maxEnd=arr[0];
		int maxFar=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			maxEnd=Math.max(arr[i], maxEnd+arr[i]);
			maxFar=Math.max(maxFar, maxEnd);
		}
		return maxFar;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 8, -3, -7, 2, 7, -1, 9 };
		System.out.println("Max Sub is  "+kadaneForMaxSubArray(arr));
		int arrNeg[] = { -10, -8, -3, -7, -2, -7, -3, -9 };
		
		System.out.println("MAx Sub for Negative "+kadaneNegative(arrNeg));

	}

}
