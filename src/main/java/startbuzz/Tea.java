package startbuzz;

public class Tea extends CoffeineBeverage {
    @Override
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    @Override
    void brew() {
        System.out.println("티백을 담근다.");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가한다.");
    }
}