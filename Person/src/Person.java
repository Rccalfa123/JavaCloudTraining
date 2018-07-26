import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Person {
  
	private String name;
	private Date dob = new Date();
	private int day,month,year;
	
	
	public Person(String name,int day,int month,int year)   
	{
		  this.name = name;
		  this.day = day;
		  this.month = month;
		  this.year = year;
		  
	  String DOB =  day+"/"+month+"/"+year; //Creating the object for dateofBirth  Instance member
	  DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");   //Create date format for input
	  try
	  {
		  dob = dateformat.parse(DOB);  // passing our designed string to dateformat object;
	  }
	  catch(Exception e)
	  {
		 System.out.println(e);
	  }
	}
	
	public void Display()
	{
		System.out.println("");
		System.out.println("Name : "+name);
		System.out.println("Date of Birth : "+day+"/"+month+"/"+year);
		System.out.println("Age : "+getCurrentAge());
		
	}
	
	public String olderOne(Person Alfaiz,Person Saif)
	{
		String whoIsOlder;
		LocalDate AlfaizLocal = LocalDate.of(Alfaiz.year, Alfaiz.month, Alfaiz.day);  // Conversion of Input date into Local Date Format for finding peroid.
		LocalDate SaifLocal = LocalDate.of(Saif.year, Saif.month, Saif.day); 
		Period age = Period.between(SaifLocal,AlfaizLocal);
		if(Alfaiz.dob.compareTo(Saif.dob)>0) //Comparision of date of birth
		{
			whoIsOlder = Saif.name + "is Older than "+Alfaiz.name+" by "+ age.getYears()+" Years  "+age.getMonths()+" Months  "+age.getDays()+" days";
		}
		else if(Alfaiz.dob.compareTo(Saif.dob)<0)
		{
			whoIsOlder = Alfaiz.name + " is Older than "+Saif.name+" by "+ age.getYears()+" Years  "+age.getMonths()+" Months "+age.getDays()+" days";
		}
		else
		{
			whoIsOlder = Alfaiz.name + " and "+Saif.name+" are of same age.";
		}
		return whoIsOlder;
		
	}
	
	public String getCurrentAge()
	{
		LocalDate todayDate  = LocalDate.now();
		LocalDate dobLocal = LocalDate.of(year, month, day);
		Period age = Period.between(dobLocal, todayDate);
		String CurrentAgeMessage = age.getYears() +" Years,"+age.getMonths()+" Months,"+age.getDays()+" Days";
		return CurrentAgeMessage;
	}
}
