package org.workshop.api.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VcsRoot {
    private String id;
    private String internalId;
    private String uuid;
    private String name;
    private String vcsName;
    private Integer modificationCheckInterval;
    private String href;
    private Project project;
    private Properties properties;
    private VcsRootInstances vcsRootInstances;
    private Items repositoryIdStrings;
    private String projectLocator;
    private String locator;
}
