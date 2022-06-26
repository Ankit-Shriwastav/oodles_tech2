package com.example.oodles_tech_2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OODLES_DETAILS")
public class OodlesData {
    @Id
    @Column(name="ID")
    private long id;
    @Column(name="NAME")
    private String name;
    @Column(name="GENDER")
    private String gender;
    @Column(name="MOBILE_NUMBER")
    private String mobileNumber;

    public OodlesData(){}

    public OodlesData(long id, String name, String gender, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
