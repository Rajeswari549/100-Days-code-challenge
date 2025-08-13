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



	public void DeleteNthNode2Pointers(int pos) {

		if (root == null) {
			System.out.println("list is empty");
			return;
		}
		Nodes fast = this.root;
		Nodes slow = this.root;
		for (int i = 0; i < pos; i++) {
			if (fast == null) {
				System.out.println("position not found");
				return;
			}
			fast = fast.next;
		}
		if (fast == null) {
			root = root.next;
			return;
		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;

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

public class AddNthNodeToLL {

	public static void main(String[] args) {

		SLL d = new SLL();
		d.addNode1(100);
		d.addNode1(200);
		d.addNode1(300);
		d.addNode1(400);
		d.addNode1(500);
		d.Display();
		d.DeleteNthNode2Pointers(5);
		d.Display();


	}
}

