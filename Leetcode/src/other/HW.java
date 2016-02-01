package other;

import java.util.ArrayList;
import java.util.List;

public class HW {
	
	public List<List<Integer>> combinationSum(int M, int N) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        helper(rst,list, M, N, 0, 1);
        return rst;
    }
    
    public void helper(List<List<Integer>> rst, List<Integer> list, int M, int N, int sum, int start){
        if(sum == M && list.size() == N){
            rst.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = start; i < M; i++){
            if(sum > M || list.size() > N){
                continue;
            }
            list.add(i);
            sum+=i;
            helper(rst,list,M, N, sum, i);
            sum-=list.get(list.size()-1);
            list.remove(list.size()-1);
        }
    }
    
    public static void main(String[] args){
    	HW h = new HW();
    	System.out.println(h.combinationSum(10, 5));
    }
    
}
