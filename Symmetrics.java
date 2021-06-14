import java.io.*;
import java.util.Scanner;

class Symmetrics
{
	public static void main(String args[])throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int row,col,i,j;
		boolean b;
		System.out.println("Enter the number of rows");
		row = sc.nextInt();
		System.out.println("Enter the number columns");
		col = sc.nextInt();
		int mat[][] = new int[row][col];
		System.out.println("Enter the elements of the matrix"); 

		for (i=0;i<row;i++)
		{ 
			for (j=0;j<col;j++)
			mat[i][j] = sc.nextInt();	
		}
		if(row!=col)
        {
            System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
        }
        else
        {
        	b=true;
        	for(i=0;i<row;i++)
        	{
        		for(j=0;j<col;j++)
        		{
		        	if(mat[i][j] != mat[j][i])
		        	{
		        		b=false;
		        	}
	        	}
        	}
        	if(b)
        	{
        		System.out.println("The given matrix is Symmetric");
        	}
        	else
        	{
        		System.out.println("The given matrix is not Symmetric");
        	}

        }
	}
}