package 学习成绩;

public class 简易计算器 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner (System.in);
		System.out.println("请输入第一个数字：");
		int num1 = s.nextInt();
		
		System.out.println("请输入运算符：");
		String operator = s.next();
		
		System.out.println("请输入第二个数字：");
		int num2 = s.nextInt();
		
		int reslut = 0 ;
		switch (operator) {
			case "+" : 
				reslut = num1 + num2;
				break;
			case "-" : 
				reslut = num1 - num2;
				break;
			case "*" : 
				reslut = num1 * num2;
				break;
			case "/" : 
				reslut = num1 / num2;
				break;
			case "%" : 
				reslut = num1 % num2;
				break;
		}
		System.out.println("您输入的结果为："+  num1 + operator + num2 + "=" + reslut );
	}
}
