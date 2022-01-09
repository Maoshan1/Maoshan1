public class Switch{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入数字【0-6】 :");
		int num = s.nextInt();
		if (num > 6 || num < 0)		{
					System.out.print("输入错误");
		}
		switch (num)		{
		case 0 :
			System.out.print("星期日");
			break;
		case 1 :
			System.out.print("星期一");
			break;
		case 2 :
			System.out.print("星期二");
			break;
		case 3 :
			System.out.print("星期三");
			break;
		case 4 :
			System.out.print("星期四");
			break;
		case 5 :
			System.out.print("星期五");
			break;
		case 6 :
			System.out.print("星期六");
			break;
		}
	}
}