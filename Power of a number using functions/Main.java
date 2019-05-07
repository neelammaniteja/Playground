import java.util.Scanner;
public class Main 
{
    public static void main(String args[])
    {
        int x,y;
        double i,z;
        
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
      y=s.nextInt();
        i = Math.pow(x , y);
        
        
        System.out.println(+i);
    }
}