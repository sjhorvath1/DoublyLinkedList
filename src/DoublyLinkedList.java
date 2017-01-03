
public class DoublyLinkedList<T> {
	private DoubleListNode<T> head;
	private DoubleListNode<T> tail;
	private int numObjects;
	
	public DoublyLinkedList(){
		head = null;
		tail = null;
		numObjects = 0;
	}
	
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
	
	public void addBack(T addElement){
		DoubleListNode<T> addNode = new DoubleListNode<T>(addElement);
		if(numObjects == 0){
			head = tail = addNode;
			numObjects++;
		}
		else{
			tail.setNextNode(addNode);
			addNode.setPreviousNode(tail);
			tail = addNode;
			numObjects++;
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
}
