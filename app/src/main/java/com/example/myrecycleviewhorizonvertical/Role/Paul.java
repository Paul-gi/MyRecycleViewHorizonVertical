package com.example.myrecycleviewhorizonvertical.Role;

public class Paul extends PersonData {
    public Paul(String pName, String pAge, String pCompany) {
        setAge(pAge);
        setCompany(pCompany);
        setName(pName);
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public String getAge() {
        return mAge;
    }

    @Override
    public String getCompany() {
        return mCompany;
    }
}
