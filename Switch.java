public class Switch{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("���������֡�0-6�� :");
		int num = s.nextInt();
		if (num > 6 || num < 0)		{
					System.out.print("�������");
		}
		switch (num)		{
		case 0 :
			System.out.print("������");
			break;
		case 1 :
			System.out.print("����һ");
			break;
		case 2 :
			System.out.print("���ڶ�");
			break;
		case 3 :
			System.out.print("������");
			break;
		case 4 :
			System.out.print("������");
			break;
		case 5 :
			System.out.print("������");
			break;
		case 6 :
			System.out.print("������");
			break;
		}
	}
}