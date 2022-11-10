package question2;

import java.util.Scanner;

public class CommonElement {

	// method for finding the common elements in both array
	private static void common(int[] arr1, int[] arr2, int len)
	{
		 int common[] = new int[len];
		 int common_count = 0;
		 
		 // evaluating the common elements
		 for(int i = 0; i < len; i++)
		 {
			 for(int j =0; j< len; j++)
			 {
				 if(arr1[i] == arr2[j])
				 {
					 boolean flag = true;
					 // checking the common array element exist  or not 
					 /* if exist then flag will be false or not exist then 
					   flag will be true */
					 for(int k = 0; k < common_count; k++)
					 {
						 if(common[k] == arr2[j])
							 flag = false;
					 }
						 
					 if(flag)
					 { 
						 common[common_count] = arr1[i];
						 common_count++;
					 }
				 }
			 }
		 }
		if(common_count > 0)
		{
			 System.out.println("Common elements are : ");
			 // printing the common elements
			 for(int i =0; i < common_count; i++)
			 {
				
				 System.out.print(common[i]+" ");
			 }
		}
		else
		{
			System.out.println("No common elements are in the array");
		}
				 
		 
	}
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of arrays :");
		int num = sc.nextInt();
		int arr1[] = new int[num];
		int arr2[] = new int[num];
		System.out.println("Enter Frist array elements :");
		// taking user input for first array
		for(int i =0; i < num; i++)
			arr1[i] = sc.nextInt();
		System.out.println("Enter second array elements :");
		// taking user input for second array
		for(int i =0; i < num; i++)
			arr2[i] = sc.nextInt();
		
		common(arr1, arr2, num);
		sc.close();
	}

}
