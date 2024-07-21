/*
           A
           AB
           ABC
           ABCD
           ABCDE
           ABCDEF.
           ...
           ...
 */
import java.io.*;
import java.util.*;
public class Pattern1 {
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
		int rows=s.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
		        System.out.print((char)(64+j));  
		    }
        System.out.println();
    }
}
}
