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

	public void SearchNode(int ele) {

		Node temp = this.root;
		int pos = 1;
		boolean isfound = false;
		while (temp != null) {
			if (ele == temp.val) {
				System.out.println("the ele found at position " + pos);
				isfound = true;
				break;
			}
			temp = temp.next;
			pos++;

		}
		if (!isfound) {
			System.out.println("not found");
		}

	}

	public void FindNthNode(int n) {

		Node temp = this.root;
		int count = 1;
		while (temp != null) {
			if (count == n) {
				System.out.println("value found" + temp.val);
				return;
			}
			temp = temp.next;
			count++;
		}

	}

	public void AddNthNode(int val, int pos) {
		Node n = new Node(val);
		Node temp = this.root;
		int count = 1;
		while (temp != null && count < pos) {

			temp = temp.next;
			count++;

		}
		n.next = temp.next;
		temp.next = n;
		temp = n;

	}

	public void NewAdd() {
		Node n = new Node(500);
		n.next = root;
		root = n;

	}

	public void last() {
		Node n = new Node(100);
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
//		s.Display();
//		s.NewAdd();
//		s.Display();
//		s.last();
		s.Display();
		s.Reverse();
//		s.AddNthNode(335, 2);
		s.Display();
//		s.FindNthNode(2);
//		s.SearchNode(10);
//		s.SearchNode(200);
	}

}
