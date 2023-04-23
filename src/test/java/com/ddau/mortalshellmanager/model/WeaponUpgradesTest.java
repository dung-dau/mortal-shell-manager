package com.ddau.mortalshellmanager.model;

import org.junit.jupiter.api.Test;

public class WeaponUpgradesTest {

    @Test
    public void testEqualsMethod() {
        WeaponUpgrades testWeaponUpgrades = new WeaponUpgrades(
                "Perfumed Censer",
                true,
                "Foul Censer",
                false,
                null
        );

        WeaponUpgrades expectedWeaponUpgrades = new WeaponUpgrades(
                "Perfumed Censer",
                true,
                "Foul Censer",
                false,
                null
        );

        assert(expectedWeaponUpgrades.equals(testWeaponUpgrades));
    }

    @Test
    public void testBasicConstructor() {
        WeaponUpgrades testWeaponUpgrades = new WeaponUpgrades(
                "Awakened Stone",
                true,
                "Foundry Stone",
                false,
                null
        );
        Weapon testWeapon = new Weapon(
                2,
                "Smouldering Mace",
                "Ashes drift from the mace's smoldering head.\n" +
                        "This mace bears an inscription: \"Righteous fire may only be wielded by a disciple consecrated by " +
                        "wrath and fury.",
                5,
                testWeaponUpgrades
        );
        testWeaponUpgrades.setWeapon(testWeapon);

        String expectedFirstUpgradeName = "Awakened Stone";
        String actualFirstUpgradeName = testWeaponUpgrades.getFirstUpgradeName();
        boolean expectedHasFirstUpgrade = true;
        boolean actualHasFirstUpgrade = testWeaponUpgrades.hasFirstUpgrade();

        String expectedSecondUpgradeName = "Foundry Stone";
        String actualSecondUpgradeName = testWeaponUpgrades.getSecondUpgradeName();

        boolean expectedHasSecondUpgrade = false;
        boolean actualHasSecondUpgrade = testWeaponUpgrades.hasSecondUpgrade();

        assert(expectedFirstUpgradeName.equals(actualFirstUpgradeName));
        assert(expectedHasFirstUpgrade == actualHasFirstUpgrade);
        assert(expectedSecondUpgradeName.equals(actualSecondUpgradeName));
        assert(expectedHasSecondUpgrade == actualHasSecondUpgrade);
    }
}
