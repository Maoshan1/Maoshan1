import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * ����һ���򵥵�����
 * 
 * @author ��֪ʶ����������ѽ
 *
 */
public class date {

	public static void main(String[] args) {
		// �ӿ���̨����
		Scanner scanner = new Scanner(System.in);
		// ��ʾ�û�
		System.out.println("����������(�磺2019-5-16)��");
		// ��ȡ���������
		String date = scanner.nextLine();
		try {
			// ���ڸ�ʽ����
			DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
			// ���ַ������͵�����ת��Ϊdate���͵�
			Date parse = dFormat.parse(date);
			// ����һ���������ʵ��
			Calendar calendar = new GregorianCalendar();
			// �Ѹ�ʽ���õ����ڶ���Ž�Calendar
			calendar.setTime(parse);
			// ��ȡ�����Ǽ���
			int day = calendar.get(Calendar.DATE);
			// DATE���ó�����µ�һ��
			calendar.set(Calendar.DATE, 1);
			// ��ȡ����µĵ�һ�����ܼ�
			int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
			// ��ȡÿ������������
			int maxDay = calendar.getActualMaximum(Calendar.DATE);

			System.out.println("��\tһ\t��\t��\t��\t��\t��");

			// ѭ����ӡ �ո�
			for (int i = 1; i < weekDay; i++) {
				System.out.print("\t");
			}
			// ѭ����ӡ����
			for (int i = 1; i <= maxDay; i++) {
				// �ж����i ���� ���� ǰ���ӡһ��?���Ǻ�
				if (i == day) {
					System.out.print("?");
				}
				// ��ӡ ����
				System.out.print(i + "\t");
				// ��ȡ�������ܼ�
				int w = calendar.get(Calendar.DAY_OF_WEEK);
				// ������������������任��
				if (w == Calendar.SATURDAY) {
					System.out.println();
				}
				// ��������
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}

