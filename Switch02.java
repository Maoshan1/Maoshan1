public class Switch02{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("���������֡�0-6�� :");
		String Str = s.next();
		switch (Str)		{
		case "0" :
			Str = "������" ;
			break;
		case "1" :
			Str = "����һ" ;
			break;
		case "2" :
			Str = "���ڶ�" ;
			break;
		case "3" :
			Str = "������" ;
			break;
		case "4" :
			Str = "������" ;
			break;
		case "5" :
			Str = "������" ;
			break;
		case "6" :
			Str = "������" ;
			break;
		default:
			Str = "11111111";
		}
		System.out.print(Str);
	}
}