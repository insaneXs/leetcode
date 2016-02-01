package leetCode;

public class BulbSwitcher {
	//位置n的灯开关次数同该数的因数个数一样，
	//由于除了平方根以外，因数都是成对出现，因此只有能开发的书开会是开关奇数次
	public int bulbSwitcher(int n){
		if(n <= 0)
			return 0;
		
//		int num = 0;
//		for(int i=1; i<=n; i++){
//			if(i * i <= n)
//				num++;
//			else
//				break;
//		}
//		return num;
		return (int)Math.sqrt(n);
	}
	
	public static void main(String[] args){
		BulbSwitcher bs = new BulbSwitcher();
		System.out.println(bs.bulbSwitcher(999999));
	}
}
