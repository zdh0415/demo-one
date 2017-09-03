package com.zdh.queue;

public class QueueTwo<E>
{

	private int maxSize;
	
	private E[] queArray;
	
	private int front;
	
	private int rear;
	
	public QueueTwo(int s) {
		maxSize = s + 1;
		queArray = (E[]) new Object[s];
		front = 0;
		rear = -1;
	}
	
	public void insert(E e) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		
		queArray[++rear] = e;
	}
	
	public E remove() {
		E e = queArray[front++];
		if (front == maxSize) {
			front = 0;
		}
		return e;
	}
	
	public E peek() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (rear + 1 == front || (front + maxSize - 1 == rear));
	}
	
	public boolean isFull() {
		return (rear + 2 == front || (rear + maxSize - 2 == rear));
	}
	
	public int size() {
		if (rear >= front) {
			return rear - front + 1;
		} else {
			return (maxSize - front) + (rear + 1);
		}
	}
}
