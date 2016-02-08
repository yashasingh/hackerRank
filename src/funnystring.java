/**
 * Created by Yasha on 23-01-2016.
 */

import java.io.*;
import java.util.*;

public class funnystring {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        if(t<1 || t>10)
            return;


        String arr[] = new String[t];

        for(int i=0; i<t; i++)
            arr[i]= in.next();
        String rev="";

        for(int i=0; i<t; i++)
        {
            int l = arr[i].length();

            if(l<2 || l>10000)
                continue;

            for(int j=0;j<l;j++)
                rev= ""+arr[i].charAt(j)+ rev;

            int c=1;
            for(int k=1;k<=l-1;k++)
            {
                char p= arr[i].charAt(k);
                char q= arr[i].charAt(k-1);
                char r= rev.charAt(k);
                char s= rev.charAt(k-1);

                if(Math.abs(p-q) != Math.abs(r-s))
                {c=0;
                    System.out.println("Not Funny");
                    break;
                }

            }
            if(c==1)
                System.out.println("Funny");


        }








            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}