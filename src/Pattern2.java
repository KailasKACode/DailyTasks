import java.util.Scanner;

public class Pattern2
{
public static void main(String[] args)
{
  System.out.println("Enter value to display");
  Scanner sc=new Scanner(System.in);
  int k=sc.nextInt();  
  for(int j=1;j<=k;j++)
{
	for(int i=1; i<=j;i++)
	{
		System.out.print("  "+j);
	}
	System.out.println();
}
}

}
//Enter value to display
//
//5
//  1
//  2  2
//  3  3  3
//  4  4  4  4
//  5  5  5  5  5

