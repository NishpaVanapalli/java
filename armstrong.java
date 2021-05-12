import java.util.*;
class armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int t=n,sum=0,r;
while(n!=0)
{
r=n%10;
sum=sum+r*r*r;
n=n/10;
}
if(sum==t)
System.out.println("Given number "+t+" is an armstrong number");
else
System.out.println("The given number is not an armstrong number");
}
}