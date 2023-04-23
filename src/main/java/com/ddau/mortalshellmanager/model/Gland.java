package com.ddau.mortalshellmanager.model;

import com.ddau.mortalshellmanager.enums.GlandLocation;
import lombok.Generated;

import javax.persistence.*;

@Entity
public class Gland {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Enumerated(EnumType.STRING)
    GlandLocation currentGlandLocation;

    private Integer bossId;

    public Gland() {
        id = -1;
        currentGlandLocation = GlandLocation.NOTVALID;
        bossId = -1;
    }

    public Gland(Integer id, GlandLocation currentGlandLocation, Integer bossId) {
        this.id = id;
        this.currentGlandLocation = currentGlandLocation;
        this.bossId = bossId;
    }

    @Generated
    public Integer getId() {
        return id;
    }

    @Generated
    public GlandLocation getCurrentGlandLocation() {
        return currentGlandLocation;
    }

    @Generated
    public Integer getBossId() {
        return bossId;
    }
}
