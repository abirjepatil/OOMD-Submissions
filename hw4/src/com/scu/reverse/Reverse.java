package com.scu.reverse;

import static org.junit.Assert.assertEquals;

public class Reverse {
	
	public void reverse(char[] array)
	{
		int len=array.length-1;
		System.out.println(len);
		
		for(int i=0;i<(array.length/2);i++)
		{
			
			
			
			char temp = array[i];
			array[i] = array[len];
			array[len] = temp;
			len--;
		}
	
		
		System.out.println(array);
	}

	
	
	public static void main(String[] args)
	{
		
		
		Reverse rev = new Reverse();
		String aString = "7812";
		char[] c = aString.toCharArray();
		rev.reverse(c);
		
		
		
	}
}
