package sample.classes;

/**
 * Created by 5ia15niwallner on 08.06.2017.
 */
public class Car {
    private String carName;
    private String licensePlate;
    private double cubic;
    private int ps;

    public Car(String carName, String licensePlate, double cubic, int ps) {
        this.carName = carName;
        this.licensePlate= licensePlate;
        this.cubic = cubic;
        this.ps = ps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", cubic=" + cubic +
                ", ps=" + ps +
                '}';
    }
}
