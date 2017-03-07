//输出1-100内前5个可以被3整除的数
public class TestWhile {
	public static void main(String[] args) {
		int i = 1 , j = 1;
		
		while(i<=100){
			while (j<=5) {			
			
				if (i%3==0) {
					System.out.println(i+"");
					j++;
				}
			 i++;
		  }
		}
	}
}