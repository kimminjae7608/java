package vo;

import java.sql.Date;

public class asdadasd {

	public static void main(String[] args) {

		String s1 = "1995-07-18";
		String s2 = "2000-01-01";
		Date d1,d2;
		d1 = Date.valueOf(s1);
		d2 = Date.valueOf(s2);
		if(d1.before(d2))
			System.out.println("d1 과거입니다.");
		else
			System.out.println("d2 과거입니다.");
		
		if(d1.after(d2))
			System.out.println("d1미래입니다.");
		else
			System.out.println("d2 미래입니다.");
	}

}
