package com.smartcitytransport;
class AmbulanceService implements TransportService, EmergencyService {

    public String getServiceName() { return "Ambulance"; }
    public double getFare() { return 0; }
    public int getDepartureTime() { return 0; }
}
