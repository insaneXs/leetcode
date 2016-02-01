package leetCode;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	Queue<Integer> queue = new LinkedList<Integer>();
	// Push element x onto stack.
    public void push(int x) {
        queue.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        Queue<Integer> temp = new LinkedList<Integer>();
        while(queue.size() >1){
        	temp.offer(queue.poll());
        }
        while(!temp.isEmpty()){
        	queue.offer(temp.poll());
        }
        queue.poll();
    }

    // Get the top element.
    public int top() {
    	Queue<Integer> temp = new LinkedList<Integer>();
        while(queue.size() >1){
        	temp.offer(queue.poll());
        }
        while(!temp.isEmpty()){
        	queue.offer(temp.poll());
        }
        int ans = queue.poll();
        queue.offer(ans);
        return ans;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
