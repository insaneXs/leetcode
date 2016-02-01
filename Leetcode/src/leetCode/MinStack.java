package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;


public class MinStack {
	ArrayList<Integer> order = new ArrayList<Integer>();
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	public void push(int x) {
        for(int i=0; i<list.size(); i++){
        	if(list.get(i)>= x){
        		list.add(0);
        		for(int j=list.size()-1; j>i; j--){
        			list.set(j, list.get(j - 1));
        		}
        		list.set(i, x);
        		for(int j=0; j<order.size(); j++){
        			if(order.get(j) > i)
        				order.set(j, order.get(j)+1);
        		}
        		order.add(i);
        		return;
        	}
        }
        order.add(list.size());
        list.add(x);
        
    }

    public void pop() {
    	if(list.size() > 0){
    		int index = order.get(order.size() -1);
    		list.remove(order.get(index));
    		for(int i=0; i<order.size() -1; i++){
    			if(order.get(i) > index)
    				order.set(i, order.get(i) - 1);
    		}
    		order.remove(order.size() -1);
    	}
    }

    public int top() {
        return list.get(order.size() - 1);
    }

    public int getMin() {
        if(list.size() > 0)
        	return list.get(0);
        else 
        	return -1;
    }
    
    public static void main(String[] args){
    	MinStack m = new MinStack();
    	m.push(-2);
    	m.push(0);
    	m.push(-1);
    	m.getMin();
    	m.top();
    	m.top();
    	m.getMin();
    }
}


