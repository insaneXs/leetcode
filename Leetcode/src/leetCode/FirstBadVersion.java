package leetCode;

public class FirstBadVersion extends VersionControl{
	public int firstBadVersion(int n) {
        if(n == 0 || !isBadVersion(n))
        	return -1;
        if(isBadVersion(1))
        	return 1;
        int left = 1, right = n;
        while(left < right - 1){
        	int mid = left + (right - left) / 2;
        	if(isBadVersion(mid))
        		right = mid;
        	else
        		left = mid;
        }
        return right; 
    }
}

class VersionControl{
	boolean isBadVersion(int version){
		return true;
	}
}
