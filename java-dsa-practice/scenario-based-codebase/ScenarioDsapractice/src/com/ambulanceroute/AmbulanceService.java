package com.ambulanceroute;
public class AmbulanceService {

    public static void main(String[] args) {

        CircularHospitalRoute route = new CircularHospitalRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.showRoute();

        route.redirectPatient();   // Finds Surgery

        route.removeUnit("Surgery"); // Under maintenance

        route.showRoute();

        route.redirectPatient();   // All busy
    }
}
