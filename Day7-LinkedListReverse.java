package com.DSA;

class Node {

	int val;
	Node next;

	public Node(int val) {
		this.val = val;
		this.next = null;
	}
}

class SingleLinkedList {
	private Node root;

	public SingleLinkedList() {
		this.root = null;
	}


	public void AddNode(int val) {
		Node n = new Node(val);

		if (this.root == null) {
			this.root = n;
			return;
		}
		Node temp = root;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
	}

	public void Display() {
		if (this.root == null)
			return;
		Node temp = root;
		while (temp != null) {
			System.out.print(temp.val + " ->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void Reverse() {
		Node prev = null;
		Node temp = root;
		Node next = null;

		while (temp != null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		root = prev;
	}
}

public class LinkedList {

	public static void main(String[] args) {
		SingleLinkedList s = new SingleLinkedList();
		s.AddNode(10);
		s.AddNode(20);
		s.AddNode(30);
     	s.Display();
		s.Reverse();
		s.Display();

	}

}

