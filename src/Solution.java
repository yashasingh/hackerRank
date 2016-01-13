/**
 * Created by Yasha on 13-01-2016.
 */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.next();

        String type= s.charAt(8)+""+s.charAt(9);
        String hr= s.charAt(0)+""+s.charAt(1);
        String minsec= s.substring(2,8);
        int hour= Integer.parseInt(hr);
        if(type.equalsIgnoreCase("AM"))
        {
            if (hour==12)
                System.out.println("00"+minsec);
            else
                System.out.println(s.substring(0,8));
        }
        else
        {if(hour==12)
            System.out.println(s.substring(0,8));
        else
        { hour+=12;
            System.out.println(hour+minsec);
        }
        }



        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}