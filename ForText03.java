public class ForText03{
	public static void main(String[] args){
		
		for (int i = 1;i < 10 ;i++ ){
			for (int k = 1;k <( i+1) ;k++ )	{
				int x = 0;
				x = x + i*k;
				System.out.print(k + "*" + i + "=" + x + "	");
			}
			System.out.println();
		}
	}
}