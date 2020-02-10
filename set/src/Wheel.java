import java.util.Objects;

public class Wheel {

    private String wheelType = "stock";
    private int diameter;
    private double pressure;

    public Wheel(int diameter, double pressure) {
        this.diameter = diameter;
        this.pressure = pressure;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public String getType() {
        return wheelType;
    }

    public void setType(String type) {
        this.wheelType = type;
    }

    @Override
    public String toString() {
        return "У вас встановленi диски --> " + diameter + "-го діаметру\nТип встановлених шин    --> " + wheelType + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return diameter == wheel.diameter &&
                Double.compare(wheel.pressure, pressure) == 0 &&
                Objects.equals(wheelType, wheel.wheelType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(wheelType, diameter, pressure);
    }
}
