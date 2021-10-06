package com.algo.array;

public class StringStar {

	public static void main(String[] args) {
		String[] s= {"abc","def"};
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==1 && j==1)
				{
					System.out.print(s[0]+" ");
					j++;
					continue;
				}
				if(i==2 && j==1)
				{
					System.out.print(s[1]+" ");
					j++;
					continue;
				}
				System.out.print("x ");
			}
			System.out.println();
		}

	}

}
