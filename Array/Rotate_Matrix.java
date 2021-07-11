package array;

public class Rotate_Matrix {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Printing Matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int[][] temp=new int[3][3];
		int k=0;
		System.out.println("Printing Transpose Matrix");
		// code to rotate
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				temp[i][j]=arr[j][i];
				arr[j][i]=k;
			}
		
			
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		int row=arr.length;
		//reversing each row
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row/2;j++)
			{
				k=temp[i][j];
				temp[i][j]=temp[i][row-1-j];
				temp[i][row-1-j]=k;
			}
			
		}
		System.out.println("90 degree Rotated Array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
