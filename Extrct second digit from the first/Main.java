import java.util.Scanner;
class Main{

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in); //scanner object to read the input number.

int input=scanner.nextInt();// assigning entered number to variable 'input' of type int.

int temp;

for (temp = input; temp > 0;) {

if (temp < 99) {

System.out.println(temp % 10);

break;

} else {

temp = temp / 10;

}





      
        }
      
    }
}