package org.workshop.api.models;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Property {
    private String name;
    private String value;

}

