package org.tnsif.challenges;
class Node{
	int data;
	Node next;
}
public class Element {
	Node head;
	 void push(int newdata) {
     Node newnode=new Node();
     newnode.data=newdata;
     newnode.next=head;
     head=newnode;
	
      
	}
	 void printList() {
		 Node node=head;
		 while(node!=null){
			 System.out.print(node.data);
			 node=node.next;
		 }System.out.println();
	 }
	public static void main(String[] args) {
		Element list=new Element();
		list.push(7);
		list.push(5);
		list.push(8);
		System.out.println("existed ");
		list.printList();
		list.push(3);
		System.out.println("new");
		list.printList();
	}

}
