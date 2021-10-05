
public class LinkedList {

	// to access the last element in a LinkedList
	// we need to travel each node until we get to the last node.
	
	// head - first node in the linked list - when object is declared and not created its value is null
	private Node head;
	
	// getters and setters of head/first node
	public Node getHead() {
		return head;
	}
	
	public void setHead(Node head) {
		this.head = head;
	}
	
	// methods
	// displays each nodes' data through loop
	public void displayList() {
		if (head == null) {
			// display this if head is null - means linked list is empty
			System.out.println("The linked list is empty.");
		} else {
			// set head as currentNode
			Node currentNode = head;
			
			System.out.print("Numbers in linked list: ");
			
			// currentNode and not currentNode.getNext() - so that it'll also print the last node's value
			while (currentNode != null) {
				System.out.print(currentNode.getData() + " ");
				currentNode = currentNode.getNext();
			}
			
			// new line (for spacing)
			System.out.println();
		}
	}	
		
	// appends new node in the linked list
	public void addNode(Node node) {
		// when linked list has no nodes yet, assign first node as head
		if (head == null) {
			head = node;
		} else {
			// set first node as currentNode
			Node currentNode = head; 
			
			// move currentNode to next node repeatedly, until its next is null
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			
			// once current node is the last node, link new node to last node's next
			currentNode.setNext(node);
		}
		
		// prints the message
		System.out.println("Node was successfully added.");
	}
	
	// removes node located at specified position
	public void deleteNode(int position) {
		// stores the number of nodes in list
		int size = length();
		
		// display error message if position is not valid or if linked list is empty
		if (position < 1 || position > size || size == 0) {
			System.out.println("Position is not existing.");
			return;
		}
		
		// store old head to temp, and move head to next node, if position = 1
		if (position == 1) {
			Node temp = head;
			head = head.getNext();
			// remove the old head from the memory 
			temp = null;
		} else {
			// set the head as the previous node
			Node prevNode = head;	
			// initialize it with 2, as we'll delete node in position > 1
			int count = 2;
			
			// loop until count is equal to position
			while (count < position) {
				// move prevNode to next node and increment count
				prevNode = prevNode.getNext();
				count++;
			}
			
			// store the node to be deleted in temp
			Node temp = prevNode.getNext();
			// link the next node of the node to be deleted to prevNode 
			prevNode.setNext(temp.getNext());
			// remove the unlinked node to the memory
			temp = null;
		}
		
		// prints the message
		System.out.println("Node in position " + position + " was successfully deleted.");
	}
	
	// count and returns the number of nodes in linked list
	public int length() {
		// store head to currentNode - so we loop changing the currentNode without losing the head
		Node currentNode = head;
		// counter of nodes
		int count = 0;
		
		// increments count and move currentNode to next node repeatedly, until its next is null
		while(currentNode != null) {
			count++;
			currentNode = currentNode.getNext();	
		}
		
		// returns node count
		return count;
	}
	
	// adds/inserts the new node in a specified position
	public void insertNode(Node node, int position) {
		// stores number of nodes in list
		int size = length();
		
		// display error message if position is not valid or if linked list is empty
		if (position < 1 || position > size+1 || size == 0) {
			System.out.println("Position is not existing.");
			return;
		}
		
		// link old head to new node's next, and move head to new node, if position = 1
		if (position == 1) {
			node.setNext(head);
			head = node;
		} else {
			// set head as previous node
			Node prevNode = head;
			// initialize it with 2, as we'll insert node in position > 1
			int count = 2;
			
			// loop until count is equal to position
			while (count < position) {
				// move prevNode to next node and increment count
				prevNode = prevNode.getNext(); 
				count++;
			}
			
			// append/link new node to last node's next, if position == number of nodes + 1
			if (position == size+1) {
				prevNode.setNext(node);
			} else {
				// else, if position is within 2 and size (number of node) 
				// link next node of previous node to new node's next
				node.setNext(prevNode.getNext());
				// then, link new node to previous node - inserts new node in position
				prevNode.setNext(node);
			}
		}
		
		// prints the message
		System.out.println("Node with a value of " + node.getData() + " was successfully inserted at position: " + position);
		
	}
	
}
