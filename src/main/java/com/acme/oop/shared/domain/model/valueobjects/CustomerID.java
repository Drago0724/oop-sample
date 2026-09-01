package com.acme.oop.shared.domain.model.valueobjects;
import java.util.Objects;
import java.util.UUID;

public record CustomerID(UUID value) {
    public CustomerID {        if (Objects.isNull(value)) {
            throw new IllegalArgumentException("CustomerID cannot be null");
        }
    }
    public CustomerID()
    {
        this(UUID.randomUUID());
    }

    @Override
    public String toString() {
         return value.toString();    }
}
