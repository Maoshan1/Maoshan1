public class Switch03{
	public static void main(String [] args){
	java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入成绩： ");
		double point = s.nextDouble();
		 int grade = (int)(point / 10) ;
		String Str = "不合格";
		switch (grade)		{
		case 9: case 10:
			Str = "优秀";
			break;
		case 8: case 7:
			Str = "良好";
			break;
		case 6: 
			Str = "合格";
			break;
		} 
		System.out.print(Str);
	}
}