/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
public class CandidateCode {
     
   public static void main(String args[] ) throws Exception {
       int a[]={97,78,-41,-42,99,-87};
     int i,j,k,b=0,c=0;
    b=a[0];
    for(i=0;i<=5;i++)
    {
        if(b<a[i])
        {
            b=a[i];
        }
    }
     c=-a[0];
    for(j=0;j<=5;j++)
    {
        if(-c<-a[j])
        {
            c=a[j];
        }
    }
    System.out.println(b);
}

   }

