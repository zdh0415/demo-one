package com.zdh.queue;

/**
 * 功能描述：优先级队列
 * 
 * @author ZDH
 * @date 2017年7月23日 下午2:51:42 @修改日志：
 */
public class PriorityQueue
{
	private int maxSize;

	private long[] queArray;

	private int nItems;

	public PriorityQueue(int s)
	{
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}

	public void insert(long e)
	{
		int j;
		if(nItems == 0)
		{
			queArray[nItems++] = e;
		}
		else
		{
			for (j = nItems - 1; j >= 0; j--)
			{
				if(e > queArray[j])
				{
					queArray[j + 1] = queArray[j];
				}
				else
				{
					break;
				}
			}
			queArray[j + 1] = e;
			nItems++;
		}
	}

	public long remove() {
		return queArray[--nItems];
	}
	
	public long peekMin() {
		return queArray[nItems - 1];
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
