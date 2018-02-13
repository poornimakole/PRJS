package com.psl.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateDemo {

public static void main(String[] args) {
	Date d=new Date();

	System.out.println(d);
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
	
	String strd=sdf.format(d);
	System.out.println(strd);
	
	sdf.setLenient(false);
	Date d1=null;
	try {
		 d1=sdf.parse("13/07/2007");
		//System.out.println(d1);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	Calendar c=Calendar.getInstance();
	Calendar c1=new GregorianCalendar();
	c1.setTime(d);
	Calendar c2=new GregorianCalendar();
	c2.setTime(d1);
	/*System.out.println(c1.get(Calendar.DAY_OF_MONTH));
	System.out.println(c1.get(Calendar.MONTH));
	System.out.println(c1.get(Calendar.YEAR));
//	c1.set(Calendar.DAY_OF_MONTH,13);
	
	System.out.println(c1.get(Calendar.DAY_OF_MONTH));
	System.out.println(c1.get(Calendar.MONTH));
	System.out.println(c1.get(Calendar.YEAR));
	
	//c1.add(Calendar.DAY_OF_MONTH, 20);
	
	System.out.println(c1.get(Calendar.DAY_OF_MONTH));
	System.out.println(c1.get(Calendar.MONTH));
	System.out.println(c1.get(Calendar.YEAR));
	
	//c1.add(Calendar.DAY_OF_MONTH, -15);
*/	
	System.out.print(c1.get(Calendar.DAY_OF_MONTH)+"  ");
	System.out.print(c1.get(Calendar.MONTH)+"  ");
	System.out.println(c1.get(Calendar.YEAR));
	
	java.util.Date d2=c1.getTime();
	System.out.println(d2);
	
	System.out.print(c2.get(Calendar.DAY_OF_MONTH)+"  ");
	System.out.print(c2.get(Calendar.MONTH)+" ");
	System.out.println(c2.get(Calendar.YEAR));
	java.util.Date d3=c1.getTime();
	System.out.println(d3);
	
	//System.out.println(c1.get(Calendar.DAY_OF_YEAR));
	//System.out.println(c2.get(Calendar.DAY_OF_YEAR));
	
	int x=(c1.get(Calendar.YEAR)-c2.get(Calendar.YEAR));
	
	int result=(x%4+1)*366+(x-(x%4+1))*365-c1.get(Calendar.DAY_OF_YEAR)+c2.get(Calendar.DAY_OF_YEAR);
	System.out.println(result);
	
	//System.out.println(c1.get();
	
	java.sql.Date sqld=new java.sql.Date(d2.getTime());
	//System.out.println(sqld);
	
	
	
	
	
	
}
}
