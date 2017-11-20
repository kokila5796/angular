import java.io.*;

import java.util.*;

public class EvenNos {
  
 public static void main(String args[] ) throws Exception {

int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

int i,j,d=0;
for(i=0;i<=3;i++)

{

    for(j=0;j<=3;j++)
  
  {

        if(a[i][j]%2==0)
    
    {

           
                if(d>0){
 
               System.out.print(" ");    
 
               }
     
           d++;
     
           System.out.print(""+a[i][j]);
   
         
         

        }
    

       
    }

}
 
  }

}
