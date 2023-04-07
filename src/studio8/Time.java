package studio8;


public class Time {

	private int hour; 
	private int minute;
	private boolean militaryTimeOut;
	
	public Time(int hr, int min, boolean MT) {
		hour=hr; 
		minute=min;
		militaryTimeOut=MT;
	}
	
	public String toString() {
		if(militaryTimeOut) 
			{return hour + ":" + minute;}
		else if (!militaryTimeOut && hour>12) 
			{return (hour-12) + ":" + minute + " pm";}
		else
			{return hour + ":" + minute + " am";}
	}
	
	public static void main(String[] args) {
 
		
    	
    }

}