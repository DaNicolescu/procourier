package com.procourier.model;

import java.util.Objects;

public final class Seller {
    private String name;
    private String description;
    private Location address;

    public Seller(String name, String description, Location address) {
        this.name = Objects.requireNonNull(name);
        this.description = Objects.requireNonNull(description);
        this.address = Objects.requireNonNull(address);
    }

    public Seller(String name, Location address) {
        this(name, "", address);
    }

}
