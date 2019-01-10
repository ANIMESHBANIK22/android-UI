package com.example.virus.mystore.model_classes;

public class Nav_model_You {

    private String personName;
    private String jobProfile;

    public Nav_model_You(String personName, String jobProfile) {
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
