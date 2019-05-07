import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();
     int k=n/100;
      int m=n%10;
      System.out.println(k+m);
	}
}