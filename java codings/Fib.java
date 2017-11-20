import java.util.*;
class Fib
{
public static void main(String args[])
{
int c,i,count=20;
System.out.println("enter a and b:");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();

for(i=2;i<count;i++)
{
c=a+b;
System.out.println("result is:"+c);
a=b;
b=c;
}
}
}