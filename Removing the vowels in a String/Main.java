import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
     Scanner scan= new Scanner(System.in);
      String string=scan.nextLine();
    
    string = string.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(string);
  }
}