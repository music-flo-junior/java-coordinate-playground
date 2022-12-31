package fuelinjection;

import fuelinjection.car.AbstractCar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/12/31
 */
public class RentCompany {

    private final List<AbstractCar> cars;

    public RentCompany() {
        this.cars = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(AbstractCar abstractCar) {
        cars.add(abstractCar);
    }

    public String generateReport() {
        return cars.stream()
                .map(car -> {
                    int number = (int) (car.getChargeQuantity());
                    return String.format("%s : %s리터", car.getName(), number);
                })
                .collect(Collectors.joining("\n")) + "\n";
    }
}
