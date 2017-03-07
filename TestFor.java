//输出101-200内的质数
public class TestFor {
	public static void main(String[] args) {
		boolean f = true;
		
		for(int i=101;i<=200;i+=2) {
			
			for(int j=2;j<i;j++) {
				
				if (i%j==0) {
					f = false;
					break;
				}
			}	
			if (!f)  continue;
			System.out.println(" "+i);
		}
	}
}