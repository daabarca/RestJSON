package com.daa.piloto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    
    private String summary;
 
    public String getSummary() {
        return summary;
    }
 
    public void setSummary(String summary) {
        this.summary = summary;
    }
}