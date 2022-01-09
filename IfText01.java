public class IfText01{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入年龄: ");
		int age = s.nextInt();
		if (age < 0 || age > 150){
			System.out.print("非法年龄");
		} else if (age < 5){
			System.out.print("  婴儿");
		} else if (age < 18){
			System.out.print("  少年");
		} else if (age < 35){
			System.out.print("  成年");		
		} else {
			System.out.print("  老年");
		}
			
	} 
}