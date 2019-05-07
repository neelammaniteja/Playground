
import java.util.regex.Pattern;
import java.util.Scanner;
public class Main { 

	
	static String reverseWords(String str) 
	{ 

		
		Pattern pattern = Pattern.compile("\\s"); 

		
		String[] temp = pattern.split(str); 
		String result = ""; 

		
		for (int i = 0; i < temp.length; i++) { 
			if (i == temp.length - 1) 
				result = temp[i] + result; 
			else
				result = " " + temp[i] + result; 
		} 
		return result; 
	} 

	
	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in);
    
    String s1 = scan.nextLine();
    
    
		System.out.println(reverseWords(s1)); 

		
	} 
} 
