public class IfText01{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("����������: ");
		int age = s.nextInt();
		if (age < 0 || age > 150){
			System.out.print("�Ƿ�����");
		} else if (age < 5){
			System.out.print("  Ӥ��");
		} else if (age < 18){
			System.out.print("  ����");
		} else if (age < 35){
			System.out.print("  ����");		
		} else {
			System.out.print("  ����");
		}
			
	} 
}