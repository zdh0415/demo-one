package com.zdh.stack;

import java.util.Stack;

public class StackX<E>
{
	
	public static void main(String[] args) {
		StackX<Long> sx = new StackX(5);
		
		sx.push(5l);
		sx.push(10l);
		sx.push(3l);
		sx.push(8l);
		sx.push(12l);
		
		System.out.println(sx.top);
		
		while(!sx.isEmpty()) {
			long value = sx.pop();
			System.out.print(value + "\t");
		}
		System.out.println();
		
		
		
		Stack<Integer> sk = new Stack<Integer>();
		sk.push(10);
		sk.push(2);
		sk.push(4);
		sk.push(6);
		sk.push(12);
		
		while(!sk.isEmpty()) {
			int value = sk.pop();
			System.out.print(value + "\t");
		}
		System.out.println();
		
		
	}

	private int maxSize;
	
	private E[] stackArray;
	
	private int top;
	
	/**
	 * 构造方法根据参数规定的容量创建一个新栈。
	 * 注意：由于栈是由数组实现的，因此需要先规定栈的大小。但是如果使用链表来实现栈，就不需要先规定栈的容量
	 * @param s
	 */
	public StackX(int s) {
		this.maxSize = s;
		stackArray = (E[]) new Object[maxSize];
		top = -1;
	}
	
	/**
	 * 功能描述：压栈
	 * 将top值增加一，使它指向原顶端数据项上面的一个位置，并在这个位置上存储一个数据项。
	 * top在插入数据项之前是递增的
	 * @param lo void
	 * @author ZDH
	 * @date 2017年7月15日 下午9:09:21
	 * @修改日志：
	 */
	public void push(E lo) {
		stackArray[++top] = lo;
	}
	
	/**
	 * 功能描述：返回top标识的数据项值，然后top减一。
	 * 这个方法有效的从栈中移除了数据项，虽然数据项仍存在数组中（直到有新的数据项压入栈中覆盖这个数据项），但不能再访问它了
	 * @return long
	 * @author ZDH
	 * @date 2017年7月15日 下午9:09:55
	 * @修改日志：
	 */
	public E pop() {
		return stackArray[top--];
	}
	
	/**
	 * 功能描述：
	 * @return E
	 * @author ZDH
	 * @date 2017年7月15日 下午9:29:29
	 * @修改日志：
	 */
	public E peek() {
		return stackArray[top];
	}
	
	/**
	 * 功能描述：判断是否为空
	 * @return boolean
	 * @author ZDH
	 * @date 2017年7月15日 下午9:10:28
	 * @修改日志：
	 */
	public boolean isEmpty() {
		return (top == -1);
	}
	
	/**
	 * 功能描述：判断栈是否已满
	 * @return boolean
	 * @author ZDH
	 * @date 2017年7月15日 下午9:10:42
	 * @修改日志：
	 */
	public boolean isFull() {
		return (top == maxSize - 1);
	}
}
