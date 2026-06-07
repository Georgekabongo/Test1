package Excercise;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i =10; i>0; i--)
		{
		
			for (int k=1; k <=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//
		for (int i =1; i<10; i++)
		{
		
			for (int k=1; k <=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		System.out.println("");
		for (int i =0; i<=10; i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("#");
			}
			System.out.println("");
		}
		//upper Pyramid
		int number =10;
		for (int i=1; i<number;i++)
		{
			//print the space
			for(int j=1;j<=number-i;j++)
			{
				System.out.print(" ");
			}
			//print the stars
			for (int k=1; k <=(2*i-1);k++ )
			{
				System.out.print("*");
			}
			
			System.out.println();	
					
		}
		//lower pyramid
		
		for (int i=number-1; i>=0; i--)
		{
			//print the space
			for (int j=number;j>=i+1; j--)
			{
				System.out.print(" ");
			}
			//print the stars
			for (int k=1; k <=(2*i-1);k++ )
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
	}

}
