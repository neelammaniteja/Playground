import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
 
class Main {
 
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      String str=scan.nextLine();
      String[] strWords = str.split("\\s+");
        
        
        LinkedHashSet<String> lhSetWords  = new LinkedHashSet<String>( Arrays.asList(strWords) );
        StringBuilder sbTemp = new StringBuilder();
        int index = 0;
        for(String s : lhSetWords){
            if(index > 0)
                sbTemp.append(" ");
            sbTemp.append(s);
            index++;
        }
        str = sbTemp.toString();
        System.out.println(str);
    }
}