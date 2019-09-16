public class Pattern
{
	public static void main(String[] args)
	{
		
for(int i=0;i<=5;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print(" * ");
	}
	System.out.println(" ");
}
for(int t=0;t<=4;t++)
{
	for(int r=4;r>=t;r--)
	{
		System.out.print(" * ");
	}
	System.out.println(" ");
}
	
	
	}
}

////output
//* 
//*  * 
//*  *  * 
//*  *  *  * 
//*  *  * 
//*  * 
//* 
