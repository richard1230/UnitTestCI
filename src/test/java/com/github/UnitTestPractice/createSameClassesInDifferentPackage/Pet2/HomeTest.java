package com.github.UnitTestPractice.createSameClassesInDifferentPackage.Pet2;

import org.junit.jupiter.api.Test;


class HomeTest {
    @Test
    public void createSameClassesInDifferentPackageTest() {
        Home home = new Home();
        home.cat1 = new com.github.UnitTestPractice.createSameClassesInDifferentPackage.Pet1.Cat();
        home.cat2 = new com.github.UnitTestPractice.createSameClassesInDifferentPackage.Pet2.Cat();
    }
}
