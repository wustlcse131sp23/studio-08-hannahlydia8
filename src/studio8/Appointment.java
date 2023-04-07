package studio8;

import java.util.Objects;

public class Appointment {

	private String name;
	private Time time;
	private Date day;
	
	public Appointment(String n, Time t, Date d) {
		name=n;
		time=t;
		day=d;
	}
	
	
	public static void main(String[] args) {

		Date myBirthday=new Date(6, 23, 2004, true);
    	Date christmas=new Date(12, 25, 2023, true);
    	Date easter=new Date(4, 9, 2023, true);
    	Date dogBirthday= new Date(9,4,2013, true);
    	Date lucyBirthday= new Date(9,4,2003, true);
    	
    	Time morning=new Time(9, 30, true);
    	
    	
    	
		Appointment doctor = new Appointment("Doctor", morning, easter); 
		Appointment dentist = new Appointment("Dentist", morning, lucyBirthday); 
		Appointment meeting = new Appointment("Meeting", morning, myBirthday); 
		
		
		

	}


	@Override
	public int hashCode() {
		return Objects.hash(day, time);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(day, other.day) && Objects.equals(time, other.time);
	}

}
