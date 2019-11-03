package com.tyss.usttyspringmvc.dto;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateConverter {

	public static void main(String[] args)  throws ParseException{
		String date = "15/08/1947";
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		
		java.util.Date d = format.parse(date);
		
		System.out.println(d.toString());

	}

}
