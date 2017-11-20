import java.io.*;

import java.util.*;

public class Odd {

  public static void main(String args[] ) throws Exception {


int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

int i,j,n=0,count=0;

for(i=0;i<=3;i++)

{

    for(j=0;j<=3;j++)
  
  {

        if(a[i][j]%2==0)
  
      {
        
    n=0;
     
   }
    
 
       else
      
  {
        
    count++;
      
  }
   
 }

}

System.out.println(""+count);
   
}

}
