public class StackGeneric {
	public static void main(String arg[]) {
		Stack<Integer> stackInteger = new Stack<Integer>();
		stackInteger.push(1);
		stackInteger.push(2);
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());

		Stack<String> stackString = new Stack<String>();
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}
}

class Stack<T> {
	T top;
	Node<T> currentNode;

	public T pop() {
		top = currentNode.getData();
		currentNode = currentNode.getNext();
		
		return top;
	}

	public void push(T data) {
		Node<T> tempNode = new Node<T>(data);
		tempNode.setNext(currentNode);
		currentNode = tempNode;
	}
}

class Node<T> {
	Node<T> next;
	T data;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}