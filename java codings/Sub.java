/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {
int a[]={74,32,31,91,77,88,96,44,23};
int i,b=0,e=0,o=0,sub=0;
for(i=0;i<=8;i++)
{
    b=a[i];
    if(b%2==0)
    {
        e=e+b;
    }
    else
    {
      o=o+b;  
    }
    sub=e-o;
    
}
   System.out.println(sub);

   }
}
