
public class DoubleListNode<T> {
	
	private T payload;
	private DoubleListNode<T> nextNode;
	private DoubleListNode<T> previousNode;
	
	public DoubleListNode(T payloads){
		payload = payloads;
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}

	public DoubleListNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoubleListNode<T> nextNode) {
		this.nextNode = nextNode;
	}

	public DoubleListNode<T> getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(DoubleListNode<T> previousNode) {
		this.previousNode = previousNode;
	}
	
	
	
}
