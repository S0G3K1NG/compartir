public class CancionDD {
  private String nombre;
  private String grupo;
  private int duracion;

  public CancionDD(String nombre, String grupo, int duracion) {
    this.nombre = nombre;
    this.grupo = grupo;
    this.duracion = duracion;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getGrupo() {
    return grupo;
  }

  public void setGrupo(String grupo) {
    this.grupo = grupo;
  }

  public int getDuracion() {
    return duracion;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  @Override
  public String toString() {
    return "CancionDD{" +
            "nombre='" + nombre + '\'' +
            ", grupo='" + grupo + '\'' +
            ", duracion=" + duracion +
            '}';
  }
}
