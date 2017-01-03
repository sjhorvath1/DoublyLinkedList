import static org.junit.Assert.*;

import org.junit.Test;

public class Tester {
	
	@Test
	//Tests the addFront method
	public void testAddFront(){
		DoublyLinkedList<String> testList = new DoublyLinkedList<String>();
		testList.addFront("Jim");
		testList.addFront("Tony");
		testList.addFront("Bob");
		assertEquals("Bob", testList.getFirst());
	}
	
	@Test
	//Tests the addBack method
	public void testAddBack(){
		DoublyLinkedList<String> testList = new DoublyLinkedList<String>();
		testList.addBack("Jim");
		testList.addBack("Tony");
		testList.addBack("Bob");
		assertEquals("Bob",testList.getLast());
	}
	
	@Test
	//Tests the getFirst method
	public void testGetFirst(){
		DoublyLinkedList<String> testList = new DoublyLinkedList<String>();
		testList.addFront("Jim");
		assertEquals("Jim", testList.getFirst());
	}
	
	@Test
	//Tests the getLast method
	public void testGetLast(){
		DoublyLinkedList<String> testList = new DoublyLinkedList<String>();
		testList.addFront("Jim");
		testList.addFront("Bob");
		assertEquals("Jim", testList.getLast());
	}
	
	@Test
	//Tests the getLength method
	public void testGetLength(){
		DoublyLinkedList<String> testList = new DoublyLinkedList<String>();
		testList.addFront("Jim");
		testList.addFront("Bob");
		assertEquals(2, testList.getLength());
	}
}
