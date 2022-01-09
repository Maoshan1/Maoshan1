public class IfText03{
	public static void main(String[] args){
		java.util.Scanner s1 = new java.util.Scanner(System.in);
		java.util.Scanner s2 = new java.util.Scanner(System.in);
		System.out.print("请输入天气(0表示雨天，1表示晴天): ");
			int weather = s1.nextInt();
				if (weather!=0&weather!=1)		{
					System.out.print("输入错误");
				} else {
					System.out.print("请输入性别: ");
				}
			String sex = s2.next();
				if (!sex.equals ("男") & !sex.equals ("女") )		{
					System.out.print("输入错误");
				} else if (weather == 0 & sex.equals ("男")	)		{
					System.out.print("打一把大黑伞");
				} else if (weather == 0 & sex.equals ("女")	)		{
					System.out.print("打一把小花伞");
				} else if (weather == 1 & sex.equals ("男")	)		{
					System.out.print("直接走起，出去玩耍");
				} else {
					System.out.print("擦点防晒，出去玩耍");
				}/*制作
				   0105*/
		
	}
}