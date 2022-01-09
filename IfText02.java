public class IfText02{
	public static void main(String [] args){
	java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入成绩： ");
		double point = s.nextDouble();
		String Str = "不合格";
		if (point < 0 || point > 100){
			Str = "非法成绩";
		} else if (point >= 90){
			Str = "优秀";
		} else if (point >= 80){
			Str = "良好";
		} else if (point >= 70){
			Str = "一般";
		} else if (point >= 60){
			Str = "合格";
		} 
		System.out.print(Str);
	}
}