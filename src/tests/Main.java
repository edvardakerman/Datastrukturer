package tests;

import myutil.*;

public class Main {

	// Sätter upp våra datastrukturer
	public static Node<Character> alfabet = new Node<>();
	public static MyStack<Integer> stack = new MyStack<>();
	public static MyQueue<Character> que = new MyQueue<>();
	public static MyList<Character> list = new MyList<>();

	public static void nodeTest(Node<Character> node) {

		node.setData('A');
		System.out.println("Första bokstaven i alfabetet är " + node.getData());

		node.setNextNode(new Node<Character>('B'));
		System.out.println("Nästa bokstav i alfabetet är " + node.getNextNode().getData());

		node.getNextNode().setNextNode(new Node<Character>('C'));
		System.out.println("Nästa bokstav i alfabetet är " + node.getNextNode().getNextNode().getData());

		node.getNextNode().setNextNode(new Node<Character>('D'));
		System.out.println("Nästa bokstav i alfabetet är " + node.getNextNode().getNextNode().getData());
	}

	public static void stackTest(MyStack<Integer> stack) {

		System.out.println("Stacken är tom: " + stack.isEmpty());
		System.out.println("");
		System.out.println("Vi lägger till 10 siffror");

		for (int i = 1; i < 11; i++) {
			System.out.println("Inlagd siffra: " + i);
		}

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);

		System.out.println("Stacken är tom: " + stack.isEmpty());
		System.out.println("");

		System.out.println("Stackens storlek: " + stack.size());
		System.out.println("");

		System.out.println("Peek: " + stack.peek());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Pop: " + stack.pop());

		try {
			System.out.println(stack.peek()); // triggers StackEmptyException

		} catch (RuntimeException StackEmptyException) {
			System.out.println("Försökte poppa ett objekt som inte existerar. Kastar error.");
			System.out.println("Fångade StackEmptyException");
		}

		System.out.println("");
		System.out.println("Stackens nuvarande storlek: " + stack.size());
	}

	public static void queueTest(MyQueue<Character> que) {

		System.out.println("Kön är tom: " + que.isEmpty() + "\n");

		System.out.println("Vi lägger till tecken i kön: &, a, 7");

		que.enqueue('&');
		que.enqueue('a');
		que.enqueue('7');

		System.out.println("Kön är tom: " + que.isEmpty() + "\n");

		System.out.println("Vi tar bort: " + que.dequeue());
		System.out.println("Så många tecken finns i kön: " + que.size());
		System.out.println("Vi tar bort: " + que.dequeue());
		System.out.println("Så många tecken finns i kön: " + que.size());
		System.out.println("Vi tar bort: " + que.dequeue());
		System.out.println("Så många tecken finns i kön: " + que.size());

		try {
			System.out.println(que.dequeue());

		} catch (RuntimeException QueueEmptyException) {
			System.out.println("Försökte ta bort ett objekt som inte existerar. Kastar error.");
			System.out.println("Fångade QueueEmptyException");
		}
	}

	public static void listTest(MyList<Character> list) {

		System.out.println("Listan är tom: " + list.isEmpty());
		System.out.println("");

		list.add('J');
		list.add('A');
		list.add('V');
		list.add('A');
		list.add('L');
		list.add('A');
		list.add('B');
		list.add('B');

		try {
			list.getElementAt(8);

		} catch (RuntimeException ListOutOfBoundsException) {
			System.out.println("Försökte ta bort ett objekt som inte existerar. Kastar error.");
			System.out.println("Fångade ListOutOfBoundsException");
		}

		System.out.println("");

		System.out.println("Storleken på listan: " + list.size());
		System.out.println("Bokstaven på plats 1 är: " + list.getElementAt(0));
		System.out.println("Bokstaven på plats 2 är: " + list.getElementAt(1));
		System.out.println("Bokstaven på plats 3 är: " + list.getElementAt(2));
		System.out.println("Bokstaven på plats 4 är: " + list.getElementAt(3));
		System.out.println("Bokstaven på plats 5 är: " + list.getElementAt(4));
		System.out.println("Bokstaven på plats 6 är: " + list.getElementAt(5));
		System.out.println("Bokstaven på plats 7 är: " + list.getElementAt(6));
		System.out.println("Bokstaven på plats 8 är: " + list.getElementAt(7));

		System.out.println("");
		System.out.println("Listan är tom: " + list.isEmpty());
	}

	public static void main(String[] args) {

		System.out.println("##################### Node TEST #####################");
		nodeTest(alfabet);
		System.out.println("\n---------------------------------------------------\n");

		System.out.println("##################### Stack TEST #####################");
		stackTest(stack);
		System.out.println("\n---------------------------------------------------");

		System.out.println("##################### Kö TEST #####################");
		queueTest(que);
		System.out.println("\n---------------------------------------------------");

		System.out.println("##################### List TEST #####################");
		listTest(list);
	}
}
