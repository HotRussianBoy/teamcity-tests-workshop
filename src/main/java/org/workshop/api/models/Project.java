package org.workshop.api.models;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder
public class Project {
    private ParentProject parentProject;
    private String name;
    private String id;
    private Boolean copyAllAssociatedSettings;
}
