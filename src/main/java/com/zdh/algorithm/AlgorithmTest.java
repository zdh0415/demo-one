package com.zdh.algorithm;

public class AlgorithmTest
{

	public static void main(String[] args)
	{
		int size = 5;
		for (int i = 1; i <= size/2 + 1; i++)
		{
			for (int j = size/2 + 1; j > i; j--)
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <= 2*i - 1; k++)
			{
				if (k == 1 || k == 2*i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		for (int i = size/2; i > 0; i--)
		{
			for (int j = size/2; j >= i; j--)
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <= 2*i - 1; k++)
			{
				if (k == 1 || k == 2*i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
