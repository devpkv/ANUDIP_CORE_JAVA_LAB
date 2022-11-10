package question4;

import java.util.Scanner;

public class MatricMultiplication {

	public static void main(String[] args) {
		 
		  int i, j, k, s=0;
	      int[][] mOne = new int[3][3];
	      int[][] mTwo = new int[3][3];
	      int[][] mThree = new int[3][3];
	      Scanner sc = new Scanner(System.in);
	      // taking input in first matrix
	      System.out.print("Enter elements of first matrix: ");
	      for(i=0; i<3; i++)
	      {
	         for(j=0; j<3; j++)
	         {
	        	 mOne[i][j] = sc.nextInt();
	         }
	      }
	      
	   // taking input in second matrix
	      System.out.print("Enter elements of second matrix: ");
	      for(i=0; i<3; i++)
	      {
	         for(j=0; j<3; j++)
	         {
	        	 mTwo[i][j] = sc.nextInt();
	         }
	      }
	      
	      // multiplying the two matrices
	      for(i=0; i<3; i++)
	      {
	         for(j=0; j<3; j++)
	         {
	            s = 0;
	            for(k=0; k<3; k++)
	            {
	               s = (mOne[i][k] * mTwo[k][j]) + s;
	            }
	            mThree[i][j] = s;
	         }
	      }
	      
	      System.out.println(" ++++++++ Multiplication Result ++++++++++");
	      for(i=0; i<3; i++)
	      {
	         for(j=0; j<3; j++)
	         {
	            System.out.print(mThree[i][j]+ "  ");
	         }
	         System.out.println();
	      }

	}

}
