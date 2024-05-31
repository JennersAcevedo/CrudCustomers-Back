package com.demo.model;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String line_1;
    private String line_2;
    private String line_3;
    private String state;
    private String city;
    private String country;
    private Integer referenceType;
    private Long referenceId;

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id =id;
    }

    public String getLine_1() {
        return line_1;
    }

    public void setLine_1(String line_1) {
        this.line_1 = line_1;
    }

    public String getLine_2() {
        return line_2;
    }

    public void setLine_2(String line_2) {
        this.line_2 = line_2;
    }

    public String getLine_3() {
        return line_3;
    }

    public void setLine_3(String line_3) {
        this.line_3 = line_3;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getReference_type() {
        return referenceType;
    }

    public void setReference_type(Integer reference_type) {
        this.referenceType = reference_type;
    }

    public Long getReference_id() {
        return referenceId;
    }

    public void setReference_id(Long reference_id) {
        this.referenceId = reference_id;
    }


}
