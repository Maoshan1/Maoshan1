public class IfText02{
	public static void main(String [] args){
	java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������ɼ��� ");
		double point = s.nextDouble();
		String Str = "���ϸ�";
		if (point < 0 || point > 100){
			Str = "�Ƿ��ɼ�";
		} else if (point >= 90){
			Str = "����";
		} else if (point >= 80){
			Str = "����";
		} else if (point >= 70){
			Str = "һ��";
		} else if (point >= 60){
			Str = "�ϸ�";
		} 
		System.out.print(Str);
	}
}