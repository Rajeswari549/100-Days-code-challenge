package com.DSA;

class Nodes {
	int val;
	Nodes next;

	public Nodes(int val) {
		this.val = val;
		this.next = null;

	}

}

class SLL {
	private Nodes root;

	public SLL() {
		this.root = null;

	}

	public void addNode1(int val) {
		Nodes n = new Nodes(val);
		if (this.root == null) {
			this.root = n;
			return;
		}
		Nodes temp = this.root;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
	}

	public void AddNthNode1(int val, int pos) {

		Nodes n = new Nodes(val);
		if (pos == 1) {
			n.next = root;
			root = n;
			return;
		}
		Nodes temp = this.root;
		int count = 1;
		while (temp != null && count < pos) {

			temp = temp.next;
			count++;

		}
		if (temp == null) {
			System.out.println("Position out of range");
			return;
		}
		n.next = temp.next;
		temp.next = n;

	}

	public void Display() {
		if (this.root == null)
			return;
		Nodes temp = root;
		while (temp != null) {
			System.out.print(temp.val + " ->");
			temp = temp.next;
		}
		System.out.println("null");
	}
}

public class InsertNthNodeInSLL {

	public static void main(String[] args) {
		SLL d = new SLL();
		d.addNode1(100);
		d.addNode1(200);
		d.addNode1(300);
		d.addNode1(400);
		d.addNode1(500);
		d.Display();
		System.out.println("inserting node at postion 1 :");
		d.AddNthNode1(600, 1);
		d.Display();

	}

}
