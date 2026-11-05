/*
* EJERCICIO 7: Arrays y bucles - La estación meteorológica
* ------------------------------------------------
*
* Enunciado:
* Una estación meteorológica registra la temperatura de cada día de la semana.
* Vamos a ver por qué necesitamos los arrays y cómo se usan.
*
*/
public class Ejercicio7 {

    public static void main(String[] args) {

        // ---------- A) SIN ARRAYS ----------
        System.out.println("===== A) sin arrays =====");
        // TODO 1: Declara 7 variables double (una por día) con distintos valores de temperatura (que algunos tengan décimas de grado)
        //         Calcula y muestra la temperatura media de la semana.
        // ...

		double tempLun = 15.5;
		double tempMar = 25.2;
		double tempMie = 35.1;
		double tempJue = 5.6;
		double tempVie = 45.4;
		double tempSab = 10.5;
		double tempDom = 18.7;

		double media = (tempLun + tempMar + tempMie + tempJue + tempVie + tempSab + tempDom) / 7.0;
        System.out.println("La temperatura media de la semana es: " + media);

        // ¿Y si en lugar de 7 días fueran 365? ¿Qué harías para resolverlo solo con variables?
        // ESCRIBE AQUÍ LA RESPUESTA:
        // ...


        // ---------- B) CON ARRAYS ----------
        System.out.println("===== B) con arrays =====");
        // TODO 2: Declara un array de double "temperaturas" con los mismos 7 valores de antes.
        // ...

		double temperaturas[] = {15.5, 25.2, 35.1, 5.6, 45.4, 10.5, 18.7};

		System.out.println(temperaturas[0]);


        // TODO 3: Muestra la temperatura del primer día, la del último
        //         y cuántos días hay registrados (sin escribir el 7 a mano).

		System.out.println(temperaturas[temperaturas.length - 1]);
        // TODO 4: El martes el termómetro falló. La temperatura real fue 23.0.
        //         Corrígela en el array y muéstrala.


		temperaturas[1] = 23.0;


        // TODO 5: Intenta mostrar la posición 7 del array y ejecuta el programa.
        //         Lee el error: ¿qué significa? Después comenta la línea.
	// EXPLICACIÓN: El array tiene 7 elementos, por lo que sus posiciones (índices) van del 0 al 6.

        // ---------- C) ARRAYS Y BUCLES ----------
        System.out.println("===== C) arrays y bucles =====");
        // TODO 6: Con un for con contador, muestra todas las temperaturas
        //         con el formato "Dia 1: 19.5".

		for (int i = 0; i < temperaturas.length; i++){
			System.out.println("Dia "+ (i+1) + ": " + temperaturas[i]);
		}


        // TODO 7: Con un for-each, calcula la media del array y muéstrala. 
        // for (tipo_de_elemento elemento : mi_array){ 
        //  //código a repetir;
        // }
		double suma = 0;
        for (double temp : temperaturas) {
            suma += temp;
        }
        double mediaArray = suma / temperaturas.length;
        System.out.println("La temperatura media calculada con for-each es: " + mediaArray);

        // ---------- D) CASO PRÁCTICO ----------
        System.out.println("===== D) dia mas caluroso =====");
        // TODO 8: Averigua qué día de la semana (del 1 al 7) hizo más calor
        //         y cuántos grados marcó.

		double tempMax = temperaturas[0];
        int diaMasCaluroso = 1;

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > tempMax) {
                tempMax = temperaturas[i];
                diaMasCaluroso = i + 1; // Le sumamos 1 porque el índice 0 corresponde al Día 1
            }
        }
        System.out.println("El día más caluroso fue el día " + diaMasCaluroso + " con " + tempMax + " grados.");
    }

    
}
 