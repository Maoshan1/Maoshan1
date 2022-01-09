public class Switch02{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入数字【0-6】 :");
		String Str = s.next();
		switch (Str)		{
		case "0" :
			Str = "星期日" ;
			break;
		case "1" :
			Str = "星期一" ;
			break;
		case "2" :
			Str = "星期二" ;
			break;
		case "3" :
			Str = "星期三" ;
			break;
		case "4" :
			Str = "星期四" ;
			break;
		case "5" :
			Str = "星期五" ;
			break;
		case "6" :
			Str = "星期六" ;
			break;
		default:
			Str = "11111111";
		}
		System.out.print(Str);
	}
}