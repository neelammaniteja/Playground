import java.io.*; 
import java.util.Scanner;
  
class Main { 
  

 
public static void main(String args[])  
{ 
  Scanner scan=new Scanner(System.in);
    String str = scan.nextLine();
    String word = scan.nextLine(); 
    int count = 0, fromIndex = 0;
        
        while ((fromIndex = str.indexOf(word, fromIndex)) != -1 ){
 
            
            count++;
            fromIndex++;
            
        }
        
        System.out.println( + count);
} 
} 
  