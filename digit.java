import java.util.*;
class digit
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int sum=0,n=s.nextInt();
while(n>0)
{
int a=n%10;
sum=sum+a;
n=n/10;
}
System.out.print(sum);
}
}
