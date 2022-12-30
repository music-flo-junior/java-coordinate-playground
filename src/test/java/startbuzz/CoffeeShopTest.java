package startbuzz;

import org.junit.jupiter.api.Test;

class CoffeeShopTest {

    @Test
    void coffeeTest() {
        CoffeineBeverage beverage = new Coffee();
        beverage.prepareRecipe();
    }

    @Test
    void teaTest() {
        CoffeineBeverage beverage = new Tea();
        beverage.prepareRecipe();
    }
}
