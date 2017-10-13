import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyStackTest {


	@Test 
	public void testPush()
	   {
	      MyStack<String> stack = new MyStack<String>();
	      stack.push ("hello");
	      stack.push ("world");
	      assertEquals (stack.peek(), "world");
	   }

   @Test 
	public void testPop()
	   {
	      MyStack<String> stack = new MyStack<String>();
	      stack.push ("hello");
	      stack.push ("world");
	      stack.pop ();
	      assertEquals (stack.peek(), "hello");
	   }

   @Test 
	public void testEmpty()
	   {
	      MyStack<String> stack = new MyStack<String>();
	      assertEquals (stack.empty(), true);
	   }

   @Test 
	public void testSize()
	   {
	      MyStack<String> stack = new MyStack<String>();
  	      stack.push("test test test");
	      assertEquals (stack.size(), 1);
	      stack.push("test test test");
	      assertEquals (stack.size(), 2);
	      stack.push("test test test");
	      assertEquals (stack.size(), 3);
	      stack.pop();
	      stack.pop();
	      assertEquals (stack.size(), 1);
	   }

   @Test 
	public void testNotIsEmpty()
	   {
	      MyStack<String> stack = new MyStack<String>();
	      stack.push("test test test");
	      assertEquals (stack.empty(), false);
	   }

   @Test 
	public void testPopEmpty()
	   {
	      MyStack<String> stack = new MyStack<String>();
	      assertEquals (stack.pop(), null);
	      stack.push("");
	      stack.push("");
	      stack.pop();
	      stack.pop();
	      assertEquals (stack.pop(), null);
	   }

   @Test 
	public void testFailToPushNullOntoStack()
	   {
	      MyStack<String> stack = new MyStack<String>();
	      stack.push(null);
	      assertEquals (stack.peek(), null);
	      assertEquals (stack.size(), 0);
	   }

   @Test 
	public void testPushEmptyString()
	   {
	      MyStack<String> stack = new MyStack<String>();
	      stack.push("");
	      assertEquals (stack.peek(), "");
	   }

   @Test 
	public void testPushLargeString()
	   {
	      MyStack<String> stack = new MyStack<String>();
	      StringBuilder test = new StringBuilder();
	      for (int x = 0; x <= 400000; x++)
	      {
	      	test.append("testing");
	      }
	      String fin = test.toString();
	      stack.push(fin);
	      assertEquals (stack.peek(), fin);
	   }

   @Test 
	public void testPushManyItems()
	   {
	      MyStack<String> stack = new MyStack<String>();
	      for (int x = 0; x < 400000; x++)
	      {
	      	stack.push("x");
	      }	      
	      assertEquals (stack.size(), 400000);
	   }

   @Test 
	public void testPushStackOnStack()
	   {
	      MyStack<MyStack> stack = new MyStack<MyStack>();
	      MyStack<String> testStack = new MyStack<String>();
	      stack.push(testStack);
	      assertEquals (stack.peek(), testStack);
	   }

   @Test 
	public void testPushStringOntoStackOnStack()
	   {
	      MyStack<MyStack> stack = new MyStack<MyStack>();
	      MyStack<String> testStack = new MyStack<String>();
	      stack.push(testStack);
	      stack.peek().push("1");
	      assertEquals (stack.peek().peek(), "1");
	   }
}
