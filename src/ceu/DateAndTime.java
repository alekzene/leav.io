package ceu;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

    public String getFormattedDate() {
        Date currentDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        String formattedDate = dateFormat.format(currentDate);

        return formattedDate;
    }
    
    public Date getCurrentDate() {
        Date currentDate = new Date();

        return currentDate;
    }
    
    public Date getEndDate(String endDate) throws ParseException {      
        DateFormat df = new SimpleDateFormat("mm-dd-yyyy");
        Date formattedEndDate = df.parse(endDate);
        
        return formattedEndDate;
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