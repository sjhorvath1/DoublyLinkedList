
public class DoublyLinkedList<T> {
	private DoubleListNode<T> head;
	private DoubleListNode<T> tail;
	private int numObjects;
	
	public DoublyLinkedList(){
		head = null;
		tail = null;
		numObjects = 0;
	}
	
	//Adds an element to the front of the list
	public void addFront(T addElement){
		DoubleListNode<T> addNode = new DoubleListNode<T>(addElement);
		if(numObjects == 0){
			head = tail = addNode;
			numObjects++;
		}
		else{
			head.setPreviousNode(addNode);
			addNode.setNextNode(head);
			head = addNode;
			numObjects++;
		}
	}
	
	/*Adds an element to the back of the list
	Use cases - 
	1) empty list
	2) one item in list
	*/
	public void addBack(T addElement){
		DoubleListNode<T> addNode = new DoubleListNode<T>(addElement);
		//Empty list
		if(numObjects == 0){
			head = tail = addNode;
			numObjects++;
		}
		//mulitple items in list
		else{
			tail.setNextNode(addNode);
			addNode.setPreviousNode(tail);
			tail = addNode;
			numObjects++;
		}
	}
	
	//Searches for a node containing given element called searchElement, 
	//and adds a node created with addElement after that node.
	public void addSearch(T addElement, T searchElement){
		DoubleListNode<T> addNode = new DoubleListNode<T>(addElement);
		if(numObjects == 0){
			System.out.println("Empty list, node with given search element not found.");
			return;
		}
		else if(numObjects == 1){
			DoubleListNode<T> currentNode = head;
			if(currentNode.getPayload() == searchElement){
				System.out.println("Node with given search element found!");
				addBack(searchElement);
			}
			else{
				System.out.println("Node with given search element not found.");
				return;
			}
		}
		else{
			DoubleListNode<T> currentNode = head;
			while((currentNode.getPayload() != searchElement) && currentNode.getNextNode() != null){
				currentNode = currentNode.getNextNode();
			}
			if(currentNode.getPayload() == searchElement){
				if(currentNode.getNextNode() == null){
					addBack(currentNode.getPayload());
				}
				else{
					DoubleListNode<T> tempNode = currentNode.getNextNode();
					currentNode.setNextNode(addNode);
					addNode.setNextNode(tempNode);
				}
			}
		}	
	}

	public T getFirst() {
		return head.getPayload();
	}

	public T getLast() {
		return tail.getPayload();
	}
	
	public int getLength() {
		return numObjects;
	}

	public T getElementAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
