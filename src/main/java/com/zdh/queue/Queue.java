package com.zdh.queue;

public class Queue<E>
{
	private int maxSize;

	private E[] queArray;

	private int front; // 队头

	private int rear; // 队尾

	private int nItems;// 队列中当前数据项个数

	/**
	 * 该方法运行的前提条件是队列不满；通常需要先调用isFull()方法并且返回false后，才调用insert()方法。
	 * 更通用的做法是在insert()方法中加入检查队列是否满的判定，如果出现向已满队列里插入数据项的情况就抛出异常。
	 * 
	 * @param s
	 */
	public Queue(int s)
	{
		maxSize = s;
		queArray = (E[]) new Object[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(E e)
	{
		if(rear == maxSize - 1)
		{
			rear = -1;
		}
		queArray[++rear] = e;
		nItems++;
	}

	public E remove()
	{
		E temp = queArray[front++];
		if(front == maxSize)
		{
			front = 0;
		}
		nItems--;
		return temp;
	}

	public E peekFront()
	{
		return queArray[front];
	}

	public boolean isEmpty()
	{
		return nItems == 0;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
	
	public int size() {
		return nItems;
	}
}
