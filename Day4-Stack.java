package com.DSA;

class MyStack {
	private int top;
	private int capacity;
	private int[] stack;

	public MyStack(int capacity) {
		this.capacity = capacity;
		top = -1;
		stack = new int[capacity];
	}

	public void push(int element) {
		if (top == capacity - 1) {
			System.out.println("stack overflow");
			return;
		}
		stack[++top] = element;
		System.out.println("elemnet is inserted" + element);
	}

	public int pop() {

		if (isEmpty()) {
			System.out.println("stack is underflow");
			return -1;
		}
		int element = stack[top--];
		return element;

	}

	private boolean isEmpty() {
		return top == -1;
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("stack is empty");
		}
		int ele = stack[top];
		System.out.println(ele);

	}

	public void display() {

		if (isEmpty()) {
			System.out.println("stack is empty");
		}
		for (int i = 0; i <= top; i++) {
			System.out.println(stack[i] + " ");
		}
		System.out.println();
	}

//	public boolean isEmpty1() {
//		if (top == -1) {
//			return true;
//		} else {
//			return false;
//		}
//
//	}
//
//	public boolean isFull() {
//		if (top == capacity - 1) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	public boolean isEmpty1() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public int size() {
		if (isEmpty()) {
			System.out.println("satck is empty");
			return 0;
		}
		return top + 1;

	}
}

public class Stack {

	public static void main(String[] args) {

		MyStack m = new MyStack(5);
		m.push(100);
		m.push(200);
		m.push(300);
		m.push(400);
		m.push(500);
		m.display();
		m.pop();
		System.out.println("afer");
		m.display();
		System.out.println(m.isFull());
		System.out.println(m.isEmpty1());

	}

}
