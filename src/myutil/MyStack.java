package myutil;

public class MyStack<E> extends AbstractList<E> {

	// Om noden är null tilldelas noden det nya elemenetet, annars tilldelas
	// nästa node.
	public void push(E element) {
		if (this.getNode() == null) {
			this.setNode(new Node<E>(element));
			this.changeSize(1);
		} else {
			Node<E> tmpNode = new Node<>(element);
			tmpNode.setNextNode(this.getNode());
			this.setNode(tmpNode);
			this.changeSize(1);
		}
	}

	public E peek() throws EmptyStackException {
		if (!this.isEmpty()) {
			return this.getNode().getData();
		} else
			throw new EmptyStackException();
	}
	
	// Hämtar nodens data, sparar det i tmpData, tar bort noden från stacken och retunerar tmpData
	// Kastar undantag om det ej finns något att poppa,
	public E pop() throws EmptyStackException {
		if (!this.isEmpty()) {
			E tmpData = this.getNode().getData();
			this.setNode(this.getNode().getNextNode());
			this.changeSize(-1);
			return tmpData;
		} else {
			throw new EmptyStackException();
		}
	}
}
