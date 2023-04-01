// Note: Do not write @Enumerated annotation above CountryName in this model.
package com.driver.model;

import javax.persistence.*;

@Entity
public class Country {
    public Country(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    CountryName countryName;
    String code;
    @OneToOne
    @JoinColumn
    User user;
    @ManyToOne
    @JoinColumn
    ServiceProvider serviceProvider;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CountryName getCountryName() {
        return countryName;
    }

    public void setCountryName(CountryName countryName) {
        this.countryName = countryName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public Country(int id, CountryName countryName, String code, User user, ServiceProvider serviceProvider) {
        this.id = id;
        this.countryName = countryName;
        this.code = code;
        this.user = user;
        this.serviceProvider = serviceProvider;
    }
}