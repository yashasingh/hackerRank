/**
 * Created by Yasha on 01-02-2016.
 */

import java.io.*;
import java.util.*;

public class insertionsort2 {

    public static void insertionSortPart2(int[] ar,int s)
    {

        int small=0,pos=0;
        for(int i =0;i<s;i++)
        {small=ar[i]; pos=i;
            for(int j=i+1; j<s;j++)
            {
                if(ar[j]<small)
                {
                    small=ar[j];
                    pos=j;
                }
            }
            int t=ar[i];
            ar[i]=ar[pos];
            ar[pos]=t;
            printArray(ar);
        }
        // Fill up the code for the required logic here
        // Manipulate the array as required
        // The code for Input/Output is already provided
    }



    public static void main(String[] args) {
        Solution ob= new Solution();


        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar,s);

    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
