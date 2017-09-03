package com.zdh.queue;

import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo
{
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>(5);
		
//		queue.insert(10);
//		queue.insert(20);
//		queue.insert(30);
//		queue.insert(40);
		
//		queue.remove();
//		queue.remove();
//		queue.remove();
		
//		queue.insert(50);
//		queue.insert(60);
//		queue.insert(70);
//		queue.insert(80);
//		
//		System.out.println(queue.size());
//		while(!queue.isEmpty()) {
//			Integer res = queue.remove();
//			System.out.print(res + "\t");
//		}
//		System.out.println();
		
//		java.util.Queue<Integer> q = new LinkedList<Integer>();
//		q.add(10);
//		q.add(20);
//		q.add(30);
//		q.add(40);
//		q.add(50);
//		q.add(60);
//		q.add(70);
//		q.add(80);
//		q.add(90);
//		q.add(100);
//		System.out.println(q.size());
//		while(!q.isEmpty()) {
//			Integer i = q.poll();
//			System.out.print(i + "\t");
//		}
//		System.out.println();
		
		
//		java.util.Queue<Integer> q2Integers = new ArrayBlockingQueue<Integer>(5);
		
//		q2Integers.add(10);
//		q2Integers.add(20);
//		q2Integers.add(30);
//		q2Integers.add(40);
//		q2Integers.add(50);
//		q2Integers.add(60);
//		q2Integers.add(70);
//		q2Integers.add(80);
		
//		System.out.println(q2Integers.size());
//		while(!q2Integers.isEmpty()) {
//			Integer i = q2Integers.poll();
//			System.out.print(i + "\t");
//		}
//		System.out.println();
		
		
		PriorityQueue pq = new PriorityQueue(5);
		pq.insert(50);
		pq.insert(20);
		pq.insert(10);
		pq.insert(30);
		pq.insert(40);
		
		while(!pq.isEmpty()) {
			long temp = pq.remove();
			System.out.println(temp);
		}
	}
}
