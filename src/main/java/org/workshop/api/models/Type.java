package org.workshop.api.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Type {
    private String rawValue;
}
