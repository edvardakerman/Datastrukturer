package myutil;

public class MyList<E> extends AbstractList<E> {

	private Node<E> lastNode = new Node<>();

	// Om noden är null tildeas det nya elemenetet till noden, annars tilldeals
	// nästa node. Vi lägger till noden sist i listan.
	public void add(E element) {
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
	
	// Returenrar ett element för specivikt index, om index är ≥ listans storlek kaster vi ett undantag
	public E getElementAt(int index) throws ListException {
		if (!this.isEmpty() && (index < this.size())) {
			Node<E> tmpNode = this.getNode();
			for (int i = 0; i < index; i++) {
				tmpNode = tmpNode.getNextNode();
			}

			return tmpNode.getData();

		} else {
			throw new ListException();
		}
	}
}
