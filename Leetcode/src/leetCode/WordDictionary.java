package leetCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDictionary {
	private Set<String> set = new HashSet<String>();
	
	public void addWord(String word){
		if(word != null)
			set.add(word);
	}
	
	public boolean search(String word){
		if(word == null)
			return false;
		char[] chars = word.toCharArray();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String str = iterator.next();
			char[] strs = str.toCharArray();
			if(strs.length == chars.length){
				for(int i=0; i<chars.length; i++){
					if(chars[i] == '.')
						continue;
					if(chars[i] != strs[i])
						break;
					if(i == chars.length - 1)
						return true;
				}
			}
		}
		return false;
	}
}
