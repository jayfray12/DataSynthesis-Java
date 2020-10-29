package com.redhat.idaas.datasynthesis.dtos;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SSN {
    public String SocialSecurityNumberValue;

    public SSN(String socialSecurityNumberValue) {
        SocialSecurityNumberValue = socialSecurityNumberValue;
    }

    //Getters and Setters
    public String getSocialSecurityNumberValue() {
        return SocialSecurityNumberValue;
    }

    public void setSocialSecurityNumberValue(String socialSecurityNumber) {
        SocialSecurityNumberValue = socialSecurityNumber;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
