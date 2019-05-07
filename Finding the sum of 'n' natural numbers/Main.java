import java.util.Scanner;

import java.util.*; 
import java.lang.*; 

class Main
{ 

	
	public static int recurSum(int n) 
	{ 
		if (n <= 1) 
			return n; 
		return n + recurSum(n - 1); 
	} 
	
	// Driver code 
	public static void main(String args[]) 
	{ 
      Scanner in=new Scanner(System.in);
      
		int n = in.nextInt();
		System.out.println(recurSum(n)); 
	} 
} 


