//Program to convert kilometer to miles
public class KilometerToMilesConverter
{
public static void main(String args[])
{
//distance in kilometer
double distanceInKilometer=10.8;
//coversion factor
double conversionfactor=1.6;//given
//convert kilometers to miles
double distanceInMiles=distanceInKilometer*conversionfactor;
//Displaying result
System.out.println("The distance "+distanceInKilometer+" km in miles is "+distanceInMiles);
}
}