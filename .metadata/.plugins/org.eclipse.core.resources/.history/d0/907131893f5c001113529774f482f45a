package Excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaTest {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaTest test = new JavaTest();
		test.input();
		items();

	}
	public void input()
	{
		System.out.println("enter the price");
		Scanner input = new Scanner(System.in);
		//Double  items = Double.parseDouble("20");
		//Integer item = Integer.parseInt("2");
		Double items =input.nextDouble();
		Double price = 10.0;
		Double addedvat = 2.5;
		Double total =items*price+addedvat;
		System.out.println("Total price:"+ total);
		
	}
	public static void items()
	{
		String [] arr = {"tomato","pineapple","mango","strawberry","kiwi","cherry"};
		List<String> Fruits = Arrays.asList(arr);
		//search  in the array or iterate till the end of the array
		for (int i=0;i<Fruits.size(); i++)
		{
			//int count = 0;
			String contains =Fruits.get(i);
			  
			
			//linear search  
			if(contains.equals("strawberry"))
			{
				System.out.println("thanks for the purchase of the " +""+contains +""+contains);
				break;
			}
			
		}
		int [] [] MyNumbers = { {1,4,2},{3,6,8},{2,6,7}};
		//int num [] [] = new num[3][4];
		/*System.out.println(MyNumbers[1][4]);
		System.out.println(MyNumbers.length);*/
		for (int row=0;row< 3; row++)
		{
			for (int column =0;column<MyNumbers.length;column++) 
			{
				System.out.println("MyNumbers["+ row+ "]["+column +"] = "+ MyNumbers[row][column]  );
				
			}
			
		}
		/*for (int[] row:MyNumbers)
		{
			for (int nun:row)
			{
				System.out.println(nun);
			}
		}*/
		
		int num [] [] = new int[3][4];  // normal array already specify the row and the column
	
		
		for (int i=0; i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				num[i][j]= ( int) (Math.random()*10);
				System.out.print(num [i][j] +" ");
			}
			System.out.println();
		}
		int nums [] [] = new int[3][];  //  jagged array
		nums[0]= new int [3];
		nums[1]= new int [4];
		nums[2] = new int[2];
		for (int i=0;i<nums.length;i++)
		{
			for(int j=0; j<nums[i].length;j++)
			{
				num[i][j]= ( int) (Math.random()*10);
				System.out.print(num [i][j]+" ");
			}
			System.out.println();
		
	}
		/*
		for (int n[]:nums)
		{
			for (int m:n)
			{
				System.out.print(m +" ");
			}
			
			System.out.println();
		} */
		int[][][] number = new int[4][4][3];//three dimension array
		for (int i=0;i<4;i++)
		{
			for(int j=0;j<4; j++)
			{
				//number[i][j][2]= ( int) (Math.random()*10);
				for (int k=0;k<j; k++)
				{
					number[i][j][k]= ( int) (Math.random()*10);
					System.out.print(number [i][j][k] +" ");
				}
			}
			System.out.println();
		}
	}
}
