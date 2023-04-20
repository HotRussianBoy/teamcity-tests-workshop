package org.workshop.api.models;

import org.workshop.api.generators.RandomData;

import java.util.Arrays;


public class PropertiesGenerator {

    private final RandomData randomData = new RandomData();


    public Properties getBasicVcsProp() {
        return Properties.builder()
                .property(Arrays.asList(
                        new Property("authMethod","ANONYMOUS"),
                        new Property("branch","refs/heads/"+ randomData.getString()),
                        new Property("url","https://github.com/AlexPshe/"+ randomData.getString())
                ))
                .build();
    }

    public Properties getBasicStepProp() {
        return Properties.builder()
                .property(Arrays.asList(
                        new Property("script.content","echo \"Hello world!\""),
                        new Property("teamcity.step.mode","default"),
                        new Property("use.custom.script","true")
                ))
                .build();
    }
}
