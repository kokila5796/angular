/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

int i,c=0,b=0,j=0;
int a[]={11,22,33,44,55,66};
b=a[0];
int d[],v=0;
d=new int[a.length];
	for(i=1;i<=4;i++)
	{
	 if(b<a[i])
	 {
	     b=a[i];
	     d[v]=a[i];
	  v++;
	    }
	   }
	
j=v-1;
System.out.println(""+d[j]);
   }
}
