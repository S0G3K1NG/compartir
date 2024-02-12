import java.util.Objects;

public class ProfesorDD {
  private String nombre;
  private int id;

  public ProfesorDD(String nombre, int id) {
    this.nombre = nombre;
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "ProfesorDD{" +
            "nombre='" + nombre + '\'' +
            ", id=" + id +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProfesorDD that = (ProfesorDD) o;
    return Objects.equals(getNombre(), that.getNombre());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNombre());
  }
}
