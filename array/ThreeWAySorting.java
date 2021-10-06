package array;

import java.util.Arrays;

public class ThreeWAySorting {
public static void swap(int[] arr,int i,int j )
{
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
public static void threeWayPartition(int[] A, int end)
{
	 // Linear time partition routine to sort an array containing 0, 1, and 2.
    // It is similar to 3–way partitioning for the Dutch national flag problem.
    int start = 0, mid = 0;
    int pivot = 1;

    while (mid <= end)
    {
        if (A[mid] < pivot)         // current element is 0
        {
            swap(A, start, mid);
            ++start;
            ++mid;
        }
        else if (A[mid] > pivot)    // current element is 2
        {
            swap(A, mid, end);
            --end;
        }
        else {                      // current element is 1
            ++mid;
        }
    }
}
	public static void main(String[] args) {
		int[] A = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
		
		threeWayPartition(A,A.length-1);
		System.out.println(Arrays.toString(A));

	}

}
