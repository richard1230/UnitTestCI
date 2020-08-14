package createSameClassesInDifferentPackage.Pet2;

import org.junit.jupiter.api.Test;


class HomeTest {
    @Test
    public void createSameClassesInDifferentPackageTest() {
        Home home = new Home();
        home.cat1 = new createSameClassesInDifferentPackage.Pet1.Cat();
        home.cat2 = new createSameClassesInDifferentPackage.Pet2.Cat();
    }
}
