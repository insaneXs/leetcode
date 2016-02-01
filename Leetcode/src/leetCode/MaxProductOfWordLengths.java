package leetCode;

public class MaxProductOfWordLengths {
	public static int maxProduct(String[] words){
		if(words == null || words.length <=1)
			return 0;
		int[] bits = new int[words.length];
		for(int i=0; i<bits.length; i++){
			char[] chars = words[i].toCharArray();
			for(int j=0; j<chars.length; j++){
				int t = chars[j] - 'a';
				bits[i] |= (1 << t);
			}
		}
		int ans = 0;
		for(int i=0; i<bits.length; i++){
			for(int j=i+1; j<bits.length; j++){
				if((bits[i] & bits[j]) == 0){
					int pro = words[i].length() * words[j].length();
					if(pro > ans)
						ans = pro;
				}
			}
		}
		return ans;
	}
}
