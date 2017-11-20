import java.util.*;
public class Pyramid{
public static void main(String args[])
{
int i,j,k,l,m;
for(i=1;i<=4;i++){
for(j=4-i;j>0;j--){
System.out.print(" ");
}
for(k=1;k<=i;k++){
System.out.print(""+i);
}
for(l=1;l<i;l++){
System.out.print(""+i);
}
for(m=3;m>=i;m--){
System.out.print(" ");
}System.out.println("");
}
}
} 