package com.ddau.mortalshellmanager.model;

import lombok.Generated;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class WeaponUpgrades {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String firstUpgradeName;
    private boolean hasFirstUpgrade;

    private String secondUpgradeName;
    private boolean hasSecondUpgrade;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Weapon weapon;

    public WeaponUpgrades(String firstUpgradeName, boolean hasFirstUpgrade,
                          String secondUpgradeName, boolean hasSecondUpgrade, Weapon weapon) {
        this.firstUpgradeName = firstUpgradeName;
        this.hasFirstUpgrade = hasFirstUpgrade;
        this.secondUpgradeName = secondUpgradeName;
        this.hasSecondUpgrade = hasSecondUpgrade;
        this.weapon = weapon;
    }

    @Generated
    public String getFirstUpgradeName() {
        return firstUpgradeName;
    }

    @Generated
    public boolean hasFirstUpgrade() {
        return hasFirstUpgrade;
    }

    @Generated
    public String getSecondUpgradeName() {
        return secondUpgradeName;
    }

    @Generated
    public boolean hasSecondUpgrade() {
        return hasSecondUpgrade;
    }

    @Generated
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Generated
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeaponUpgrades that = (WeaponUpgrades) o;
        return hasFirstUpgrade == that.hasFirstUpgrade && hasSecondUpgrade == that.hasSecondUpgrade && Objects.equals(id, that.id) && Objects.equals(getFirstUpgradeName(), that.getFirstUpgradeName()) && Objects.equals(getSecondUpgradeName(), that.getSecondUpgradeName()) && Objects.equals(weapon, that.weapon);
    }
}
