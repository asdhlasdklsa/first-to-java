public class 判断质数 {
	public static void main(String[] args) {
		int count = 0;
		for ( int i =2 ; i <= 10000 ; i ++ ) {
			boolean  素数 = true ;
			for ( int j = 2 ; j < i ; j ++) {
				if (i % j == 0 ) {
					素数 = false;
					break;
				}
			}
			if (素数) {
				System.out.print(i+"  ");
				count++;
				if (count % 8 == 0) {
					System.out.println();
				}
			}		
		}
	}
}
