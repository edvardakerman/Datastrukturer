package myutil;

public class MyQueue<E> extends AbstractList<E> {

	private Node<E> lastNode = new Node<>();

	// Om noden är null tildeas det nya elemenetet till noden, annars tilldeals
	// nästa node. Vi lägger till noden sist i listan.
	public void enqueue(E element) {
		if (this.getNode() == null) {
			this.setNode(new Node<E>(element));
			this.changeSize(1);
			this.lastNode = this.getNode();
		} else {
			Node<E> tmpNode = new Node<>(element);
			this.lastNode.setNextNode(tmpNode);
			this.lastNode = this.lastNode.getNextNode();
			this.changeSize(1);
		}
	}

	// Returnerar det äldsta elementet, kastar ett undantag om kön är tom
	public E dequeue() throws EmptyQueueException {
		if (!this.isEmpty()) {
			E tmpData = this.getNode().getData();
			this.setNode(this.getNode().getNextNode());
			this.changeSize(-1);
			return tmpData;
		} else {
			throw new EmptyQueueException();
		}
	}
}
