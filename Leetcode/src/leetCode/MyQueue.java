package leetCode;

import java.util.Stack;

public class MyQueue {
	private Stack<Integer> stack = new Stack<Integer>();
	
	// Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
    	Stack<Integer> temp = new Stack<Integer>();
    	while(stack.size() > 1){
    		temp.push(stack.pop());
    	}
    	while(temp.size() > 0){
    		stack.push(temp.pop());
    	}
    }

    // Get the front element.
    public int peek() {
    	Stack<Integer> temp = new Stack<Integer>();
    	int ans = 0;
    	while(stack.size() > 1){
    		temp.push(stack.pop());
    	}
    	ans = stack.peek();
    	while(temp.size() > 0){
    		stack.push(temp.pop());
    	}
    	return ans;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }	
}
