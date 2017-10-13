import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {

	// generic ArrayList stack
	private ArrayList<E> list;

	// Constructor
	public MyStack() {
		list = new ArrayList<E>();
	}

	// Test if stack is empty
	public boolean empty() {
		return list.isEmpty();
	}

	// Empty the stack
	public void clear() {
		list = new ArrayList<E>();
	}

	// Push an element to the stack
	public E push(E elt) {
		if(elt != null)
		{
			list.add(elt);
		}
		else 
		{
			return null;
		}
		return elt;
	}

	// Pop an element off the stack
	public E pop() {
		try {
			if (empty()) {
				throw new EmptyStackException();
			}
			E x = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			return x;
		} catch (EmptyStackException e) {
			System.err.println("\nError: Cannot \'pop\' an empty stack");
			e.printStackTrace();
		}
		return null;
	}

	// Peek at top of the stack
	public E peek() {
		try {
			if (empty()) {
				throw new EmptyStackException();
			}
			return list.get(list.size() - 1);
		} catch (EmptyStackException e) {
			System.err.println("\nError: Cannot \'peek\' an empty stack");
			e.printStackTrace();
		}
		return null;

	}

	// Return the size of stack
	public int size() {
		return list.size();
	}

	// toString override method
	@Override
	public String toString() {
		return list.toString();
	}

}