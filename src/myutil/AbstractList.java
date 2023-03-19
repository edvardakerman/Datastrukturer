package myutil;

public abstract class AbstractList<E> {

	// består av datatypen node
	private Node<E> node = null;
	private int size;

	public void changeSize(int i) {
		this.size += i;
	}
	
//	sätter noden
	public void setNode(Node<E> node) {
		this.node = node;
	}
	
//	returnerar noden
	public Node<E> getNode() {
		return this.node;
	}
	
//	returnerar sant om noden är tom.
	public boolean isEmpty() {
		return this.node == null;
	}
	
//	returnerar det totala antalet noder som ett heltal.
	public int size() {
		return this.size;
	}
}