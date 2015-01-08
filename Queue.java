package binaryTree;
import java.util.LinkedList;

public class Queue {
	private LinkedList queue = new LinkedList();
	
	public Queue() {}
		
	public boolean isEmpty() {
		return queue.size() == 0;
	}	
		
	public void enqueue(Object obj) {
		queue.add(obj);
	}	
	
	public Object dequeue() {
		if (!queue.isEmpty()) {
			return queue.removeFirst();
		}
		return null;
	}	
}	