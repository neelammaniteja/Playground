import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      
       
int n, i, j, space = 1;
      
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1;
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }System.out.print("\n"); 
        }}}