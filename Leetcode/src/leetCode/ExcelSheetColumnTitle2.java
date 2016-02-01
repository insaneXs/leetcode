package leetCode;

public class ExcelSheetColumnTitle2 {
	public int convertToTitle(String s) {
        if(s == null || s.equals(""))
        	return 0;
        char[] chars = s.toCharArray();
        int ans = 0;
        for(int i = 0; i <chars.length; i++){
        	ans = chars[i]- 64 + ans * 26;
        }
        return ans;
    }
}
