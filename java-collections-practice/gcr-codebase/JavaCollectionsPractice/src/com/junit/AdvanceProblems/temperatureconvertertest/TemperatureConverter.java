package com.junit.AdvanceProblems.temperatureconvertertest;

// Class for converting temperatures between Celsius and Fahrenheit
public class TemperatureConverter{
	
	// Method to convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double c){
        return (c*9/5)+32;
    }
    
    // Method to convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }
}
