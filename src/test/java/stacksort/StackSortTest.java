package stacksort;

import javax.naming.OperationNotSupportedException;

import org.junit.Assert;
import org.junit.Test;


public class StackSortTest {

	@Test
	public void testSort() throws OperationNotSupportedException {

		Stack stack = new Stack();
		stack.push(6);
		stack.push(3);
		stack.push(5);
		stack.push(100);
		Stack sortedStack =   StackSort.sort(stack);
		Assert.assertEquals(3, sortedStack.pop());
		Assert.assertEquals(5, sortedStack.pop());
		Assert.assertEquals(6, sortedStack.pop());
		Assert.assertEquals(100, sortedStack.pop());		
	
	
	}

}
