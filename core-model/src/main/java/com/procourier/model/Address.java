package com.procourier.model;

import java.util.Objects;

public final class Address {
    private String region;
    private String city;
    private String address;
    private String streetNumber;

    public Address(String region, String city, String address, String streetNumber) {
        this.region = Objects.requireNonNull(region);
        this.city = Objects.requireNonNull(city);
        this.address = Objects.requireNonNull(address);
        this.streetNumber = Objects.requireNonNull(streetNumber);
    }

    public Address(String region, String city, String address) {
        this(region, city, address, "");
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getStreetNumber() {
        return streetNumber;
    }
}
