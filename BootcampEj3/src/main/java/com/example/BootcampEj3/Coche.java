package com.example.BootcampEj3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;
    private String model;
    private Integer car_year;

    public Coche() {
    }

    public Coche(Long id, String manufacturer, String model, Integer car_year) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.car_year = car_year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCar_year() {
        return car_year;
    }

    public void setCar_year(Integer car_year) {
        this.car_year = car_year;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", car_year=" + car_year +
                '}';
    }
}
