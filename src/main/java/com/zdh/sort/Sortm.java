package com.zdh.sort;

public class Sortm
{
	
	public static void main(String[] args) {
		Sortm sm = new Sortm();
		int[] a = {3,4,5,2,1};
		a = sm.selectSort(a);
		sm.display(a);
	}
	
	public long[] maoPaoSort(long[] a)
	{
		int out;
		int in;
		for (out = a.length - 1; out > 0; out--)
		{
			for (in = 0; in < out; in++)
			{
				long temp;
				if(a[in] > a[in + 1])
				{
					temp = a[in];
					a[in] = a[in + 1];
					a[in + 1] = temp;
					System.out.println("外循环次数为：" + out + "; 内循环次数为：" + in);
				}
			}
		}
		return a;
	}
	

	public int[] maoPao(int[] t) {
		for (int i = t.length - 1; i > 0; i--)
		{
			for (int j = 0; j < i ; j++)
			{
				int temp;
				if (t[j] > t[j + 1]) {
					temp = t[j];
					t[j] = t[j + 1];
					t[j + 1] = temp;
				}
			}
		}
		return t;
	}
	
	public void display(int[] t) {
		for (int i = 0; i < t.length; i++)
		{
			System.out.print(t[i] + "\t");
		}
		System.out.println();
	}
	
	public void display(long[] t) {
		for (int i = 0; i < t.length; i++)
		{
			System.out.print(t[i] + "\t");
		}
		System.out.println();
	}
	
	
	public int[] insertSort(int[] nums) 
	{
		int anyone;
		for (anyone = 1; anyone < nums.length; anyone++)
		{
			int temp = nums[anyone];
			while (anyone > 0 && nums[anyone - 1] > temp) {
				nums[anyone] = nums[anyone - 1];
				anyone--;
			}
			nums[anyone] = temp;
		}
		return nums;
	}
	
	
	public int[] selectSort(int[] nums)
	{
		for (int i = 0; i < nums.length - 1; i++)
		{
			int min = i;
			for (int j = i + 1; j < nums.length; j++)
			{
				if (nums[min] > nums[j]) {
					min = j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[min];
			nums[min] = temp;
		}
		return nums;
	}
}
