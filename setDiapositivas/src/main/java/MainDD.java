import java.util.TreeSet;

import static david.Scanners.*;
public class MainDD {

  public static void main(String[] args) {
    int ej = 0;
    while (ej != 8) {
      System.out.println("""
              1-7. Ejercicios
              8. Salir""");
      ej = entero();
      switch (ej) {
        case 1 -> ej1();
      }
    }
  }

  private static void ej1() {
    TreeSet<EstudianteDD> estudiantes = new TreeSet<>();
    estudiantes.add(new EstudianteDD(10, 18, "david"));
    estudiantes.add(new EstudianteDD(10, 18, "javi"));
    estudiantes.add(new EstudianteDD(10, 19, "alvaro"));
    estudiantes.add(new EstudianteDD(10, 18, "carlos"));

    for (EstudianteDD e : estudiantes) {
      System.out.println(e);
    }
  }
}
