package stacksort;
import javax.naming.OperationNotSupportedException;


import org.junit.Assert;
import org.junit.Test;

import stacksort.Stack;


public class StackTest {

	@Test
	public void testPush() throws OperationNotSupportedException {

		Stack stack = new Stack();
		stack.push(3);
		Assert.assertEquals(3, stack.pop());
		
	
	}

	@Test
	public void testPeek() {
		
		Stack stack = new Stack();
		stack.push(3);
		Assert.assertEquals(3, stack.peek());
		Assert.assertEquals(1, stack.size());
	}

}
