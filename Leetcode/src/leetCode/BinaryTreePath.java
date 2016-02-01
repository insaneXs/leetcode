package leetCode;

import java.util.ArrayList;
import java.util.List;

import Base.TreeNode;

public class BinaryTreePath {
	public List<String> binaryTreePaths(TreeNode roof){
		List<String> ans = new ArrayList<String>();
		if(roof == null)
			return ans;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		path.add(roof.val);
		helper(path, list, roof);
		
		for(int i=0; i<list.size(); i++){
			List<Integer> l = list.get(i);
			StringBuffer sb = new StringBuffer();
			for(int j=0; j<l.size() - 1; j++){
				sb = sb.append(l.get(j) + "->");
			}
			sb.append(l.get(l.size() -1));
			ans.add(sb.toString());
		}
		return ans;
	}
	
	private void helper(List<Integer> path, List<List<Integer>> list, TreeNode roof){
		if(roof != null && roof.left == null && roof.right == null){
			list.add(new ArrayList<Integer>(path));
			return;
		}
		TreeNode left = roof.left;
		if(left != null){
			path.add(left.val);
			helper(path, list, left);
			path.remove(path.size() - 1);
		}
		
		TreeNode right = roof.right;
		if(right != null){
			path.add(right.val);
			helper(path, list, right);
			path.remove(path.size() - 1);
		}
	}
}
