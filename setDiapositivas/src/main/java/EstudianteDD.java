public class EstudianteDD implements Comparable<EstudianteDD>{
  private int nota;
  private int edad;
  private String nombre;

  public EstudianteDD(int nota, int edad, String nombre) {
    this.nota = nota;
    this.edad = edad;
    this.nombre = nombre;
  }

  public int getNota() {
    return nota;
  }

  public void setNota(int nota) {
    this.nota = nota;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public int compareTo(EstudianteDD o) {
    if (this.edad == o.getEdad()) {
      return this.nombre.compareTo(o.getNombre());
    } else {
      return this.edad - o.getEdad();
    }
  }

  @Override
  public String toString() {
    return "EstudianteDD{" +
            "nota=" + nota +
            ", edad=" + edad +
            ", nombre='" + nombre + '\'' +
            '}';
  }
}
