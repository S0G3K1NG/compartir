import java.util.*;

import static david.Scanners.*;

public class MainDD {
  public static void main(String[] args) {
    int ej = 0;
    while (ej != 4) {
      System.out.println("""
              1-3. Ejercicios
              4. Salir""");
      ej = entero();
      switch (ej) {
        case 1 -> ej1();
        case 2 -> ej2();
        case 3 -> ej3();
        case 4 -> System.out.println("👍");
        default -> System.out.println("Opcion incorrecta");
      }
    }
  }

  private static void ej1() {
    List<String> listaConDuplicados =
            Arrays.asList("perro", "gato", "perro", "loro", "gato",
                    "elefante");
    // Utilizar un HashSet para eliminar duplicados
    Set<String> conjuntoSinDuplicados = new HashSet<>(listaConDuplicados);

    System.out.println("Lista original: " +
            listaConDuplicados);
    System.out.println("Lista sin duplicados: " +
            conjuntoSinDuplicados);
  }

  private static void ej2() {
    Set<Integer> conjunto1 = new
            HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> conjunto2 = new
            HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

    // Verificar si hay elementos comunes
    boolean boolCom = false;
    ArrayList<Integer> comunes = new  ArrayList<>();
    for (int i : conjunto1) {
      if (conjunto2.contains(i)) {
        boolCom = true;
        comunes.add(i);
      }
    }
    System.out.println(boolCom);
    System.out.println(comunes);
  }

  private static void ej3() {
    TreeSet<AlumnoDD> alumnos = new TreeSet<>();
    alumnos.add(new AlumnoDD("david", 12));
    alumnos.add(new AlumnoDD("javi", 15));
    alumnos.add(new AlumnoDD("mario", 5));
    alumnos.add(new AlumnoDD("carlos", 20));

    HashSet<ProfesorDD> profesores = new HashSet<>();
    profesores.add(new ProfesorDD("carmen", 2));
    profesores.add(new ProfesorDD("marian", 4));
    profesores.add(new ProfesorDD("marian", 4));

    for (AlumnoDD a : alumnos) {
      System.out.println(a);
    }
    for (ProfesorDD p : profesores) {
      System.out.println(p);
    }
  }
}
