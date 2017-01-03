
public class DoubleListNode<T> {
	
	private T payload;
	private DoubleListNode<T> nextNode;
	private DoubleListNode<T> previousNode;
	
	public DoubleListNode(T payloads){
		payload = payloads;
		nextNode = null;
		previousNode = null;
	}
	
}
