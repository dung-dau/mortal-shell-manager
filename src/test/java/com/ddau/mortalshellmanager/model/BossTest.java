package com.ddau.mortalshellmanager.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BossTest {

    @Test
    public void testEmptyConstructor() {
        Boss boss = new Boss();

        String expectedBossName = "";
        String actualBossName = boss.getName();

        boolean expectedIsDefeated = false;
        boolean actualIsDefeated = boss.isDefeated();

        assertTrue(actualBossName.equals(expectedBossName));
        assertEquals(expectedIsDefeated, actualIsDefeated);
    }

    @Test
    public void testNoSpaceBossName() {
        Boss boss = new Boss("Hadern", false);

        String expectedBossName = "Hadern";
        String actualBossName = boss.getName();

        boolean expectedIsDefeated = false;
        boolean actualIsDefeated = boss.isDefeated();

        assertTrue(actualBossName.equals(expectedBossName));
        assertEquals(expectedIsDefeated, actualIsDefeated);
    }

    @Test
    public void testBossNameWithSpaces() {
        Boss boss = new Boss("Crucix, The Twiceborn", true);

        String expectedBossName = "Crucix, The Twiceborn";
        String actualBossName = boss.getName();

        boolean expectedIsDefeated = true;
        boolean actualIsDefeated = boss.isDefeated();

        assertTrue(actualBossName.equals(expectedBossName));
        assertEquals(expectedIsDefeated, actualIsDefeated);
    }

    @Test
    public void testNullBossName() {
        Boss boss = new Boss(null, true);

        String expectedBossName = "";
        String actualBossName = boss.getName();

        boolean expectedIsDefeated = true;
        boolean actualIsDefeated = boss.isDefeated();

        assertTrue(actualBossName.equals(expectedBossName));
        assertEquals(expectedIsDefeated, actualIsDefeated);
    }

    @Test
    public void testEmptyBossName() {
        Boss boss = new Boss("", false);

        String expectedBossName = "";
        String actualBossName = boss.getName();

        boolean expectedIsDefeated = false;
        boolean actualIsDefeated = boss.isDefeated();

        assertTrue(actualBossName.equals(expectedBossName));
        assertEquals(expectedIsDefeated, actualIsDefeated);
    }

}
