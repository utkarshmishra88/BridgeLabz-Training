package com.junit.AdvanceProblems.dataformatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter{
	
	// Method to format date from "yyyy-MM-dd" to "dd-MM-yyyy"
    public String formatDate(String inputDate){
        try{
            LocalDate d=LocalDate.parse(inputDate,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return d.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
        catch(Exception e){
            throw new IllegalArgumentException("Invalid date");
        }
    }
}
