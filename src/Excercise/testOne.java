package Excercise;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class testOne {
	@Test
	public void One ()
	{
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("kabongo");
		arr.add("mbaya");
		arr.add("sifl");
		arr.add("simon");
		arr.add("stian");
		int count =0;
		for (int i=0; i<arr.size();i++)
		{
			String contains =arr.get(i);
			if(contains.startsWith("s"))
			{
				count++;
			}
		}
		System.out.println(count);

	}
	public void two()
	{
		System.out.println("KM");
	}
	public void three()
	{
		System.out.println("Mbaya");
	}
	public void four()
	{
		System.out.println("George");
	}

}
