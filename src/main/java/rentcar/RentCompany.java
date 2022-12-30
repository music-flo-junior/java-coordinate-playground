package rentcar;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    private final List<Car> carList = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public String generateReport() {
        StringBuilder builder = new StringBuilder();
        for (Car car : carList) {
            builder.append(String.format("%s : %.0f리터", car.getName(), car.getChargeQuantity()))
                    .append("\n");
        }
        return builder.toString();
    }
}
