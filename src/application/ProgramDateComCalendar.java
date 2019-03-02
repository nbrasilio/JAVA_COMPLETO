package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramDateComCalendar {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		//somando 4 horas
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		System.out.println("-------------");
		
		//obtendo uma unidade de tempo
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		
		
	}

}
