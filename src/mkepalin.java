/**
 * Created by Yasha on 24-01-2016.
 */

import java.io.*;
import java.util.*;

public class mkepalin {

    boolean checkpalin(String str)
    {
        String rev="";
        int l = str.length();
        for(int j=0;j<l;j++)
            rev=""+str.charAt(j)+rev;

        if(str.equals(rev))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t= in.nextInt();
        String arr[]= new String[t];

        for(int i=0; i<t; i++)
            arr[i]=in.next();






    }
}