import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// instantiate BufferedReader class, and be able to use readLine() method
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// creates an object of LinkedList
		LinkedList list = new LinkedList();
		
		// stores the choice made by the user
		int input;
		
		// loops until user choose to exit
		while (true) {	
			// prints the choices available
			System.out.println("\nOPTIONS:");
			System.out.println("1 - Display linked list");
			System.out.println("2 - Add node");
			System.out.println("3 - Delete node");
			System.out.println("4 - Count nodes");
			System.out.println("5 - Insert node");
			System.out.println("0 - EXIT\n");
			
			// prompt the user to input option
			System.out.print("Enter choice : ");
			input = Integer.parseInt(reader.readLine());
			
			// execute the code block that pass the condition
			if (input == 1) {
				// displays the nodes in the list
				list.displayList();
			} else if (input == 2) {
				// prompts the user to enter new node value
				System.out.print("Enter node value: ");
				int number = Integer.parseInt(reader.readLine());
				
				// append the new node in the list
				list.addNode(new Node(number));
			} else if (input == 3) {
				// prompts the user to enter node position - starts at 1
				System.out.print("Enter node position to delete: ");
				int position = Integer.parseInt(reader.readLine());
				
				// deletes the node in specified position
				list.deleteNode(position);
			} else if (input == 4) {
				// displays the total number of nodes in list
				System.out.println("Total number of nodes in the linked list: " + list.length());
			} else if (input == 5) {
				// prompts the user to enter new node value and the position to insert
				System.out.print("Enter node value: ");
				int number = Integer.parseInt(reader.readLine());
				System.out.print("Enter node position to insert: ");
				int position = Integer.parseInt(reader.readLine());
				
				// insert new node in the specified position
				list.insertNode(new Node(number), position);
			} else  if (input == 0){
				// displays the message and breaks the loop
				System.out.println("Exited Successfully.");
				break;
			} else {
				// displays if user inputs a non-existing option
				System.out.println("Invalid choice! Please try again.");
			}
		}
	}

}
