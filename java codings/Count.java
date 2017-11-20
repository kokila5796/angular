/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   
   public static void main(String args[] ) throws Exception {
 int a[]={-112,-119,2000,100,-888,-668,446};
    int i,b=0,count=0;
	for(i=0;i<=6;i++)
	{
	   b=-a[i]; 
	    if(b>100 && b<2000)
	    {
	      count++;  
	    }
	}
System.out.println(count);
   }
}
