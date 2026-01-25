package com.junit.AdvanceProblems.dataformatter;
import static org.junit.Assert.*;
import org.junit.Test;

public class DateFormatterTest{
	
	// Create an instance of DateFormatter
    DateFormatter f=new DateFormatter();

    @Test
    public void testValidDate(){
        assertEquals("25-01-2026",f.formatDate("2026-01-25"));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testInvalidDateFormat(){
        f.formatDate("25-01-2026");
    }

    @Test(expected=IllegalArgumentException.class)
    public void testInvalidDateValue(){
        f.formatDate("2026-02-30");
    }

    @Test(expected=IllegalArgumentException.class)
    public void testNullDate(){
        f.formatDate(null);
    }
}
