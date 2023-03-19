package myutil;

public class Node<E> {

	//E är en obestämd datatyp, wildcard
	private E data;
	private Node<E> next;

	public Node() {
		this.next = null;
	}

	public Node(E element) {
		this.data = element;
		this.next = null;
	}

	public void setData(E data) {
		this.data = data;
	}

	public E getData() {
		return this.data;
	}
	
//   .setNextNode() för att ändra nästa element
	public void setNextNode(Node<E> nextNode) {
		this.next = nextNode;
	}

//	.getNextNode() för att få tillgång till nästa element
	public Node<E> getNextNode() {
		return this.next;
	}
}
