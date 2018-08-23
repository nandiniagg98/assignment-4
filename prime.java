import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
int n,j,i;
int flag;
System.out.print("enter number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
flag=0;
for(j=2;j<i/2;j++)
{
if(i%j==0)
{
flag=1;
break;
}
}
if(flag==0&&i!=1)
{
System.out.println(i+"\n");
}
}
}
}
