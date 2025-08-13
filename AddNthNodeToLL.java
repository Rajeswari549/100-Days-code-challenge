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

	// the same code will work deletelast node also
	public void DeleteNthNode(int pos) {

		if (this.root == null) {
			System.out.println("list is empty");
		}
		Nodes temp = this.root;
		int count = 1;
		while (temp != null && count < pos - 1) {
			temp = temp.next;
			count++;
		}

		if (temp == null || temp.next == null) {
			System.out.println("position out of boundrange");
			return;
		}
		temp.next = temp.next.next; // here skipping node

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

	public void deleteFirstNode(int pos) {
		if (this.root == null) {
			System.out.println("empty");
		}

		if (pos == 1) {
			root = root.next;
			return;
		}
	}

	public void MiddleNode()

	{

		if (this.root == null) {
			System.out.println("list is empty");
			return;
		}
		Nodes temp = this.root;
		Nodes slow = this.root;
		Nodes fast = this.root;
		while (fast != null && fast.next != null) {

			fast = fast.next.next;
			if (fast != null && fast.next != null) {
				slow = slow.next;
			}

		}
		if (fast == null)

		{
			System.out.println("middle nodes is: " + slow.val + " and " + slow.next.val); // here even middleodd length
//			System.out.println("middle nodes is: " + slow.next.val);                        //here odd middle length 
		} else {
			System.out.println("middle nodes is: " + slow.next.val);
		}
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
//		d.AddNthNode1(600, 1);
		d.Display();
//		d.MiddleNode();
		d.DeleteNthNode2Pointers(5);
		d.Display();
//		d.Display();
//		d.DeleteNthNode(5);
//		d.Display();
//		d.deleteFirstNode(1);
//		d.Display();

	}
}
