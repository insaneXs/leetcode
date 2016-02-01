package leetCode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
        if((s == null )&& (t != null ) || (t == null )&& (s != null))
        	return false;
        if( s == null && t == null)
        	return true;
        char[] charOfs = s.toCharArray();
        char[] charOft = t.toCharArray();
        Map<Character, Integer> mapOfs = new HashMap<Character, Integer>();
        Map<Character, Integer> mapOft = new HashMap<Character, Integer>();
        for(int i=0; i<charOfs.length; i++){
        	int sum1 = mapOfs.get(charOfs[i]) == null ? i + 1 : mapOfs.get(charOfs[i]) + i + 1;
        	int sum2 = mapOft.get(charOft[i]) == null ? i + 1 : mapOft.get(charOft[i]) + i + 1;
        	mapOfs.put(charOfs[i],sum1+i);
        	mapOft.put(charOft[i],sum2+i);
        	if(sum1 != sum2)
        		return false;
        }
        return true;
    }
}
