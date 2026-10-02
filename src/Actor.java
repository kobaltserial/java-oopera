import java.util.Objects;

public class Actor extends Person {
    private double height;

    public Actor(String name, String surname, String gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor other = (Actor) obj;
        return Double.compare(other.height, height) == 0
                && Objects.equals(getName(), other.getName())
                && Objects.equals(getSurname(), other.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }

    @Override
    public String toString() {
        return super.toString() + " (" + height + ")";
    }
}