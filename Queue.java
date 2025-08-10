package com.DSA;

class MyQueue {
	int capacity;
	int front;
	int rear;
	int[] queue;

	public MyQueue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
		this.rear = -1;
		this.front = 0;
	}

	public void enqueue(int ele) {
		if (isFull()) {
			System.out.println("quque is full");
			return;
		}
		queue[++rear] = ele;
		System.out.println("add the element is " + ele);

	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		int ele = queue[front++];
		return ele;
	}

	public boolean isEmpty() {
		if (front == rear)

		{
			return true;
		} else

		{
			return false;
		}

	}

	public boolean isFull() {
		if (rear == capacity) {
			return true;
		}
		return false;
	}

	public void peek()

	{
		if (isEmpty()) {
			System.out.println("queue is empty");
			return;
		}
		int ele = queue[front];
		System.out.println("front element is:" + ele);
	}

	public int size() {

		if (isEmpty()) {
			return 0;
		}
		return rear - front + 1;

	}

	public void display() {
		if (isEmpty()) {
			System.out.println("quque is empty");
			return;
		}
		for (int i = front; i <= rear; i++) {
			System.out.println(queue[i]);
		}
	}
}

public class Queue {

	public static void main(String[] args) {

		MyQueue m = new MyQueue(5);
		m.enqueue(100);
		m.enqueue(200);
		m.enqueue(300);
		m.display();
		m.dequeue();
		m.display();

	}

}
