package com.example.virus.mystore.model_classes;

public class Sub_Details {

    private String personName;
    private String jobProfile;

    public Sub_Details(String personName, String jobProfile) {
        this.personName = personName;
        this.jobProfile = jobProfile;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getJobProfile() {
        return jobProfile;
    }

    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }
}
