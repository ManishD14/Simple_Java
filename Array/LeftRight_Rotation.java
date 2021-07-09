package array;

public class LeftRight_Rotation {
public void left(int[] arr,int k)
{
	for(int i=0;i<k;i++)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
	}
}
public void right(int[] arr,int k)
{
	for(int i=0;i<k;i++)
	{
		for(int j=arr.length-1;j>0;j--)
		{
			int temp=arr[j];
			arr[j]=arr[j-1];
			arr[j-1]=temp;
		}
	}
}
	public static void main(String[] args) {
		
		System.out.println("Left Rotation of Array by kth Position");
		int[] arr= {1,2,3,4,5,6,7,8,9};//456789123
		int k=3;
		LeftRight_Rotation l=new LeftRight_Rotation();
		l.left(arr,k);
		for(int i:arr)
			System.out.print(i+" ");
		
		
		
		System.out.println();
		System.out.println("Right Rotation of Array by kth Position");
		int[] ar= {1,2,3,4,5,6,7,8,9};//789123456
		k=3;

		l.right(ar,k);
		for(int i:ar)
			System.out.print(i+" ");


	}

}
