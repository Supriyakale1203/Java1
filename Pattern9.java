class Pattern9
{
public static void main(String[]args)
{

for(int i=1;i<=4;i++)
{
for(int j=1;j<=4;j++)
{
if(j==1 ||j==3)
{
System.out.print("*");
}
else
{
System.out.print("1");
}

}
System.out.println();

}
}
}
/*
Output-
compile time-Success
Run time-sucess
*1*1
*1*1
*1*1
*1*1
*/