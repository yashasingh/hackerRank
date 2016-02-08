/**
 * Created by Yasha on 08-02-2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sherlockarr1 {



    boolean check(int x, int arr[])
    {  int s1=0,s2=0;
        for(int p=0;p<x;p++)
            s1 += arr[p];
        for(int p=x+1;p<arr.length;p++)
            s2 += arr[p];
        if (s1==s2)
            return true;
        else
            return false;
    }



    public static void main(String[] args) {

        boolean f= false;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++)
        {
            f=false;
            int n= in.nextInt();
            int ar[]= new int[n];
            for(int j=0;j<n;j++)
                ar[j]=in.nextInt();

            sherlockarr1 ob = new sherlockarr1();

            for(int k=0;k<n;k++)
            {
                f = ob.check(k,ar);
                if(f)
                    break;
            }


            if(f)
                System.out.println("YES");
            else
                System.out.println("NO");


        }



        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}