public class Switch03{
	public static void main(String [] args){
	java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������ɼ��� ");
		double point = s.nextDouble();
		 int grade = (int)(point / 10) ;
		String Str = "���ϸ�";
		switch (grade)		{
		case 9: case 10:
			Str = "����";
			break;
		case 8: case 7:
			Str = "����";
			break;
		case 6: 
			Str = "�ϸ�";
			break;
		} 
		System.out.print(Str);
	}
}