import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
       int originalNumber, remainder, result = 0;

        originalNumber = n;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder,3 );
            originalNumber /= 10;
        }

        if(result == n)
            System.out.println("Armstrong Number");
        else
          System.out.println("Not a Armstrong Number");
	}}
