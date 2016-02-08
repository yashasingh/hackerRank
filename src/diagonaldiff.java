
 import java.io.*;
 import java.util.*;

 public class diagonaldiff {

 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int n= in.nextInt();

 int a[][]= new int[n][n];

 int d1=0,d2=0;

 for(int i=0;i<n;i++)
 {
 for(int j=0;j<n;j++)
 {
 a[i][j] = in.nextInt();

 if(i==j)
 d1=a[i][j];
 if((i+j) == (n-1))
 d2=a[i][j];

 }

 }

 int diff = Math.abs(d1-d2);
 //if(diff<0)
 //diff*=-1;

 System.out.println(diff);


 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
}
        }