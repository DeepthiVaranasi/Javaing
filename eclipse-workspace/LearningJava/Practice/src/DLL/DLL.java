package DLL;

class Node{
	int data;
	Node prev;
	Node next;
	Node(int d){
		data = d;
	}
}

 class DLL{
	 void push(int d) {
		 Node n = new Node(d);
		 n.prev = null;
		 n.next = head.prev;
		 
	 }

 }
	

}
