import java.util.*;

public class ListasDD {
  private static int entero() {
    Scanner in = new Scanner(System.in);
    return in.nextInt();
  }

  private static String str() {
    Scanner in = new Scanner(System.in);
    return in.nextLine();
  }

  public static void main(String[] args) {
    int ej = 0;
    while (ej != 9) {
      System.out.println("""
              1-8. Ejercicios
              9. Salir""");
      ej = entero();
      switch (ej) {
        case 1 -> ej1();
        case 2 -> ej2();
        case 3 -> ej3();
        case 4 -> ej4();
        case 5 -> ej5();
        case 6 -> ej6();
        case 7 -> ej7();
        case 8 -> ej8();
        case 9 -> System.out.println("👍");
        default -> System.out.println("Opcion incorrecta");
      }
    }
  }

  private static void ej1() {
    ArrayList<String> arr = new ArrayList<>();
    Vector<String> vec = new Vector<>();
    LinkedList<String> link = new LinkedList<>();

    arr.add("David");
    arr.add("Javi");
    arr.add("Carlos");
    arr.add("Ivan");
    arr.add("Mario");
    vec.add("David");
    vec.add("Javi");
    vec.add("Carlos");
    vec.add("Ivan");
    vec.add("Mario");
    link.add("David");
    link.add("Javi");
    link.add("Carlos");
    link.add("Ivan");
    link.add("Mario");

    System.out.println("arr");
    for (String str : arr) {
      System.out.println(str);
    }

    System.out.println("vec");
    for (String str : vec) {
      System.out.println(str);
    }

    System.out.println("link");
    for (String str : link) {
      System.out.println(str);
    }
  }

  private static void ej2() {
    ArrayList<Integer> arr = new ArrayList<>();
    Random rnd = new Random();

    int tam = rnd.nextInt(10, 20);
    for (int i = 0; i < tam; i++) {
      arr.add(rnd.nextInt(0, 100));
    }

    int sum = 0;
    for (int n : arr) {
      sum += n;
    }

    int med = sum / arr.size();

    int max = arr.getFirst();
    for (int n : arr) {
      if (n > max) {
        max = n;
      }
    }

    int min = arr.getFirst();
    for (int n : arr) {
      if (n < min) {
        min = n;
      }
    }

    for (int n : arr) {
      System.out.print(n + " ");
    }
    System.out.println();
    System.out.println("Suma: " + sum);
    System.out.println("Media: " + med);
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
  }

  private static void ej3() {
    ArrayList<Integer> arr = new ArrayList<>();

    System.out.println("Añade 10 numeros");
    for (int i = 0; i < 10; i++) {
      arr.add(entero());
    }

    arr.sort(Integer::compareTo);
    for (int n : arr) {
      System.out.print(n + " ");
    }
    System.out.println();
  }

  private static void ej4() {
    ArrayList<String> arr = new ArrayList<>();

    System.out.println("Añade 10 palabras");
    for (int i = 0; i < 10; i++) {
      arr.add(str());
    }

    arr.sort(String::compareTo);
    for (String str : arr) {
      System.out.print(str + " ");
    }
    System.out.println();
  }

  private static void ej5() {
    LinkedList<CancionDD> disco = new LinkedList<>();
    LinkedList<CancionDD> borradas = new LinkedList<>();

    disco.add(new CancionDD("A", "grupo", 120));
    disco.add(new CancionDD("B", "grupo", 120));
    disco.add(new CancionDD("C", "grupo", 120));
    disco.add(new CancionDD("D", "grupo", 120));
    disco.add(new CancionDD("E", "grupo", 120));

    int opt = 0;
    while (opt != 4) {
      mostrarC(disco);
      System.out.println("""
              1. Cambiar posicion de cancion
              2. Borrar cancion
              3. Ver la cancion en una posicion
              4. Salir""");
      opt = entero();
      switch (opt) {
        case 1 -> {
          System.out.print("x: ");
          int x = entero();
          System.out.print("y: ");
          int y = entero();

          CancionDD cTemp = disco.get(y);
          CancionDD cTemp2 = disco.get(x);
          disco.set(y,cTemp2);
          disco.set(x,cTemp);
        }
        case 2 -> {
          System.out.println("Nombre de la cancion a borrar");
          String c = str();
          CancionDD aBorrar = null;
          for (CancionDD canc : disco) {
            if (canc.getNombre().equalsIgnoreCase(c)) {
              aBorrar = canc;
            }
          }
          disco.remove(aBorrar);
          borradas.add(aBorrar);
        }
        case 3 -> {
          System.out.println("Introduce una posicion");
          int pos = entero();

          System.out.println(disco.get(pos));
        }
        case 5 -> System.out.println("👍");
        default -> System.out.println("Opcion incorrecta");
      }
    }
  }

