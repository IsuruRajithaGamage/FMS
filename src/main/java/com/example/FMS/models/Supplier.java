package com.example.FMS.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String address;
    private String city;
    private String phone;
    private String mobile;
    private String website;
    private String email;

    @ManyToOne
    @JoinColumn(name="countryid", insertable=false, updatable=false)
    private Country country;
    private Integer countryid;

    @ManyToOne
    @JoinColumn(name="stateid", insertable=false, updatable=false)
    private State state;
    private Integer stateid;

    private String details;
}
