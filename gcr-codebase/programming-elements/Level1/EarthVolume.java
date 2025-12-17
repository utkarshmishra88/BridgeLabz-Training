// Program to calculate volume of Earth in cubic kilometers and cubic miles
public class EarthVolume
{  
    public static void main(String[] args)
    {
        //declare and initialize variables
        double radiusKm = 6378;
        double pi = 3.14159;
        
        double volumeKm = (4.0 / 3) * pi * radiusKm * radiusKm * radiusKm; //volume in km^3
        double volumeMiles = volumeKm * 0.239913;                          //convert to miles^3
        
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                           " and cubic miles is " + volumeMiles); //Display the result
    }
}
