/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

int n=5,i,fact=1;
for(n=1;n<=5;n++)
{
    fact=n*fact;
}

System.out.println(fact);
   }
}
