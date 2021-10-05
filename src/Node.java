
public class Node {
	
	// Node class implements encapsulation - hiding the data and next
	// which can only be accessed by setters and getters defined in the Node class
	
	// for storing the node data (number)
	private int data;
	
	// for storing the next Node object's address (pointer)
	private Node next;
	
	// a constructor accepting no arguments to create Node with default value = 0
	public Node() {
		data = 0;
		// assign next as null, since new node has no node to point yet (next node) 
		next = null;
	}
	
	// parameterized constructor
	// assigns the data from the user to the instance variable - data 
	public Node(int data) {
		this.data = data;
		next = null;   
	}
	
	// setters and getters
	// use to assign data to a new Node
	public void setData(int data) {
		this.data = data;  
	}
	
	// returns the data of the node
		public int getData() {
			return data;
		}
	
	// use to assign the next Node object's address to current node's next
	public void setNext(Node next) {
		this.next = next; 
	}
	
	// returns the node's next - next node's address
	public Node getNext() {
		return next;
	}	
	
}
