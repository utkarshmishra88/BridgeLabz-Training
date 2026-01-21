package com.sorting.medwarehouse;
class Medicine {
    String name;
    int expiry; // days left to expire

    Medicine(String name, int expiry) {
        this.name = name;
        this.expiry = expiry;
    }
}