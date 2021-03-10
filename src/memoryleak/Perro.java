package memoryleak;

import java.util.Objects;

public class Perro {
    String raza;

    public Perro(String raza) {
        this.raza = raza;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Perro)) {
            return false;
        }
        Perro perro = (Perro) o;
        return Objects.equals(raza, perro.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(raza);
    }

}
