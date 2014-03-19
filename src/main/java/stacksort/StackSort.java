package stacksort;

import javax.naming.OperationNotSupportedException;

public class StackSort {

	public static Stack sort(Stack unsortedStack)
			throws OperationNotSupportedException {

		Stack sortedStack = new Stack();
		while (!unsortedStack.isEmpty())

		{
			int x = unsortedStack.pop();
			while (!sortedStack.isEmpty() && (sortedStack.peek() < x)) {
				unsortedStack.push(sortedStack.pop());
			}
			sortedStack.push(x);

		}
		return sortedStack;
	}
}
