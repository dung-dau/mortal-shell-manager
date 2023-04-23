package com.ddau.mortalshellmanager.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Weapon {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private String description;

    private int numQuencingAcid;
    @OneToOne(mappedBy = "weapon")
    private WeaponUpgrades weaponUpgrades;

    public Weapon(int id, String name, String description, int numQuencingAcid, WeaponUpgrades weaponUpgrades) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.numQuencingAcid = numQuencingAcid;
        this.weaponUpgrades = weaponUpgrades;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumQuencingAcid() {
        return numQuencingAcid;
    }

    public WeaponUpgrades getWeaponUpgrades() {
        return weaponUpgrades;
    }

    public void setWeaponUpgrades(WeaponUpgrades weaponUpgrades) {
        this.weaponUpgrades = weaponUpgrades;
    }
}
