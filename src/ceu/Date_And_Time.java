package ceu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_And_Time {

    public String getFormattedDate() {
        Date currentDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        String formattedDate = dateFormat.format(currentDate);

        return formattedDate;
    }

    public String getFormattedDay() {
    	Date currentDay = new Date();
    	
    	SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        String formattedDay = dayFormat.format(currentDay);
        
        return formattedDay;
    }

    public String getFormattedTime() {
    	Date currentTime = new Date();
    	
    	SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
        String formattedTime = timeFormat.format(currentTime);
        
        return formattedTime;
    
    }
    
}