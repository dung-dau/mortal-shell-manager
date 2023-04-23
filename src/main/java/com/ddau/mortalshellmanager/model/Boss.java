package com.ddau.mortalshellmanager.model;

import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boss {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private boolean isDefeated;

    public Boss() {
        this.name = "";
        this.isDefeated = false;
    }

    public Boss(Integer id, String name, boolean isDefeated) {
        this.id = id;
        this.name = name;
        this.isDefeated = isDefeated;
    }

    public Boss(String name, boolean isDefeated) {
        if(name == null || name.isBlank()) {
            this.name = "";
        } else {
            this.name = name;
        }
        this.isDefeated = isDefeated;
    }

    @Generated
    public Integer getId() {
        return id;
    }

    @Generated
    public String getName() {
        return name;
    }

    @Generated
    public void setName(String name) {
        this.name = name;
    }

    @Generated
    public boolean isDefeated() {
        return isDefeated;
    }

    @Generated
    public void setDefeated(boolean defeated) {
        isDefeated = defeated;
    }
}
