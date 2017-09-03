package com.zdh.algorithm;

import java.util.Random;

public class HighArray
{ // 37页
	private long[] a;

	private int nElems;

	public HighArray(int max)
	{
		a = new long[max];
		nElems = 0;
	}

	public static void main(String[] args)
	{
		// int max = 5;
		// HighArray ha = new HighArray(max);
		// for(int i = 0; i < max; i++) {
		// long temp = (long) (Math.random()*1000);
		// ha.insert(temp);
		// }
		// ha.display();
		// System.out.println("=============================================================================");
		// ha.maoPaoSort();
		// System.out.println("=============================================================================");
		// ha.display();

		int max = 6;
		HighArray ha2 = new HighArray(max);
		ha2.insert(10);
		ha2.insert(30);
		ha2.insert(20);
		ha2.insert(40);
		ha2.insert(1);
		ha2.insert(-1);

		ha2.display();
		System.out.println(
				"===========================================================================================");
		ha2.insertSort();
		System.out.println(
				"===========================================================================================");
		ha2.display();
	}

	public boolean find(long searchKey)
	{
		int j;
		for (j = 0; j < nElems; j++)
		{
			if(a[j] == searchKey)
			{
				break;
			}
		}

		if(j == nElems)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public void insert(long value)
	{
		a[nElems] = value;
		nElems++;
	}

	public void insertAndOrder(long value)
	{
		int j;
		for (j = 0; j < nElems; j++)
		{
			if(a[j] > value)
			{// 当新增的值小于原数组中的某个值时
				break;
			}
		}

		// 从后往前倒序
		for (int k = nElems; k > j; k--)
		{
			a[k] = a[k - 1];// 将原数组中元素依次向后移，直到j位置
		}

		a[j] = value;// 向j位置插入新增的元素
		nElems++;
	}

	public boolean delete(long value)
	{
		int j;
		for (j = 0; j < nElems; j++)
		{
			if(value == a[j])
			{
				break;
			}
		}
		if(j == nElems)
		{
			return false;
		}
		else
		{
			for (int k = j; k < nElems - 1; k++)
			{
				a[k] = a[k + 1];
			}
			nElems--;
			return true;
		}
	}

	public void display()
	{
		for (int i = 0; i < nElems; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public void display(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public int[] sort(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i; j < a.length; j++)
			{
				int num;
				if(a[i] > a[j])
				{
					num = a[i];
					a[i] = a[j];
					a[j] = num;
				}
			}
		}
		return a;
	}

	public long[] sort()
	{
		for (int i = 0; i < nElems; i++)
		{
			for (int j = i; j < nElems; j++)
			{
				long num;
				if(a[i] > a[j])
				{
					num = a[i];
					a[i] = a[j];
					a[j] = num;
				}
			}
		}
		return a;
	}

	public int size()
	{
		return nElems;
	}

	public int findTwoSpect(long searchKey, int num)
	{
		int lowerBound = 0;
		int uperBound = nElems - 1;
		int curIn;
		while (true)
		{
			num++;
			curIn = (lowerBound + uperBound) / 2;
			if(a[curIn] == searchKey)
			{
				System.out.println("比较的次数为：" + num);
				return curIn;
			}
			else if(lowerBound > uperBound)
			{
				return nElems;
			}
			else
			{
				if(a[curIn] < searchKey)
				{
					lowerBound = curIn + 1;
				}
				else
				{
					uperBound = curIn - 1;
				}
			}
		}
	}

	public int findTwoSpect2(long searchKey)
	{
		int lowerBound = 0;
		int uperBound = nElems - 1;
		int curIn = (lowerBound + uperBound) / 2;
		for (int i = 0; i < curIn; i++)
		{
			curIn = (lowerBound + uperBound) / 2;
			if(a[curIn] == searchKey)
			{
				return curIn;
			}
			else if(lowerBound > uperBound)
			{
				return nElems;
			}
			else
			{
				if(a[curIn] < searchKey)
				{
					lowerBound = curIn + 1;
				}
				else
				{
					uperBound = curIn - 1;
				}
			}
		}
		return 0;
	}

	/**
	 * 功能描述：冒泡排序. 实现思路：将数组中最大的元素通过比较，向右移动；
	 * 特点： 每次执行比较时，数组右边已经排好序的数据不会再发生位置变化
	 * 
	 * @return long[]
	 * @author ZDH
	 * @date 2017年6月30日 下午10:44:14 @修改日志：
	 */
	public long[] maoPaoSort()
	{
		int out;
		int in;
		for (out = nElems - 1; out > 1; out--)
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
					display();
				}
			}
		}
		return a;
	}

	/**
	 * 功能描述：选择排序. 实现思路：数组左边元素大于右边元素时，将右边元素下标给左边元素，直到左边元素为最小元素，
	 * 跳出内层循环，并将两个元素交换位置;
	 * 外层循环控制比较次数
	 * 特点：数组左侧已经排好序的元素位置不会发生变化
	 * @return long[]
	 * @author ZDH
	 * @date 2017年7月8日 下午8:00:01 @修改日志：
	 */
	public long[] selectSort()
	{
		int out, in, min;
		for (out = 0; out < nElems - 1; out++)
		{
			min = out;
			for (in = out + 1; in < nElems; in++)
			{
				if(a[in] < a[min])
				{
					min = in;
				}
				System.out.println("外循环次数为：" + out + "; 内循环次数为：" + in
						+ "; 最小值所在位置 ：" + min);
			}
			long temp = a[out];
			a[out] = a[min];
			a[min] = temp;
			display();
		}
		return a;
	}

	/**
	 * 功能描述：插入排序.
	 * 选定数组中某一元素，当左边元素大于这一元素时，将左边元素右移，直到左边元素小于等于该元素，
	 * 将该元素与其左侧数据交换;
	 * 特点：数组左侧已经排好序的元素不会发生变动;
	 * @return long[]
	 * @author ZDH
	 * @date 2017年7月8日 下午8:09:01 @修改日志：
	 */
	public long[] insertSort()
	{
		int in, out;

		for (out = 1; out < nElems; out++)
		{
			in = out;
			long temp = a[out];
			while (in > 0 && a[in - 1] >= temp)
			{
				a[in] = a[in - 1];
				--in;
				System.out.println("out : " + out + ";  in : " + in);
				display();
			}
			a[in] = temp;
		}

		return a;
	}
}
