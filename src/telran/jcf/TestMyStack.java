package telran.jcf;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMyStack {
	MyStack<Integer> myStack = new MyStack<>();
	
		 @BeforeEach
		    void setUp() {
		        Comparator<Integer> comparator = Integer::compare; 
		        myStack = new MyStack<>(comparator);
		    }
	

		 
	@Test
	 void test() {
		myStack.push(222);
		myStack.push(1);
		myStack.push(2);
		myStack.push(10);
		myStack.push(111);
		myStack.push(500);
		assertEquals(500, myStack.getMax());
		Integer[] expected = {222, 1, 2, 10, 111, 500 };
		assertArrayEquals(expected, myStack.toArray());
		myStack.pop();
		Integer[] expected2 = { 222, 1, 2, 10, 111};
		assertArrayEquals(expected2, myStack.toArray());
		assertFalse(myStack.isEmpty());
		assertEquals(222, myStack.getMax());
		myStack.pop();
		myStack.push(1000);
		assertEquals(1000, myStack.getMax());
		myStack.pop();
		assertEquals(222, myStack.getMax());
		
	}

}
