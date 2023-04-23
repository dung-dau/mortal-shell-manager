package com.ddau.mortalshellmanager.model;

import org.junit.jupiter.api.Test;

public class WeaponTest {
    @Test
    public void testBasicConstructor() {
        Weapon testWeapon = new Weapon(
                3,
                "Martyr's Blade",
                "A two-handed sword, achingly cold to grasp. \n" +
                        "A remnant from a long dead empire. The First Martyr reserved this greatsword for heretics, but the " +
                        "blade fell upon many pious necks. In time devotion was not enough, the Enshrined whispered of new" +
                        "sins and new foes hidden within their ranks.",
                4,
                null
        );
        WeaponUpgrades testWeaponUpgrades = new WeaponUpgrades(
                "Petrified Winterglass",
                true,
                "Radiant Winterglass",
                true,
                null
        );
        testWeapon.setWeaponUpgrades(testWeaponUpgrades);
        testWeaponUpgrades.setWeapon(testWeapon);

        int expectedWeaponId = 3;
        int actualWeaponId = testWeapon.getId();

        String expectedWeaponName = "Martyr's Blade";
        String actualWeaponName = testWeapon.getName();

        String expectedWeaponDescription = "A two-handed sword, achingly cold to grasp. \n" +
                "A remnant from a long dead empire. The First Martyr reserved this greatsword for heretics, but the " +
                "blade fell upon many pious necks. In time devotion was not enough, the Enshrined whispered of new" +
                "sins and new foes hidden within their ranks.";
        String actualWeaponDescription = testWeapon.getDescription();

        int expectedNumQuencingAcid = 4;
        int actualNumQuencingAcid = testWeapon.getNumQuencingAcid();

        WeaponUpgrades expectedWeaponUpgrades = testWeaponUpgrades;
        WeaponUpgrades actualWeaponUpgrades = testWeapon.getWeaponUpgrades();

        assert(expectedWeaponId == actualWeaponId);
        assert(expectedWeaponName.equals(actualWeaponName));
        assert(expectedWeaponDescription.equals(actualWeaponDescription));
        assert(expectedNumQuencingAcid == actualNumQuencingAcid);
        assert(expectedWeaponUpgrades.equals(actualWeaponUpgrades));
    }
}
