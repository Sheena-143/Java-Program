class Armstrong 
{
public static void main(String args[])
{
int n=153,rem,resualt=0,num=n;
while (n>0)
{
rem=n%10;
resualt=resualt+(rem*rem*rem);
n=n/10;
}
if (num==resualt)
{
System.out.print("No is Armstrong");
}
else
{
System.out.print("No is not Armstrong");
}
}
}