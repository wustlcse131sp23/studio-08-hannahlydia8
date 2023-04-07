package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Date {

	private int month; 
	private int day;
	private int year;
	private boolean isHoliday;
	
public Date(int m, int d, int y, boolean holiday) {
	month=m; 
	day=d;
	year=y;
	isHoliday=holiday;
	
}

public String toString() {
	return month +"/" + day + "/" + year;
}

    public static void main(String[] args) {
    	
    	Date myBirthday=new Date(6, 23, 2004, true);
    	Date christmas=new Date(12, 25, 2023, true);
    	Date easter=new Date(4, 9, 2023, true);
    	Date dogBirthday= new Date(9,4,2013, true);
    	Date lucyBirthday= new Date(9,4,2003, true);




    	List<Date> holidays = new LinkedList<Date>();
    	holidays.add(myBirthday);
    	holidays.add(christmas);
    	holidays.add(easter);
    	holidays.add(dogBirthday);
    	holidays.add(lucyBirthday);
    	holidays.add(easter);
    	
    	System.out.println(holidays);
    	
    	boolean compare;
    	if (myBirthday.equals(easter))
    		{compare=true;}
    	else
    		{compare=false;}
    	
    	System.out.println(compare);

    	HashSet<Date> set = new HashSet<Date>();
    	set.add(myBirthday);
    	set.add(easter);
    	set.add(christmas);
    	System.out.println(set);
    	
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
