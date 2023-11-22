package com.SharathInfotech.PoServices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id ;
    public String  poNumber;
    public String poName;
    public String poCompany;
    public String poc;
    public String poAmount;
    public String poDescription;
    public Date poDate;
    public String noofhours;
    public String rateperhour;

}
