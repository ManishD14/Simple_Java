package com.algo.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class RemoveZeroMatrix {

	public static int array[][];
	static void removeZe(int arr[][],int c,int r)
	{
		int r1=0;
		int c1=0;
		int sum1=0;
		int sum2=0;
		List<Integer> rowList=new ArrayList<Integer>();
		List<Integer> colList=new ArrayList<Integer>();
		while(r1<r)
		{
			c1=0;
			sum1=0;
			while(c1<c)
			{
				sum1=sum1+arr[r1][c1];
				c1++;
			}
			if(sum1==0)
			{
				rowList.add(r1);
			}
			r1++;
		}
		c1=0;
		while(c1<c)
		{
			r1=0;
			sum2=0;
			while(r1<r)
			{
				sum2=sum2+arr[r1][c1];
				r1++;
			}
			if(sum2==0)
			{
				colList.add(c1);
			}
			c1++;
		}
		displayFinalArray(array,rowList,colList,r,c);

		
	}
	private static void displayFinalArray(int[][] array2,
			List<Integer> rowList, List<Integer> colList,int row,int column) {

			int newarray[][]=new int[row-rowList.size()][column-colList.size()];
			int newrow=-1;
			int newcol=0;
			int row1=0;
			int col1=0;
			while(row1<row){
			if(rowList.contains(row1)){
			row1++;
			continue;
			}
			col1=0;
			newcol=0;
			newrow++;
			while(col1<column){
			if(colList.contains(col1)){
			col1++;
			continue;

			}

			newarray[newrow][newcol++]=array2[row1][col1];

			col1++;
			}

			row1++;
			}

			System.out.println();
			System.out.println();
			System.out.println();
			displayArray(newarray,row-rowList.size(),column-colList.size());

			}

			private static void displayArray(int[][] array2,int row,int column) {

			for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){

			System.out.print(array2[i][j]+" ");
			}

			System.out.println();
			}



			}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.nextLine();
		array=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		removeZe(array,a,b);
		

	}

}
