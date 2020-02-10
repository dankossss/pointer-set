import java.util.Objects;

public class Body {

    private String color;
    private String bodyType;

    public Body(String color, String bodyType) {
        this.color = color;
        this.bodyType = bodyType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Колiр вашої машини -------> " + color + "\nТип кузова ---------------> " + bodyType + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Body body = (Body) o;
        return Objects.equals(color, body.color) &&
                Objects.equals(bodyType, body.bodyType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, bodyType);
    }
}
