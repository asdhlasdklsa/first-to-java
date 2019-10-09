package 方法;
//计算1~N的和
public class 递归 {
	public static void main(String[] args) {
		long n = 19L ;
		System.out.println(doSome(n));
		System.out.println(19*18*17*16);
	}
	public static long doSome( long n) {
		if ( n == 1L ) {
			return 1L ;
		}
		return  n * doSome(n-1);
	}
}
