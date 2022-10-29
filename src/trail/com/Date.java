package trail.com;

import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/yy");
		String format = s.format(d);
		String replaceAll = format.replaceAll("/", "-");
System.out.println(replaceAll);
	}

}
