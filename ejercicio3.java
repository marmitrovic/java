/*EJERCICIO 3: Entrada al cine y permiso de conducir
* ------------------------------------------------
*
* Enunciado:
* A partir de los datos de una persona, el programa debe decidir:
*   A) Qué precio de entrada de cine paga.
*   B) Si puede conducir.
*   C) Si su número favorito es par o impar.
*
* Reglas del cine:
*   - Menores de 12 años: 4 euros
*   - Mayores de 64 años: 5 euros
*   - Resto: 8 euros
*   - Además, si es estudiante (y no entra en los casos anteriores), paga 6 euros.
*
* Reglas de conducción:
*   - Puede conducir si tiene 18 años o más Y tiene carnet.
*
* Salida esperada con los valores de ejemplo (edad: 20, esEstudiante: true,
* tieneCarnet: false, numeroFavorito: 7):
*   Precio de la entrada: 6.0 euros
*   Puede conducir: NO (le falta el carnet)
*   El numero 7 es impar
*
* Prueba después con otros valores, por ejemplo:
*   edad : 70, esEstudiante : false, tieneCarnet : true, numeroFavorito : 10
*   edad : 10, esEstudiante : true,  tieneCarnet : false, numeroFavorito : 3
*/

import java.time.LocalDate;
import java.time.DayOfWeek;



public class ejercicio3 {

    public static void main(String[] args) {

        // Datos de la persona (puedes modificarlos para probar)
		int edad = 20;
        boolean esEstudiante = true;
        boolean tieneCarnet = false;
        int numeroFavorito = 7;

        // ---------- A) PRECIO DE LA ENTRADA ----------
        double precio;   // la declaramos aquí y le damos valor dentro del if

		if (edad < 0 || edad > 120) {
            System.out.println("GREŠKA: Uneta starost nije validna (mora biti između 0 i 120 godina).");
            return;
        }
        // TODO 1: Usa if / else if / else para asignar el valor correcto a "precio"
        //         según las reglas del cine.
	if (edad < 12) {
            precio = 4.0;
        } else if (edad > 64) {
            precio = 5.0; 
        } else if (esEstudiante) {
            precio = 6.0; 
        } else {
            precio = 8.0;
        }

		LocalDate danas = LocalDate.now();
        DayOfWeek danSedmice = danas.getDayOfWeek();
		if (danSedmice == DayOfWeek.WEDNESDAY) {
            precio = precio - 2.0; // Smanjujemo cenu za 2 evra
            System.out.println("Popust sredom primenjen (-2 evra).");
        }
		if (precio < 0) {
            precio = 0.0;
        }
        //Imprime el precio de entrada calculado
	System.out.println("Precio de la entrada: " + precio + " euros");

        // ---------- B) ¿PUEDE CONDUCIR? ----------

        // TODO 2: Declara una variable "puedeConducir" que valga true solo si
        //         la edad es mayor que 18 Y además tieneCarnet.
		boolean puedeConducir = (edad >= 18) && tieneCarnet;

        // TODO 3: Con un if / else, muestra:
        //         - "Puede conducir: SI"  si puedeConducir 
        //         - "Puede conducir: NO"  en caso contrario
        //         Si no puede conducir, indica el motivo
        //               ("es menor de edad" o "le falta el carnet").
			if (puedeConducir) {
				System.out.println("Puede conducir: SI");
    	    } else {
				System.out.print("Puede conducir: NO ");
            if (edad < 18) {
                System.out.println("(es menor de edad)");
            } else {
                System.out.println("(le falta el carnet)");
            }
        }

        // ---------- C) PAR O IMPAR ----------

        // TODO 4: Usa el operador "módulo" o  "resto de la división" para comprobar si
        //         numeroFavorito es par o impar,
        //         y muestra "El numero X es impar" o "El numero X es par"
		if (numeroFavorito % 2 == 0) {
            System.out.println("El numero " + numeroFavorito + " es par");
        } else {
            System.out.println("El numero " + numeroFavorito + " es impar");
        }
		if (numeroFavorito > 0) {
            System.out.println("Numero favorito es positivo.");
        } else if (numeroFavorito < 0) {
            System.out.println("Numero favorito es negativo.");
        } else {
            System.out.println("Numero favorito es 0.");
        }

		if (numeroFavorito % 3 == 0) {
            System.out.println("Broj je višekratnik (umnožak) broja 3.");
        }
        if (numeroFavorito % 5 == 0) {
            System.out.println("Broj je višekratnik (umnožak) broja 5.");
        }

        // Muestra el mensaje "Descuento especial por edad aplicado" si la persona
        //         es menor de 12 años O mayor de 64 años.
	if (edad < 12 || edad > 64) {
            System.out.println("Descuento especial por edad aplicado");
        }
    }
}
