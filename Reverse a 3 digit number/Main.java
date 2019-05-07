import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int i=in.nextInt();
    int f=i/100;
    int s=i/10%10;
    int t=i%10;
    
    System.out.println( t*100 + s*10 + f);
  }
}