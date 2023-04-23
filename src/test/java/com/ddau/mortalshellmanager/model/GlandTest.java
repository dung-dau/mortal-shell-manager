package com.ddau.mortalshellmanager.model;

import com.ddau.mortalshellmanager.enums.GlandLocation;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GlandTest {
    private static Boss testFirstBoss;
    private static Boss testSecondBoss;

    @BeforeAll
    public static void init() {
        testFirstBoss = new Boss(1, "Imrod the Unrepentant", true);
        testSecondBoss = new Boss(2, "Tarsus, The First Martyr", false);
    }

    @Test
    public void testEmptyConstructor() {
        Gland newGland = new Gland();

        GlandLocation expectedGlandLocation = GlandLocation.NOTVALID;
        GlandLocation actualGlandLocation = newGland.getCurrentGlandLocation();

        assert(expectedGlandLocation == actualGlandLocation);
    }

    @Test
    public void testNonEmptyConstructor() {
        Gland gland = new Gland(1, GlandLocation.WITHPLAYER, testFirstBoss.getId());

        int expectedId = 1;
        int actualId = gland.getId();
        GlandLocation expectedGlandLocation = GlandLocation.WITHPLAYER;
        GlandLocation actualGlandLocation = gland.getCurrentGlandLocation();
        int expectedBossId = 1;
        int actualBossId = gland.getBossId();

        assert(expectedId == actualId);
        assert(expectedGlandLocation == actualGlandLocation);
        assert(expectedBossId == actualBossId);
    }
}
