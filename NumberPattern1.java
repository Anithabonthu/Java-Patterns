/* Pattern  1
            12
            123
            1234
            12345
            123456
 */
import java.io.*;
import java.util.*;
public class Program1{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
		int rows=s.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
		        System.out.print(j);  
		    }
        System.out.println();
    }
}
}