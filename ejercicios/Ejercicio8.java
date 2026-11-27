/*
- EJERCICIO 8: Funciones
- ------------------------------------------------
*
*
- Las funciones se escriben FUERA del main, pero DENTRO de la clase.
-  Ejemplo:
-   static TIPO_QUE_DEVUELVE nombre(TIPO parametro1, TIPO parametro2) {
-       ...
-       return valor;
-   }
*
-   - Tipo void: hace algo (por ejemplo, mostrar texto) pero no devuelve nada.
-   - Parámetros: los datos que recibe para hacer su tarea.
-   - return: devuelve un valor al punto donde se llamó y termina la función.
-   - Por ahora escribe siempre "static" delante; más adelante veremos por qué.
*
- Llamada:  resultado = mi_funcion(valor1, valor2);
*
*/
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        //TODO 0: Define la función "saludar" fuera del método main
        // Debe mostrar algo como "¡Hola, NOMBRE!"
        saludar("Lucia");
        saludar("Marcos");


        // ---------- A) FUNCIONES SIN RESULTADO (void) ----------
        System.out.println("===== A) void =====");
        // TODO 1: Escribe la función mostrarSeparador(), sin parámetros:
        //         Debe mostrar una línea de 20 caracteres "=". Llámala desde aquí.
        mostrarSeparador();


        // TODO 2: Escribe mostrarTitulo(String texto): muestra un separador, el texto
        //         y otro separador (reutiliza la función mostrarSeparador del TODO 1).
        //         Llámala con "MENU", "RESULTADOS" y "FIN".
        mostrarTitulo("MENU");
        mostrarTitulo("RESULTADOS");
        mostrarTitulo("FIN");

        //  Ahora cambia el separador de "=" a "#". 
        //  ¿Cuántas líneas de código has tenido que cambiar?
        //  Solo 1 línea (dentro de la función mostrarSeparador).


        // ---------- B) FUNCIONES QUE DEVUELVEN UN VALOR ----------
        System.out.println("===== B) return =====");
        // TODO 3: Define la función areaRectangulo, que calcula el área a partir de una base y una altura
        //         Muestra el área de un rectángulo de 8.5 x 4.0 y de otro de 3 x 2.
        //         Pista: puedes llamar a la función dentro del propio println.
        System.out.println("Área (8.5 x 4.0): " + areaRectangulo(8.5, 4.0));
        System.out.println("Área (3 x 2): " + areaRectangulo(3, 2));


        // TODO 4: Define la función "esPar", que debe devolver si un número es par o no.
        //         Llamándola junto con el resto de código que consideres, debes conseguir generar esta salida:
        //          "El número 7 es impar"
        //          "El número 10 es par".
        int[] numerosPrueba = {7, 10};
        for (int i = 0; i < numerosPrueba.length; i++) {
            if (esPar(numerosPrueba[i])) {
                System.out.println("El número " + numerosPrueba[i] + " es par");
            } else {
                System.out.println("El número " + numerosPrueba[i] + " es impar");
            }
        }


        // ---------- C) FUNCIONES Y ARRAYS ----------
        System.out.println("===== C) arrays =====");
        //Crea un array de enteros con las notas: 7, 4, 9, 5, 10, 3.
        int[] notas = {7, 4, 9, 5, 10, 3};

        // TODO 5: Crea una función que reciba las notas y devuelva la suma. 
        //         Muestra el resultado
        System.out.println("Suma de las notas: " + sumarNotas(notas));


        // TODO 6: Crea una función que reciba las notas y devuelva la media, reutilizando la función del TODO5
        //         Muestra el resultado
        System.out.println("Media de las notas: " + calcularMedia(notas));


        // ---------- D) PROBLEMAS ----------
        System.out.println("===== D) problemas =====");
        // TODO 7: Crea una función "esPrimo" que devuelva si un número entero es primo o no.
        //          Muestra los números primos del 1 al 30.
        //          Extra: Optimiza el código para que haga el menor número de comprobaciones posible.
        System.out.print("Primos del 1 al 30: ");
        for (int i = 1; i <= 30; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


        // TODO 8: Crea una función que devuelva un número aleatorio del 1 al 6, simulando una tirada de dado.
        //          Tira el dado hasta que salga un 6, mostrando cada tirada,
        //          y al final muestra cuántas tiradas hicieron falta.
        //          Pista: (int) (Math.random() * 6) da un número del 0 al 5.
        int tirada = 0;
        int intentos = 0;
        while (tirada != 6) {
            tirada = tirarDado();
            intentos++;
            System.out.println("Tirada " + intentos + ": " + tirada);
        }
        System.out.println("Hicieron falta " + intentos + " tiradas para sacar un 6.");


        // TODO 9: Escribe una función "pedirNumeroEntre" que pida un número dentro de un rango (min, max)
        //          Si el introducido no es válido, avisa "Valor no valido" y vuelve a pedirlo hasta que sea válido.
        //          Crea el Scanner aquí, no dentro de la función.
        Scanner sc = new Scanner(System.in);
        int numeroElegido = pedirNumeroEntre(sc, 1, 10);
        System.out.println("Número válido introducido: " + numeroElegido);
        sc.close();
    }

    // ---------- FUNCIONES (escribe aquí debajo las tuyas) ----------

    // TODO 0
    static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    // TODO 1 (cambiado a "#" según pide la nota del TODO 2)
    static void mostrarSeparador() {
        for (int i = 0; i < 20; i++) {
            System.out.print("#");
        }
        System.out.println();
    }

    // TODO 2
    static void mostrarTitulo(String texto) {
        mostrarSeparador();
        System.out.println(texto);
        mostrarSeparador();
    }

    // TODO 3
    static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    // TODO 4
    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // TODO 5
    static int sumarNotas(int[] notas) {
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma;
    }

    // TODO 6
    static double calcularMedia(int[] notas) {
        return (double) sumarNotas(notas) / notas.length;
    }

    // TODO 7 (optimizado: descarta <= 1, pares > 2 y comprueba divisores impares hasta la raíz cuadrada)
    static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // TODO 8
    static int tirarDado() {
        return (int) (Math.random() * 6) + 1;
    }

    // TODO 9
    static int pedirNumeroEntre(Scanner sc, int min, int max) {
        int num;
        while (true) {
            System.out.print("Introduce un número entre " + min + " y " + max + ": ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num >= min && num <= max) {
                    return num;
                }
            } else {
                sc.next(); // limpia la entrada no numérica del buffer
            }
            System.out.println("Valor no valido");
        }
    }
}