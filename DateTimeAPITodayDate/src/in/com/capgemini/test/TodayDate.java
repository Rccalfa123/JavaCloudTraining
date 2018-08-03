package in.com.capgemini.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodayDate {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(" eeee , MMMM dd , yyyy");

		String date = localDate.format(dateTimeFormatter);

		System.out.println(date);

	}

}
