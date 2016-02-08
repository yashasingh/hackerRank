/**
 * Created by Yasha on 07-02-2016.
 */
import java.io.*;
import java.util.*;

public class subarray {

   static int psum;
    static int ar[];
     public int find(int b[],int x,int y, int psum)
    {
        int sum=0;
        for (int i = x; i < y; i++) {
            sum+= b[i];
        }
       if(sum>psum)
           psum= sum;
        return(psum);
    }


   public static void main(String []args)
   {
       subarray ob = new subarray();
       Scanner in= new Scanner(System.in);
       int t= in.nextInt();

       for (int q=0;q<t;q++)
       {
           int n= in.nextInt();
           ar= new int[n];
             int s1=0;

           for(int i=0; i<n;i++) {
               ar[i] = in.nextInt();
               if (ar[i] > 0)
                   s1 += ar[i];
           }


           for (int m = 0;m<n-1;m++)
           {
               for (int k=1;k<n;k++)
               {
                   psum= ob.find(ar, m,k, psum);
               }
           }
           System.out.print(s1 + " "+psum);
           System.out.println();

       }





   }



}
