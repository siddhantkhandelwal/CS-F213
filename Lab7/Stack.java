import java.util.LinkedList;
import java.util.ListIterator;


public class Stack {
	private LinkedList<Integer> stack;
	
	Stack(){
		stack = new LinkedList<Integer>();
	}
	
	void push(int n){
		stack.add(n);
	}
	
	int pop(){
		return stack.remove(0);
	}
	
	void printStack() {
		ListIterator<Integer> litr = stack.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next() + " ");
		}
		System.out.println();
	}
	
	public static void main( String[] args) {
		Stack testStack = new Stack();
		testStack.push(2);
		testStack.push(28);
		testStack.push(89);
		testStack.push(46);
		
		testStack.pop();
		testStack.printStack();
	}
}
