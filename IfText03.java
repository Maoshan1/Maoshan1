public class IfText03{
	public static void main(String[] args){
		java.util.Scanner s1 = new java.util.Scanner(System.in);
		java.util.Scanner s2 = new java.util.Scanner(System.in);
		System.out.print("����������(0��ʾ���죬1��ʾ����): ");
			int weather = s1.nextInt();
				if (weather!=0&weather!=1)		{
					System.out.print("�������");
				} else {
					System.out.print("�������Ա�: ");
				}
			String sex = s2.next();
				if (!sex.equals ("��") & !sex.equals ("Ů") )		{
					System.out.print("�������");
				} else if (weather == 0 & sex.equals ("��")	)		{
					System.out.print("��һ�Ѵ��ɡ");
				} else if (weather == 0 & sex.equals ("Ů")	)		{
					System.out.print("��һ��С��ɡ");
				} else if (weather == 1 & sex.equals ("��")	)		{
					System.out.print("ֱ�����𣬳�ȥ��ˣ");
				} else {
					System.out.print("�����ɹ����ȥ��ˣ");
				}/*����
				   0105*/
		
	}
}