  private static void mostrarC(LinkedList<CancionDD> disco) {
    int pos = 0;
    System.out.println("-------------");
    for (CancionDD c : disco) {
      System.out.print(pos + " ");
      System.out.println(c);
      pos++;
    }
    System.out.println("-------------");
  }

  private static void ej6() {
    LinkedList<MonedaDD> monedas = new LinkedList<>();
    String[] valores = {"1 centimo", "2 centimos", "5 centimos", "10 centimos", "25 centimos",
    "50 centimos", "1 euro", "2 euros"};
    String[] caras = {"cara", "cruz"};
    Random rnd = new Random();

    monedas.add(new MonedaDD(
            valores[rnd.nextInt(valores.length)], caras[rnd.nextInt(caras.length)]));

    int m = 5;
    while (m != 0) {
      switch (rnd.nextInt(0,2)) {
        case 0 -> {
          MonedaDD add = new MonedaDD(
                  monedas.getLast().getValor(), caras[rnd.nextInt(caras.length)]);
          monedas.add(add);
        }
        case 1 -> {
          MonedaDD add = new MonedaDD(
                  valores[rnd.nextInt(valores.length)], monedas.getLast().getCara());
          monedas.add(add);
        }
      }
      m--;
    }

    for (MonedaDD mon : monedas) {
      System.out.println(mon);
    }
  }

  private static void ej7() {
    ArrayList<CartaDD> cartas = crearLas10();
    for (CartaDD cart : cartas) {
      System.out.println(cart);
    }
  }

  private static ArrayList<CartaDD> crearLas10() {
    ArrayList<CartaDD> cartas = new ArrayList<>();

    cartas.add(nuevaCarta());

    for (int i = 0; i < 10; i++) {
      boolean igual = true;
      CartaDD nueva = null;
      while (igual) {
        nueva = nuevaCarta();
        for (CartaDD cart : cartas) {
          igual = false;
          if (CartaDD.comparar(cart,nueva)) {
            igual = true;
            break;
          }
        }
      }
      cartas.add(nueva);
    }

    return cartas;
  }

  private static CartaDD nuevaCarta() {
    String[] palos = {"oros", "bastos", "copas", "espadas"};
    Random rnd = new Random();
    return new CartaDD(
            palos[rnd.nextInt(palos.length)], rnd.nextInt(1,13));
  }

  private static void ej8() {
    ArrayList<CartaDD> cartas = crearLas10();

    CartaDD[] bastos = new CartaDD[12];
    CartaDD[] espadas = new CartaDD[12];
    CartaDD[] oros = new CartaDD[12];
    CartaDD[] copas = new CartaDD[12];

    for (CartaDD carta : cartas) {
      switch (carta.getPalo()) {
        case "bastos" -> bastos[carta.getNumero() - 1] = carta;
        case "espadas" -> espadas[carta.getNumero() - 1] = carta;
        case "oros" -> oros[carta.getNumero() - 1] = carta;
        case "copas" -> copas[carta.getNumero() - 1] = carta;
      }
    }

    ArrayList<CartaDD> ordenadas = new ArrayList<>();
    arrToArrL(bastos, ordenadas);
    arrToArrL(espadas, ordenadas);
    arrToArrL(oros, ordenadas);
    arrToArrL(copas, ordenadas);

    for (CartaDD c : ordenadas) {
      System.out.println(c);
    }
  }

  private static void arrToArrL(CartaDD[] arr, ArrayList<CartaDD> arrL) {
    for (CartaDD c : arr) {
      if (c != null) {
        arrL.add(c);
      }
    }
  }
}
