package org.workshop.api.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Items {
    private List<String> item;
}
