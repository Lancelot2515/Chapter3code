package git_demo.第九章课后题;

import java.util.GregorianCalendar;

public class code9_5 {
	public static void main(String[] args) {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.get(GregorianCalendar.YEAR);
		System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + " "
				+ (gregorianCalendar.get(GregorianCalendar.MONTH) + 1) + " "
				+ gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
		gregorianCalendar.setTimeInMillis(1234567898765L);

		System.out.println(
				gregorianCalendar.get(GregorianCalendar.YEAR) + "年" + gregorianCalendar.get(GregorianCalendar.MONTH)
						+ "月" + gregorianCalendar.get(GregorianCalendar.DATE) + "日");
	}

}
