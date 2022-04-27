package com.example.myrecycleviewhorizonvertical.Role;

public abstract class PersonData {
    public String mName;
    public String mAge;
    public String mCompany;

    public void setAge(String pAge) {
        mAge = pAge;
    }

    public void setCompany(String pCompany) {
        mCompany = pCompany;
    }

    public void setName(String pName) {
        mName = pName;
    }



    public abstract String getName();

    public abstract String getAge();

    public abstract String getCompany();
}
