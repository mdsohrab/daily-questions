package company;

import java.util.Spliterator;
public class pp5 {
    public static void main(String[] args) {
      int n=7;
        int spaces=n-1;
        int str=1;
        for(int i=1;i<=n;i++)
        {
            //print spaces
            for(int j=1;j<=spaces;j++)
            {
                System.out.print("\t");
            }
            //print stars
            for(int k=1;k<=str;k++){
                System.out.print("*\t");
            }
            System.out.println( );

            spaces--;
            str++;
        }
    }
}
