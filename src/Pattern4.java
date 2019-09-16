public class Pattern4
{
public static void main(String[] args)
{
	int n=5;
	int z=1;
	int j;
	for(int i=1;i<=n;i++)
	{
		for(j=n-1;j>=i;j--)
		{
			System.out.print(" ");
		}
	for(int k=1;k<=z;k++)
	{
		System.out.print(" * ");
	}
	z++;
	System.out.println();
	}
}
	
}
