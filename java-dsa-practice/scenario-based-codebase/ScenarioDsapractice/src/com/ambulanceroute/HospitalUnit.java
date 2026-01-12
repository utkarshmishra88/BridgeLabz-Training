package com.ambulanceroute;
class HospitalUnit {
    String name;
    boolean isAvailable;
    HospitalUnit next;

    HospitalUnit(String name, boolean isAvailable) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.next = null;
    }
}
