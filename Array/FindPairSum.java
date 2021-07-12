package array;

public class FindPairSum {
	public static void findPair(int[] arr,int sum)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			   if(arr[i]+arr[j]==sum)
			    {
				System.out.println("The Required Pair [ "+arr[i]+" ,"+arr[j]+" ]");
				
		     	}
			}
		}
	
	}
	public static void findThreePair(int[] arr,int sum)//three pair
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			   for(int k=0;k<arr.length;k++)
			   {
				   if(arr[i]+arr[j]+arr[k]==sum)
				    {
					System.out.println("The Required Pair [ "+arr[i]+" ,"+arr[j]+" ,"+arr[k]+" ]");
					
			     	}
			   }
			}
		}
	
	}

	public static void main(String[] args) {
		int[] arr= {1,4,7,8,6,5,3,2};
		int sum=15;
		
		findPair(arr,sum);//three pair= 2 ,7 ,6

	}

}
