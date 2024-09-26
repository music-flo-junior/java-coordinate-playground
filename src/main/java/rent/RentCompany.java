package rent;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    private final List<Car> carList = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        this.carList.add(car);
    }

    public String generateReport() {
        StringBuilder reportBuilder = new StringBuilder();
        for (Car car : this.carList) {
            reportBuilder.append(car.getName()).append(" : ").append(Math.round(car.getChargeQuantity())).append("리터").append(NEWLINE);
        }
        return reportBuilder.toString();
    }
}
