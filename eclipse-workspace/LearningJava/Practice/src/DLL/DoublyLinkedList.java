package DLL;

public class DoublyLinkedList { 
	       class Node{  
	       int data;  
	        Node previous;  
	        Node next;  
	       public Node( int data) {  
	            this.data = data;  
	        }  
	    }  
	    Node head, tail = null;      
	   public void addNode(int data) {  
	                Node newNode = new Node(data); 
	        if(head == null) {  
	            head = tail = newNode;  
	            head.previous =null;  
	            tail.next = null;  
	        }  
	       else{  
	            tail.next = newNode;  
	 newNode.previous = tail;  
	            tail = newNode;   
	            tail.next = null;  
	        }  
	    } 
	   public void display() {  
	        Node current = head;  
	       if(head ==null) {  
	            System.out.println("Empty list");  
	           return;  
	        }  
	        System.out.println("Enter the nodes");  
	      while(current !=null) { 
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }  
	    }
	   public void delete(int data) {
		   Node current = head;
		   if(current==null) {
			   return;
		   }
		   if(current.data==data) {
			   head = current.next;
		   }
		   while(current!=null&&current!=data) {
			   prev = current;
			   current = current.next;
		   }
		   
	   }
	   
	   public void delete(Node node) {
		   Node current = head;
		   if(current==null||node == null) {
			  System.out.println("Its null");  
		   }
		   if(current == node) {
			   	head = current.next;
		   }
		   if(node.next!=null) {
			   node.next.prev=node.next;
		   }
		   if(node.prev!=null) {
			   node.previous.next=node.prev;
		   }
		                
	   }
	public static void main(String[] args) {   
	        DoublyLinkedList dList = new DoublyLinkedList(); 
	        dList.addNode(1);  
	        dList.addNode(2);  
	        dList.addNode(3);  
	        dList.display();  
	    }  
	}  


