package org.workshop.api.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BuildType {
    private String id;
    private String name;
    private Project project;
    private Properties parameters;
    private Steps steps;
    // TODO: add fields from API Doc https://www.jetbrains.com/help/teamcity/rest/buildtype.html
}
