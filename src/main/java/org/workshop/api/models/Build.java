package org.workshop.api.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Build {
    private Long id;
    private String status;
    private String state;
    private BuildType buildType;
}
