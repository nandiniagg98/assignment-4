import java.util.Scanner;
class Even
{
public static void main(String args[])
{
int n,i;
System.out.print("enter number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=2;i<=n;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}
