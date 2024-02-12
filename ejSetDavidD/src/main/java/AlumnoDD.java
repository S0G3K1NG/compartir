public class AlumnoDD implements Comparable<AlumnoDD> {
  private String nombre;
  private int id;

  public AlumnoDD(String nombre, int id) {
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
  public int compareTo(AlumnoDD o) {
    return this.id - o.getId();
  }

  @Override
  public String toString() {
    return "AlumnoDD{" +
            "nombre='" + nombre + '\'' +
            ", id=" + id +
            '}';
  }
}
