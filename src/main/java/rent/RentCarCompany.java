package rent;

import java.util.ArrayList;
import java.util.List;

public class RentCarCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    private final List<CarInterface> carList = new ArrayList<>();

    public static RentCarCompany create() {
        return new RentCarCompany();
    }

    public void addCar(CarInterface car) {
        this.carList.add(car);
    }

    public String generateReport() {
        StringBuilder reportBuilder = new StringBuilder();
        for (CarInterface car : this.carList) {
            reportBuilder.append(car.getName()).append(" : ").append(Math.round(car.getChargeQuantity())).append("리터").append(NEWLINE);
        }
        return reportBuilder.toString();
    }
}
