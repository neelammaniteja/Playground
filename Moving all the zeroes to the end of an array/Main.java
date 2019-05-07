import java.io.*; 
import java.util.Scanner;
class Main 
{ 
    static void pushZerosToEnd(int arr[], int n) 
    { 
        int count = 0;
        for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i];  
        while (count < n) 
            arr[count++] = 0; 
    } 
    public static void main (String[] args) 
    {   Scanner in=new Scanner(System.in);
     int arr_size=in.nextInt();
        int arr[] = new int[arr_size];
        int n = arr.length;
     for(int index=0;index<=(arr_size-1);index++)
     {
       arr[index]=in.nextInt();
     }
        pushZerosToEnd(arr, n); 
        
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
    } 
} 