import java.util.HashMap;
public class ProgramacionModular {
    static java.util.Scanner in;
    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);

        boolean seguir = true;

        while (seguir) {
            HashMap<Integer, Runnable> ejercicios = new HashMap<>();
            ejercicios.put(1, ProgramacionModular::ej1);
            ejercicios.put(2, ProgramacionModular::ej2);
            ejercicios.put(3, ProgramacionModular::ej3);
            ejercicios.put(4, ProgramacionModular::ej4);
            ejercicios.put(5, ProgramacionModular::ej5);

            System.out.print("Introduce el ejercicio que quieres ejecutar: ");
            int ej = in.nextInt();
            in.nextLine();

            Runnable ejercicio = ejercicios.get(ej);

            if (ejercicio != null){
                ejercicio.run();
            }else {
                System.out.println("Ejercicio no valido");
            }

            System.out.print("\nQuieres seguir ejecutando ejercicios?[y/n]: ");
            String opt = in.next();

            if (!opt.equals("y")) {
                seguir = false;
            }
        }
    }
    /*

     */
    static boolean esPrimo(int num){
        if (num < 2){
            return false;
        }

        for (int i = 2; i < num; i++){

            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    static void ej1(){
        int cont = 0;

        for (int i = 2; i <= 1000; i++){

            if (esPrimo(i)){

                System.out.print(i + " ");
                cont++;
            }

            if (cont == 4){

                System.out.println();
                cont = 0;
            }
        }
    }
    /*

     */
    static int sumar(int n, int m){
        return n + m;
    }
    static int restar(int n, int m){
        return n - m;
    }
    static int multiplicar(int n, int m){
        return n * m;
    }
    static int dividir(int n, int m){
        try{
            return n / m;
        }catch (ArithmeticException e){
            return -1;
        }
    }
    static int potencia(int n, int m){
        return (int) Math.pow(n,m);
    }
    static int raizCuadrada(int n){
        return (int) Math.sqrt(n);
    }
    static void ej2(){
        int n1, n2;
        boolean salir = false;

        while (!salir){

            System.out.println("""
                1: sumar
                2: restar
                3: multiplicar
                4: dividir
                5: potencia
                6: raiz cuadrada
                9: salir""");

            switch (in.nextInt()){

                case 1:

                    System.out.print("Numero 1: ");
                    n1 = in.nextInt();

                    System.out.print("Numero 2: ");
                    n2 = in.nextInt();

                    System.out.println(sumar(n1, n2));

                    break;

                case 2:

                    System.out.print("Numero 1: ");
                    n1 = in.nextInt();

                    System.out.print("Numero 2: ");
                    n2 = in.nextInt();

                    System.out.println(restar(n1, n2));

                    break;

                case 3:

                    System.out.print("Numero 1: ");
                    n1 = in.nextInt();

                    System.out.print("Numero 2: ");
                    n2 = in.nextInt();

                    System.out.println(multiplicar(n1, n2));

                    break;

                case 4:

                    System.out.print("Numero 1: ");
                    n1 = in.nextInt();

                    System.out.print("Numero 2: ");
                    n2 = in.nextInt();

                    if (dividir(n1 , n2) == -1){

                        System.out.println("No se puede dividir entre 0");
                    }else {

                        System.out.println(dividir(n1, n2));
                    }

                    break;

                case 5:

                    System.out.print("Numero 1: ");
                    n1 = in.nextInt();

                    System.out.print("Numero 2: ");
                    n2 = in.nextInt();

                    System.out.println(potencia(n1, n2));

                    break;

                case 6:

                    System.out.print("Numero: ");
                    n1 = in.nextInt();

                    System.out.println(raizCuadrada(n1));

                    break;

                case 9:

                    salir = true;

                default:

                    System.out.println("Introduce una opcion correcta");
            }
        }
    }
    /*

     */
    static void imprimeCajaTexto(String str){

        for (int i = 1; i <= 5; i++){

            if (i == 1 || i == 5){

                for (int j = 1; j <= str.length()+2; j++){

                    System.out.print("*");
                }
                System.out.println();
            } else {

                for (int j = 1; j <= str.length()+2; j++){

                    if (j == 1 || j == str.length()+2){

                        System.out.print("*");
                    }else if (i == 3 && j == 3){

                        System.out.print(str);
                    } else if (i == 3) {

                        System.out.print("");
                    } else {

                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    static void ej3(){

        System.out.print("String: ");
        String str = in.nextLine();

        System.out.println();
        imprimeCajaTexto(str);
    }
    /*

     */
    static String convierteEnPalotes(int n){
        String palotes="";

        for (int i = 0; i < n; i++){

            palotes += "|";
        }

        return palotes;
    }
    static void ej4(){

        System.out.print("Numero a convertir en palotes: ");
        String num = in.nextLine();

        String[] numArray = num.split("");

        int[] numeros = new int[num.length()];

        for (int i = 0; i < numArray.length; i++){

            int numero = Integer.parseInt(numArray[i]);

            numeros[i] = numero;
        }

        String palotes = "";

        for (int i = 0; i < numeros.length; i++){

            palotes += convierteEnPalotes(numeros[i]);

            if (i != numeros.length-1){

                palotes += "-";
            }
        }

        System.out.println(palotes);
    }
    /*

     */
    static String convierteEnPalabras(int n){

        String[] numerosPal = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis","siete",
                "ocho", "nueve"};

        return numerosPal[n];
    }
    static void ej5(){

        System.out.print("Numero a convertir: ");
        String numString = in.nextLine();

        String[] numArray = numString.split("");

        int[] numeros = new int[numString.length()];

        for (int i = 0; i < numArray.length; i++){

            int numero = Integer.parseInt(numArray[i]);

            numeros[i] = numero;
        }

        String convertido = "";

        for (int i = 0; i < numeros.length; i++){

            convertido += convierteEnPalabras(numeros[i]);

            if (i != numeros.length-1){

                convertido += ",";
            }
        }

        System.out.println(convertido);
    }
}