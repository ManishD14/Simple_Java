package com.algo.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralArray {

	
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 },
                      { 17, 18, 19, 20}};
		//int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int w=0;
		int y=0;
		int x=a.length-1;//4
		int z=a[0].length-1;//3
		
		while(w<=x && y<=z)
		{
			for(int i=w ; i<=z ; i++)
				System.out.print(a[w][i]+" ");//w=3
			for(int i=w+1;i<=x;i++)//i=4,z=3
				System.out.println(a[i][z]+" ");
			if(w+1<=x)//w=4
			{
				for(int i=z-1;i>=y;i--)
					System.out.print(a[x][i]+" ");
			}
			if(y+1<=z)
			{
				for(int i=x-1;i>w;i--)
					System.out.print(a[i][y]+" ");
			}
			w++;
			x--;
			y++;
			z--;
		}
		

	}

}
