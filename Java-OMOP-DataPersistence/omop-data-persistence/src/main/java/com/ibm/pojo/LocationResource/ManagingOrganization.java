package com.ibm.pojo.LocationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ManagingOrganization {
    public String reference;

    public String getReference() { return reference; }

    public void setReference(String reference) { this.reference = reference; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }
}