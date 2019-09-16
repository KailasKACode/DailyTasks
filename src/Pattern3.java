import java.util.Scanner;
public class Pattern3
{
	public static void main(String[] args)
	{
		int z=1;
        System.out.println("Enter the value");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
	      for(int j=n-1;j>=i;j--)
			{
				System.out.print("   ");
		    }
	      for(int k=1;k<=z;k++)
	      {
	    	  System.out.print(" * " );
	      }
		System.out.println();
		z++;
		}
		

}
}
//output
//            * 
//         *  * 
//      *  *  * 
//   *  *  *  * 
//*  *  *  *  * 

